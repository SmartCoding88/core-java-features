
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ObjectFile {
    public static void main(String[] args) {
        try {
            cust c=new cust("c1",1);
            
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("src/1.txt"));
            ob.writeObject(c);
            ObjectInputStream obi = new ObjectInputStream(new FileInputStream("src/1.txt"));
            cust newC =(cust)obi.readObject();
            System.out.println("newC.vals "+newC.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class cust {
    String name;
    Integer id;
    cust(){};
    cust(String name, Integer i){
        this.name=name;
        this.id=i;
    }
    public String toString(){
        System.out.println("Reached here");
        return "name::"+this.name+"::and id is ::"+this.id;
    }
}