/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author testuser
 */
public class ObjectDemo implements Cloneable {

    int val;
    String info;

    public ObjectDemo(int val, String info) {
        this.val = val;
        this.info = info;
    }
    
    public ObjectDemo() {
        this.val = 0;
        this.info = "info";
    }
    
    public static void main(String args[]) {
        try {
            ObjectDemo o = new ObjectDemo(10, "Hello");
            System.out.println("o's values are " + o.val + "::" + o.info);

            ObjectDemo o2 = new ObjectDemo(20, "New Value");
            System.out.println("o and o2's comparison " + o.equals(o2));
            
            ObjectDemo o3 = (ObjectDemo) o.clone();
            System.out.println("o and o3's comparison " + o.equals(o3));
            
            System.out.println("O's hashcode value is "+o.hashCode());
            System.out.println("O2's hashcode value is "+o2.hashCode());
            System.out.println("O3's hashcode value is "+o3.hashCode());
            
            
            
            System.gc();
        } catch (Exception e) {
            System.err.println("hi");
            e.printStackTrace();
        }

    }

    protected void finalize(){
        System.out.println("Inside Object demo's finalize method " );
    }
    public int hashCode(){
        int code=1;
        code = code * 11 + val;
        code = code *13 + info.hashCode();
        return code;
    }
    
    public boolean equals(ObjectDemo obj) {
        if ((this.val == obj.val) && (this.info == obj.info)) {
            return true;
        } else {
            return false;
            
            
        }
    }

}
