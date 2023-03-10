
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author testuser
 */
public class ComparableDemo {
    public static void main(String args[]){
        Employee[] arr = new Employee[2];
        Employee e1= new Employee(11,"Jack",1000);
        Employee e2= new Employee(2,"Abram",2000);
        
        arr[0]=e1;
        arr[1]=e2;
        
        for(int i=0; i< arr.length;i++){
            System.out.println("The value of emp is "+arr[i].empName+" and empid is "+arr[i].empId);
        }
        Collections.sort(Arrays.asList(arr));
        System.out.println("After getting sorted using comparable");
        for(int i=0; i< arr.length;i++){
                System.out.println("The value of emp is "+arr[i].empName+" and empid is "+arr[i].empId);            
            
        }
        
        System.out.println("After getting sorted using name comparator");
        Collections.sort(Arrays.asList(arr), new EmpNameComparator());
        for(int i=0; i< arr.length;i++){
                System.out.println("The value of emp is "+arr[i].empName+" and empid is "+arr[i].empId);            
            
        }
        
        System.out.println("After getting sorted using salary comparator");
        Collections.sort(Arrays.asList(arr), new EmpSalaryComparator());
        for(int i=0; i< arr.length;i++){
                System.out.println("The value of emp is "+arr[i].empName+" and empid is "+arr[i].empId);            
            
        }
        
     }
    
}
class Employee implements Comparable{
    int empId;
    String empName;
    int salary;
    
    Employee(int empId,String empName,int salary){
        super();
        this.empId=empId;
        this.empName = empName;
        this.salary =salary;
    }
    
    public int compareTo(Object o){
        int retVal;
        if(o instanceof Employee){
            Employee e = (Employee)o;
            retVal= this.empId - e.empId;
        }
        else{
            throw new ClassCastException("Passed object is not of type Employee");
        }
        return retVal;
    }
    
}
class EmpNameComparator implements Comparator{
    public int compare(Object o1, Object o2){
        int retVal=-1;
        if((o1 instanceof Employee) && (o2 instanceof Employee)){
            Employee e1 = (Employee)o1;
            Employee e2 = (Employee)o2;
            retVal= e1.empName.compareTo(e2.empName);
        }
        else{
            throw new ClassCastException("Passed objects ars not of type Employee");
        }
        return retVal;
    }
}

class EmpSalaryComparator implements Comparator{
    public int compare(Object o1, Object o2){
        int retVal=-1;
        if((o1 instanceof Employee) && (o2 instanceof Employee)){
            Employee e1 = (Employee)o1;
            Employee e2 = (Employee)o2;
            retVal= e1.salary - e2.salary;
        }
        else{
            throw new ClassCastException("Passed objects ars not of type Employee");
        }
        return retVal;
    }
}