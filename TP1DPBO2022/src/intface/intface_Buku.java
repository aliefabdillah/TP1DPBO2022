/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import entitas.ent_Buku;
/**
 *
 * @author LENOVO
 */
public interface intface_Buku{
    ent_Buku insert (ent_Buku buku);
    void deleteDataBuku (String id_buku) ;
    void updateDataBuku (ent_Buku buku, String id);
    
}
