
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class MultipleExceptionDemo {
    public static void main(String args[]){
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            String urlString = br.readLine();
            URL url = new URL(urlString);
            br= new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println(""+br.readLine());
        }
//        catch(MalformedURLException mue){
//            System.out.println("Reached inside malformed exception block");
//        }
        catch(IOException ioe){
            System.out.println("Reached inside IOexception block");
        }
        
       
        catch(Exception e){
            System.out.println("Reached inside exception block");
        }
        finally{
            System.out.println("Reached inside finally block");
        }
        
    }

}
