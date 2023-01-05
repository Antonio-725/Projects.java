/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class ShowAdmin {
    public String fname;
    public String lname;
    public int phone;
    public String email;
    public ShowAdmin(String fnm,String lnm,int phn,String em){
        this.fname=fnm;
        this.lname=lnm;
        this.phone=phn;
        this.email=em;
    }
    public String getFname(){
        return fname;
    }
     public String getLname(){
        return lname;
    }
      public int getPhone(){
        return phone;
    }
       public String getEmail(){
        return email;
    }
    
    
    
    
    
}
