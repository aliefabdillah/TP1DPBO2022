package entitas;

public class ent_Autor {
    private int id_author;
    private byte[] img;
    private String namaAutor;
    private int jmlh_buku;
    private String dirGambar;
    
    public ent_Autor(){
        
    }
    
    public ent_Autor(byte[] img, String namaAutor, int jmlh_buku) {
        this.img = img;
        this.namaAutor = namaAutor;
        this.jmlh_buku = jmlh_buku;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }
        
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getNamaAutor() {
        return namaAutor;
    }

    public void setNamaAutor(String namaAutor) {
        this.namaAutor = namaAutor;
    }

    public int getJmlh_buku() {
        return jmlh_buku;
    }

    public void setJmlh_buku(int jmlh_buku) {
        this.jmlh_buku = jmlh_buku;
    }

    public String getDirGambar() {
        return dirGambar;
    }

    public void setDirGambar(String dirGambar) {
        this.dirGambar = dirGambar;
    }
    
    
}
