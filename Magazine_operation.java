package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Magazine_operation {
     public static ArrayList<Borrowed_Publication> Borrowed_Magazine=new ArrayList<Borrowed_Publication>();
    public static ArrayList<Sold_Publication>Sold_Magazine=new ArrayList<Sold_Publication>();
    public static ArrayList<Magazine>magazines=new ArrayList<Magazine>();
    public static ArrayList<Magazine>m=new ArrayList<Magazine>();
   public static void Add_Magazine(String Title, String Type, String Publishing_House,String Date_Of_Publication,int Num_Of_Publication, double Price, double Price_for_Borrowing, double Price_For_Sell, int Num_Of_Pages, int Num_Of_CopyInStock)
    {
       Magazine a=new Magazine(Title.toLowerCase(),Type.toLowerCase(),Publishing_House.toLowerCase(),Date_Of_Publication,Num_Of_Publication,Price,Price_for_Borrowing,Price_For_Sell,Num_Of_Pages,Num_Of_CopyInStock);
       magazines.add(a);

   }
    public static Magazine Search_Magazine_ByTitle(String Title)
    {
        for(Magazine a:magazines)
        {
            if(Title.equalsIgnoreCase(a.Title))
            {
                return a;
            }
        }
        return null;
    }

    public static ArrayList<Magazine> Search_Magazine_ByType(String Type){
        m.clear();
        for(Magazine a:magazines)
        {
            if(a.Type.equalsIgnoreCase(Type))
            {
                m.add(a);
            }
        }
        return m;


    }

    public static ArrayList<Magazine>Search_Magazine_ByPublishingHouse(String publishing_house)
    {
       m.clear();
        for(Magazine a:magazines)
        {
            if(a.Publishing_House.equalsIgnoreCase(publishing_house))
            {
                m.add(a);
            }
        }
        return m;
    }
    public static String Convert_Date_To_String(Date f)
    {
        String date=f.toString();
        String Month=new String(date.substring(4,7));
        String Day=new String(date.substring(8,10));
        String Year=new String( date.substring(24,28));
        char second=Month.charAt(1);
        char third=Month.charAt(2);
        switch(third) {
            case 'n': {
                if (second == 'a') Month = "01";
                else if (second == 'u') Month = "06";
                break;
            }
            case 'r': {
                if (second == 'p') Month = "04";
                else if (second == 'a') Month = "03";
                break;
            }
            case 'b':
                Month = "02";
                break;
            case 'y':
                Month = "05";
                break;
            case 'g':
                Month = "08";
                break;
            case 'l':
                Month = "07";
                break;
            case 'p':
                Month = "09";
                break;
            case 't':
                Month = "10";
                break;
            case 'v':
                Month = "11";
                break;
            case 'c':
                Month = "12";
                break;
        }
        String d=new String(Day+"/"+Month+"/"+Year);

        return d;
    }
    public static ArrayList<Magazine>Show_Added_Magazines_By_Day(String Date)
    {
        m.clear();
        String d=new String();
        for(Magazine a:magazines)
        {
            d=Convert_Date_To_String(a.Date_Created);
            if(d.equalsIgnoreCase(Date))
            {
                m.add(a);
            }
        }
        return m;
    }
    public static boolean Update_Magazine_Title(String name,String Update)
    {

        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(name))
            {

                a.Title=Update.toLowerCase();
                return true ;
            }
        }
        return false;

    }
    public static boolean Update_Magazine_NumOfCopies(String title,int Num_Of_Copies)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                a.Num_Of_CopyINStock=Num_Of_Copies;
                return true;
            }

        }
        return false;
    }

    public static boolean Update_Magazine_Borrowing_Price(String title,double update)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                a.Price_For_Borrowing=update;
                return true;
            }
        }
        return false;
    }
    public static boolean Update_Magazine_Sell_Price(String title,double update)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                a.Price_For_Sell=update;
                return true;
            }
        }
        return false;
    }
    public static boolean Update_Magazine_Type(String title,String Upgrade)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                a.Type=Upgrade.toLowerCase();
                return true;
            }
        }
        return false;
    }

    public static boolean Update_Magazine_PublishingHouse(String title,String Update)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                a.Publishing_House=Update.toLowerCase();
                return true;
            }
        }
        return  false;
    }
    public static boolean Delete_Magazine(String title)
    {
        for(Magazine a:magazines)
        {
            if(a.Title.equalsIgnoreCase(title))
            {
                magazines.remove(a);
                return true;
            }
        }
        return false;
    }
public static boolean Update_Magazine_DateOfPublication(String title,String Update)
{
    m.clear();
    for(Magazine a:magazines)
    {
        if(a.Title.equalsIgnoreCase(title))
        {
            a.Date_of_Publication=Update;

            return true;
        }
    }
    return false;
}
    public static void Check_Magazines_In_Stock()
    {
        for(Magazine a:magazines)
        {
            if(a.Num_Of_CopyINStock<=0)
            {
                magazines.remove(a);
            }
        }
    }
}
