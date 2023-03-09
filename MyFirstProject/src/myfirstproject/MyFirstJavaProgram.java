/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstproject;

/**
 *
 * @author khouloud
 */
public class MyFirstJavaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intVal;
        String strVal;
        
        intVal = 10; //assign 10 to variable intVal
        strVal = "Assign string value";
        System.out.println("---Increment & decrement oprators---");
        
        int a=10;
        System.out.println("--current calue of a is: "+a);
        System.out.println("a after a++ becomes : "+(a++));
        System.out.println("--current calue of a is: "+a);
        System.out.println("a after a-- becomes : "+(a--));
        System.out.println("--current calue of a is: "+a);
        System.out.println("a after ++a becomes : "+(++a));
        System.out.println("--current calue of a is: "+a);
        System.out.println("a after --a becomes : "+(--a));
        System.out.println("--current calue of a is: "+a);
        
        System.out.println("---Logical complement oprators---");
        boolean isCorrect = false;
        System.out.println("isCoorect's value of now is: "+(!isCorrect));
        
        //ternary demo
        int i=10;
        // a=5;
        System.out.println("ternary operation "+(i==10 ? i: 0));
        
        byte b = 31;
        System.out.println("Left shift of b results is: "+(b<<2));
        System.out.println("Right shift of b results is: "+(b>>2));
    }
    
}
