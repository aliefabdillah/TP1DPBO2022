/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intface;
import entitas.ent_Autor;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public interface intface_Author{
    ent_Autor insert (ent_Autor buku);
    void deleteDataAuthor (String id_buku);
    void updateDataAuthor (ent_Autor buku, String id);
}
