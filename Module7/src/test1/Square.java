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
public class Square extends Rectangle{
    int side;
    
    public  int getArea(){
        return this.side * this.side;
    }
    public  int getArea(int s){
        return this.side * s;
    }
    public static void main(String args[]){
        Square s = new Square();
        s.side=4;
        System.out.println(" the values are "+s.getArea(6));
    }

}
