
public class LocalClassDemo {
    public static void main(String[] args) {
    //        test();
        
       StaticOuter.StaticNested  i= new StaticOuter.StaticNested();
       i.printStr();
       
    }
    
    static void test(){
        class localInner{
            String str;
//="local inner string";
            void printStr(){
            }
        }
        localInner i = new localInner();
        i.printStr();
        
        
    }
}

class StaticOuter{
    static String str123="Static Outer";
    static class StaticNested{
        static void printStr(){
            System.out.println("Inside the nested class ");
        }
    }
}