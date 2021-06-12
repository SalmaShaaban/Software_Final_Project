package gofo;

import java.util.Scanner;



class Playground {

    private String name, location;
    int[] AvlHours={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
    int  Dayprice, NightPrice;
    static int x=0;

    public Playground() {
        x++;                
        name = "";
        location = "";  
        Dayprice = NightPrice = 0;
    }

    void setname(String n) {
        name = n;
    }

    void setlocation(String l) {
        location = l;
    }

    void setDprice(int p) {
        Dayprice = p;
    }

    void setNprice(int night) {
        NightPrice = night;
    }

    void setAvlHours(int H) {
        int ctr=0;
        for (int j=0;j<AvlHours.length;j++)
        {
            if (AvlHours[j]==H)
                ctr=j;
        }
         
        for (int i =ctr ;i <AvlHours.length-1; i++) {
            
                AvlHours[i]=AvlHours[i+1];
  
    }
        
    }        
    String getname(){return name;}
    String getlocation(){return location;}
    int getDprice(){return Dayprice;}
    int getNprice(){return NightPrice;}
    
    void getavlH()
    {
        x=x+1;
        System.out.print("Available hours of Playground  -->");
        for (int i = 0; i < AvlHours.length-x; i++) {
              System.out.print(AvlHours[i]); 
              System.out.print(" ");
    }
        System.out.println(" ");
        
        }
    void Booking() 
    {
        
        Scanner scan=   new Scanner(System.in);
        int slot;
        boolean free=false;
        System.out.println("What time do you want to book?");
        slot=scan.nextInt();
        for (int i=0;i<AvlHours.length;i++){
        if (slot==AvlHours[i])
        {
           free=true; 
        }
        }
        if (free==true)
        {
            setAvlHours(slot);
            System.out.println("Successfully booked");
         }
        else 
            System.out.println("this slot is already booked please try to choose another slot");
    }
     public void getPlaygroundInfo(Playground h){
   System.out.println("Playgeound "+x+" Info");
   System.out.println("Name of Playground -->"+name);
   System.out.println("Location of Playground -->"+location);
   System.out.println("Price of Playground in the morning -->"+Dayprice);
   System.out.println("Price of Playground at the night -->"+NightPrice);
   
  }
}
