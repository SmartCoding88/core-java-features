/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class AnnonymousClassDemo {
    private String str ="Outer";

    public static void main(String[] args) {
        AbsClass a = new AbsClass() {
            void printStr() {
                System.out.println("Hello abtract");
            }
        };
        a.printStr();

        InterDemo i = new InterDemo() {

            @Override
            public void printInterStr() {
                System.out.println("Hello interface");
            }
        };
        i.printInterStr();
        test();
        Outer1.Nested n =  new Outer1.Nested();
        n.test1();
        
        Outer1.Nested.test1();
        
        
    }
    static void test(){
        final String str ="method";
        class inner{
            String str ="local inner";
            void printStr(){
                System.out.println("hello local inner "+str);
            }
        }
        inner i = new inner();
        i.printStr();
    }
}
 class Outer1 {
     String str="test123";

  public static class Nested {
      static void test1(){System.out.println("hello static");}

  }

}

abstract class AbsClass {

    abstract void printStr();
}

interface InterDemo {

    void printInterStr();
}
