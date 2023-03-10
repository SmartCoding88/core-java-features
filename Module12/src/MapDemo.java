
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import javafx.scene.layout.Priority;


public class MapDemo {
    public static void main(String[] args) {
        Map m = new TreeMap();
        System.out.println("1. Map is  "+m);
        
        m.put(1,"alpha");
        m.put(2,"beta");
        m.put(3, "gamma");
        System.out.println("2. Map after put is  "+m);
        
        m.remove(2);
        System.out.println("3. Map after remove 2 is  "+m);
        
        m.put(2,"beta");m.put(4, "omega");
        Iterator it = m.keySet().iterator();
        while(it.hasNext()){
            System.out.println("The values inside map is "+m.get(it.next()));
                    
        }
        
        
        
        
    }
            
            
    
}
