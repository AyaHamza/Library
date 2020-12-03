package com.company;

import java.util.Date;

import static com.company.Book_Operation.Sold_Book;
import static com.company.Book_Operation.books;
import static com.company.Booklet_Operation.Sold_Booklet;
import static com.company.Booklet_Operation.booklets;
import static com.company.Magazine_operation.Sold_Magazine;
import static com.company.Magazine_operation.magazines;
import static com.company.Student_operation.students;

public class Sold_Publication {
    Date Operation_Date;

    Publication Sold;
    Student buyer;

    private Sold_Publication(Publication a, Student buyer) {
        Operation_Date = new Date();
        this.buyer = buyer;
        Sold = a;
        if (a instanceof Booklet) {
            Booklet_Operation.Sold_Booklet.add(this);
            Booklet_Operation.Check_Booklets_In_Stock();
        } else if (a instanceof Book) {
            Book_Operation.Sold_Book.add(this);
            Book_Operation.Check_Books_In_Stock();
        } else if (a instanceof Magazine) {
            Magazine_operation.Sold_Magazine.add(this);
            Magazine_operation.Check_Magazines_In_Stock();

        }

    }

    public static boolean Buy_Publication(String P, String ID) {
        Publication pub = null;
        boolean enter = true;
        String p = new String();
        if (enter) {
            for (Book a : books) {
                if (a.Title.equalsIgnoreCase(P)) ;
                {
                    pub = a;
                    enter = false;
                    p = "book";

                }
            }
        }
        if (enter) {
            for (Booklet a : booklets) {
                if (a.Title.equalsIgnoreCase(P)) ;
                {
                    pub = a;
                    enter = false;
                    p = "booklet";

                }
            }
        }
        if (enter) {
            for (Magazine a : magazines) {
                if (a.Title.equalsIgnoreCase(P)) ;
                {
                    pub = a;
                    enter = false;
                    p = "magazine";

                }
            }
            //return false;
        }

        Student S = null;
        for (Student s : students) {
            if (s.ID.equals(ID)) {
                S = s;
                if (p.equalsIgnoreCase("book")) {
                    Sold_Publication g = new Sold_Publication(pub, S);
                    Sold_Book.add(g);
                    pub.Num_Of_CopyINStock--;
                    pub.Num_of_SoldCopy++;
                    return true;
                } else if (p.equalsIgnoreCase("booklet")) {
                    Sold_Publication g = new Sold_Publication(pub, S);
                    Sold_Booklet.add(g);
                    pub.Num_Of_CopyINStock--;
                    pub.Num_of_SoldCopy++;
                    return true;
                } else if (p.equalsIgnoreCase("magazine")) {
                    Sold_Publication g = new Sold_Publication(pub, S);
                    Sold_Magazine.add(g);
                    pub.Num_Of_CopyINStock--;
                    pub.Num_of_SoldCopy++;
                    return true;
                }
            }
        }
        return false;


    }

}
