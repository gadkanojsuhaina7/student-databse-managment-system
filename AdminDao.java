/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qt.apn_portal.dao;

import com.qt.apn_portal.database.Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QaswaTech_1
 */
public class AdminDao {

    public int adminLogin(String phone, String password) {
        Connection con = Database.connectDB();
        int status = 0;
        CallableStatement cs = null;
        ResultSet rs = null;
        String query = "Select * from admin where phone = ? AND password= ? ";
        try {
            cs = con.prepareCall(query);
            cs.setString(1, phone);
            cs.setString(2, password);
            rs = cs.executeQuery();
            while(rs.next()){
                status = 1 ;
            }
        } catch (Exception e) {
            System.out.println("Unable to login"+e.getMessage());
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
        return status;
    }

    public String sign_up(String name, String phone, String password) {
        
             String message = null;
        Connection con = Database.connectDB();
        PreparedStatement ps = null;
        String query = "INSERT INTO admin (name, phone, password) VALUES (?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, password);
          

            int row = ps.executeUpdate();
            if (row >= 1) {
                message = "Sign up Success Please Login.";
            }
        } catch (Exception e) {
            message = "Unable to isign up due to: " + e.getMessage();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // Handle SQLException during closing connection (optional)
                }
            }
        }
        return message;
       }
    
}
