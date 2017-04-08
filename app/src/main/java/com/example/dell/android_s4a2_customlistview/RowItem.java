package com.example.dell.android_s4a2_customlistview;

/**
 * Created by dell on 4/6/2017.
 */
public class RowItem {

    private String name;
    private String contact_number;

    public RowItem(String name, String contact_number){
        this.name = name;
        this.contact_number = contact_number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContact_number(){
        return contact_number;
    }

    public void setContact_number(){
        this.contact_number= contact_number;
    }
}
