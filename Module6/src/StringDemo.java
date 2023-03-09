/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class StringDemo {
    public static void main(String args[]){
        String s1= "Hello world";
        String s2="Hello world";
        
        System.out.println("s1 length is "+s1.length());
        System.out.println("s1's substrng  is "+s1.substring(6));
        String[] s = s1.split(" ");
        for (String str : s){
            System.out.println("str is "+str);
        }
                 //Runtime runtime= Runtime.getRuntime();
//        System.gc();
//        System.out.println("Total memory before starting is "+(runtime.totalMemory()/(1024*1024)));
//        System.out.println("Free memory before starting is "+(runtime.freeMemory()/(1024*1024)));
//        System.out.println("Used memory before starting is "+((runtime.totalMemory()- runtime.freeMemory())/(1024*1024)));
       
//        for (int i=0; i< 50000;i++){
//            s1=s1+s2;
//        }
        
//        System.out.println("Total memory after finishing is "+(runtime.totalMemory()/(1024*1024)));
//        System.out.println("Free memory after finishing  is "+(runtime.freeMemory()/(1024*1024)));
//        System.out.println("Used memory after finishing  is "+((runtime.totalMemory()- runtime.freeMemory())/(1024*1024)));
        System.gc();
        
        

        
        
        
    }

}
