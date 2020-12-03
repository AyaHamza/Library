package com.company;

import org.w3c.dom.html.HTMLBodyElement;

import javax.swing.*;
import javax.swing.text.LayoutQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static com.company.Book_Operation.Borrowed_Book;
import static com.company.Book_Operation.books;
import static com.company.Booklet_Operation.booklets;
import static com.company.Magazine_operation.magazines;
import static java.awt.BorderLayout.*;

public class GUI {

    private static String Student_ID = new String();
    private static String Manager_ID = new String();
    private static String book_booklet = new String();

    public static void User_Admin() {
        Student_ID = "";
        Manager_ID = "";

        JFrame f = new JFrame("LOG IN");
        f.setVisible(true);

        f.setBounds(400, 200, 400, 280);

        JLabel a = new JLabel("Welcome");
        Color c1 = new Color(12, 23, 80);
        Font f1 = new Font(Font.DIALOG, Font.BOLD, 25);
        a.setFont(f1);
        a.setForeground(c1);
        a.setBounds(130, 10, 240, 20);
        JButton B1 = new JButton("User");
        JButton B2 = new JButton("Admin");
        f.setLayout(null);
        B1.setBounds(110, 70, 150, 30);
        B2.setBounds(110, 120, 150, 30);
        f.add(a);
        f.add(B1);
        f.add(B2);

        ////////////////////////////////////////////////////Buttons////////////////////////////////////////////////////////
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Log_In();
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin_Log_In();
                f.dispose();

            }
        });


    }

    public static void Admin_Log_In() {
        //   Manager_ID = "";
        JFrame f = new JFrame(" ADMIN LOG IN");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 280);
        f.setLocation(400, 200);

        JLabel a = new JLabel("ADMIN");
        Color c1 = new Color(12, 23, 80);
        Font f1 = new Font(Font.DIALOG, Font.BOLD, 25);

        a.setFont(f1);
        a.setForeground(c1);
        a.setBounds(140, 10, 240, 20);
        JLabel J1 = new JLabel("Enter Your ID");
        JLabel J2 = new JLabel("Enter Your Password");
        JTextField t1 = new JTextField();
        JPasswordField t2 = new JPasswordField();
        J1.setBounds(30, 70, 120, 25);
        J2.setBounds(30, 110, 150, 25);
        t1.setBounds(190, 70, 130, 25);
        t2.setBounds(190, 110, 130, 25);
        JButton B1 = new JButton("BACK");
        JButton B2 = new JButton("ENTER");
        B1.setBounds(70, 170, 80, 25);
        B2.setBounds(200, 170, 80, 25);
        f.add(J1);
        f.add(J2);
        f.add(t1);
        f.add(t2);
        f.add(a);
        f.add(B1);
        f.add(B2);
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Manager_Operation.Manager_Log_In(t1.getText(), String.valueOf(t2.getPassword()))) {
                    Manager_ID = t1.getText();

                    f.dispose();
                    Welcome_Admin_User();

                } else {
                    JOptionPane.showMessageDialog(null, "Check The Password and UserName You Enterd", "Warning", JOptionPane.WARNING_MESSAGE);

                }

            }
        });
//////////////////////////////////////////////////Buttons/////////////////////////////////////////////////////////////////////////////
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Admin();
            }
        });
    }

    public static void User_Log_In() {
        //Student_ID = "";
        JFrame f = new JFrame(" USER LOG IN");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 280);
        f.setLocation(400, 200);
        JPanel P1 = new JPanel();
        JPanel Panel = new JPanel(null);
        Panel.setBorder(BorderFactory.createTitledBorder(""));
        Panel.setBounds(10, 40, 370, 190);

        f.add(Panel);
        JLabel a = new JLabel("USER");
        Color c1 = new Color(12, 23, 80);
        Font f1 = new Font(Font.DIALOG, Font.BOLD, 20);

        a.setFont(f1);
        a.setForeground(c1);
        a.setBounds(160, 10, 240, 15);
        f.add(a);
        JButton B1 = new JButton("Login");
        JButton B2 = new JButton("Register");
        JButton back_to_Admin_User = new JButton("Back");
        f.setLayout(null);
        B1.setBounds(110, 50, 150, 30);
        B2.setBounds(110, 100, 150, 30);
        back_to_Admin_User.setBounds(0, 165, 80, 25);
        Panel.add(B1);
        Panel.add(B2);
        Panel.add(back_to_Admin_User);
        ///////////////////////////////////////Register///////////////////////////////////////////////////////
        JPanel Panel_Register = new JPanel(null);
        Panel_Register.setBorder(BorderFactory.createTitledBorder("Register"));
        Panel_Register.setBounds(10, 40, 370, 190);
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField id = new JTextField();
        JTextField faculty = new JTextField();
        JButton Back = new JButton("Back");
        JButton Add = new JButton("Add");
        JLabel Name = new JLabel("Your Name");
        JLabel Phone = new JLabel("Your Phone");
        JLabel Id = new JLabel("Your National ID");
        JLabel Faculty = new JLabel("Your Faculty");
        Name.setBounds(30, 50, 100, 20);
        name.setBounds(140, 50, 150, 20);
        Id.setBounds(30, 80, 100, 20);
        id.setBounds(140, 80, 150, 20);
        Faculty.setBounds(30, 110, 100, 20);
        faculty.setBounds(140, 110, 150, 20);
        Phone.setBounds(30, 140, 100, 20);
        phone.setBounds(140, 140, 150, 20);
        Back.setBounds(90, 180, 80, 30);
        Add.setBounds(240, 180, 80, 30);
        Panel_Register.add(Name);
        Panel_Register.add(name);
        Panel_Register.add(Id);
        Panel_Register.add(id);
        Panel_Register.add(Phone);
        Panel_Register.add(phone);
        Panel_Register.add(Faculty);
        Panel_Register.add(faculty);
        Panel_Register.add(Back);
        Panel_Register.add(Add);
        /////////////////////////////////////////////////////////////////LOG_In///////////////////////////////////////
        JPanel Panel_LogIN = new JPanel(null);
        Panel_LogIN.setBorder(BorderFactory.createTitledBorder("Log In"));
        Panel_LogIN.setBounds(10, 40, 370, 190);
        JLabel Log_Id = new JLabel("Your ID");
        Log_Id.setBounds(30, 50, 100, 20);
        JTextField log_id = new JTextField();
        log_id.setBounds(140, 50, 150, 20);
        JButton LogIn = new JButton("LogIN");
        JButton back_to_User_Main = new JButton("Back");
        LogIn.setBounds(240, 100, 80, 30);
        back_to_User_Main.setBounds(90, 100, 80, 30);
        Panel_LogIN.add(Log_Id);
        Panel_LogIN.add(log_id);
        Panel_LogIN.add(LogIn);
        Panel_LogIN.add(back_to_User_Main);

///////////////////////////////////////////////////////////Register Buttons////////////////////////////////////////////
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Panel_Register);
                f.validate();

            }
        });
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Panel);
                f.validate();
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().isEmpty() || phone.getText().isEmpty() || id.getText().isEmpty() || Faculty.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Check the Data you entered ", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (Student_operation.Add_Student(name.getText(), phone.getText(), id.getText(), faculty.getText())) {
                    Student_ID = id.getText();
                    f.setContentPane(Panel);
                    f.validate();

                } else {
                    JOptionPane.showMessageDialog(null, "This Account Is Already Exist", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        });

        back_to_Admin_User.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User_Admin();
                f.dispose();
            }
        });

