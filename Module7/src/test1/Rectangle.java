/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author testuser
 */
public class Rectangle {
    public Rectangle (){
        System.out.println("Coming in rectangle's const");
    }
    public Rectangle(int l,int b){
        this.length=l;
        this.width=b;
        System.out.format("Coming in rectangle's const with values %s and %s",l,b);
    }
    public int length=1;
    public int width=2;
    
    public int getArea(){
        System.out.println("Inside rectangle's area method");
        return this.length * this.width;
    }
    
}
