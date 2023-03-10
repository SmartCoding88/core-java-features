
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.Paths;
import java.nio.file.Path;
import lombok.Data;

public class ByteStreamDemo {
    static void callStreamDemo(){
        try {
            int size=0;
            int i=0;
            byte[] arr = new byte[256];
            InputStream in = new FileInputStream("src/inputFile.txt");
            OutputStream out = new FileOutputStream("src/inputFile2.txt");
            
            while((i=in.read(arr))!= -1){
                size++;
                out.write(arr,0,i);
            }
            in.close();
            out.close();
            System.out.println("The size of array is "+size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void charDemo(){
        try {int i=0;
            char[] charArr = new char[256];
            FileReader fin = new FileReader("src/inputFile.txt");
            PrintWriter pw = new PrintWriter(System.out);
            
            while((i=fin.read(charArr))!= -1){
                pw.write(charArr, 0, i);
            }
            fin.close();pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    static void BRDemo(){
        try {
            String str="";
            BufferedReader br = new BufferedReader(new FileReader("src/inputFile.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("src/inputFile3.txt"));
            while((str=br.readLine()) != null){
                wr.write(str);wr.newLine();
                
            }
            br.close();wr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void objectDemo(){
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/cust.dat"));
            Customer c1= new Customer("customer", 12);
            o.writeObject(c1);
            o.close();
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/cust.dat"));
            Customer c2= (Customer)in.readObject();
            System.out.println(c2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Customer c1= new Customer("customer", 12);
        System.out.println("info ::"+c1.getName()+":: "+c1.getId());
                
        
        
    }
    
}
@Data
class Customer implements Serializable {
    String name;
    Integer id;
    Customer(String name,Integer id){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString(){
        @SuppressWarnings("unused")
        int i;
        
        return "Name of customer::"+this.name+" and id is ::"+this.id;
    }
}