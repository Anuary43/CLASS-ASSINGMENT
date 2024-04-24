/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional_statement;

/**
 *
 * @author D-LUCAS
 */
class Conditional {
     int x = 0;
    void check(){
       
        switch (x%2) {
            case 0 -> System.out.println(" The number is even");
            case 1 -> System.out.println(" The number is odd");
            default -> System.out.println("INVALID INPUT");
        }
    }
    
    
}
