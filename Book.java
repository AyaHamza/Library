package com.company;

import java.util.Date;

public class Book  extends Publication{
    protected String Discription;
    protected String Author;
    protected static int Borrowing_Period=20;


    public Book(String Title,String Type,String Author,String Discription,String Publishing_House,int Num_Of_Publication,double Price,double Price_for_Borrowing,double Price_For_Sell,int Num_Of_Pages,int Num_Of_CopyInStock) {
       this.Title=Title;
       this.Type=Type;
       this.Author=Author;
       this.Discription=Discription;
       this.Num_Of_Publication=Num_Of_Publication;
       this.Cost=Price;
       this.Price_For_Borrowing=Price_for_Borrowing;
       this.Price_For_Sell=Price_For_Sell;
       this.Num_Of_Pages=Num_Of_Pages;
       this.Num_Of_CopyINStock=Num_Of_CopyInStock;
       this.Num_of_BorrowedCopy=0;
       this.Num_of_SoldCopy=0;
       this.Publishing_House=Publishing_House;
       Date_Created=new Date();



    }
    protected Book()
    {

    }



}
