
import javafx.beans.binding.StringBinding;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class StringBuilderDemo {
    public static void main(String args[]){
        StringBuilder str1= new StringBuilder("Hello world");
        System.out.println("str1 is "+str1);
        System.out.println("str1 is "+str1.length());
        System.out.println("str1's capacity is "+str1.capacity());
        System.out.println("str1 append fnct works as "+str1.append(", India is here!!"));
        System.out.println("str1 insert fnct works as "+str1.insert(0,"!!"));
        
        
        Runtime runtime= Runtime.getRuntime();
        System.gc();
        System.out.println("Total memory before starting is "+(runtime.totalMemory()/(1024*1024)));
        System.out.println("Free memory before starting is "+(runtime.freeMemory()/(1024*1024)));
        System.out.println("Used memory before starting is "+((runtime.totalMemory()- runtime.freeMemory())/(1024*1024)));
       
       for (int i=0; i< 50000;i++){
            str1.append("India is here");
        }
        
        System.out.println("Total memory after finishing is "+(runtime.totalMemory()/(1024*1024)));
        System.out.println("Free memory after finishing  is "+(runtime.freeMemory()/(1024*1024)));
        System.out.println("Used memory after finishing  is "+((runtime.totalMemory()- runtime.freeMemory())/(1024*1024)));
        System.gc();

    }

}
