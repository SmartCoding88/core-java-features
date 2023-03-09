/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

/**
 *
 * @author khouloud
 */
public class Module4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ifDemo();
//        forDemo();
//        whileDemo();
          breakDemo();
          //continueDemo();
        
//        switchDemo();

    }
    public static void ifDemo(){
        int i =20;
        //1st If
        if(i==20){
            System.out.println("Inside 1st if loop");
        }
        
        //2nd If
        if(i>20){
            System.out.println("Inside 2nd if loop");
        }
        else{
            System.out.println("Inside 2nd else loop");
        }
        
        //3rd if
        if(i>20){
            System.out.println("Inside 3rd if loop");
        }
        else if(i> 10){
            System.out.println("Inside 3rd else if loop");
        }
        else {
            System.out.println("Inside 3rd else loop");
        }
    }
    public static void forDemo(){
        
        //1st for
        System.out.println("1st for demo ");
        for(int i=0; i< 5; i++){
            System.out.println(" value of i is "+i);
        }
        
        //2nd for 
        System.out.println("2nd for demo ");
        for(int j=0; ; j++){
            if(j >= 5) break;
            System.out.println(" value of j is "+j);
        }
        
        //3dd for 
        System.out.println("3rd for demo ");
        for(int k=0; ; ){
            if(k >= 5) break;
            System.out.println(" value of k is "+k);
            k++;
        }
        
    }
    
    public static void whileDemo(){
        
        //1st while
        int i =3;
        System.out.println("1st while demo ");
        while(i< 5){
            System.out.println(" value of i is "+i);
            i++;
        }
        
        //2nd while 
        int j =0;
        System.out.println("2nd while demo ");
        while(true){
            if(j >= 5) break;
            System.out.println(" value of j is "+j++);
        }
        
        //3rd while 
        int k =0;
        do{
            System.out.println(" value of k is "+k++);
        }while(k >=5);
        
    }
    public static void breakDemo(){
        
        //1st break
        int k =0;
        System.out.println("1st break demo ");
        while(true){
            if(k >= 5) break;
            System.out.println(" value of k is "+k++);
        }
        
        //2nd break
        test1: for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j > 2) break test1 ;
                System.out.println(" value of i & j is "+i+" & "+j);
            }
        }

    }
    public static void continueDemo(){
        
//        //1st continue
//        int k =0;
//        System.out.println("1st continue demo ");
//        while(k < 5){
//            if(k == 2) continue;
//            System.out.println(" value of k is "+(k++));
//        }
        
        //2nd break

        test1:
            for(int i=0;i<5;i++){
            
            for(int j=0;j<5;j++){
                if(j > 1) continue test1 ;
                System.out.println(" value of i & j is "+i+" & "+j);
                
                if(i > 2) break test1;
            }
            
        }

    }
    public static void switchDemo(){
        int i = 15;
        switch(i){
            case 1: System.out.println(i);
                    break;
            case 2: System.out.println(i);
                    break;
            case 10: System.out.println(i);
                    break;
            default: System.out.println("default");
                    break;
                         
        }
    }
}
