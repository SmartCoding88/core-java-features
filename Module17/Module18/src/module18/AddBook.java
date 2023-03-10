/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module18;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author testuser
 */
public class AddBook {

    public static void addBookMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("Inside Add Book Menu");
        System.out.println("###################################################");
        System.out.println("###################################################");
        Book b = new Book();
        int addStatus=0;
        while(addStatus ==0){
            try {
                System.out.println("Enter Book ISBN ");
                b.setIsbnCode(sc.nextLine());
                System.out.println("Enter Book Name ");
                b.setBookName(sc.nextLine());
                System.out.println("Enter Book description ");
                b.setBookDesc(sc.nextLine());
                System.out.println("Enter Author Name");
                b.setAuthorName(sc.nextLine());
                System.out.println("Enter Subject");
                b.setSubjectName(sc.nextLine());
                System.out.println("Enter Units");
                b.setUnitsAvailable(Integer.parseInt(sc.nextLine()));
                addBook(b);
                addStatus=1;
            } catch (Exception e) {
                addStatus=0;
            }
        }
        
        
    }

    public static void addBook(Book b) {
        Connection conn = LibUtil.getConn();

        try {
            Statement st = conn.createStatement();
            String str1 = b.isbnCode;
            String str2 = b.bookName;
            String str3 = b.bookDesc;
            String str4 = b.authorName;
            String str5 = b.subjectName;
            Integer str6 = b.unitsAvailable;

            int k = st.executeUpdate("insert into books values('" + str1 + "','" + str2 + "','" + str3 + "','" + str4 + "','" + str5 + "'," + str6 + ")");
            if (k > 0) {
                System.out.println("books are added successfully");
                conn.commit();
            } else {
                System.out.println("books are not added");
                conn.rollback();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
