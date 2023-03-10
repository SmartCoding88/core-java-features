/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sync;

import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author testuser
 */
public class TestThreadHashSet {

    public static void main(String args[]) {
        HashSet set = new HashSet();
        withoutThread();
        withThread();
    }

    static void withoutThread() {
        HashSet set = new HashSet();
        Random random = new Random();
        int[] n = new int[15000];
        for (int i = 0; i < n.length; i++) {
            for (int i1 = 0; i1 < n.length; i1++) {
                n[i1] = random.nextInt(10);
            }
        }
        long l = System.nanoTime();
        System.out.println("Time start is " + l);
        for (int i : n) {
            set.add(i);
        }
        long timeTaken = (System.nanoTime() - l)/1000000;
        System.out.println("Time to end is  " + timeTaken);

    }

    static void withThread() {
        HashSet set = new HashSet();
        Random random = new Random();
        int[] n = new int[15000];
        for (int i = 0; i < n.length; i++) {
            for (int i1 = 0; i1 < n.length; i1++) {
                n[i1] = random.nextInt(10);
            }
        }
        long l = System.nanoTime();
        System.out.println("Time start is " + l);

        try{
            IterateRS t1 = new IterateRS(set,n,0,4999);
            IterateRS t2 = new IterateRS(set,n,5000,9999);
            IterateRS t3 = new IterateRS(set,n,10000,14999);
            t1.setName("T1");t2.setName("T2");t3.setName("T3");
            t1.start();t2.start();t3.start();
            t1.join();
            System.out.println("Finished t1");
            t2.join();
            System.out.println("Finished t2");
            t3.join();
            System.out.println("Finished t3");

        } catch(Exception e){};
        long timeTaken = (System.nanoTime() - l)/1000000;
        //TimeUnit.SECONDS.convert(timeTaken, TimeUnit.NANOSECONDS) ;
        System.out.println("Time to end is  " + timeTaken);
    }
}

class IterateRS extends Thread {

    HashSet sharedSet;
    int startRange;
    int endRange;
    int[] arr;

    IterateRS(HashSet sharedSet, int[] arr, int start, int end) {
        this.sharedSet = sharedSet;
        this.arr = arr;
        this.startRange = start;
        this.endRange = end;
    }

    public void run() {
        for (int i = startRange; i <= endRange; i++) {
            sharedSet.add(arr[i]);
        }
        System.out.println(Thread.currentThread().getName()+ "'s job completed");
    }
}
