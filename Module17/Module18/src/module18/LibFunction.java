/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import static module18.AddBook.addBook;

/**
 *
 * @author testuser
 */
public class LibFunction {
    public static void issueBook(Member m,Book b) {
        Connection conn = LibUtil.getConn();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;
            String qry = "select m.member_id, b.isbn_code, mbr.rec_id from members m,books b,member_book_record mbr\n" +
                                            "where m.member_id= "+m.getMemberId()+" \n" +
                                            "and b.isbn_code = '"+ b.isbnCode +"' \n" +
                                            "and m.member_id=mbr.member_id\n" +
                                            "and b.isbn_code=mbr.isbn_code and mbr.dor is null ";
            
            rs = stmt.executeQuery(qry);
            if (rs.next()) {
                System.out.println("Book already issued");
                String memberId = rs.getString(1);
                String isbnCode = rs.getString(2);
                Integer recId = rs.getInt(3);
                System.out.println(" values are "+memberId+"::"+isbnCode+"::"+recId+"::");
             }else{
                    int k = stmt.executeUpdate("insert into member_book_record values(lib_rec_seq.nextval,"+m.getMemberId()+",'"+b.isbnCode+"',sysdate,null)"); 
                    if(k>0){
                        
                        k=stmt.executeUpdate("update books set units_available= (units_available-1) where isbn_code = '"+ b.isbnCode +"' "); 
                        if(k>0){
                            System.out.println("book issued successfully");
                            conn.commit();
                            
                        }else{
                            System.out.println("book not issued");
                            conn.rollback();
                        }
                            
                    }
                     
                    else
                     System.out.println("book not issued");
            }
         

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    public static void  issueBookMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("Inside Issue Book Menu");
        System.out.println("###################################################");
        System.out.println("###################################################");
        Book b = new Book(); Member m = new Member();
        int addStatus=0;
        while(addStatus ==0){
            try {
                System.out.println("Enter Book ISBN ");
                b.setIsbnCode(sc.nextLine());
                System.out.println("Enter Member Id ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));
                issueBook(m,b);
                addStatus=1;
            } catch (Exception e) {
                addStatus=0;
            }
        }
    }
    
    public static void returnBookMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("Inside Return Book Menu");
        System.out.println("###################################################");
        System.out.println("###################################################");
        Book b = new Book(); 
        Member m = new Member();
        int addStatus=0;
        while(addStatus ==0){
            try {
                System.out.println("Enter Book ISBN ");
                b.setIsbnCode(sc.nextLine());
                System.out.println("Enter Member Id ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));
                returnBook(m,b);
                addStatus=1;
            } catch (Exception e) {
                addStatus=0;
            }
        }
    }
    
    public static void returnBook(Member m,Book b) {
        Connection conn = LibUtil.getConn();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;
            String qry = "select m.member_id, b.isbn_code, mbr.rec_id from members m,books b,member_book_record mbr\n" +
                                            "where m.member_id= "+m.getMemberId()+" \n" +
                                            "and b.isbn_code = '"+ b.isbnCode +"' \n" +
                                            "and m.member_id=mbr.member_id\n" +
                                            "and b.isbn_code=mbr.isbn_code and mbr.dor is null ";
            
            rs = stmt.executeQuery(qry);
            if (rs.next()) {
                System.out.println("Book has been issued, starting the return process");
                
                Integer recId = rs.getInt(3);
                int k=stmt.executeUpdate("update books set units_available= (units_available+1) where isbn_code = '"+ b.isbnCode +"' "); 
                
                if(k>0){
                   k=stmt.executeUpdate("update member_book_record set dor= sysdate where rec_id = "+ recId +" ");
                   if(k> 0){
                       System.out.println("Book returned successfully");
                       conn.commit();
                   } else{
                       conn.rollback();
                       System.out.println("Book not returned successfully");
                   }
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }        

}
