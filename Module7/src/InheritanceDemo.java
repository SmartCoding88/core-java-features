
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class InheritanceDemo {
    
    public static void main(String args[]){
        Shape s1= new Shape();
        s1.setColor("Red");
        s1.setIsFilled(Boolean.FALSE);
        
        Circle c1= new Circle();
        c1.radius=5;
               
        System.out.format("The attributes of circle c1 are %s and %s and %s is the color and %s is the isfilled \n",c1.getArea(),c1.getCircumference(),c1.getColor(),c1.IsFilled());
        
        
    }

}
