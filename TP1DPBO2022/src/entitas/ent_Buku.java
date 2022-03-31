package entitas;

import java.io.Serializable;

public class ent_Buku implements Serializable {
    private int id_buku;
    private byte[] img;
    private String penerbit;
    private String autor;
    private String desc;

    public ent_Buku(byte[] img, String penerbit, String autor, String desc) {
        this.img = img;
        this.penerbit = penerbit;
        this.autor = autor;
        this.desc = desc;
    }

    public ent_Buku() {
        
    }
    
    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }
    
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
