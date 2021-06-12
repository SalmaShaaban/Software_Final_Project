/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.Scanner;

/**
 *
 * @author semsem
 */
public class GoFo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean b=true;
       Owner r = new Owner();
       Playground g = new Playground();
       System.out.println("Welcome in GoFo World ^_^");
       System.out.println("Do you want to\n1)Sign Up\n2)Sign In");
       int choice;
       Scanner sc = new Scanner(System.in);
       choice= sc.nextInt();
        if (choice == 1) {
            Sign_up s= new Sign_up() ;  
            System.out.println("Please, Fill out this required information\nName:");
                String n = sc.next();
                s.setName(n);
            System.out.println("Email:");
                 n = sc.next();
                s.setEmail(n);
            System.out.println("Phone Number:");
                 n = sc.next();
                s.setPhone(n);
            System.out.println("Gender:");
                 n = sc.next();
                s.setGender(n);
            System.out.println("Birthdate:");
                 n = sc.next();
                s.setBirth(n);
            System.out.println("password:");
                 n = sc.next();
                s.setPassword(n);
            System.out.println("Are you 1)player or 2)playgroud owner");
                int choice2 = sc.nextInt();
        
                  if(choice2==2){
                 System.out.println("Number of Playgrounds:");
                 int num=sc.nextInt();
                 r.seNumOfPlaygrounds(num);
                 s.Owner_Sign_up(r);
                 r.addPlayground();
                 r.getPlayground_ownerInfo();
                 r.printPlaygrounds();
                }
                if(choice2==1){
                    Player p= new Player();
                    s.Player_Sign_up(p);
                    System.out.println("Payment Way:");
                    n = sc.next();
                    p.setPayment(n);
                    p.getPlayerInfo();
                    System.out.println("View Available play grounds and available hours\n1)Yes    2)No");
                    int choice3= sc.nextInt();
                    if(choice3==1){
                    r.printPlaygrounds();
                    g.Booking();
                    }
                }
              
                }   
                        if(choice==2){
                   Scanner sc2 = new Scanner(System.in);

                         Sign_in s2= new Sign_in() ;  
            
            System.out.println("Email:");
                String m  = sc2.next();
                 s2.setEmail(m);
                 System.out.println("Password:");
                 m = sc2.next();
                s2.setPassword(m);  
                
                        }


    }
    }