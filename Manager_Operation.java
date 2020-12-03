package com.company;

import java.util.ArrayList;

public class Manager_Operation {
    public static ArrayList<Manager>managers=new ArrayList<Manager>();
    public static Boolean Add_Manager(String name,String Phone,String ID,String Password)
    {
        if(!Check_Manager(ID)) {


            Manager a = new Manager(name, Phone, ID, Password);
            managers.add(a);
            return true;
        }
        else{
            return false;
        }
    }
    public static Boolean Manager_Log_In(String ID,String Passwords)
    {
        for(Manager a:managers)
        {
            if(a.ID.equals(ID)&&a.Password.equals(Passwords))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean Check_Manager(String ID)
    {
        for(Manager a:managers)
        {
            if(a.ID.equals(ID))
            {
                return true;
            }
        }
        return false;
    }
    public static Manager Search_Manager(String ID)
    {
        for(Manager a:managers)
        {
            if(a.ID.equals(ID))
            {
                return a;
            }
        }
        return null;
    }

}
