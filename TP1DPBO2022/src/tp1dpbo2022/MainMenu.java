/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp1dpbo2022;

import dbConnection.Koneksi1;
import javax.swing.JOptionPane;
import query.sql_query_author;
import query.sql_query_buku;

/**
 *
 * @author LENOVO
 */
public class MainMenu extends javax.swing.JFrame {
    
    Koneksi1 dbcon = new Koneksi1();
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        panel_Buku.setVisible(false);
        dbcon.readTableAuthor(tbl_dataAuthor);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Buku = new javax.swing.JPanel();
        btn_BukuPanelBuku = new javax.swing.JButton();
        btn_AuthorPanelBuku = new javax.swing.JButton();
        btn_AddPanelBuku = new javax.swing.JButton();
        btn_deleteBuku = new javax.swing.JButton();
        btn_updateBuku = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dataBuku = new javax.swing.JTable();
        panel_Author = new javax.swing.JPanel();
        btn_BukuPanelAuthor = new javax.swing.JButton();
        btn_AuthorPanelAuthor = new javax.swing.JButton();
        btn_AddPanelAuthor = new javax.swing.JButton();
        btn_deleteAuthor = new javax.swing.JButton();
        btn_updateAuthor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dataAuthor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_BukuPanelBuku.setText("btn Buku");
        btn_BukuPanelBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BukuPanelBukuActionPerformed(evt);
            }
        });

        btn_AuthorPanelBuku.setText("btn Author");
        btn_AuthorPanelBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AuthorPanelBukuActionPerformed(evt);
            }
        });

        btn_AddPanelBuku.setText("Add");
        btn_AddPanelBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPanelBukuActionPerformed(evt);
            }
        });

        btn_deleteBuku.setText("Delete");
        btn_deleteBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteBukuActionPerformed(evt);
            }
        });

        btn_updateBuku.setText("Update");
        btn_updateBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateBukuActionPerformed(evt);
            }
        });

        tbl_dataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_dataBuku);

        javax.swing.GroupLayout panel_BukuLayout = new javax.swing.GroupLayout(panel_Buku);
        panel_Buku.setLayout(panel_BukuLayout);
        panel_BukuLayout.setHorizontalGroup(
            panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BukuLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BukuLayout.createSequentialGroup()
                        .addComponent(btn_BukuPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_AddPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AuthorPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_BukuLayout.createSequentialGroup()
                            .addComponent(btn_updateBuku)
                            .addGap(18, 18, 18)
                            .addComponent(btn_deleteBuku))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 119, Short.MAX_VALUE))
        );
        panel_BukuLayout.setVerticalGroup(
            panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BukuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BukuPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AuthorPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_BukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_updateBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        btn_BukuPanelAuthor.setText("btn Buku");
        btn_BukuPanelAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BukuPanelAuthorActionPerformed(evt);
            }
        });

        btn_AuthorPanelAuthor.setText("btn Author");
        btn_AuthorPanelAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AuthorPanelAuthorActionPerformed(evt);
            }
        });

        btn_AddPanelAuthor.setText("Add");
        btn_AddPanelAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPanelAuthorActionPerformed(evt);
            }
        });

        btn_deleteAuthor.setText("Delete");
        btn_deleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteAuthorActionPerformed(evt);
            }
        });

        btn_updateAuthor.setText("Update");
        btn_updateAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateAuthorActionPerformed(evt);
            }
        });

        tbl_dataAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Author", "Foto Author", "Nama", "Jumlah Buku"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Byte.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_dataAuthor);
        if (tbl_dataAuthor.getColumnModel().getColumnCount() > 0) {
            tbl_dataAuthor.getColumnModel().getColumn(0).setMinWidth(5);
            tbl_dataAuthor.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_dataAuthor.getColumnModel().getColumn(0).setMaxWidth(5);
        }

        javax.swing.GroupLayout panel_AuthorLayout = new javax.swing.GroupLayout(panel_Author);
        panel_Author.setLayout(panel_AuthorLayout);
        panel_AuthorLayout.setHorizontalGroup(
            panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_AuthorLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AuthorLayout.createSequentialGroup()
                        .addComponent(btn_BukuPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_AddPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AuthorPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_AuthorLayout.createSequentialGroup()
                            .addComponent(btn_updateAuthor)
                            .addGap(18, 18, 18)
                            .addComponent(btn_deleteAuthor))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel_AuthorLayout.setVerticalGroup(
            panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AuthorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BukuPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AuthorPanelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_updateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(panel_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(panel_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddPanelAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPanelAuthorActionPerformed
        // TODO add your handling code here:
        panel_Author.setVisible(false);
        panel_Buku.setVisible(true);
        btn_BukuPanelAuthor.setVisible(true);
        btn_AuthorPanelAuthor.setVisible(true);
        dbcon.readTableBuku(tbl_dataBuku);
        tbl_dataBuku.getColumnModel().getColumn(0).setPreferredWidth(5);
    }//GEN-LAST:event_btn_AddPanelAuthorActionPerformed

    private void btn_AuthorPanelAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AuthorPanelAuthorActionPerformed
        // TODO add your handling code here:
        formDataAuthor obj = new formDataAuthor();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_AuthorPanelAuthorActionPerformed

    private void btn_BukuPanelAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BukuPanelAuthorActionPerformed
        // TODO add your handling code here:
        formDataBuku obj = new formDataBuku();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_BukuPanelAuthorActionPerformed

    private void btn_AddPanelBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPanelBukuActionPerformed
        // TODO add your handling code here:
        panel_Buku.setVisible(false);
        panel_Author.setVisible(true);
        dbcon.readTableAuthor(tbl_dataAuthor);
    }//GEN-LAST:event_btn_AddPanelBukuActionPerformed

    private void btn_AuthorPanelBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AuthorPanelBukuActionPerformed
        // TODO add your handling code here:
        formDataAuthor obj = new formDataAuthor();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_AuthorPanelBukuActionPerformed

    private void btn_BukuPanelBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BukuPanelBukuActionPerformed
        // TODO add your handling code here:
        formDataBuku obj = new formDataBuku();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_BukuPanelBukuActionPerformed

    private void btn_updateAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateAuthorActionPerformed
        // TODO add your handling code here:
        try {
            int row = tbl_dataAuthor.getSelectedRow();
            String id_author = tbl_dataAuthor.getValueAt(row, 0).toString();
            String nama = (tbl_dataAuthor.getValueAt(row, 2).toString());
            String jmlh_buku = (tbl_dataAuthor.getValueAt(row, 3).toString());

            formUpdAuthor fun = new formUpdAuthor();
            fun.fillFieldAuthor(nama, jmlh_buku, id_author);
            fun.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Setidaknya Pilih Satu Data!");
        }
        
    }//GEN-LAST:event_btn_updateAuthorActionPerformed

    private void btn_updateBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateBukuActionPerformed
        // TODO add your handling code here:
        try {
            int row = tbl_dataBuku.getSelectedRow();
            String id_buku = tbl_dataBuku.getValueAt(row, 0).toString();
            String penerbit = (tbl_dataBuku.getValueAt(row, 2).toString());
            String author = (tbl_dataBuku.getValueAt(row, 3).toString());
            String desc = (tbl_dataBuku.getValueAt(row, 4).toString());
            
            formUpdBuku fun = new formUpdBuku();
            fun.fillFieldBuku(penerbit, author, desc, id_buku);
            fun.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Setidaknya Pilih Satu Data!");
        }
    }//GEN-LAST:event_btn_updateBukuActionPerformed

    private void btn_deleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteAuthorActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try {
                int row = tbl_dataAuthor.getSelectedRow();
                String id_author = tbl_dataAuthor.getValueAt(row, 0).toString();

                sql_query_author query = new sql_query_author();
                query.deleteDataAuthor(id_author);
                dbcon.readTableAuthor(tbl_dataAuthor);
                tbl_dataAuthor.getColumnModel().getColumn(0).setPreferredWidth(5);
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Setidaknya Pilih Satu Data!");
            }
        }
        else{
            
        }
        
    }//GEN-LAST:event_btn_deleteAuthorActionPerformed

    private void btn_deleteBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteBukuActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try {
                int row = tbl_dataBuku.getSelectedRow();
                String id_buku = tbl_dataBuku.getValueAt(row, 0).toString();

                sql_query_buku query = new sql_query_buku();
                query.deleteDataBuku(id_buku);
                dbcon.readTableBuku(tbl_dataBuku);
                tbl_dataBuku.getColumnModel().getColumn(0).setPreferredWidth(5);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Setidaknya Pilih Satu Data!");
            }
        }
        else{
            
        }
        
    }//GEN-LAST:event_btn_deleteBukuActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddPanelAuthor;
    private javax.swing.JButton btn_AddPanelBuku;
    private javax.swing.JButton btn_AuthorPanelAuthor;
    private javax.swing.JButton btn_AuthorPanelBuku;
    private javax.swing.JButton btn_BukuPanelAuthor;
    private javax.swing.JButton btn_BukuPanelBuku;
    private javax.swing.JButton btn_deleteAuthor;
    private javax.swing.JButton btn_deleteBuku;
    private javax.swing.JButton btn_updateAuthor;
    private javax.swing.JButton btn_updateBuku;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_Author;
    private javax.swing.JPanel panel_Buku;
    private javax.swing.JTable tbl_dataAuthor;
    private javax.swing.JTable tbl_dataBuku;
    // End of variables declaration//GEN-END:variables
}
