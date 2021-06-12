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
public class Sign_in {
 public String email;
 private String password;
 Sign_up test = new Sign_up();
 Sign_in(){
 email="";
 password="";
 }
 String h=test.getEmail();
  void setEmail (String email){
      if(email.equals(h)){
        this.email=email;
      }
     if(!email.equals(h)){
            System.out.println("There's no registered user with this email");
     }  
 }
  void setPassword (String password){
      if(test.getPassword().equalsIgnoreCase(password)){
        this.password=password;
        
      }
     if(!test.getPassword().equalsIgnoreCase(password)){
            System.out.println("Wrong password");
     }
  }
  
}
