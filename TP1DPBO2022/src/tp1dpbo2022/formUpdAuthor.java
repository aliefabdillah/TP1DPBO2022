/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tp1dpbo2022;

import com.mysql.jdbc.Statement;
import dbConnection.Koneksi;
import dbConnection.Koneksi1;
import entitas.ent_Autor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import query.sql_query_author;
/**
 *
 * @author LENOVO
 */
public class formUpdAuthor extends javax.swing.JDialog {
    BufferedImage image;
    String path;
    byte[] bitArray = null;
    String id;
    boolean newImage;
    /**
     * Creates new form formUpdAuthor
     */
    public formUpdAuthor() {
        initComponents();
    }
    
    public void fillFieldAuthor(String nama, String jmlh_buku, String id){
        try {
            Statement st = (Statement) Koneksi.getCekKoneksi().createStatement();
            ResultSet rs = st.executeQuery("select img_author from tbl_author where id_author="+id);
            
            while(rs.next()){
                byte[] imageData = rs.getBytes("img_author");
                ImageIcon format = new ImageIcon(imageData);
                Image img = format.getImage();
                Image image = img.getScaledInstance(imgInpAuthor.getWidth(), imgInpAuthor.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon outImg = new ImageIcon(image);
                
                this.id = id;
                imgInpAuthor.setIcon(outImg);
                txtField_inpNama.setText(nama);
                txtField_inpJmlhBuku.setText(jmlh_buku);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(formUpdBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_Author = new javax.swing.JPanel();
        label_JudulFormAuthor = new javax.swing.JLabel();
        lbl_namaAuthor = new javax.swing.JLabel();
        lbl_JmlhBuku = new javax.swing.JLabel();
        txtField_inpJmlhBuku = new javax.swing.JTextField();
        txtField_inpNama = new javax.swing.JTextField();
        lbl_inpGambarAuthor = new javax.swing.JLabel();
        jScrollPane_imgInpAuthor = new javax.swing.JScrollPane();
        imgInpAuthor = new javax.swing.JLabel();
        txtField_dirGambarAuthor = new javax.swing.JTextField();
        btn_choseImgFormAuthor = new javax.swing.JButton();
        btn_SaveFormAuthor = new javax.swing.JButton();
        btn_cance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_JudulFormAuthor.setFont(new java.awt.Font("Myriad Pro", 2, 24)); // NOI18N
        label_JudulFormAuthor.setText("Form  Update Data Author");

        lbl_namaAuthor.setText("Nama");

        lbl_JmlhBuku.setText("Jumlah Buku");

        txtField_inpJmlhBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_inpJmlhBukuActionPerformed(evt);
            }
        });
        txtField_inpJmlhBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_inpJmlhBukuKeyTyped(evt);
            }
        });

        txtField_inpNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_inpNamaActionPerformed(evt);
            }
        });

        lbl_inpGambarAuthor.setText("Gambar");

        jScrollPane_imgInpAuthor.setViewportView(imgInpAuthor);

        txtField_dirGambarAuthor.setEditable(false);

        btn_choseImgFormAuthor.setText("Choose");
        btn_choseImgFormAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choseImgFormAuthorActionPerformed(evt);
            }
        });

        btn_SaveFormAuthor.setText("Save");
        btn_SaveFormAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveFormAuthorActionPerformed(evt);
            }
        });

        btn_cance.setText("Cancel");
        btn_cance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout form_AuthorLayout = new javax.swing.GroupLayout(form_Author);
        form_Author.setLayout(form_AuthorLayout);
        form_AuthorLayout.setHorizontalGroup(
            form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_AuthorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_AuthorLayout.createSequentialGroup()
                        .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_JmlhBuku)
                            .addComponent(lbl_namaAuthor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_inpJmlhBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(form_AuthorLayout.createSequentialGroup()
                        .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_JudulFormAuthor)
                            .addGroup(form_AuthorLayout.createSequentialGroup()
                                .addComponent(lbl_inpGambarAuthor)
                                .addGap(32, 32, 32)
                                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(form_AuthorLayout.createSequentialGroup()
                                        .addComponent(txtField_dirGambarAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_choseImgFormAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane_imgInpAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(form_AuthorLayout.createSequentialGroup()
                                        .addComponent(btn_SaveFormAuthor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_cance)))))
                        .addGap(0, 56, Short.MAX_VALUE))))
        );
        form_AuthorLayout.setVerticalGroup(
            form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_AuthorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label_JudulFormAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_namaAuthor)
                    .addComponent(txtField_inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_JmlhBuku)
                    .addComponent(txtField_inpJmlhBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_inpGambarAuthor)
                    .addComponent(btn_choseImgFormAuthor)
                    .addComponent(txtField_dirGambarAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane_imgInpAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(form_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cance)
                    .addComponent(btn_SaveFormAuthor))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtField_inpJmlhBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_inpJmlhBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_inpJmlhBukuActionPerformed

    private void txtField_inpJmlhBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_inpJmlhBukuKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Input hanya boleh angka!");
            evt.consume();
        }
    }//GEN-LAST:event_txtField_inpJmlhBukuKeyTyped

    private void txtField_inpNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_inpNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_inpNamaActionPerformed

    private void btn_choseImgFormAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choseImgFormAuthorActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser(System.getProperty("user.home"));
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        choose.setFileFilter(new FileNameExtensionFilter("jpg|png|bmp|","jpg","png","bmp"));
        if(choose.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = choose.getSelectedFile();
            try {
                if (file.length() > 1024000) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "Gambar Terlalu Besar", "Max 1MB", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    image  = ImageIO.read(file);
                    Image inpImg = image.getScaledInstance(imgInpAuthor.getWidth(), imgInpAuthor.getHeight(), image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(inpImg);
                    imgInpAuthor.setIcon(icon);
                    path = file.getAbsolutePath();
                    txtField_dirGambarAuthor.setText(file.getName());
                    newImage = true;
                }
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btn_choseImgFormAuthorActionPerformed

    private void btn_SaveFormAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveFormAuthorActionPerformed
        // TODO add your handling code here:
        if ((txtField_inpNama.getText().equals("")) || (txtField_inpJmlhBuku.getText().equals(""))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Field tidak boleh kosong!");
        }else{
            try {
                ent_Autor dataauthor = new ent_Autor();
                
//                dataauthor.setId_author(id);
                dataauthor.setNamaAutor(txtField_inpNama.getText());
                dataauthor.setJmlh_buku(Integer.parseInt(txtField_inpJmlhBuku.getText()));
                
                if(newImage == true){
                    //input gambar
                    ByteArrayOutputStream outImg = new ByteArrayOutputStream();
                    File imgBuku = new File(path);
                    FileInputStream input = new FileInputStream(imgBuku);

                    try {
                        byte[] buffer = new byte[1024];
                        for(int readbyte;(readbyte = input.read(buffer)) !=-1;){
                            outImg.write(buffer, 0, readbyte);
                        }

                        bitArray = outImg.toByteArray();
                        dataauthor.setImg(bitArray);
                    } catch (Exception e) {
                    }   
                }
                else{
                    try {
                        Statement st = (Statement) Koneksi.getCekKoneksi().createStatement();
                        ResultSet rs = st.executeQuery("select img_author from tbl_author where id_author="+id);

                        while(rs.next()){
                            byte[] imageData = rs.getBytes("img_author");
                            dataauthor.setImg(imageData);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(formUpdBuku.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                
                
                sql_query_author query = new sql_query_author();
                query.updateDataAuthor(dataauthor, id);

                dispose();
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Proses Update Error!");
            }
        }
    }//GEN-LAST:event_btn_SaveFormAuthorActionPerformed

    private void btn_canceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canceActionPerformed
        // TODO add your handling code here:
        dispose();
        MainMenu obj = new MainMenu();
        obj.setVisible(true);
    }//GEN-LAST:event_btn_canceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formUpdAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUpdAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUpdAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUpdAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDataAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SaveFormAuthor;
    private javax.swing.JButton btn_cance;
    private javax.swing.JButton btn_choseImgFormAuthor;
    private javax.swing.JPanel form_Author;
    private javax.swing.JLabel imgInpAuthor;
    private javax.swing.JScrollPane jScrollPane_imgInpAuthor;
    private javax.swing.JLabel label_JudulFormAuthor;
    private javax.swing.JLabel lbl_JmlhBuku;
    private javax.swing.JLabel lbl_inpGambarAuthor;
    private javax.swing.JLabel lbl_namaAuthor;
    private javax.swing.JTextField txtField_dirGambarAuthor;
    private javax.swing.JTextField txtField_inpJmlhBuku;
    private javax.swing.JTextField txtField_inpNama;
    // End of variables declaration//GEN-END:variables
}