////////////////////////////////////////////////////////////////////////////////LogIn_Buttons/////////////////////////////////////////
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Panel_LogIN);
                f.validate();
            }
        });
        LogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Student_operation.Student_Log_In(log_id.getText())) {
                    Student_ID = log_id.getText();
                    Welcome_Admin_User();
                    f.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Check Your ID", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        back_to_User_Main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Panel);
                f.validate();
            }
        });
    }

    public static void Welcome_Admin_User() {
        JFrame f = new JFrame(" Welcome");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 280);
        f.setLocation(400, 200);
        f.setLayout(null);
        Color c1 = new Color(12, 23, 80);
        Font f1 = new Font(Font.DIALOG, Font.BOLD, 20);
        JLabel a = new JLabel("Welcome,");
        a.setFont(f1);
        a.setForeground(c1);
        a.setBounds(10, 10, 240, 20);
        String M_U = new String();
        if (!Manager_ID.isEmpty()) {
            Manager M;
            M = Manager_Operation.Search_Manager(Manager_ID);
            if (M.Name.contains(" ")) {
                M_U = M.Name.substring(0, M.Name.indexOf(' '));
            } else {
                M_U = M.Name;
            }
        } else {

            Student S;
            S = Student_operation.Search_Student(Student_ID);
            if (S != null)
                if (S.Name.contains(" ")) {
                    M_U = S.Name.substring(0, S.Name.indexOf(' '));
                } else {
                    M_U = S.Name;
                }


        }

        JLabel b = new JLabel(M_U);
        b.setFont(f1);
        b.setForeground(c1);
        b.setBounds(10, 35, 240, 20);
        f.add(a);
        f.add(b);
        JButton welcome = new JButton("Press here to continue");
        welcome.setBounds(30, 120, 320, 30);
        f.add(welcome);
        welcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Manager_ID.isEmpty()) {
                    Manager_Menu();
                    f.dispose();
                } else if (!Student_ID.isEmpty()) {
                    User_Menu();
                    f.dispose();
                } else if (Student_ID.isEmpty()) {
                    User_Log_In();
                    f.dispose();
                } else {

                }
            }
        });

    }

    public static void Manager_Menu() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JButton add = new JButton("ADD");
        JButton search = new JButton("SEARCH");
        JButton update = new JButton("UPDATE");
        JButton delete = new JButton("DELETE");
        JButton BACK2 = new JButton("BACK");
        JButton Show_Borrowed_books = new JButton("Show Borrowed Books");
        search.setBounds(270, 100, 200, 50);
        add.setBounds(270, 200, 200, 50);
        update.setBounds(270, 300, 200, 50);
        delete.setBounds(270, 400, 200, 50);
        BACK2.setBounds(270, 500, 200, 50);
        Show_Borrowed_books.setBounds(270, 600, 200, 50);
        f.add(search);
        f.add(update);
        f.add(delete);
        f.add(add);
        f.add(BACK2);
        f.add(Show_Borrowed_books);

        Show_Borrowed_books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Borrowed_Publication a : Borrowed_Book) {
                    System.out.println(a.Borrowed.Title + "  Borrower: " + a.Borrower.Name + " Date" + a.Issued_Date);
                }
            }
        });

        ////////////////////////////////////////////////////////Add_Panel////////////////////////////////////////////
        JPanel Add_BBM_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Add_BBM_Panel.setBorder(BorderFactory.createTitledBorder(""));
        Add_BBM_Panel.setBounds(10, 45, 750, 35);
        JButton Add_Book = new JButton("Add Book");
        JButton Add_Magazine = new JButton("Add Magazine");
        JButton Add_Booklet = new JButton("Add Booklet");
        JButton Add_Manager = new JButton("Add Manager");
        JButton BACKtomenu = new JButton("BACK");

        Add_BBM_Panel.add(Add_Book);
        Add_BBM_Panel.add(Add_Booklet);
        Add_BBM_Panel.add(Add_Magazine);
        Add_BBM_Panel.add(Add_Manager);
        Add_BBM_Panel.add(BACKtomenu);
        ////////////////////////////////////////////////////Add_Book//////////////////////////////////////////////////
        book_booklet = "book";
        JPanel Add_book_Panel = new JPanel(null);
        Add_book_Panel.setBorder(BorderFactory.createTitledBorder("Add Book"));

        Add_book_Panel.setBounds(1, 50, 800, 620);
        JLabel Book_Title = new JLabel("Title");
        JLabel Book_Type = new JLabel("Type");
        JLabel Book_Author = new JLabel("Author Name");
        JLabel Book_PublishingHouse = new JLabel("Publishing House");
        JLabel Book_NumOfPublishing = new JLabel("Num of Publishing");
        JLabel Book_NumOfPages = new JLabel("Num Of Pages");
        JLabel Book_Price = new JLabel("Cost");
        JLabel Book_Price_forBorrowing = new JLabel("Price For Borrowing");
        JLabel Book_Price_forSell = new JLabel("Price For Sell");
        JLabel Book_Num_OfCopy = new JLabel("Number Of Copies");
        JLabel Book_Discription = new JLabel("Discription About the Book");
        JTextField book_title = new JTextField();
        JTextField book_type = new JTextField();
        JTextField book_author = new JTextField();
        JTextField book_publishing_house = new JTextField();
        JTextField book_num_of_publishing = new JTextField();
        JTextField book_num_of_pages = new JTextField();
        JTextField book_price = new JTextField();
        JTextField book_price_for_borrow = new JTextField();
        JTextField book_price_for_sell = new JTextField();
        JTextField book_num_of_copy = new JTextField();
        JTextField book_discription = new JTextField();
        Book_Title.setBounds(45, 50, 150, 40);
        book_title.setBounds(210, 50, 350, 40);
        Book_Type.setBounds(45, 100, 150, 40);
        book_type.setBounds(210, 100, 350, 40);
        Book_Author.setBounds(45, 150, 150, 40);
        book_author.setBounds(210, 150, 350, 40);
        Book_PublishingHouse.setBounds(45, 200, 150, 40);
        book_publishing_house.setBounds(210, 200, 350, 40);
        Book_NumOfPublishing.setBounds(45, 250, 150, 40);
        book_num_of_publishing.setBounds(210, 250, 350, 40);
        Book_NumOfPages.setBounds(45, 300, 150, 40);
        book_num_of_pages.setBounds(210, 300, 350, 40);
        Book_Price.setBounds(45, 350, 150, 40);
        book_price.setBounds(210, 350, 350, 40);
        Book_Price_forBorrowing.setBounds(45, 400, 150, 40);
        book_price_for_borrow.setBounds(210, 400, 350, 40);
        Book_Price_forSell.setBounds(45, 450, 150, 40);
        book_price_for_sell.setBounds(210, 450, 350, 40);
        Book_Num_OfCopy.setBounds(45, 500, 150, 40);
        book_num_of_copy.setBounds(210, 500, 350, 40);
        Book_Discription.setBounds(45, 550, 170, 40);
        book_discription.setBounds(210, 550, 350, 80);
        Add_book_Panel.add(Book_Title);
        Add_book_Panel.add(book_title);
        Add_book_Panel.add(Book_Type);
        Add_book_Panel.add(book_type);
        Add_book_Panel.add(Book_Author);
        Add_book_Panel.add(book_author);
        Add_book_Panel.add(Book_PublishingHouse);
        Add_book_Panel.add(book_publishing_house);
        Add_book_Panel.add(Book_NumOfPublishing);
        Add_book_Panel.add(book_num_of_publishing);
        Add_book_Panel.add(Book_NumOfPages);
        Add_book_Panel.add(book_num_of_pages);
        Add_book_Panel.add(Book_Price);
        Add_book_Panel.add(book_price);
        Add_book_Panel.add(Book_Price_forBorrowing);
        Add_book_Panel.add(book_price_for_borrow);
        Add_book_Panel.add(Book_Price_forSell);
        Add_book_Panel.add(book_price_for_sell);
        Add_book_Panel.add(Book_Num_OfCopy);
        Add_book_Panel.add(book_num_of_copy);
        Add_book_Panel.add(Book_Discription);
        Add_book_Panel.add(book_discription);
        JButton ADD_BOOK = new JButton("ADD");
        JButton Back_To_ADD_Panell = new JButton("BACK");
        JButton BACK = new JButton("BACK");
        Back_To_ADD_Panell.setBounds(170, 640, 150, 30);
        ADD_BOOK.setBounds(370, 640, 150, 30);
        BACK.setBounds(100, 640, 150, 30);
        Add_book_Panel.add(ADD_BOOK);

        Add_book_Panel.add(BACK);
        BACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_BBM_Panel);
                f.validate();
            }
        });


