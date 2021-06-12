/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

/**
 *
 * @author semsem
 */
public class Player {
 private String phone,email,password,address;
 public String pgender,pname,birth,payment_way;
 public double balance;
 public int age;
 public static int id=0;
 public Player(){
     phone="";
     pname="";
     email="";
     pgender="";
     birth="";
     password="";
     payment_way="";
     balance=0;
     id++;
 }
   public Player(String phone,String pname,String payment_way,double balance,String email,String pgender,String birth,String password){
    this.phone=phone;
    this.pname=pname;
    this.email=email;
    this.pgender=pgender;
    this.birth=birth;
    this.password = password;  
    this.balance=balance;
    this.payment_way=payment_way;
 }  
   
 void setPhone (String phone){
     this.phone=phone;
 }
  void setGender (String pgender){
     this.pgender=pgender;
 }
   void setPname (String pname){
     this.pname=pname;
 }
  void setBirth (String birth){
     this.birth=birth;
 }
  void setEmail (String email){
     this.email=email;
 }
  void setPassword (String password){
     this.password=password;
 }
  
   void setAge (int age){
     this.age=age;
 }
    void setPayment (String payment_way){
     this.payment_way=payment_way;
 }
  
  String getPayment (){
     return(payment_way);
 }
  int getAge (){
     return(age);
 }
  String getPhone (){
     return(phone);
 }
    String getPgender (){
     return(pgender);
 }
  String getPname (){
     return(pname);
 }
  String getBirth (){
return (birth);
        }
  String getEmail (){
     return (email);
  }
  String getPassword (){
     return (password);
 }
  public void getPlayerInfo(){
   System.out.println("Player "+id+" Info");
   System.out.println("Name -->"+pname);
   System.out.println("Gender -->"+pgender);
   System.out.println("Birthdate -->"+birth);
   System.out.println("Phone Number -->"+phone);
   System.out.println("Address -->"+address);
   System.out.println("Email -->"+email);
   System.out.println("Balance -->"+balance);
   System.out.println("Payment Way -->"+payment_way);
  }
}
