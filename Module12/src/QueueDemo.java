
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        System.out.println("1. the values in q is "+q);
        
        q.add(1);q.add(4);q.add(3);q.add(2);
        System.out.println("2. the values in q after insertion is "+q);
        
        System.out.println("3. The peek operator would give "+q.peek());
        System.out.println("4. the values in q after peek is "+q);  
        
        System.out.println("5. The poll operator would give "+q.poll());
        System.out.println("6. the values in q after poll is "+q);  
        
        System.out.println("7. The remove operator would give "+q.remove());
        System.out.println("8. the values in q after remove is "+q);  
        
        
    }

}
