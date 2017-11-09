package com.phacsin.firebasechatapp;

/**
 * Created by sachin on 17/10/17.
 */

public class ListItem {
    String message,name,time;

    ListItem()
    {

    }

    ListItem(String message,String name, String time)
    {
        this.message = message;
        this.name = name;
        this.time = time;

    }

    public String getMessage()
    {
        return message;
    }

    public String getName()
    {
        return name;
    }

    public String getTime()
    {
        return time;
    }

}
