/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstproject;
import java.lang.*;

/**
 *
 * @author khouloud
 */
public class MyFirstJavaProgram implements Comparable{

    int empId;
    String empName;

    MyFirstJavaProgram(int empId, String empName){
        super();
        this.empId = empId;
        this.empName = empName;
    }

    public int compareTo(Object o){
        if(o instanceof MyFirstJavaProgram){
            MyFirstJavaProgram e = (MyFirstJavaProgram)o;
            
            return this.empId - e.empId;
        }else{
            throw new ClassCastException("Passed object is not of type MyFirstJavaProgram");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFirstJavaProgram emp1 = new MyFirstJavaProgram(3,"Employee1");
        MyFirstJavaProgram emp2 = new MyFirstJavaProgram(1,"Employee2");
        System.out.println("CompareTo Result: "+emp1.compareTo(emp2));
    }
    
}
