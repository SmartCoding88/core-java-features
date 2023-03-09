/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Calendar;
import static java.util.Calendar.SATURDAY;
/**
 *
 * @author testuser
 */

public class Circle {
    
    static double pi ;

    int radius;
    
    static{
        System.out.println("Class's static bloack is getting init ");
        pi=3.14;
    }
    
    public Circle(int radius){
        this.radius=radius;
        System.out.println("Inside constructor");
    }
    public static double returnAreaFormula(String s, int n){
        return pi;
    }
    
    public static void main(String args[]){
        Circle c1= new Circle(5);
        Circle c2= new Circle(5);
        
        int val1=10;
        int val2=10;
        
        System.out.println("c1 is "+c1);
        System.out.println("c2 is "+c2);
        System.out.println("Comparing ca & c2 returns "+(c2.equals(c1)));
        System.out.println("Comparing val1 & val2 returns "+(val1==val2));
    }
    public boolean equals(Circle obj){
        if(this.getClass() != obj.getClass()) return false;
        else if (this.radius != obj.radius) return false;
        else return true;
    }
}
