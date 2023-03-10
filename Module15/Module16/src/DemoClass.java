import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnn(name="JavaUser",value="alpha")
public class DemoClass {
    private int intField=10;
    public String strField="hello";
    public DemoClass() {
        System.out.println("hello 0");
    }
    public DemoClass(int i) {
        System.out.println("hello 1");
    }
    public DemoClass(int i, int j) {
        System.out.println("hello 2");
    }
    void testClass() {
        try {
            DemoClass obj = new DemoClass();
            System.out.println("obj's class is ::" + obj.getClass());
            String className = "java.lang.String";
            Class testClass = Class.forName(className);
            System.out.println("new class is " + testClass.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void testConstructor() {
        try {
            String className = "DemoClass";
            Class testClass = Class.forName(className);
            Constructor[] c = testClass.getConstructors();
            for (Constructor c1 : c) {
                System.out.println("And cons is " + c1.getName());

            }
            Constructor c2 = testClass.getConstructor(new Class[]{int.class, int.class});
            System.out.println("And cons with int is " + c2.getName());
            DemoClass d = (DemoClass) c2.newInstance(2, 4);
        } catch (Exception e) {
        }
    }
    void testmethods(){
        try {
            DemoClass d = new DemoClass();
            Method[] m = d.getClass().getDeclaredMethods();
            for (Method m1 : m) {
                System.out.println("m is "+m1.getName());
                Annotation[] an= m1.getAnnotations();
                System.out.println("m1.an.length "+an.length);
                for (Annotation an1 : an) {
                System.out.println("an is "+an1.annotationType());
            }
            }
            Method m2 = d.getClass().getDeclaredMethod("helloWorld",new Class[]{int .class});
            m2.setAccessible(true);
            System.out.println(" m2 is "+m2.getName()+" ::"+m2.getReturnType());
            
            Object retVal = m2.invoke(d, new Object[]{20});
            System.out.println("retVal is "+retVal);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     @Deprecated
    void helloWorld(){System.out.println("hello void void");}
    private String helloWorld(int i){System.out.println("hello "+i);return "str success";}
    
}
class testDemo{
    public static void main(String[] args) {
        try {
            DemoClass d = new DemoClass();
            Method[] m = d.getClass().getDeclaredMethods();
            for (Method m1 : m) {
                Annotation[] an = m1.getAnnotations();
                for (Annotation an1 : an) {
                    System.out.println(" The annotation is "+an1.toString());
                }
            }
            
            Annotation[] an2= d.getClass().getAnnotations();
            for (Annotation an1 : an2) {
                    System.out.println(" The class annotation is "+an1.toString());
                }
       
        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String name();
    String value();
}