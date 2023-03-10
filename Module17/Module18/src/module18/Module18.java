package module18;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class Module18 {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            FileInputStream in= new FileInputStream("src/module18/DBProperties");
            prop.load(in);
            String driver= prop.getProperty("DBDriver");
            //1.Register and load driver
            Class.forName(driver);
            
            String databaseName,userName,password;
            databaseName= prop.getProperty("DBName");
            userName= prop.getProperty("User");
            password= prop.getProperty("Password");
            
            //2. Get the connection
            Connection conn = DriverManager.getConnection(databaseName,userName,password);
            System.out.println(conn.isClosed()+" is conn.isClosed()");            
            //3. Write the statements.
            PreparedStatement pstmt ;
            ResultSet rs;
            pstmt = conn.prepareStatement("select sysdate from dual");
            rs=pstmt.executeQuery();rs.next();
            System.out.println("rs.getDate is "+rs.getDate("sysdate").toString());
            
            
            conn.commit();
            conn.rollback();
            
            
            conn.close();
            
            
            
            } catch (Exception e) {
            e.printStackTrace();
        } finally{
            
        }
    }

}