/////////////////////////////////////////////Add_Book_Buttons/////////////////////////////////////////////////////////
        ADD_BOOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (book_title.getText().isEmpty() || book_type.getText().isEmpty() || book_author.getText().isEmpty() || book_discription.getText().isEmpty() || book_num_of_copy.getText().isEmpty() || book_num_of_pages.getText().isEmpty() || book_num_of_publishing.getText().isEmpty() || book_price.getText().isEmpty() || book_price_for_borrow.getText().isEmpty() || book_price_for_sell.getText().isEmpty() || book_publishing_house.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check the Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (book_booklet.equals("book")) {
                            Book_Operation.Add_Book(book_title.getText(), book_type.getText(), book_author.getText(), book_discription.getText(), book_publishing_house.getText(), Integer.parseInt(book_num_of_publishing.getText()), Double.parseDouble(book_price.getText()), Double.parseDouble(book_price_for_borrow.getText()), Double.parseDouble(book_price_for_sell.getText()), Integer.parseInt(book_num_of_pages.getText()), Integer.parseInt(book_num_of_copy.getText()));
                        } else if (book_booklet.equals("booklet")) {
                            Booklet_Operation.Add_Booklet(book_title.getText(), book_type.getText(), book_author.getText(), book_discription.getText(), book_publishing_house.getText(), Integer.parseInt(book_num_of_publishing.getText()), Double.parseDouble(book_price.getText()), Double.parseDouble(book_price_for_borrow.getText()), Double.parseDouble(book_price_for_sell.getText()), Integer.parseInt(book_num_of_pages.getText()), Integer.parseInt(book_num_of_copy.getText()));

                        }
                        JOptionPane.showMessageDialog(null, "The Operation is done sucessfully", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check the Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }

        });
        Back_To_ADD_Panell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_BBM_Panel);
                f.validate();
            }
        });


        ///////////////////////////////////////////////////////////////Add_Magazine_Panel///////////////////////////////////////
        JPanel Add_Magazine_Panel = new JPanel(null);
        Add_Magazine_Panel.setBorder(BorderFactory.createTitledBorder("Add Magazine"));

        Add_Magazine_Panel.setBounds(1, 50, 800, 620);
        JLabel Magazine_Title = new JLabel("Title");
        JLabel Magazine_Type = new JLabel("Type");
        JLabel Magazine_PublishingHouse = new JLabel("Publishing House");
        JLabel Magazine_NumOfPublishing = new JLabel("Num of Publishing");
        JLabel Magazine_NumOfPages = new JLabel("Num Of Pages");
        JLabel Magazine_Price = new JLabel("Cost");
        JLabel Magazine_Price_forBorrowing = new JLabel("Price For Borrowing");
        JLabel Magazine_Price_forSell = new JLabel("Price For Sell");
        JLabel Magazine_Num_OfCopy = new JLabel("Number Of Copies");
        JLabel Magazine_Date_of_Publishing = new JLabel("Date Of Publishing");
        JTextField magazine_title = new JTextField();
        JTextField magazine_type = new JTextField();
        JTextField magazine_publishing_house = new JTextField();
        JTextField magazine_num_of_publishing = new JTextField();
        JTextField magazine_num_of_pages = new JTextField();
        JTextField magazine_price = new JTextField();
        JTextField magazine_price_for_borrow = new JTextField();
        JTextField magazine_price_for_sell = new JTextField();
        JTextField magazine_num_of_copy = new JTextField();
        JTextField magazine_date_of_publishing = new JTextField();
        Magazine_Title.setBounds(45, 50, 150, 40);
        magazine_title.setBounds(210, 50, 350, 40);
        Magazine_Type.setBounds(45, 100, 150, 40);
        magazine_type.setBounds(210, 100, 350, 40);
        Magazine_Date_of_Publishing.setBounds(45, 150, 150, 40);
        magazine_date_of_publishing.setBounds(210, 150, 350, 40);
        Magazine_PublishingHouse.setBounds(45, 200, 150, 40);
        magazine_publishing_house.setBounds(210, 200, 350, 40);
        Magazine_NumOfPublishing.setBounds(45, 250, 150, 40);
        magazine_num_of_publishing.setBounds(210, 250, 350, 40);
        Magazine_NumOfPages.setBounds(45, 300, 150, 40);
        magazine_num_of_pages.setBounds(210, 300, 350, 40);
        Magazine_Price.setBounds(45, 350, 150, 40);
        magazine_price.setBounds(210, 350, 350, 40);
        Magazine_Price_forBorrowing.setBounds(45, 400, 150, 40);
        magazine_price_for_borrow.setBounds(210, 400, 350, 40);
        Magazine_Price_forSell.setBounds(45, 450, 150, 40);
        magazine_price_for_sell.setBounds(210, 450, 350, 40);
        Magazine_Num_OfCopy.setBounds(45, 500, 150, 40);
        magazine_num_of_copy.setBounds(210, 500, 350, 40);
        Add_Magazine_Panel.add(Magazine_Title);
        Add_Magazine_Panel.add(magazine_title);
        Add_Magazine_Panel.add(Magazine_Type);
        Add_Magazine_Panel.add(magazine_type);
        Add_Magazine_Panel.add(Magazine_PublishingHouse);
        Add_Magazine_Panel.add(magazine_publishing_house);
        Add_Magazine_Panel.add(Magazine_NumOfPublishing);
        Add_Magazine_Panel.add(magazine_num_of_publishing);
        Add_Magazine_Panel.add(Magazine_NumOfPages);
        Add_Magazine_Panel.add(magazine_num_of_pages);
        Add_Magazine_Panel.add(Magazine_Price);
        Add_Magazine_Panel.add(magazine_price);
        Add_Magazine_Panel.add(Magazine_Price_forBorrowing);
        Add_Magazine_Panel.add(magazine_price_for_borrow);
        Add_Magazine_Panel.add(Magazine_Price_forSell);
        Add_Magazine_Panel.add(magazine_price_for_sell);
        Add_Magazine_Panel.add(Magazine_Num_OfCopy);
        Add_Magazine_Panel.add(magazine_num_of_copy);
        Add_Magazine_Panel.add(Magazine_Date_of_Publishing);
        Add_Magazine_Panel.add(magazine_date_of_publishing);
        JButton ADD_Magazine = new JButton("ADD");
        ADD_Magazine.setBounds(370, 640, 150, 30);
        Add_Magazine_Panel.add(ADD_Magazine);
        Add_Magazine_Panel.add(Back_To_ADD_Panell);
/////////////////////////////////////////////////////////////Add_Manager_Panel//////////////////////////////////////////
        JPanel Add_Manager_Panel = new JPanel(null);
        Add_Manager_Panel.setBorder(BorderFactory.createTitledBorder("Add Manager"));

        Add_Manager_Panel.setBounds(1, 50, 800, 620);
        JLabel Manager_Name = new JLabel("Your Name");
        JLabel Manager_Phone = new JLabel("Your Phone");
        JLabel Manager_Id = new JLabel("Your National ID");
        JLabel Manager_Password = new JLabel("Your Password");
        JTextField manager_name = new JTextField();
        JTextField manager_phone = new JTextField();
        JTextField manager_id = new JTextField();
        JTextField manager_password = new JTextField();
        JButton Add_Manager_Button = new JButton("ADD");
        JButton Back_To_Add = new JButton("BACK");
        Manager_Name.setBounds(45, 50, 150, 40);
        manager_name.setBounds(210, 50, 350, 40);
        Manager_Id.setBounds(45, 100, 150, 40);
        manager_id.setBounds(210, 100, 350, 40);
        Manager_Password.setBounds(45, 150, 150, 40);
        manager_password.setBounds(210, 150, 350, 40);
        Manager_Phone.setBounds(45, 200, 150, 40);
        manager_phone.setBounds(210, 200, 350, 40);
        Add_Manager_Panel.add(Manager_Name);
        Add_Manager_Panel.add(manager_name);
        Add_Manager_Panel.add(Manager_Id);
        Add_Manager_Panel.add(manager_id);
        Add_Manager_Panel.add(Manager_Password);
        Add_Manager_Panel.add(manager_password);
        Add_Manager_Panel.add(Manager_Phone);
        Add_Manager_Panel.add(manager_phone);
        Add_Manager_Button.setBounds(370, 250, 150, 30);
        Back_To_Add.setBounds(170, 250, 150, 30);
        Add_Manager_Panel.add(Add_Manager_Button);
        Add_Manager_Panel.add(Back_To_Add);

        ///////////////////////////////////////////////Panel_Manager_Menu_Buttons//////////////////////////////////////////////////////

        Color z = new Color(112, 128, 144);
        Color s = new Color(150, 170, 200);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_BBM_Panel);
                f.validate();
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Search_menu_Manager();
            }
        });
        BACK2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Admin_Log_In();
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Manager_Menu_Update();

            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Remove_Publication();
                f.dispose();
            }
        });
        /////////////////////////////////////////////////////////////////Add_Panel_Buttons///////////////////////////////////////
        Add_Book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                book_booklet = "book";
                Add_book_Panel.setBorder(BorderFactory.createTitledBorder("Add Book"));
                f.setContentPane(Add_book_Panel);
                f.validate();
            }
        });

        Add_Booklet.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                book_booklet = "booklet";
                Add_book_Panel.setBorder(BorderFactory.createTitledBorder("Add Booklet"));
                f.setContentPane(Add_book_Panel);
                f.validate();

            }
        });
        Add_Magazine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_Magazine_Panel);
                f.validate();
            }
        });
        Add_Manager.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_Manager_Panel);
                f.validate();
            }
        });
        BACKtomenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Manager_Menu();
            }
        });
