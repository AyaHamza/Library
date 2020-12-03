package com.company;

import java.util.Date;

public class Magazine extends Publication {
    protected String Date_of_Publication;

    static int Borrowing_period = 12;

    Magazine(String Title, String Type, String Publishing_House, String Date_Of_Publication, int Num_Of_Publication, double Price, double Price_for_Borrowing, double Price_For_Sell, int Num_Of_Pages, int Num_Of_CopyInStock) {
        this.Title = Title;
        this.Type = Type;
        this.Date_of_Publication = Date_Of_Publication;
        this.Num_Of_Publication = Num_Of_Publication;
        this.Cost = Price;
        this.Price_For_Borrowing = Price_for_Borrowing;
        this.Price_For_Sell = Price_For_Sell;
        this.Num_Of_Pages = Num_Of_Pages;
        this.Num_Of_CopyINStock = Num_Of_CopyInStock;
        this.Num_of_BorrowedCopy = 0;
        this.Num_of_SoldCopy = 0;
        this.Publishing_House = Publishing_House;
        Date_Created = new Date();

    }

}
