/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class WrapperDemo {
    public static void main(String args[]){
        int i = 5;
        Integer I = new Integer(0);
        String fName="Hello";String lName="World";
       System.out.println("checksum value of 2 ints is "+checksum(1,2));
       System.out.println("checksum value of 4 ints is "+checksum(1,2,3,4));
       
        System.out.println(" The value of first name is "+fName+" and last name is "+lName);
        System.out.format(" The value of first name is %s and value of last name is %s and display name is %s\n", fName,lName,(fName+"_"+lName));
        
    }
public static int checksum(int ... vals){
    int sum=0;
    for (int i : vals){
        sum+=i;
    }
    return sum;
}
}
