/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Koneksi {
    public static Connection cekKoneksi;
    public static Statement stm;
    
    public static Connection getCekKoneksi(){
        if (cekKoneksi == null) {
            try {
                String url ="jdbc:mysql://localhost/db_tp1";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cekKoneksi = (Connection) DriverManager.getConnection(url, user, pass);
                stm = cekKoneksi.createStatement();
                
                System.err.println("koneksi berhasil;");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        return cekKoneksi;
    }
}
