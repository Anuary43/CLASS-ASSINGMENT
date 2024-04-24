/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional_statement;

import java.util.Scanner;


/**
 *
 * @author D-LUCAS
 */
public class Conditional_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Operations Op = new Operations();
       Conditional con =new Conditional();
       Scanner sc = new Scanner(System.in);
       boolean running =true;
       while (running){
       System.out.print("Please enter the number\n"
                          +"1: addition\n"
                          +"2: substruction\n"
                          +"3: multiplication\n"
                          +"4: division\n"
                          +"5: To check for odd or even\n");
        int number = sc.nextInt();
       
      switch(number){
          case 1:
              System.out.print("Enter two numbers\n");
              Op.a=sc.nextInt();
              Op.b=sc.nextInt();
           Op.add();
           break;
          case 2:
                System.out.print("Enter two numbers\n");
              Op.a=sc.nextInt();
              Op.b=sc.nextInt();
           Op.sub();
           break;
          case 3:
                System.out.print("Enter two numbers\n");
              Op.a=sc.nextInt();
              Op.b=sc.nextInt();
           Op.mult();
           break;
          case 4:
                System.out.print("Enter two numbers\n");
              Op.a=sc.nextInt();
              Op.b=sc.nextInt();
           Op.div();
           break;
          case 5:
              System.out.print("enter the number to check\n");
              //int check.a;
              con.x=sc.nextInt();
           con.check();
           break;
          default:
                System.out.print("Invalid input");
      }
    }
    
    }
}
