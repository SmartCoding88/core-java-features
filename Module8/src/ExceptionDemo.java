/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ExceptionDemo {
    public static void main(String args[]){
        try{     
            print();
        
        }
        catch(Exception e){
            System.out.println("Some execption ");
//            e.printStackTrace();
            e.getCause().getStackTrace();        }
        
    }
    public static void print(){
        int num = 25;
        try{
           for (int i =0; i<=25;i++){
            if(num%i == 0)
                System.out.format("%s divides %s \n",i,num);
            }
        }
        catch(Exception e){
            System.out.println("Some execption has happened and we are inside the exception block");
            ArithmeticException ae= new ArithmeticException("Error has happened");
            ae.initCause(e);
            throw ae;
        }
        finally {
            System.out.println("We are inside the finally block");
        }
    }
}
