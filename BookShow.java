/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class BookShow {
    public int id;
    public String name;
    public String author;
    public String category;
    public int quantity;
    public int price;
    public BookShow(int id,String nm, String auth, String cate,int qua,int pr){
        this.id=id;
        this.name=nm;
        this.author=auth;
        this.category=cate;
        this.quantity=qua;
        this.price=pr;
    }
    public int getId(){
        return this.id;
    }
     public String getName(){
        return this.name;
    }
    public String getAuth(){
        return this.author;
    }
    public String getcate(){
        return this.category;
    }
     public int getqua(){
        return this.quantity;
    }
      public int getpr(){
        return this.price;
    }
}
