/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ClassDemo {
    public static void main(String args[]) {
        int mb =1024*1024;
        String s1=new String("hello strings");
        String s2=new String("hello again");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Used Memory before starting:"+ (runtime.totalMemory() - runtime.freeMemory()) );
        System.out.println("Free Memory before starting:"+ (runtime.freeMemory()) );
        int i=1;
        while(i<10){
            s1+=s2;
            i++;
        }
        System.out.println("Used Memory after starting:"+ (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("Free Memory after starting:"+ (runtime.freeMemory()) / mb);
        
            

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        String info =" Hello";
//        Class testClass = info.getClass();
//        System.out.println("testclass's name is "+testClass.getName());
//        
//        Class testClass2 = null;
//        try{
//        testClass2 = Class.forName("ObjectDemo");
//        System.out.println(""+testClass2.getName());
//        ObjectDemo obj1= (ObjectDemo)testClass2.newInstance();
//        System.out.println("obj's values are "+obj1.val+":"+obj1.info);
//           
//       
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        
    }

}
