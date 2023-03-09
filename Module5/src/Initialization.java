/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class Initialization {
    boolean booleanUninitializedVar; boolean booleanVar=true;
    int intUninitializedVar; int intVar=10;
    float floatUninitializedVar; float floatVar=5.9f;
    Circle circleUninitializedVar; Circle circleVar=new Circle(5);
    
    public static void main(String args[]){
        Initialization testClass = new Initialization();
        System.out.println("booleanUninitializedVar is "+testClass.booleanUninitializedVar);
        System.out.println("booleanVar is "+testClass.booleanVar);
        
        System.out.println("intUninitializedVar is "+testClass.intUninitializedVar);
        System.out.println("intVar is "+testClass.intVar);
        
        System.out.println("floatUninitializedVar is "+testClass.floatUninitializedVar);
        System.out.println("floatVar is "+testClass.floatVar);
        
        System.out.println("circleUninitializedVar is "+testClass.circleUninitializedVar);
        System.out.println("circleVar is "+testClass.circleVar.radius);
  
    }

}
