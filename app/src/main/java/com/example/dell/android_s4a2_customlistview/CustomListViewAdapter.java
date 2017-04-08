package com.example.dell.android_s4a2_customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 4/6/2017.
 */
public class CustomListViewAdapter extends ArrayAdapter<RowItem> {

    Context context;
    public CustomListViewAdapter(Context context, int resource, List<RowItem> items) {
        super(context, resource, items);

        this.context = context;
    }

    private class ViewHolder{

        TextView name;
        TextView contact_number;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        ViewHolder holder = null;
        RowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();

            holder.name = (TextView) convertView.findViewById(R.id.textView);
            holder.contact_number = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);
        }
        else{
                holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(rowItem.getName());
        holder.contact_number.setText(rowItem.getContact_number());

        return convertView;
    }
}
