/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;
import static gofo.Player.id;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author semsem
 */
public class Owner {
 private String phone,email,password;
 private int NumOfPlaygrounds;
 public static int id2=0;
 public String birth,gender,oname;
 public Owner(){
     phone="";
     oname="";
     email="";
     gender="";
     birth="";
     password="";
     NumOfPlaygrounds=0;
     id2++;
 }
 public Owner(String phone,String oname,String email,String gender,String birth,String password, int NumOfPlaygrounds){
    this.phone=phone;
    this.oname=oname;
    this.email=email;
    this.gender=gender;
    this.birth=birth;
    this.password = password; 
    this.NumOfPlaygrounds=NumOfPlaygrounds;
 }
 void setPhone (String phone){
     this.phone=phone;
 }
  void setGender (String gender){
     this.gender=gender;
 }
   void setOname (String oname){
     this.oname=oname;
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
  
    void seNumOfPlaygrounds (int NumOfPlaygrounds){
     this.NumOfPlaygrounds=NumOfPlaygrounds;
 }
  
  int getNumOfPlaygrounds (){
     return(NumOfPlaygrounds);
 }
  String getPhone (){
     return(phone);
 }
    String getGender (){
     return(gender);
 }
  String getOame (){
     return(oname);
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
  ArrayList<Playground> playground_list = new ArrayList<>();
        Playground p1= new Playground();
  public void addPlayground(){
    for(int i=0;i<NumOfPlaygrounds;i++){
    System.out.println("Please, Fill out this required information for Playground "+(i+1)+"\nName of Playground:");
           Scanner input = new Scanner(System.in);
           String temp= input.next();
           p1.setname(temp);
            System.out.println("Location of Playground:");
            temp= input.next();
            p1.setlocation(temp);
             System.out.println("Price of Playground in the morning:");
            int temp2 = input.nextInt();
            p1.setDprice(temp2);
            System.out.println("Price of Playground at the night:");
             temp2 = input.nextInt();
            p1.setNprice(temp2);
            playground_list.add(i,p1);
    }
}
  public void printPlaygrounds(){
          for(int i=0;i<NumOfPlaygrounds;i++){
          p1.getPlaygroundInfo(p1);
          p1.getavlH();
          }
          
  }
  public void getPlayground_ownerInfo(){
   System.out.println("Playgeound Owner "+id2+" Info");
   System.out.println("Name -->"+oname);
   System.out.println("Gender -->"+gender);
   System.out.println("Birthdate -->"+birth);
   System.out.println("Phone Number -->"+phone);
   System.out.println("Email -->"+email);
   
  }
}
