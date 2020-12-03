package com.company;

import java.util.ArrayList;

public class Student_operation {

    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void Make_Suggestion() {
    }

    public static Boolean Check_Student(String ID) {
        for (Student a : students) {
            if (a.ID.equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public static Boolean Add_Student(String name, String phone, String ID, String Faculty) {
        try {
            if (name.equals(null) || phone.equals(null) || ID.equals(null) || Faculty.equals(null)) {
                return false;

            }
            if (!Check_Student(ID)) {
                students.add(new Student(name, phone, ID, Faculty));
                return true;
            } else return false;
        } catch (Exception a) {
            return false;
        }
    }

    public static Boolean Student_Log_In(String ID) {
        try {
            for (Student a : students) {
                if (a.ID.equals(ID)) {

                    return true;
                }
            }

            return false;
        } catch (Exception a) {
            return false;
        }


    }


    public static Boolean Check_Student_Can_Borrow(String ID) {
        for (Student a : students) {
            if (a.ID.equals(ID)) {
                if (a.Num_Of_Delayed < 4) {
                    return true;
                }
                break;
            }
        }
        return false;


    }

    public static Student Search_Student(String ID) {
        for (Student a : students) {
            if (a.ID.equals(ID)) {
                return a;
            }
        }
        return null;
    }

}



