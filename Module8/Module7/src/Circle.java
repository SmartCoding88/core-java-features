/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class Circle extends Shape{
    int radius;
    final static double PI =3.14;
    
    public double getArea(){
        return PI*radius*radius;
    }
    
    public double getCircumference(){
        return 2*PI*radius;
    }
}
