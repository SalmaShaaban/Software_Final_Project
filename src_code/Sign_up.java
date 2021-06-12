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
 public class Sign_up {
 private String phone,email,password;
 public String birth,gender,name;
 public Sign_up(){
     phone="";
     name="";
     email="";
     gender="";
     birth="";
     password="";
 }
 public Sign_up(String phone,String name,String email,String gender,String birth,String password){
    this.phone=phone;
    this.name=name;
    this.email=email;
    this.gender=gender;
    this.birth=birth;
    this.password = password;  
 }
 void setPhone (String phone){
     this.phone=phone;
 }
  void setGender (String gender){
     this.gender=gender;
 }
   void setName (String name){
     this.name=name;
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
  
  String getPhone (){
     return(phone);
 }
    String getGender (){
     return(gender);
 }
  String getName (){
     return(name);
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
  void Player_Sign_up(Player p){
     p.setPname(name);
     p.setGender(gender);
     p.setBirth(birth);
     p.setPassword(password);
     p.setEmail(email);
     p.setPhone(phone);
    }
   void Owner_Sign_up(Owner o){
     o.setOname(name);
     o.setGender(gender);
     o.setBirth(birth);
     o.setPassword(password);
     o.setEmail(email);
     o.setPhone(phone);
    }
  
}
