
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class SetDemo {
 public static void main(String args[]){
     
     Set hashSet = new LinkedHashSet();
     hashSet.add("obj1");hashSet.add("obj2");hashSet.add("obj1");
     System.out.println("1.hashset is "+hashSet);
     //hashSet.remove("obj2");
     System.out.println("2.hashset is "+hashSet);
     Iterator it= hashSet.iterator();
     while(it.hasNext()){
         System.out.println("inside while loop and value in set is "+it.next());
     }
 }
}
