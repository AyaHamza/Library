package com.company;

public class Manager extends Person {

  protected   String Password;
  protected   Manager (String Name,String Phone,String ID,String Passsword)
    {
        this.Name=Name;
        this.Phone=Phone;

        this.Password=Passsword;
        this.ID=ID;
    }

}
