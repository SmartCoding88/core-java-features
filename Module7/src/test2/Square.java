/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test2;

import test1.Rectangle;

/**
 *
 * @author testuser
 */
public class Square extends Rectangle{
    int side;
    public Square(){
        System.out.println("In const for square");
    }
    public Square(int side){
        super(side,side);
        this.side=side;
        System.out.println("In const for square with variable "+side);
    }
        
    public static void main(String args[]){
        Square s = new Square();
        Square s1=  new Square(7);
//        System.out.format("The values of s1 are %s,%s,%s \n",s1.side,s1.length,s1.width);
//        System.out.format("The values of s1 area is %s \n",s1.getArea());
//        
        Rectangle parent = new Square(6);
        System.out.format("The values of parent's area is %s \n",parent.getArea());
        
        Square child=null;
        //child = (Square)parent;
        
               
        if(child instanceof Rectangle)
               System.out.println("it is an insatnce of rectangle");
        
        
        
        
  
    }
    public int getArea(){
        
        System.out.println("Inside square's area method");
        return //super.getArea();
        this.side * this.side;
    }

}
