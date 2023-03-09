/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class FirstJavaClass {
    
    String name ;
    
    String getName()
    {
        return name;
    }

    public static void main(String args[]){
        FirstJavaClass testObj = new FirstJavaClass();
        System.out.println(testObj.getName());
        
        FirstJavaClass testObj2 = new FirstJavaClass();
    }
}
