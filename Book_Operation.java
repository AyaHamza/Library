package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Book_Operation {
    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Book> b = new ArrayList<Book>();
    public static ArrayList<Borrowed_Publication> Borrowed_Book = new ArrayList<Borrowed_Publication>();
    public static ArrayList<Sold_Publication> Sold_Book = new ArrayList<Sold_Publication>();

    public static void Add_Book(String Title, String Type, String Author, String Discription, String Publishing_House, int Num_of_publishing, double Price, double Price_for_Borrowing, double Price_For_Sell, int Num_Of_Pages, int Num_Of_CopyInStock) {

        Book a = new Book(Title.toLowerCase(), Type.toLowerCase(), Author.toLowerCase(), Discription.toLowerCase(), Publishing_House.toLowerCase(), Num_of_publishing, Price, Price_for_Borrowing, Price_For_Sell, Num_Of_Pages, Num_Of_CopyInStock);
        books.add(a);

    }

    public static Book Search_Book_ByTitle(String Title) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(Title)) {
                return a;
            }
        }
        return null;
    }

    public static ArrayList<Book> Search_Book_ByType(String Type) {
        b.clear();
        for (Book a : books) {
            if (a.Type.equalsIgnoreCase(Type)) {
                b.add(a);
            }
        }
        return b;


    }

    public static void Search_Book_ByAuthor(String Author) {
        b.clear();
        for (Book a : books) {
            if (a.Author.equalsIgnoreCase(Author)) {
                b.add(a);
            }
        }

    }

    public static ArrayList<Book> Search_Book_BySubject(String Subject) {
        b.clear();
        for (Book a : books) {
            if (a.Discription.contains(Subject) || a.Title.contains(Subject)) {
                b.add(a);
            }
        }
        return b;
    }

    public static ArrayList<Book> Search_Book_ByPublishingHouse(String publishing_house) {
        b.clear();
        for (Book a : books) {
            if (a.Publishing_House.equalsIgnoreCase(publishing_house)) {
                b.add(a);
            }
        }
        return b;
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

    public static ArrayList<Book> Show_Added_Books_By_Day(String Date) {
        b.clear();
        String d = new String();
        for (Book a : books) {
            d = Convert_Date_To_String(a.Date_Created);
            if (d.equalsIgnoreCase(Date)) {
                b.add(a);
            }
        }
        return b;
    }

    public static Boolean Update_Book_Title(String name, String Update) {

        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(name)) {

                a.Title = Update.toLowerCase();
                return true;
            }
        }
        return false;

    }

    public static Boolean Update_Book_NumOfCopies(String title, int Num_Of_Copies) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Num_Of_CopyINStock = Num_Of_Copies;

                return true;
            }

        }
        return  false;
    }

    public static Boolean Update_Book_Author(String title, String Update) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Author = Update.toLowerCase();

                return true;
            }
        }
        return false;
    }

    public static Boolean Update_Book_Borrowing_Price(String title, double update) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Price_For_Borrowing = update;
                return true;
            }
        }
        return false;
    }

    public static Boolean Update_Book_Sell_Price(String title, double update) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Price_For_Sell = update;

                return true;
            }
        }
        return false;
    }

    public static Boolean Update_Book_Type(String title, String Upgrade) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Type = Upgrade.toLowerCase();

                return true;
            }
        }
        return false;
    }

    public static Boolean Update_Book_Discription(String title, String Upgrade) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Discription = Upgrade.toLowerCase();

                return true;
            }
        }
        return false;
    }

    public static Boolean Update_Book_PublishingHouse(String title, String Update) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                a.Publishing_House = Update.toLowerCase();

                return true;
            }
        }
        return false;
    }

    public static boolean Delete_Book(String title) {
        for (Book a : books) {
            if (a.Title.equalsIgnoreCase(title)) {
                books.remove(a);
                return true;
            }
        }
        return false;
    }

    public static void Check_Books_In_Stock() {
        for (Book a : books) {
            if (a.Num_Of_CopyINStock <= 0) {
                books.remove(a);
            }
        }
    }

}
