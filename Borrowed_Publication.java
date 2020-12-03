package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.company.Student_operation.Check_Student_Can_Borrow;
import static com.company.Student_operation.students;

public class Borrowed_Publication {
    Date Issued_Date;
    Date Return_Date;
    Publication Borrowed;
    Student Borrower;

    private Borrowed_Publication(Publication c, Student Borrower) {
        Issued_Date = new Date();
        Borrowed = c;
        this.Borrower = Borrower;
        if (c instanceof Booklet) {
            Booklet_Operation.Borrowed_Booklet.add(this);
            Booklet_Operation.Check_Booklets_In_Stock();
        } else if (c instanceof Book) {
            Book_Operation.Borrowed_Book.add(this);
            Book_Operation.Check_Books_In_Stock();
        } else if (c instanceof Magazine) {
            Magazine_operation.Borrowed_Magazine.add(this);
            Magazine_operation.Check_Magazines_In_Stock();

        }

    }

    public static int Borrow_Publication(String p, String ID) {
        boolean enter = true;

        if (enter) {
            for (Book q : Book_Operation.books) {
                if (q.Title.equalsIgnoreCase(p)) {
                    for (Student s : students) {
                        if (s.ID.equals(ID)) {
                            if (Check_Student_Can_Borrow(ID)) {
                                Borrowed_Publication B = new Borrowed_Publication(q, s);
                                q.Num_of_BorrowedCopy++;
                                q.Num_Of_CopyINStock--;
                                Book_Operation.Borrowed_Book.add(B);

                                return 1;


                            }
                        }

                    }
                }
            }
        }
        if (enter) {
            for (Booklet q : Booklet_Operation.booklets) {
                if (q.Title.equalsIgnoreCase(p)) {

                    enter = false;
                    for (Student s : students) {
                        if (s.ID.equals(ID)) {
                            if (Check_Student_Can_Borrow(ID)) {
                                Borrowed_Publication B = new Borrowed_Publication(q, s);
                                q.Num_of_BorrowedCopy++;
                                q.Num_Of_CopyINStock--;
                                Booklet_Operation.Borrowed_Booklet.add(B);

                                return 1;

                            }
                        }
                    }
                }
            }
        }
        if (enter) {
            for (Magazine q : Magazine_operation.magazines) {
                if (q.Title.equalsIgnoreCase(p)) {
                    for (Student s : students) {
                        if (s.ID.equals(ID)) {
                            if (Check_Student_Can_Borrow(ID)) {
                                Borrowed_Publication B = new Borrowed_Publication(q, s);
                                q.Num_of_BorrowedCopy++;
                                q.Num_Of_CopyINStock--;
                                Magazine_operation.Borrowed_Magazine.add(B);
                                return 1;


                            }

                        }

                    }


                }
            }
        }
        return 0;
    }

    public static long Calculate_Days(Date d1, Date d2) {

        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public static long Return_Publication(String Student_Id, String Publication_Name) {
        boolean enter = true;
        Borrowed_Publication b = null;
        int Borrowed_Price;
        long num_Days = 0;
        String c = new String();
        if (enter) {
            for (Borrowed_Publication a : Book_Operation.Borrowed_Book) {
                if (a.Borrowed.Title.equalsIgnoreCase(Publication_Name) && a.Borrower.ID.equals(Student_Id)) {
                    enter = false;
                    b = a;
                    c = "Book";
                    a.Borrowed.Num_Of_CopyINStock++;
                    a.Borrowed.Num_of_BorrowedCopy--;
                    num_Days = Calculate_Days(new Date(), a.Issued_Date);
                }
            }
        }
        if (enter) {
            for (Borrowed_Publication a : Booklet_Operation.Borrowed_Booklet) {
                if (a.Borrowed.Title.equalsIgnoreCase(Publication_Name) && a.Borrower.ID.equals(Student_Id)) {
                    enter = false;
                    b = a;
                    c = "Booklet";
                    a.Borrowed.Num_Of_CopyINStock++;
                    a.Borrowed.Num_of_BorrowedCopy--;
                    num_Days = Calculate_Days(new Date(), a.Issued_Date);
                }
            }
        }
        if (enter) {
            for (Borrowed_Publication a : Magazine_operation.Borrowed_Magazine) {
                if (a.Borrowed.Title.equalsIgnoreCase(Publication_Name) && a.Borrower.ID.equals(Student_Id)) {
                    enter = false;
                    b = a;
                    c = "Magazine";
                    a.Borrowed.Num_Of_CopyINStock++;
                    a.Borrowed.Num_of_BorrowedCopy--;
                    num_Days = Calculate_Days(new Date(), a.Issued_Date);
                }
            }
        }
        if (enter) {
            return -1;
        }


        if (c.equalsIgnoreCase("Book")) {

            if (num_Days <= 20) {
                Book_Operation.Borrowed_Book.remove(c);
                return 0;
            } else {
                Book_Operation.Borrowed_Book.remove(c);
                b.Borrower.Num_Of_Delayed++;
                return 10 * num_Days;

            }

        } else if (c.equals("Booklet")) {
            if (num_Days <= 15) {
                Booklet_Operation.Borrowed_Booklet.remove(c);
                b.Borrower.Num_Of_Delayed++;
                return 0;
            } else {
                Booklet_Operation.Borrowed_Booklet.remove(c);
                return 10 * num_Days;
            }
        } else {
            if (num_Days <= 15) {
                Magazine_operation.Borrowed_Magazine.remove(c);
                b.Borrower.Num_Of_Delayed++;
                return 0;
            } else {
                Booklet_Operation.Borrowed_Booklet.remove(c);
                b.Borrower.Num_Of_Delayed++;
                return 10 * num_Days;
            }

        }
    }
}



