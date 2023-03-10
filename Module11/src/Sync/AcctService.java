/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sync;

/**
 *
 * @author testuser
 */
public class AcctService implements Runnable {
    private Account jointAccount = new Account();
    public void run(){
        for(int i=0;i<5;i++){
            withdraw(10);
            if(jointAccount.getBal() < 0)
                System.out.println(" The value in joint account is "+jointAccount.getBal());
        }
        
    }
    
    public synchronized void withdraw(int amt){
        //synchronized(this){
            if(amt > jointAccount.getBal()){
                System.out.println("The amount is greater than available balance "+Thread.currentThread().getName());
            }else{
                System.out.println("The balance is available for owner "+Thread.currentThread().getName());
                jointAccount.withdrawAmt(amt);

            }
        //}
    }
    
    public static void main(String args[]){
        AcctService jointAcctService = new AcctService();
        Thread tom=new Thread(jointAcctService);
        tom.setName("Tom");
        
        Thread harry=new Thread(jointAcctService);
        harry.setName("Harry");
        
        tom.start();
        harry.start();
    }
}
class Account{
    private int bal=50;
    public int getBal(){
        return this.bal;
    }
    public void withdrawAmt(int amt){
        bal = bal - amt;
    }
}
    