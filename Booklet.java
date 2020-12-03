package com.company;

public class Booklet extends Book {
   protected static int Borrowing_Period=12;

    public Booklet(String Title, String Type, String Author, String Discription, String Publishing_House,int Num_Of_Publication, double Price, double Price_for_Borrowing, double Price_For_Sell, int Num_Of_Pages, int Num_Of_CopyInStock) {
        super(Title, Type, Author, Discription, Publishing_House,Num_Of_Publication, Price, Price_for_Borrowing, Price_For_Sell, Num_Of_Pages, Num_Of_CopyInStock);
    }
}
