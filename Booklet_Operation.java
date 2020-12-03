package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Booklet_Operation {
    public static ArrayList<Borrowed_Publication> Borrowed_Booklet = new ArrayList<Borrowed_Publication>();
    public static ArrayList<Booklet> l = new ArrayList<Booklet>();
    public static ArrayList<Sold_Publication> Sold_Booklet = new ArrayList<Sold_Publication>();
    public static ArrayList<Booklet> booklets = new ArrayList<Booklet>();

    public static void Add_Booklet(String Title, String Type, String Author, String Discription, String Publishing_House, int Num_Of_Publication, double Price, double Price_for_Borrowing, double Price_For_Sell, int Num_Of_Pages, int Num_Of_CopyInStock) {
        Booklet a = new Booklet(Title, Type, Author, Discription, Publishing_House, Num_Of_Publication, Price, Price_for_Borrowing, Price_For_Sell, Num_Of_Pages, Num_Of_CopyInStock);
        booklets.add(a);

    }

    public static Boolean Search_Booklet_ByTitle(String Title) {
        for (Booklet a : booklets) {
            if (Title.equalsIgnoreCase(a.Title)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Booklet> Search_Booklet_ByType(String Type) {
        l.clear();
        for (Booklet a : booklets) {
            if (a.Type.equalsIgnoreCase(Type)) {
                l.add(a);
            }
        }
        return l;


    }

    public static ArrayList<Booklet> Search_Booklet_ByAuthor(String Author) {
        l.clear();
        for (Booklet a : booklets) {
            if (a.Author.equalsIgnoreCase(Author)) {
                l.add(a);
            }
        }
        return l;
    }

    public static ArrayList<Booklet> Search_Booklet_BySubject(String Subject) {
        l.clear();
        for (Booklet a : booklets) {
            if (a.Discription.contains(Subject) || a.Title.contains(Subject)) {
                l.add(a);
            }
        }
        return l;
    }

    public static ArrayList<Booklet> Search_Booklet_ByPublishingHouse(String publishing_house) {
        l.clear();
        for (Booklet a : booklets) {
            if (a.Publishing_House.equalsIgnoreCase(publishing_house)) {
                l.add(a);
            }
        }
        return l;
    }

    public static String Convert_Date_To_String(Date f) {
        String date = f.toString();
        String Month = new String(date.substring(4, 7));
        String Day = new String(date.substring(8, 10));
        String Year = new String(date.substring(24, 28));
        char second = Month.charAt(1);
        char third = Month.charAt(2);
        switch (third) {
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
        String d = new String(Day + "/" + Month + "/" + Year);

        return d;
    }

    public static ArrayList<Booklet> Show_Added_Booklets_By_Day(String Date) {
        l.clear();
        String d = new String();
        for (Booklet a : booklets) {
            d = Convert_Date_To_String(a.Date_Created);
            if (d.equalsIgnoreCase(Date)) {
                l.add(a);
            }
        }
        return l;
    }

    public static boolean Update_Booklet_Title(String name, String Update) {
try {
    for (Booklet a : booklets) {
        if (a.Title.equalsIgnoreCase(name)) {

            a.Title = Update.toLowerCase();

            return true;
        }
    }
    return false;
}
catch(Exception a)
{
    return false;
}

    }

    public static boolean Update_Booklet_NumOfCopies(String title, int Num_Of_Copies) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Num_Of_CopyINStock = Num_Of_Copies;
                return true;
            }

        }
        return false;
    }

    public static boolean Update_Booklet_Author(String title, String Update) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Author = Update.toLowerCase();
                return true;
            }
        }
        return false;
    }

    public static boolean Update_Booklet_Borrowing_Price(String title, double update) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Price_For_Borrowing = update;
                return true;
            }
        }
        return false;
    }

    public static boolean Update_Booklet_Sell_Price(String title, double update) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Price_For_Sell = update;
                return true;
            }
        }
        return false;

    }

    public static boolean Update_Booklet_Type(String title, String Upgrade) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Type = Upgrade.toLowerCase();
                return true;
            }
        }
        return false;
    }

    public static boolean  Update_Booklet_Discription(String title, String Upgrade) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Discription = Upgrade.toLowerCase();
                return true;
            }
        }
        return false;
    }

    public static boolean Update_Booklet_PublishingHouse(String title, String Update) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Publishing_House = Update.toLowerCase();
                return true;
            }
        }
        return false;
    }

    public static boolean Delete_Booklet(String title) {
        for (Booklet a : booklets) {
            if (a.Title.equalsIgnoreCase(title)) {
                booklets.remove(a);
                return true;
            }
        }
        return false;
    }

    public static void Check_Booklets_In_Stock() {
        for (Booklet a : booklets) {
            if (a.Num_Of_CopyINStock <= 0) {
                booklets.remove(a);
            }
        }
    }
}