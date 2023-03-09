/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class VariableReference {
    
    public static void changeVariableValue(int a){
        a = a + 10;
        System.out.println("inside changeVariableValue method and value of a is inside "+a);
    }
    
    public static void changeVariableValue(testRefVar a){
        a.val = 19;
        System.out.println("inside changeVariableValue method and value of refVar is inside "+a.val);
    }
    
    public static void main(String args[]){
        int a = 4;
        System.out.println("Value of a before calling is  "+a);
        changeVariableValue(a);
        System.out.println("Value of a after calling is  "+a);
        
        testRefVar refVar=new testRefVar();
        refVar.val = 4;
        System.out.println("Value of refVar before calling is  "+refVar.val);
        changeVariableValue(refVar);
        System.out.println("Value of refVar after calling is  "+refVar.val);
        
    }
}
class testRefVar{
    int val;
}
