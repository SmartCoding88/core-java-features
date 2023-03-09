
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
public class ArraysDemo {
    public static void main(String args[]){
        int[] intArray= new int[]{1,2,2};
        
        int[][] twoDArray= new int[2][];
        twoDArray[0]= new int[]{1,2,3,4};
        twoDArray[1]= new int[]{5,6};
        for (int[] i : twoDArray){
            for(int j: i){
                System.out.print(" "+j);
            }
             System.out.println(" ");
        }
        intArray = Arrays.copyOf(intArray, 5);
         for(int j: intArray){
                System.out.println("Value after copy of "+j);
            }
        intArray = Arrays.copyOfRange(intArray,2,5);
        for(int j: intArray){
                System.out.println("Value after copy of "+j);
            }
    }

}
