/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ThreadDemo {

    public static void main(String args[]) {
        ThreadExtendClass t1 = new ThreadExtendClass();
        t1.setName("FirstThread");
        t1.setPriority(1);
        
        
        ThreadExtendClass t2 = new ThreadExtendClass();
        t2.setName("SecondThread");
        t2.setPriority(1);
        
        try{
                t1.start();
                t1.join();
                System.out.println("Before putting t2 in runnable state");
                t2.start();
                
        }catch(InterruptedException ie){
            System.err.print(ie);
        }
        

    
    }
}

class ThreadExtendClass extends Thread {

    public void run() {
        try{
            for(int i=0;i<5;i++){
            System.out.println(" For iteration i ::"+i+"::Thread Extends example and thread is::  "+Thread.currentThread().getName());
                      
         }
        }catch(Exception ie){
            System.err.print(ie);
        }
        
        

    }
}

class ThreadImplementsRunnableClass implements Runnable {

    public void run() {
        System.out.println("Thread Implements example");

    }
}