/////////////////////////////////////////////////////////////////////Add_Magazine_Panel_Buutons///////////////////////////////////
        ADD_Magazine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazine_title.getText().isEmpty() || magazine_date_of_publishing.getText().isEmpty() || magazine_type.getText().isEmpty() || magazine_num_of_copy.getText().isEmpty() || magazine_num_of_pages.getText().isEmpty() || magazine_num_of_publishing.getText().isEmpty() || magazine_price.getText().isEmpty() || magazine_price_for_borrow.getText().isEmpty() || magazine_price_for_sell.getText().isEmpty() || magazine_publishing_house.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check the Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                        System.out.println("enter");
                    } else {
                        Magazine_operation.Add_Magazine(magazine_title.getText(), magazine_type.getText(), magazine_publishing_house.getText(), magazine_date_of_publishing.getText(), Integer.parseInt(magazine_num_of_publishing.getText()), Double.parseDouble(magazine_price.getText()), Double.parseDouble(magazine_price_for_borrow.getText()), Double.parseDouble(magazine_price_for_sell.getText()), Integer.parseInt(magazine_num_of_pages.getText()), Integer.parseInt(magazine_num_of_copy.getText()));

                        JOptionPane.showMessageDialog(null, "The Operation is done sucessfully", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception a) {

                    JOptionPane.showMessageDialog(null, "Check the Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }

            }
        });
