
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class SystemClass {
    public static void main(String[] args) {
        System.out.printf("%010d", 100);
        
//        long startTime = System.nanoTime();
//        System.out.println("Hello print");
//        System.err.println("Hello error");
//        //System.out.println("The user's input  string is "+getTestUsersInput());
//        long endTime = System.nanoTime();
//        
//        System.out.println(" time taken in ms "+(endTime-startTime));
//        
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("java.vendor"));
//        System.setProperty("java.demo", "core java");
//        System.out.println(System.getProperty("java.demo"));
    }
    public static String getTestUsersInput(){
        StringBuffer str= new StringBuffer();
        try{
        char c =(char)System.in.read();
        while(c!='\n'){
            str.append(c);
            c =(char)System.in.read();
        }
        System.out.println("c's value is "+c);
        } catch (Exception e){}
        return str.toString();
    }
}
