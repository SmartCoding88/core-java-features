/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sync;

import java.util.LinkedList;

/**
 *
 * @author testuser
 */
public class ThreadInteractionDemo {
    public static void main(String args[]){
        LinkedList sharedResource = new LinkedList();
        Producer p = new Producer(sharedResource);
        Consumer c = new Consumer(sharedResource,"c");
        Consumer c2 = new Consumer(sharedResource,"c2");
        p.start();c.start();c2.start();
    }
}
class Producer extends Thread{
    LinkedList sharedResource;
    Producer(LinkedList sharedResource){
        super("Producer");
        this.sharedResource = sharedResource;
    }
    public void run(){
        for(int i=0;i<5;i++){
            synchronized(sharedResource){
                while(!sharedResource.isEmpty()){
                    try{
                        System.out.println("In the wait mode in producer as the sharedResource is not empty");
                        sharedResource.wait();
                    }catch(InterruptedException ioe){
                        System.err.println("Caught exception in producer");
                    }
                    
                }
                System.out.println("In producer adding "+i+" and "+(i+1));
                sharedResource.add(i);
                sharedResource.add(i+1);
                sharedResource.notifyAll();
            }
        }
    }
    
}

class Consumer extends Thread{
    LinkedList sharedResource;
    Consumer(LinkedList sharedResource,String name){
        super("Consumer "+name);
        this.sharedResource = sharedResource;
    }
    public void run(){
        for(int i=0;i<5;i++){
            synchronized(sharedResource){
                while(sharedResource.isEmpty()){
                    try{
                        System.out.println("In the wait mode in consumer as the sharedResource is empty");
                        sharedResource.wait();
                    }catch(InterruptedException ioe){
                        System.err.println("Caught exception in consumer");
                    }
                    
                }
                sharedResource.remove();
                System.out.println("Removing from consumer "+i+" & "+Thread.currentThread().getName());
                try{
                Thread.currentThread().sleep(200);
                }
                catch(InterruptedException ioe){
                        System.err.println("Caught exception in consumer");
                    }
                sharedResource.notify();
            }
        }
    }
}