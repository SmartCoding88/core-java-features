/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class Account {
    public Account(){
        System.out.println("Called first from main : Default Constructor");
    }
    
    public Account(String accoountNumber, String accountType, long amount){
        System.out.println("Called first from main : Constructor with Args");
        this.accoountNumber=accoountNumber;
        this.accountType=accountType;
        this.amount=amount;
    }
            
            
    private String accoountNumber;
    private String accountType;
    private long amount;
    
    public boolean withdrawAmount(long amt){
        if(amt > amount) return false;
        else{
            amount = amount -amt;
            return true;
        }
    }
    
    public boolean depositAmount(long amt){
        if(amt < 0) return false;
        else {
            amount = amount + amt;
            return true;
        }
    }
    
    void setAccountNumber(String actNum){
        accoountNumber=actNum;
    }
    
    public String getAccountNumber(){
        return accoountNumber;
    }
    
    void setAccountType(String actType){
        accountType=actType;
    }
    
    public String getAccountType(){
        return accountType;
    }
    public static void main(String args[]){
        Account testObj= new Account();
        testObj.accoountNumber = "SB_101";
        testObj.accountType="SB";
        testObj.amount = 100;
        System.out.println("My testObj's initial values "+testObj.accoountNumber+"::"+testObj.accountType+"::"+ testObj.amount);
        
        Account testObj2 = new Account("SB_102","SB",1000);
        System.out.println("My testObj2's initial values "+testObj2.accoountNumber+"::"+testObj2.accountType+"::"+ testObj2.amount);
       
        
    }

}
