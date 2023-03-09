/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class NestedClassDemo {
     class NestedClass{
        void printInnerMethod(){
            System.out.println("Reached in the nested class ");
        }
    }
    public static void main(String args[]){
        NestedClassDemo.NestedClass n = new NestedClassDemo().new NestedClass();
        n.printInnerMethod();
        
    }
}
