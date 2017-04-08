package com.example.dell.android_s4a2_customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static final String[] name = new String[]{"Boni" , "Gulzar" , "Hemal" , "Kamil" , "Tiksha" , "Shruti"};
    public static final String[] contact_number = new String[]{"9898178763" , "9878655678" , "9435675896", "7864352109" ,
                                                                    "9908763425", "9807733455"};

    ListView listView;
    List<RowItem> rowItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItem = new ArrayList<RowItem>();
        for (int i =0 ; i< name.length ; i++){

            RowItem item= new RowItem(name[i] , contact_number[i]);
            rowItem.add(item);
        }

        listView = (ListView) findViewById(R.id.listView);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,R.layout.list_item,rowItem);
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
