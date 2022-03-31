/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package query;
import dbConnection.Koneksi;
import entitas.ent_Autor;
import intface.intface_Author;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class sql_query_author extends UnicastRemoteObject implements intface_Author{
    public sql_query_author() throws RemoteException{}
    
    @Override
    public ent_Autor insert(ent_Autor author) {
        try {
            java.sql.PreparedStatement ps = Koneksi.getCekKoneksi().prepareStatement("insert into tbl_author (id_author"
                    + ",img_author,nama_author,jmlh_buku) values (null,?,?,?)");
            
            ps.setBytes(1, author.getImg());
            ps.setString(2, author.getNamaAutor());
            ps.setInt(3, author.getJmlh_buku());
            ps.executeUpdate();
            
            ResultSet st = ps.getGeneratedKeys();
            if (st.next()) {
                author.setId_author(st.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
            return author;
        } catch (SQLException ex) {
            Logger.getLogger(sql_query_author.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public void deleteDataAuthor(String id_author) {
        try {
            java.sql.PreparedStatement ps =  Koneksi.getCekKoneksi().prepareStatement("delete from tbl_author where id_author=?");
            ps.setString(1, id_author);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } catch (SQLException e) {
        }
    }

    @Override
    public void updateDataAuthor(ent_Autor author, String id){
        try {
            java.sql.PreparedStatement ps = Koneksi.getCekKoneksi().prepareStatement("update tbl_author set img_author=?"
                    + ",nama_author=?,jmlh_buku=? where id_author=?");
            
            ps.setBytes(1, author.getImg());
            ps.setString(2, author.getNamaAutor());
            ps.setInt(3, author.getJmlh_buku());
            ps.setString(4, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Proses Update Error!");
        }
    }   
}
