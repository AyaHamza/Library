package com.company;

import java.util.ArrayList;

public class Student extends Person {
 protected  String Faculty;

    protected int Num_Of_Delayed;
    protected int Num_Of_BoughtPublication;
    protected String Last_Search;
    protected Publication Last_Borrowed;
    protected  Publication Last_Bought;
    protected ArrayList<Book> books = new ArrayList<Book>();

    Student(String Name, String Phone,String ID,String Faculty) {
        this.Name = Name;
        this.Phone = Phone;
        this.ID=ID;
        this.Faculty=Faculty;
    }
}

