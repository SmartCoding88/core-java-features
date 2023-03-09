/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourcePackage;

/**
 *
 * @author testuser
 */
public class SourceJava {
    
    public int publicInt=10;
    private int privateInt=20;
    protected int protectedInt=30;
    int defaultInt=40;
    
    public static void main(String args[]){
        SourceJava obj = new SourceJava();
        System.out.println(obj.publicInt);
        System.out.println(obj.privateInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);
    }
    
    

}
