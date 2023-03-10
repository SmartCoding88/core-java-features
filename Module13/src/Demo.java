
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class A{};
class B extends A{};
class C extends B{};
public class Demo {
        public static void main(String[] args) {
            List<? super A> l = new ArrayList<>();
            l.add(new A());l.add(new B());l.add(new C());
            listDemo();
        }
        static void wildcardDemo(List<?> l){
            for(Object o : l){
                System.out.println("The item is "+o);
            }
        }
        
        static double wildcardDemo2(List<? extends Number> l){
            double sum =0;
            for(Number o : l){
                sum = sum + o.doubleValue();
            }
            return sum;
        }
        
       static <T> boolean isPresent(T el, Collection<T> c){
           for (T i:c){
               if(el.equals(i)) return true;
               else continue;
           }
           return false;
       }
       
       static void classDemo(){
          myQueue<String> strQ= new myQueue<>();
          strQ.enqueue("alpha");strQ.enqueue("beta");strQ.enqueue("gamma");
           System.out.println(" strQ is "+strQ.l);
           String str =strQ.dequeue();
           System.out.println(str+":: was dequeued and the strQ is "+strQ.l);
           
           myQueue<Integer> intQ= new myQueue<>();
           intQ.enqueue(1);intQ.enqueue(2);intQ.enqueue(3);
          
           System.out.println(" intQ is "+intQ.l);
           Integer int1 =intQ.dequeue();
           System.out.println(int1+":: was dequeued and the intQ is "+intQ.l);
           
            System.out.println(" is alpha presnt "+isPresent("alpha", strQ.l));
            System.out.println(" is beta presnt "+isPresent("beta", strQ.l));
            
            System.out.println(" is 1  presnt "+isPresent(1, intQ.l));
            System.out.println(" is 3 presnt "+isPresent(3, intQ.l));
            
           
           
           
           
       }
       static void listDemo(){
            List <Integer> intList = new ArrayList<>();
            List <String> strList = new ArrayList<>();
            List  intList2 = new ArrayList();
            intList.add(new Integer(1));intList.add(2);intList.add(3);
            intList2.add(1);intList2.add(2);intList2.add(3);
            strList.add("alpha");strList.add("beta");strList.add("gamma");
            //System.out.println("intList is "+intList);
            Integer i=0;
            Iterator<Integer> it = intList.iterator();
            while(it.hasNext()){
                i=it.next();
                //System.out.println(" the value is "+i);
            }
            
            wildcardDemo(intList);
            wildcardDemo(strList);
            System.out.println("sum of intList is "+wildcardDemo2(intList));
            List <Double> dList = new ArrayList<>();
            dList.add(1.2);dList.add(1.3);dList.add(1.4);
            System.out.println("sum of dList is "+wildcardDemo2(dList));
        }
       static void mapDemo(){
           Map <Integer,String> m= new HashMap<>();
           m.put(1, "alpha");m.put(2, "beta");m.put(3, "gamma");
           System.out.println("map is "+m);
           System.out.println("the value for key 2 is "+m.get(2).concat(" hello world"));
           
           Iterator<Integer> keyIt= m.keySet().iterator();
           while(keyIt.hasNext()){
               System.out.println("map has "+m.get(keyIt.next()).toUpperCase());
           }
       }
  }

class myQueue<T>{
    LinkedList<T> l = new LinkedList<>();
    public void enqueue(T obj){
        l.addLast(obj);
    }
    public T dequeue(){
        return l.removeFirst();
    }
}