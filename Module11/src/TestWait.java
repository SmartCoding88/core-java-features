
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author testuser
 */
public class TestWait {

    public static void main(String args[]) {
        LinkedList sharedData = new LinkedList();
        Producer p = new Producer(sharedData);
        Consumer c = new Consumer(sharedData);
        p.start();
        c.start();
    }

}

class Producer extends Thread {

    LinkedList sharedData;

    Producer(LinkedList sharedData) {
        super("Producer");
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            synchronized (sharedData) {
                while (!sharedData.isEmpty()) {
                    try {
                        System.out.println("SharedData has some values so waiting");
                        sharedData.wait();
                    } catch (Exception e) {
                        System.out.println("Reached exception in producer");
                    }
                }
                sharedData.add(i);
                System.out.println("Added in sharedData value ::" + i);
                sharedData.notify();
            }

        }
    }
}

class Consumer extends Thread {

    LinkedList sharedData;

    Consumer(LinkedList sharedData) {
        super("Consumer");
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            synchronized (sharedData) {
                while (sharedData.isEmpty()) {
                    try {
                        System.out.println("SharedData has no values so waiting");
                        sharedData.wait();
                    } catch (Exception e) {
                        System.out.println("Reached exception in consumer");
                    }
                }
                sharedData.remove();
                System.out.println("Deleted from sharedData value ::" + i);
                sharedData.notify();
            }

        }
    }
}
