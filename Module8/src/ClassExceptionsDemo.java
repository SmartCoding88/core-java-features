
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ClassExceptionsDemo {
    public static void main(String args[]){
        try{
            int input = readData();
            System.out.println("Getting the input "+input);
            printDiv(input);
        }
        
        catch(NumberFormatException nfe){
            System.out.println("Inside nfe");
        }
        catch(IOException io){
            System.out.println("Inside ioe");
        }
        catch(Exception e){
            System.out.println("Inside e");
        }
        finally{
            System.out.println("Inside finally");
            
        }
        
    }
    
    public static void printDiv(int in) throws IOException{
//        try{
           for (int i =1; i<=25;i++){
            if(in%i == 0)
                System.out.format("%s divides %s \n",i,in);
            }
//        }
//        catch(Exception e){
//            System.out.println("Some execption has happened and we are inside the exception block");
//        }
    }
    
    public static int readData() throws NumberFormatException,IOException,UDException{
        int retVal=0;
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String numberStr = br.readLine();
        retVal= Integer.parseInt(numberStr);
        br.close();
        
        return retVal;
    }
}
class UDException extends Exception{
    public UDException(String message){
        super(message);
    }
}