
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class ArrayListDemo {
    public static void main(String args[]){
        List al = new ArrayList();
        System.out.println("1.al is "+al);
        al.add(0,"obj0");
        System.out.println("2.al is "+al);
        al.add("obj1");
        System.out.println("3.al is "+al);
        al.add(0,"obj2");
        System.out.println("4.al is "+al);
        al.set(0, "obj3");
        System.out.println("5.al is "+al);
        al.remove("obj3");
        System.out.println("6.al is "+al);
        
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println("Inside the while loop and the elemnet is "+it.next());
        }
        
        
    }
}