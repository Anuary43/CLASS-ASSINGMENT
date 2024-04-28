
package inheritance;

import java.util.Scanner;


public class Inheritance {


    public static void main(String[] args) {
           //System.out.println("hellow world
           Scanner sc=new Scanner(System.in);
           DIT DI =new DIT();
           Computerstudies CO = new Computerstudies();
           CO.Displayinginfo();
           CO.location();
           CO.colours();
           CO.leadership();
    
     int choice;
   choice=3;
  System.out.println("Menu:\n"
  + "1:About us\n"
           + "2:Location\n"
           + "3:colours\n"
           + "4:leadership"
           );
   
  while(choice<5){
   System.out.println("Enter choice"+sc);
    sc.nextInt();
    
    switch (choice){
        case 1:
            CO.Displayinginfo();
            break;
        case 2:
            CO.location();
            break;
        case 3:
            CO.colours();
            break;
        case 4:
            CO.leadership();
            break;
       
    }
   
}
}
}