//////////////////////////////////////////////////////////////////ADD_manager_Button/////////////////////////////////////
        Add_Manager_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (manager_id.getText().isEmpty() || manager_name.getText().isEmpty() || manager_password.getText().isEmpty() || manager_phone.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check the Data  that You Entered");
                    } else {
                        if (Manager_Operation.Add_Manager(manager_name.getText(), manager_phone.getText(), manager_id.getText(), manager_password.getText())) {
                            JOptionPane.showMessageDialog(null, "The Operation is done sucessfully", "", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "This Account is Already Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check the Data  that You Entered");
                }
            }
        });
        Back_To_Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setContentPane(Add_BBM_Panel);
                f.validate();
            }
        });
    }

    public static void Manager_Menu_Update() {

        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Update_Book_Panel.setBounds(2, 2, 790, 120);
        Update_Book_Panel.setBorder(BorderFactory.createTitledBorder("Book"));
        JPanel Update_Booklet_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Update_Booklet_Panel.setBounds(2, 122, 790, 120);
        Update_Booklet_Panel.setBorder(BorderFactory.createTitledBorder("Booklet"));
        JPanel Update_Magazine_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Update_Magazine_Panel.setBounds(2, 242, 790, 120);
        Update_Magazine_Panel.setBorder(BorderFactory.createTitledBorder("Magazine"));
        JButton Update_Book_Title = new JButton("Update Book Title");
        JButton Update_Book_NumOfCopies = new JButton("Update book Number Of Copies");
        JButton Update_Book_Author = new JButton("Update Book Author Name");
        JButton Update_Book_Borrowing_Price = new JButton("Update Book Borrowing Price");
        JButton Update_Book_Sell_Price = new JButton("Updtae Book Sell Price");
        JButton Update_Book_Type = new JButton("Update Book Type");
        JButton Update_Book_Discription = new JButton("Update Book Discription");
        JButton Update_Book_PublishingHouse = new JButton("Update Book Publishing House");
        JButton Update_Booklet_Title = new JButton("Update Booklet Title");
        JButton Update_Booklet_NumOfCopies = new JButton("Update Booklet Number of copies");
        JButton Update_Booklet_Author = new JButton("Update Booklet Author Name");
        JButton Update_Booklet_Borrowing_Price = new JButton("Update Booklet Borrowing Price");
        JButton Update_Booklet_Sell_Price = new JButton("Updtae Booklet Sell Price");
        JButton Update_Booklet_Type = new JButton("Update Booklet Type");
        JButton Update_Booklet_Discription = new JButton("Update Booklet Discription");
        JButton Update_Booklet_PublishingHouse = new JButton("Update Booklet Publishing House");
        JButton Update_Magazine_Title = new JButton("Update Magazine Title");
        JButton Update_Magazine_NumOfCopies = new JButton("Update Magazine number of Copies");
        JButton Update_Magazine_Sell_Price = new JButton("Update Magazine Sell Price");
        JButton Update_Magazine_Borrowing_Price = new JButton("Update Magazine Borrowing Price");
        JButton Update_Magazine_Type = new JButton("Update Magazine Type");
        JButton Update_Magazine_PublishingHouse = new JButton("Update Magazine Publishing House");

        Update_Book_Panel.add(Update_Book_Title);
        Update_Book_Panel.add(Update_Book_NumOfCopies);
        Update_Book_Panel.add(Update_Book_Author);
        Update_Book_Panel.add(Update_Book_Sell_Price);
        Update_Book_Panel.add(Update_Book_Borrowing_Price);
        Update_Book_Panel.add(Update_Book_Type);
        Update_Book_Panel.add(Update_Book_Discription);
        Update_Book_Panel.add(Update_Book_PublishingHouse);
        Update_Booklet_Panel.add(Update_Booklet_Title);
        Update_Booklet_Panel.add(Update_Booklet_NumOfCopies);
        Update_Booklet_Panel.add(Update_Booklet_Author);
        Update_Booklet_Panel.add(Update_Booklet_Type);
        Update_Booklet_Panel.add(Update_Booklet_Borrowing_Price);
        Update_Booklet_Panel.add(Update_Booklet_Sell_Price);
        Update_Booklet_Panel.add(Update_Booklet_Discription);
        Update_Booklet_Panel.add(Update_Booklet_PublishingHouse);
        Update_Magazine_Panel.add(Update_Magazine_Title);
        Update_Magazine_Panel.add(Update_Magazine_NumOfCopies);
        Update_Magazine_Panel.add(Update_Magazine_Type);
        Update_Magazine_Panel.add(Update_Magazine_Sell_Price);
        Update_Magazine_Panel.add(Update_Magazine_Borrowing_Price);
        Update_Magazine_Panel.add(Update_Magazine_PublishingHouse);

        f.add(Update_Book_Panel);
        f.add(Update_Booklet_Panel);
        f.add(Update_Magazine_Panel);
        JButton Back1 = new JButton("BACK");
        Back1.setBounds(320, 400, 90, 30);
        f.add(Back1);


        /////////////////////////////////////////////////Update Menu buttons////////////////////////////////////////////
        Update_Book_Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_Title();
            }
        });
        Back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Manager_Menu();
            }
        });
        Update_Book_NumOfCopies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_NumOfCopies();
            }
        });
        Update_Book_Author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_Author();
            }
        });

        Update_Book_Sell_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Update_Book_SellPrice();
                f.dispose();
            }
        });
        Update_Book_Type.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_Type();
            }
        });
        Update_Book_Discription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_Discription();
            }
        });
        Update_Book_PublishingHouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_book_PublishingHouse();
            }
        });
        Update_Book_Borrowing_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Book_BorrowingPrice();
            }
        });
        Update_Magazine_Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_Title();
            }
        });
        Update_Magazine_NumOfCopies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_NumOfCopy();
            }
        });
        Update_Magazine_Borrowing_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_BorrowingPrice();
            }
        });
        Update_Magazine_Sell_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_SellPrice();
            }
        });
        Update_Magazine_Type.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_Type();
            }
        });
        Update_Magazine_PublishingHouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Magazine_PublishingHouse();
            }
        });
        Update_Booklet_Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_Title();
            }
        });
        Update_Booklet_NumOfCopies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_numOfCopy();
            }
        });
        Update_Booklet_Author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_Author();
            }
        });
        Update_Booklet_Borrowing_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_borrowingPrice();
            }
        });
        Update_Booklet_Sell_Price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_SellPrice();
            }
        });
        Update_Booklet_Type.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_Type();
            }
        });
        Update_Booklet_Discription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_Discription();
            }
        });
        Update_Booklet_PublishingHouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Update_Booklet_PublishingHouse();
            }
        });
    }

    public static void Update_Book_Title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Title_Panel = new JPanel(null);

        Update_Book_Title_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Title"));
        Update_Book_Title_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateName = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupname = new JTextField();
        JButton UpdateBookTitle = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateName.setBounds(80, 200, 150, 40);
        bookupname.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookTitle.setBounds(420, 280, 100, 30);
        Update_Book_Title_Panel.add(BookName);
        Update_Book_Title_Panel.add(BookUpdateName);
        Update_Book_Title_Panel.add(bookname);
        Update_Book_Title_Panel.add(bookupname);
        Update_Book_Title_Panel.add(UpdateBookTitle);
        Update_Book_Title_Panel.add(Back3);
        f.add(Update_Book_Title_Panel);
        UpdateBookTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Title(bookname.getText(), bookupname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Book_NumOfCopies() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_numOfCopy_Panel = new JPanel(null);

        Update_Book_numOfCopy_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Num Of Copy"));
        Update_Book_numOfCopy_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateName = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupnum = new JTextField();
        JButton UpdateBooknumofcopy = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateName.setBounds(80, 200, 150, 40);
        bookupnum.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBooknumofcopy.setBounds(420, 280, 100, 30);
        Update_Book_numOfCopy_Panel.add(BookName);
        Update_Book_numOfCopy_Panel.add(BookUpdateName);
        Update_Book_numOfCopy_Panel.add(bookname);
        Update_Book_numOfCopy_Panel.add(bookupnum);
        Update_Book_numOfCopy_Panel.add(UpdateBooknumofcopy);
        Update_Book_numOfCopy_Panel.add(Back3);
        f.add(Update_Book_numOfCopy_Panel);
        UpdateBooknumofcopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupnum.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_NumOfCopies(bookname.getText(), Integer.parseInt(bookupnum.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Book_Author() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Author_Panel = new JPanel(null);

        Update_Book_Author_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Author"));
        Update_Book_Author_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateAuthor = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupauthor = new JTextField();
        JButton UpdateBookTitle = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateAuthor.setBounds(80, 200, 150, 40);
        bookupauthor.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookTitle.setBounds(420, 280, 100, 30);
        Update_Book_Author_Panel.add(BookName);
        Update_Book_Author_Panel.add(BookUpdateAuthor);
        Update_Book_Author_Panel.add(bookname);
        Update_Book_Author_Panel.add(bookupauthor);
        Update_Book_Author_Panel.add(UpdateBookTitle);
        Update_Book_Author_Panel.add(Back3);
        f.add(Update_Book_Author_Panel);
        UpdateBookTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupauthor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Author(bookname.getText(), bookupauthor.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Book_BorrowingPrice() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_BorrowingPrice_Panel = new JPanel(null);

        Update_Book_BorrowingPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Borrowing Price"));
        Update_Book_BorrowingPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateBorrowingPrice = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupborrowing_price = new JTextField();
        JButton UpdateBookBorrowingP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateBorrowingPrice.setBounds(80, 200, 150, 40);
        bookupborrowing_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookBorrowingP.setBounds(420, 280, 100, 30);
        Update_Book_BorrowingPrice_Panel.add(BookName);
        Update_Book_BorrowingPrice_Panel.add(BookUpdateBorrowingPrice);
        Update_Book_BorrowingPrice_Panel.add(bookname);
        Update_Book_BorrowingPrice_Panel.add(bookupborrowing_price);
        Update_Book_BorrowingPrice_Panel.add(UpdateBookBorrowingP);
        Update_Book_BorrowingPrice_Panel.add(Back3);
        f.add(Update_Book_BorrowingPrice_Panel);
        UpdateBookBorrowingP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupborrowing_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Borrowing_Price(bookname.getText(), Double.parseDouble(bookupborrowing_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Book_SellPrice() {

        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_SellPrice_Panel = new JPanel(null);

        Update_Book_SellPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Sell Price"));
        Update_Book_SellPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateSellPrice = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupsell_price = new JTextField();
        JButton UpdateBookSellP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateSellPrice.setBounds(80, 200, 150, 40);
        bookupsell_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookSellP.setBounds(420, 280, 100, 30);
        Update_Book_SellPrice_Panel.add(BookName);
        Update_Book_SellPrice_Panel.add(BookUpdateSellPrice);
        Update_Book_SellPrice_Panel.add(bookname);
        Update_Book_SellPrice_Panel.add(bookupsell_price);
        Update_Book_SellPrice_Panel.add(UpdateBookSellP);
        Update_Book_SellPrice_Panel.add(Back3);
        f.add(Update_Book_SellPrice_Panel);
        UpdateBookSellP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupsell_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Sell_Price(bookname.getText(), Double.parseDouble(bookupsell_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Book_Type() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Type_Panel = new JPanel(null);

        Update_Book_Type_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Type"));
        Update_Book_Type_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdate = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookuptype = new JTextField();
        JButton UpdateBookType = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdate.setBounds(80, 200, 150, 40);
        bookuptype.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookType.setBounds(420, 280, 100, 30);
        Update_Book_Type_Panel.add(BookName);
        Update_Book_Type_Panel.add(BookUpdate);
        Update_Book_Type_Panel.add(bookname);
        Update_Book_Type_Panel.add(bookuptype);
        Update_Book_Type_Panel.add(UpdateBookType);
        Update_Book_Type_Panel.add(Back3);
        f.add(Update_Book_Type_Panel);
        UpdateBookType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookuptype.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Type(bookname.getText(), bookuptype.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Book_Discription() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Discription_Panel = new JPanel(null);

        Update_Book_Discription_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Discription"));
        Update_Book_Discription_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdateDiscription = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupdiscription = new JTextField();
        JButton UpdateBookDiscription = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateDiscription.setBounds(80, 200, 150, 40);
        bookupdiscription.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookDiscription.setBounds(420, 280, 100, 30);
        Update_Book_Discription_Panel.add(BookName);
        Update_Book_Discription_Panel.add(BookUpdateDiscription);
        Update_Book_Discription_Panel.add(bookname);
        Update_Book_Discription_Panel.add(bookupdiscription);
        Update_Book_Discription_Panel.add(UpdateBookDiscription);
        Update_Book_Discription_Panel.add(Back3);
        f.add(Update_Book_Discription_Panel);
        UpdateBookDiscription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupdiscription.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Discription(bookname.getText(), bookupdiscription.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_book_PublishingHouse() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Publishing_Panel = new JPanel(null);

        Update_Book_Publishing_Panel.setBorder(BorderFactory.createTitledBorder("Update Book Publishing House"));
        Update_Book_Publishing_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdatePublishing = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookuppublishing = new JTextField();
        JButton UpdateBookPublishing = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdatePublishing.setBounds(80, 200, 150, 40);
        bookuppublishing.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookPublishing.setBounds(420, 280, 100, 30);
        Update_Book_Publishing_Panel.add(BookName);
        Update_Book_Publishing_Panel.add(BookUpdatePublishing);
        Update_Book_Publishing_Panel.add(bookname);
        Update_Book_Publishing_Panel.add(bookuppublishing);
        Update_Book_Publishing_Panel.add(UpdateBookPublishing);
        Update_Book_Publishing_Panel.add(Back3);
        f.add(Update_Book_Publishing_Panel);
        UpdateBookPublishing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookuppublishing.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_PublishingHouse(bookname.getText(), bookuppublishing.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Magazine_Title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_Title_Panel = new JPanel(null);

        Update_Magazine_Title_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Title"));
        Update_Magazine_Title_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdateName = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineupname = new JTextField();
        JButton UpdateMagazineTitle = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdateName.setBounds(80, 200, 150, 40);
        magazineupname.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazineTitle.setBounds(420, 280, 100, 30);
        Update_Magazine_Title_Panel.add(MagazineName);
        Update_Magazine_Title_Panel.add(MagazineUpdateName);
        Update_Magazine_Title_Panel.add(magazinename);
        Update_Magazine_Title_Panel.add(magazineupname);
        Update_Magazine_Title_Panel.add(UpdateMagazineTitle);
        Update_Magazine_Title_Panel.add(Back3);
        f.add(Update_Magazine_Title_Panel);
        UpdateMagazineTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineupname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Magazine_operation.Update_Magazine_Title(magazinename.getText(), magazineupname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Magazine_NumOfCopy() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_numOfCopy_Panel = new JPanel(null);

        Update_Magazine_numOfCopy_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Num Of Copy"));
        Update_Magazine_numOfCopy_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdateName = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineupnum = new JTextField();
        JButton UpdateMagazinenumofcopy = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdateName.setBounds(80, 200, 150, 40);
        magazineupnum.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazinenumofcopy.setBounds(420, 280, 100, 30);
        Update_Magazine_numOfCopy_Panel.add(MagazineName);
        Update_Magazine_numOfCopy_Panel.add(MagazineUpdateName);
        Update_Magazine_numOfCopy_Panel.add(magazinename);
        Update_Magazine_numOfCopy_Panel.add(magazineupnum);
        Update_Magazine_numOfCopy_Panel.add(UpdateMagazinenumofcopy);
        Update_Magazine_numOfCopy_Panel.add(Back3);
        f.add(Update_Magazine_numOfCopy_Panel);
        UpdateMagazinenumofcopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineupnum.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Magazine_operation.Update_Magazine_NumOfCopies(magazinename.getText(), Integer.parseInt(magazineupnum.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This Magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Magazine_BorrowingPrice() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_BorrowingPrice_Panel = new JPanel(null);

        Update_Magazine_BorrowingPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Borrowing Price"));
        Update_Magazine_BorrowingPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdateBorrowingPrice = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineupborrowing_price = new JTextField();
        JButton UpdateMagazineBorrowingP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdateBorrowingPrice.setBounds(80, 200, 150, 40);
        magazineupborrowing_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazineBorrowingP.setBounds(420, 280, 100, 30);
        Update_Magazine_BorrowingPrice_Panel.add(MagazineName);
        Update_Magazine_BorrowingPrice_Panel.add(MagazineUpdateBorrowingPrice);
        Update_Magazine_BorrowingPrice_Panel.add(magazinename);
        Update_Magazine_BorrowingPrice_Panel.add(magazineupborrowing_price);
        Update_Magazine_BorrowingPrice_Panel.add(UpdateMagazineBorrowingP);
        Update_Magazine_BorrowingPrice_Panel.add(Back3);
        f.add(Update_Magazine_BorrowingPrice_Panel);
        UpdateMagazineBorrowingP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineupborrowing_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Borrowing_Price(magazinename.getText(), Double.parseDouble(magazineupborrowing_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This Magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Magazine_SellPrice() {

        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_SellPrice_Panel = new JPanel(null);

        Update_Magazine_SellPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Sell Price"));
        Update_Magazine_SellPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdateSellPrice = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineupsell_price = new JTextField();
        JButton UpdateMagazineSellP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdateSellPrice.setBounds(80, 200, 150, 40);
        magazineupsell_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazineSellP.setBounds(420, 280, 100, 30);
        Update_Magazine_SellPrice_Panel.add(MagazineName);
        Update_Magazine_SellPrice_Panel.add(MagazineUpdateSellPrice);
        Update_Magazine_SellPrice_Panel.add(magazinename);
        Update_Magazine_SellPrice_Panel.add(magazineupsell_price);
        Update_Magazine_SellPrice_Panel.add(UpdateMagazineSellP);
        Update_Magazine_SellPrice_Panel.add(Back3);
        f.add(Update_Magazine_SellPrice_Panel);
        UpdateMagazineSellP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineupsell_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Magazine_operation.Update_Magazine_Sell_Price(magazinename.getText(), Double.parseDouble(magazineupsell_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Magazine_Type() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_Type_Panel = new JPanel(null);

        Update_Magazine_Type_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Type"));
        Update_Magazine_Type_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdate = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineuptype = new JTextField();
        JButton UpdateMagazineType = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdate.setBounds(80, 200, 150, 40);
        magazineuptype.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazineType.setBounds(420, 280, 100, 30);
        Update_Magazine_Type_Panel.add(MagazineName);
        Update_Magazine_Type_Panel.add(MagazineUpdate);
        Update_Magazine_Type_Panel.add(magazinename);
        Update_Magazine_Type_Panel.add(magazineuptype);
        Update_Magazine_Type_Panel.add(UpdateMagazineType);
        Update_Magazine_Type_Panel.add(Back3);
        f.add(Update_Magazine_Type_Panel);
        UpdateMagazineType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineuptype.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_Type(magazinename.getText(), magazineuptype.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Magazine_PublishingHouse() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Magazine_Publishing_Panel = new JPanel(null);

        Update_Magazine_Publishing_Panel.setBorder(BorderFactory.createTitledBorder("Update Magazine Publishing House"));
        Update_Magazine_Publishing_Panel.setBounds(1, 50, 800, 620);
        JLabel MagazineName = new JLabel("Name Of Magazine");
        JLabel MagazineUpdatePublishing = new JLabel("Modification");
        JTextField magazinename = new JTextField();
        JTextField magazineuppublishing = new JTextField();
        JButton UpdateMagazinePublishing = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        MagazineName.setBounds(80, 120, 150, 40);
        magazinename.setBounds(240, 120, 350, 40);
        MagazineUpdatePublishing.setBounds(80, 200, 150, 40);
        magazineuppublishing.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateMagazinePublishing.setBounds(420, 280, 100, 30);
        Update_Magazine_Publishing_Panel.add(MagazineName);
        Update_Magazine_Publishing_Panel.add(MagazineUpdatePublishing);
        Update_Magazine_Publishing_Panel.add(magazinename);
        Update_Magazine_Publishing_Panel.add(magazineuppublishing);
        Update_Magazine_Publishing_Panel.add(UpdateMagazinePublishing);
        Update_Magazine_Publishing_Panel.add(Back3);
        f.add(Update_Magazine_Publishing_Panel);
        UpdateMagazinePublishing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (magazinename.getText().isEmpty() || magazineuppublishing.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Update_Book_PublishingHouse(magazinename.getText(), magazineuppublishing.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Booklet_Title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Booklet_Title_Panel = new JPanel(null);

        Update_Booklet_Title_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Title"));
        Update_Booklet_Title_Panel.setBounds(1, 50, 800, 620);
        JLabel BookletName = new JLabel("Name Of Booklet");
        JLabel BookletUpdateName = new JLabel("Modification");
        JTextField bookletname = new JTextField();
        JTextField bookletupname = new JTextField();
        JButton UpdateBookletTitle = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookletName.setBounds(80, 120, 150, 40);
        bookletname.setBounds(240, 120, 350, 40);
        BookletUpdateName.setBounds(80, 200, 150, 40);
        bookletupname.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookletTitle.setBounds(420, 280, 100, 30);
        Update_Booklet_Title_Panel.add(BookletName);
        Update_Booklet_Title_Panel.add(BookletUpdateName);
        Update_Booklet_Title_Panel.add(bookletname);
        Update_Booklet_Title_Panel.add(bookletupname);
        Update_Booklet_Title_Panel.add(UpdateBookletTitle);
        Update_Booklet_Title_Panel.add(Back3);
        f.add(Update_Booklet_Title_Panel);
        UpdateBookletTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookletname.getText().isEmpty() || bookletupname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Title(bookletname.getText(), bookletupname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Booklet_numOfCopy() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Booklet_numOfCopy_Panel = new JPanel(null);

        Update_Booklet_numOfCopy_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Num Of Copy"));
        Update_Booklet_numOfCopy_Panel.setBounds(1, 50, 800, 620);
        JLabel BookletName = new JLabel("Name Of Book");
        JLabel BookletUpdateName = new JLabel("Modification");
        JTextField bookletname = new JTextField();
        JTextField bookletupnum = new JTextField();
        JButton UpdateBookletnumofcopy = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookletName.setBounds(80, 120, 150, 40);
        bookletname.setBounds(240, 120, 350, 40);
        BookletUpdateName.setBounds(80, 200, 150, 40);
        bookletupnum.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookletnumofcopy.setBounds(420, 280, 100, 30);
        Update_Booklet_numOfCopy_Panel.add(BookletName);
        Update_Booklet_numOfCopy_Panel.add(BookletUpdateName);
        Update_Booklet_numOfCopy_Panel.add(bookletname);
        Update_Booklet_numOfCopy_Panel.add(bookletupnum);
        Update_Booklet_numOfCopy_Panel.add(UpdateBookletnumofcopy);
        Update_Booklet_numOfCopy_Panel.add(Back3);
        f.add(Update_Booklet_numOfCopy_Panel);
        UpdateBookletnumofcopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookletname.getText().isEmpty() || bookletupnum.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_NumOfCopies(bookletname.getText(), Integer.parseInt(bookletupnum.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Booklet_Author() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Author_Panel = new JPanel(null);

        Update_Book_Author_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Author"));
        Update_Book_Author_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Booklet");
        JLabel BookUpdateAuthor = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupauthor = new JTextField();
        JButton UpdateBookTitle = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateAuthor.setBounds(80, 200, 150, 40);
        bookupauthor.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookTitle.setBounds(420, 280, 100, 30);
        Update_Book_Author_Panel.add(BookName);
        Update_Book_Author_Panel.add(BookUpdateAuthor);
        Update_Book_Author_Panel.add(bookname);
        Update_Book_Author_Panel.add(bookupauthor);
        Update_Book_Author_Panel.add(UpdateBookTitle);
        Update_Book_Author_Panel.add(Back3);
        f.add(Update_Book_Author_Panel);
        UpdateBookTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupauthor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Author(bookname.getText(), bookupauthor.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Booklet_borrowingPrice() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_BorrowingPrice_Panel = new JPanel(null);

        Update_Book_BorrowingPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Borrowing Price"));
        Update_Book_BorrowingPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Booklet");
        JLabel BookUpdateBorrowingPrice = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupborrowing_price = new JTextField();
        JButton UpdateBookBorrowingP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateBorrowingPrice.setBounds(80, 200, 150, 40);
        bookupborrowing_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookBorrowingP.setBounds(420, 280, 100, 30);
        Update_Book_BorrowingPrice_Panel.add(BookName);
        Update_Book_BorrowingPrice_Panel.add(BookUpdateBorrowingPrice);
        Update_Book_BorrowingPrice_Panel.add(bookname);
        Update_Book_BorrowingPrice_Panel.add(bookupborrowing_price);
        Update_Book_BorrowingPrice_Panel.add(UpdateBookBorrowingP);
        Update_Book_BorrowingPrice_Panel.add(Back3);
        f.add(Update_Book_BorrowingPrice_Panel);
        UpdateBookBorrowingP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupborrowing_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Borrowing_Price(bookname.getText(), Double.parseDouble(bookupborrowing_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklit is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Booklet_SellPrice() {

        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_SellPrice_Panel = new JPanel(null);

        Update_Book_SellPrice_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Sell Price"));
        Update_Book_SellPrice_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Booklet");
        JLabel BookUpdateSellPrice = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupsell_price = new JTextField();
        JButton UpdateBookSellP = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateSellPrice.setBounds(80, 200, 150, 40);
        bookupsell_price.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookSellP.setBounds(420, 280, 100, 30);
        Update_Book_SellPrice_Panel.add(BookName);
        Update_Book_SellPrice_Panel.add(BookUpdateSellPrice);
        Update_Book_SellPrice_Panel.add(bookname);
        Update_Book_SellPrice_Panel.add(bookupsell_price);
        Update_Book_SellPrice_Panel.add(UpdateBookSellP);
        Update_Book_SellPrice_Panel.add(Back3);
        f.add(Update_Book_SellPrice_Panel);
        UpdateBookSellP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupsell_price.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Sell_Price(bookname.getText(), Double.parseDouble(bookupsell_price.getText()))) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Booklet_Type() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Type_Panel = new JPanel(null);

        Update_Book_Type_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Type"));
        Update_Book_Type_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Booklet");
        JLabel BookUpdate = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookuptype = new JTextField();
        JButton UpdateBookType = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdate.setBounds(80, 200, 150, 40);
        bookuptype.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookType.setBounds(420, 280, 100, 30);
        Update_Book_Type_Panel.add(BookName);
        Update_Book_Type_Panel.add(BookUpdate);
        Update_Book_Type_Panel.add(bookname);
        Update_Book_Type_Panel.add(bookuptype);
        Update_Book_Type_Panel.add(UpdateBookType);
        Update_Book_Type_Panel.add(Back3);
        f.add(Update_Book_Type_Panel);
        UpdateBookType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookuptype.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that ypu entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Type(bookname.getText(), bookuptype.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });

    }

    public static void Update_Booklet_Discription() {

        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Discription_Panel = new JPanel(null);

        Update_Book_Discription_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Discription"));
        Update_Book_Discription_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Booklet");
        JLabel BookUpdateDiscription = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookupdiscription = new JTextField();
        JButton UpdateBookDiscription = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdateDiscription.setBounds(80, 200, 150, 40);
        bookupdiscription.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookDiscription.setBounds(420, 280, 100, 30);
        Update_Book_Discription_Panel.add(BookName);
        Update_Book_Discription_Panel.add(BookUpdateDiscription);
        Update_Book_Discription_Panel.add(bookname);
        Update_Book_Discription_Panel.add(bookupdiscription);
        Update_Book_Discription_Panel.add(UpdateBookDiscription);
        Update_Book_Discription_Panel.add(Back3);
        f.add(Update_Book_Discription_Panel);
        UpdateBookDiscription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookupdiscription.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_Discription(bookname.getText(), bookupdiscription.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Update_Booklet_PublishingHouse() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel Update_Book_Publishing_Panel = new JPanel(null);

        Update_Book_Publishing_Panel.setBorder(BorderFactory.createTitledBorder("Update Booklet Publishing House"));
        Update_Book_Publishing_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Book");
        JLabel BookUpdatePublishing = new JLabel("Modification");
        JTextField bookname = new JTextField();
        JTextField bookuppublishing = new JTextField();
        JButton UpdateBookPublishing = new JButton("Update");
        JButton Back3 = new JButton("BACK");
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        BookUpdatePublishing.setBounds(80, 200, 150, 40);
        bookuppublishing.setBounds(240, 200, 350, 40);
        Back3.setBounds(250, 280, 100, 30);
        UpdateBookPublishing.setBounds(420, 280, 100, 30);
        Update_Book_Publishing_Panel.add(BookName);
        Update_Book_Publishing_Panel.add(BookUpdatePublishing);
        Update_Book_Publishing_Panel.add(bookname);
        Update_Book_Publishing_Panel.add(bookuppublishing);
        Update_Book_Publishing_Panel.add(UpdateBookPublishing);
        Update_Book_Publishing_Panel.add(Back3);
        f.add(Update_Book_Publishing_Panel);
        UpdateBookPublishing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty() || bookuppublishing.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Update_Booklet_PublishingHouse(bookname.getText(), bookuppublishing.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu_Update();
                f.dispose();

            }
        });
    }

    public static void Remove_Publication() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel remove_publication_Panel = new JPanel(null);

        remove_publication_Panel.setBorder(BorderFactory.createTitledBorder("Remove Publication"));
        remove_publication_Panel.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton remove_Book = new JButton("Remove Book");
        JButton remove_Booklet = new JButton("Remove Booklet");
        JButton remove_Magazine = new JButton("Remove Magazine");
        remove_Magazine.setBounds(100, 260, 150, 30);
        remove_Book.setBounds(280, 260, 150, 30);
        remove_Booklet.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        Back3.setBounds(305, 340, 100, 30);
        remove_publication_Panel.add(BookName);
        remove_publication_Panel.add(bookname);
        remove_publication_Panel.add(remove_Book);
        remove_publication_Panel.add(remove_Booklet);
        remove_publication_Panel.add(remove_Magazine);
        remove_publication_Panel.add(Back3);
        f.add(remove_publication_Panel);
        ///////////////////////////////////////////////////////Buttons////////////////////////////////////////////////
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager_Menu();
                f.dispose();

            }
        });

        remove_Book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Book_Operation.Delete_Book(bookname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This book is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        remove_Booklet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Booklet_Operation.Delete_Booklet(bookname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This booklet is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        remove_Magazine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (Magazine_operation.Delete_Magazine(bookname.getText())) {
                        JOptionPane.showMessageDialog(null, "The Operation Is Done Successfully", " ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "This Magazine is not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check The Data that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }

        });

    }

    public static void User_Menu() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(new FlowLayout(FlowLayout.LEFT));
        menu.setBounds(2, 2, 790, 700);
        JButton Search = new JButton("Search");
        JButton Borrow = new JButton("Borrow");
        JButton Return = new JButton("Return");
        JButton Buy = new JButton("Buy");
        JButton Back = new JButton("Back");
        JButton Show = new JButton("Show ");
        menu.add(Search);
        menu.add(Borrow);
        menu.add(Return);
        menu.add(Buy);
        menu.add(Show);
        menu.add(Back);

        f.add(menu);
        Borrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrow();
                f.dispose();
            }
        });
        Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Return();
                f.dispose();
            }
        });
        Buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                Buy();
            }
        });

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Log_In();
            }
        });
        Show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = 1;
                for (Book a : books) {
                    System.out.println(c + ") " + a.Title + "  Author : " + a.Author + "  Type: " + a.Type + "  Borrowing Price : " + a.Price_For_Borrowing + "  sell Price : " + a.Price_For_Sell);
                    c++;
                }
                System.out.println("///////");
                for (Booklet a : booklets) {

                    System.out.println(c + ") " + a.Title + "  Author : " + a.Author + "  Type: " + a.Type + "  Borrowing Price : " + a.Price_For_Borrowing + "  sell Price : " + a.Price_For_Sell);
                    c++;
                }
                for (Magazine a : magazines) {

                    System.out.println(c + ") " + a.Title + "  Type: " + a.Type + "  Borrowing Price : " + a.Price_For_Borrowing + "  sell Price : " + a.Price_For_Sell);
                    c++;

                }

            }
        });
    }

    public static void Borrow() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Borrow_Book = new JButton("Borrow");

        Borrow_Book.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Borrow_Book);
        f.add(menu);
        menu.add(Back3);
        Back3.setBounds(305, 340, 100, 30);
        Borrow_Book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int mmm = Borrowed_Publication.Borrow_Publication(bookname.getText(), Student_ID);
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);

                    } else if (mmm == 0) {
                        JOptionPane.showMessageDialog(null, "Check the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (mmm == -1) {
                        JOptionPane.showMessageDialog(null, "YOU can't Borrow this Book ", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (mmm == 1) {
                        JOptionPane.showMessageDialog(null, "The Operation is Done successfully", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Check the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Menu();
            }
        });
    }

    public static void Return() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Return_Book = new JButton("Return");
        f.add(menu);
        Return_Book.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Return_Book);

        menu.add(Back3);
        Back3.setBounds(305, 340, 100, 30);
        Return_Book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    long a = Borrowed_Publication.Return_Publication(Student_ID, bookname.getText());

                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Check  the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);

                    } else if (a == -1) {
                        JOptionPane.showMessageDialog(null, "Check the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);

                    } else if (a == 0) {
                        JOptionPane.showMessageDialog(null, "the operation is done successfully", "", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "You Should Pay" + a + "ponds because you are Late", "Warning", JOptionPane.WARNING_MESSAGE);

                    }


                } catch (Exception s) {
                    JOptionPane.showMessageDialog(null, "Check the Data you entered", "Warning", JOptionPane.WARNING_MESSAGE);


                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Menu();
            }
        });

    }

    public static void Buy() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        f.add(menu);
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Buy = new JButton("Buy");

        Buy.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Buy);

        menu.add(Back3);
        Back3.setBounds(305, 340, 100, 30);
        Buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bookname.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Check Date you entered", "warning", JOptionPane.WARNING_MESSAGE);
                }
                if (Sold_Publication.Buy_Publication(bookname.getText(), Student_ID)) {
                    JOptionPane.showMessageDialog(null, "the operation is done Successfully", "warning", JOptionPane.WARNING_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "This Publication is not Exist", "warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Menu();
            }
        });
    }

    public static void Search_menu_Manager() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(new FlowLayout(FlowLayout.LEFT));
        menu.setBounds(1, 50, 800, 620);
        f.add(menu);
        JButton Search_Book_By_title = new JButton("Search Book By Title");
        JButton Search_booklet_By_title = new JButton("Search Booklet By Title");
        JButton Search_Magazine_By_title = new JButton("Search Magazine By Title");
        JButton Search_BY_Day = new JButton("Search By Day");
        JButton Show_retard_Book = new JButton("Show Retard Borrowed Book");
        JButton Show_retard_Booklet = new JButton("Show Retard Borrowed Booklet");
        JButton Show_retard_Magazine = new JButton("Show Retard Borrowed Magazine");
        JButton Back = new JButton("Back");
        menu.add(Search_Book_By_title);
        menu.add(Search_booklet_By_title);
        menu.add(Search_Magazine_By_title);
        menu.add(Search_BY_Day);
        menu.add(Show_retard_Book);
        menu.add(Show_retard_Magazine);
        menu.add(Show_retard_Booklet);
        menu.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                User_Menu();
            }
        });
        Search_Book_By_title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_book_bY_title();
                f.dispose();
            }
        });
        Search_booklet_By_title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_Booklet_By_Title();
            }
        });
        Search_Magazine_By_title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_Magazine_By_Title();
            }
        });


    }

    public static void Search_book_bY_title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        f.add(menu);
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Buy = new JButton("Search");

        Buy.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Buy);
        Buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "check date that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (Book_Operation.Search_Book_ByTitle(bookname.getText()).equals(null)) {
                            JOptionPane.showMessageDialog(null, "this book is not Exist", "warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            Book a = Book_Operation.Search_Book_ByTitle(bookname.getText());
                            System.out.println(a.Title + "  Author: " + a.Author + "  Type: " + a.Type + "  Borrowing Price" + a.Price_For_Borrowing + "  sell Price" + a.Price_For_Sell);

                        }
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "this book is not Exist", "warning", JOptionPane.WARNING_MESSAGE);

                }
            }


        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_menu_Manager();
            }
        });
    }

    public static void Search_Booklet_By_Title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        f.add(menu);
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Buy = new JButton("Search");

        Buy.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Buy);
        Buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "check date that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (Booklet_Operation.Search_Booklet_ByTitle(bookname.getText()).equals(null)) {
                            JOptionPane.showMessageDialog(null, "this book is not Exist", "warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            Book a = Book_Operation.Search_Book_ByTitle(bookname.getText());
                            System.out.println(a.Title + "  Author: " + a.Author + "  Type: " + a.Type + "  Borrowing Price" + a.Price_For_Borrowing + "  sell Price" + a.Price_For_Sell);

                        }
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "this book is not Exist", "warning", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_menu_Manager();
            }
        });
    }

    public static void Search_Magazine_By_Title() {
        JFrame f = new JFrame("Library");
        f.setVisible(true);
        f.setSize(800, 720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JPanel menu = new JPanel(null);
        menu.setBounds(1, 50, 800, 620);
        JLabel BookName = new JLabel("Name Of Publication");
        JTextField bookname = new JTextField();
        f.add(menu);
        BookName.setBounds(80, 120, 150, 40);
        bookname.setBounds(240, 120, 350, 40);
        JButton Buy = new JButton("Search");

        Buy.setBounds(460, 260, 150, 30);
        JButton Back3 = new JButton("Back");
        menu.add(BookName);
        menu.add(bookname);
        menu.add(Buy);
        Buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (bookname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "check date that you entered", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (Magazine_operation.Search_Magazine_ByTitle(bookname.getText()).equals(null)) {
                            JOptionPane.showMessageDialog(null, "this book is not Exist", "warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            Magazine a = Magazine_operation.Search_Magazine_ByTitle(bookname.getText());
                            System.out.println(a.Title + "  Type: " + a.Type + "  Borrowing Price" + a.Price_For_Borrowing + "  sell Price" + a.Price_For_Sell);

                        }
                    }
                } catch (Exception a) {

                    JOptionPane.showMessageDialog(null, "this Magazine is not Exist", "warning", JOptionPane.WARNING_MESSAGE);

                }


            }

        });
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_menu_Manager();
            }
        });
    }

}