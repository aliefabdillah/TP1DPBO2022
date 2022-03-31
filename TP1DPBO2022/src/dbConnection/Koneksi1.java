/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbConnection;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import table.tmodel_author;

/**
 *
 * @author LENOVO
 */
public class Koneksi1 {
    public static Connection cekKoneksi;
    public static Statement stm;
    
    public void getCekKoneksi(){
       
        if (cekKoneksi == null) {
            try {
                String url ="jdbc:mysql://localhost/db_tp1";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cekKoneksi = DriverManager.getConnection(url, user, pass);
                stm = cekKoneksi.createStatement();
                
                System.err.println("koneksi berhasil;");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
    public DefaultTableModel readTableAuthor(JTable tableAuthor){
        DefaultTableModel dataTable = null;
        
        tableAuthor.setDefaultRenderer(Object.class, new tmodel_author());
        tableAuthor.getColumnModel().getColumn(1).setPreferredWidth(70);
        tableAuthor.setShowHorizontalLines(true);
        
        try{
            Object[] column = {"No", "Img_Author", "Nama", "Jumlah_Buku"};
            getCekKoneksi();
            dataTable = new DefaultTableModel(null, column);
            String sql = "Select * from tbl_author";
            ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                Object[] hasil = new Object[4];
                hasil[0] = res.getString("id_author");
                      
                java.sql.Blob blob = res.getBlob(2);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                }
                ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                
                hasil[1] = new JLabel(icon);
                hasil[2] = res.getString("nama_author");
                hasil[3] = res.getInt("jmlh_buku");
                
                dataTable.addRow(hasil);        //memasukan data ke table
            }
            tableAuthor.setModel(dataTable);
            tableAuthor.setRowHeight(100);
        }catch(SQLException e){
            System.err.println("Read gagal" + e.getMessage());
        }
        
        return dataTable;
    }
    
    public DefaultTableModel readTableBuku(JTable tableBuku){
        DefaultTableModel dataTable = null;
        
        tableBuku.setDefaultRenderer(Object.class, new tmodel_author());
        tableBuku.getColumnModel().getColumn(1).setPreferredWidth(70);
        tableBuku.setShowHorizontalLines(true);
        try{
            Object[] column = {"No", "Img_Buku", "Penerbit", "Author", "Desc"};
            getCekKoneksi();
            dataTable = new DefaultTableModel(null, column);
            String sql = "Select * from tbl_buku";
            ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                Object[] hasil = new Object[5];
                hasil[0] = res.getString("id_buku");
                      
                java.sql.Blob blob = res.getBlob(2);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                }
                ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                
                hasil[1] = new JLabel(icon);
                hasil[2] = res.getString("penerbit");
                hasil[3] = res.getString("author");
                hasil[4] = res.getString("desc_buku");
                
                dataTable.addRow(hasil);        //memasukan data ke table
            }
            tableBuku.setModel(dataTable);
            tableBuku.setRowHeight(100);
        }catch(SQLException e){
            System.err.println("Read gagal" + e.getMessage());
        }
        
        return dataTable;
    }
    
    public void Query(String inputan){
        
        try{
            getCekKoneksi();
            String sql = inputan;
            stm.execute(sql);
        }catch(Exception e){
            System.err.println("Read Gagal " + e.getMessage());
        }
    }
}