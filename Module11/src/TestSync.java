/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class TestSync implements Runnable {
private Acct ourAcct= new Acct();

public void run(){
    int b=0;
    
        for(int i=0;i<5;i++){
            withdraw(10);
            if(ourAcct.getBal()<0)
                System.out.println("Overdraw "+ourAcct.getBal());
        }
    
}
public  void withdraw(int amt){
    //synchronized(this){
    try{
        System.out.println("ourAcct.getBal() is "+ourAcct.getBal());
    if(amt <= ourAcct.getBal()) {
        System.out.println("Amt Rs."+amt+" will be taken by "+Thread.currentThread().getName());
        //Thread.currentThread().sleep(100);
        ourAcct.withdrawAmt(amt);
        
    }else{
        System.out.println("Request to withdraw Amt Rs."+amt+" failed by "+Thread.currentThread().getName());

    }
    }catch(Exception e){
        System.err.print(e);
    }
    //}
}
public static void main(String args[]){
    TestSync tom= new TestSync();
    Thread t1= new Thread(tom);t1.setName("Tom");
    Thread t2= new Thread(tom);t2.setName("Harry");
    t1.start();t2.start();
}
}
class Acct{
    private int bal=50;
    public int getBal(){
        return bal;
    }
    public void withdrawAmt(int amt){
        bal = bal-amt;
    }
}
