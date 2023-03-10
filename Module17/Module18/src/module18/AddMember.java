/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module18;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
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
public class AddMember {

    public static void addMemberMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.println("###################################################");
        System.out.println("Inside Add Member Menu");
        System.out.println("###################################################");
        System.out.println("###################################################");
        Member m = new Member();
        int addStatus=0;
        while(addStatus ==0){
            try {
                System.out.println("Enter Member ID ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter Member Name ");
                m.setMemberName(sc.nextLine());
                
                addMember(m);
                addStatus=1;
            } catch (Exception e) {
                addStatus=0;
            }
        }
        
        
    }

    public static void addMember(Member m) {
        Connection conn = LibUtil.getConn();

        try {
            Statement st = conn.createStatement();
            Integer str1 = m.getMemberId();
            String str2 = m.getMemberName();

            int k = st.executeUpdate("insert into members values(" + str1 + ",'" + str2 + "',sysdate)");
            if (k > 0) {
                System.out.println("member added successfully");
                conn.commit();
            } else {
                System.out.println("member are not added");
                conn.rollback();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
