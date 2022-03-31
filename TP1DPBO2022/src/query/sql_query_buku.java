/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package query;
import com.mysql.jdbc.PreparedStatement;
import dbConnection.Koneksi;
import entitas.ent_Buku;
import intface.intface_Buku;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class sql_query_buku implements intface_Buku{
    public sql_query_buku(){}
    
    
    @Override
    public ent_Buku insert(ent_Buku buku){
        try {
            java.sql.PreparedStatement ps = Koneksi.getCekKoneksi().prepareStatement("insert into tbl_buku (id_buku"
                    + ",img_buku,penerbit,author,desc_buku)value(null,?,?,?,?)");
            
            ps.setBytes(1, buku.getImg());
            ps.setString(2, buku.getPenerbit());
            ps.setString(3, buku.getAutor());
            ps.setString(4, buku.getDesc());
            ps.executeUpdate();
            
            ResultSet st = ps.getGeneratedKeys();
            if (st.next()) {
                buku.setId_buku(st.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
            return buku;
        } catch (SQLException ex) {
            Logger.getLogger(sql_query_buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deleteDataBuku(String id_buku){
        
        try {
            java.sql.PreparedStatement ps = Koneksi.getCekKoneksi().prepareStatement("delete from tbl_buku where id_buku=?");
            ps.setString(1, id_buku);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void updateDataBuku(ent_Buku buku, String id){
        try {
            java.sql.PreparedStatement ps = Koneksi.getCekKoneksi().prepareStatement("update tbl_buku set img_buku=?"
                    + ",penerbit=?,author=?,desc_buku=? where id_buku=?");
            
            ps.setBytes(1, buku.getImg());
            ps.setString(2, buku.getPenerbit());
            ps.setString(3, buku.getAutor());
            ps.setString(4, buku.getDesc());
            ps.setString(5, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Proses Update Error!");
        }
    }

}
