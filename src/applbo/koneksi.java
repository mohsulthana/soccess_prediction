/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class koneksi {
    static Connection conn;
    static Statement sttmnt;
    private ResultSet rs;
    
    public void koneksi() throws ClassNotFoundException{
        try {
            String URL = "jdbc:mysql://localhost/java_soccer";
            String USER = "root";
            String PASS = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
            sttmnt = conn.createStatement();
        } catch(SQLException e) {
            System.err.println("Koneksi gagal");
        }
    }
}
