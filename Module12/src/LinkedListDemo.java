
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class LinkedListDemo {
   public static void main(String args[]){
       stackDemo stack = new stackDemo();
       stack.push("obj1");stack.push("obj2");stack.push("obj3");stack.push("obj4");stack.push("obj5");
       System.out.println(stack.ll);
       System.out.println(" after pop "+stack.pop());
       System.out.println(stack.ll);
       System.out.println(" after pop "+stack.pop());
       System.out.println(stack.ll);
       System.out.println(" after pop "+stack.pop());
       System.out.println(stack.ll);
   }
    
}
class stackDemo{
    LinkedList ll =new LinkedList();
    public void push(Object o){
        ll.addFirst(o);
    }
    public Object pop(){
        return ll.removeFirst();
    }
}