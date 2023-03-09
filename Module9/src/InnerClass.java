/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class InnerClass {
    
}

class Outer{
    int i=10;
    private class Inner{
        int i =20;
        void test(int i){
            System.err.println("hello inner and i is "+i);
            System.err.println("hello inner and this.i is "+this.i);
            System.err.println("hello inner and i is "+Outer.this.i);
        }
        
    }
    public static void main(String args[]){
        Outer o =new Outer();
        Outer.Inner in= o.new Inner();
        in.test(18);
        
    }
}