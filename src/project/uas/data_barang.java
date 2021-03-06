/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fadhilansyah25
 */
public class data_barang extends javax.swing.JFrame {
private Connection conn_FadilArdiansyah;
private Statement stat_FadilArdiansyah;
private ResultSet res_FadilArdiansyah;
    /**
     * Creates new form data_barang
     */
    public data_barang() {
        initComponents();
        koneksi();
        kosongkan();
        tabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_barangTextField = new javax.swing.JTextField();
        harga_barangTextField = new javax.swing.JTextField();
        nama_barangTextField = new javax.swing.JTextField();
        tipe_barangComboBox = new javax.swing.JComboBox<>();
        ukuran_barangComboBox = new javax.swing.JComboBox<>();
        simpanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Barang = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        stok_barangTextField = new javax.swing.JTextField();
        refresh_tabelButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Input Data Barang");

        jLabel2.setText("Id Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Tipe");

        jLabel5.setText("Ukuran");

        jLabel6.setText("Harga");

        tipe_barangComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Galon", "Kardus Gelas", "Kardus Botol" }));
        tipe_barangComboBox.setSelectedIndex(-1);

        ukuran_barangComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "240 ml", "330 ml", "450 ml", "600 ml", "750 ml", "1500 ml", "19 Liter", " " }));
        ukuran_barangComboBox.setSelectedIndex(-1);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        Tabel_Barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabel_Barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_BarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Barang);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Stok");

        refresh_tabelButton.setText("Refresh Tabel");
        refresh_tabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_tabelButtonActionPerformed(evt);
            }
        });

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_barangTextField)
                            .addComponent(harga_barangTextField)
                            .addComponent(nama_barangTextField)
                            .addComponent(tipe_barangComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ukuran_barangComboBox, 0, 134, Short.MAX_VALUE)
                            .addComponent(stok_barangTextField))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simpanButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh_tabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(id_barangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nama_barangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipe_barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ukuran_barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(harga_barangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simpanButton)
                        .addComponent(clearButton)
                        .addComponent(editButton)
                        .addComponent(hapusButton)
                        .addComponent(refresh_tabelButton)
                        .addComponent(kembaliButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(stok_barangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        try {
            stat_FadilArdiansyah.executeUpdate("insert into tabel_databarang values ("
            +"'"+id_barangTextField.getText()+"',"
            +"'"+nama_barangTextField.getText()+"',"
            +"'"+tipe_barangComboBox.getSelectedItem()+"',"
            +"'"+ukuran_barangComboBox.getSelectedItem()+"',"
            +"'"+Integer.parseInt(stok_barangTextField.getText())+"',"
            +"'"+Integer.parseInt(harga_barangTextField.getText())+"')");
            kosongkan();
            tabel();

            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Disimpan");
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void Tabel_BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_BarangMouseClicked
        // TODO add your handling code here:
        int i_FadilArdiansyah = Tabel_Barang.getSelectedRow();
        if (i_FadilArdiansyah == -1) {
            return;
        }

        String code0_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 0);
        String code1_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 1);
        String code2_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 2);
        String code3_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 3);
        String code4_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 4);
        String code5_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 5);

        id_barangTextField.setText(code0_FadilArdiansyah);
        nama_barangTextField.setText(code1_FadilArdiansyah);
        tipe_barangComboBox.setSelectedItem(code2_FadilArdiansyah);
        ukuran_barangComboBox.setSelectedItem(code3_FadilArdiansyah);
        stok_barangTextField.setText(code4_FadilArdiansyah);
        harga_barangTextField.setText(code5_FadilArdiansyah);
    }//GEN-LAST:event_Tabel_BarangMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int ok_FadilArdiansyah = JOptionPane.showConfirmDialog(null, "Apakah ingin mengedit Data ini?", "Edit Data", JOptionPane.YES_NO_CANCEL_OPTION);
        try {
            PreparedStatement stat_FadilArdiansyah = conn_FadilArdiansyah.prepareStatement(
                "update tabel_databarang set id_barang=?, nama_barang=?, tipe=?, ukuran=?, stok_barang=?, harga_barang=? where id_barang='"
                +Integer.parseInt(id_barangTextField.getText())+"'");
                if (ok_FadilArdiansyah == 0) {
                    try {
                        stat_FadilArdiansyah.setInt(1, Integer.parseInt(id_barangTextField.getText()));
                        stat_FadilArdiansyah.setString(2, nama_barangTextField.getText());
                        stat_FadilArdiansyah.setString(3, (String)tipe_barangComboBox.getSelectedItem());
                        stat_FadilArdiansyah.setString(4, (String)ukuran_barangComboBox.getSelectedItem());
                        stat_FadilArdiansyah.setInt(5, Integer.parseInt(stok_barangTextField.getText()));
                        stat_FadilArdiansyah.setInt(6, Integer.parseInt(harga_barangTextField.getText()));
                        stat_FadilArdiansyah.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                    } catch (Exception e) {
                        //TODO: handle exception
                        JOptionPane.showMessageDialog(null, "Update Data Gagal"+e);
                    }
                }
            tabel();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        int ok_FadilArdiansyah = JOptionPane.showConfirmDialog(null, "Apakah Yakin Menghapus Data?", "Hapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok_FadilArdiansyah == 0) {
            try {
                String sql_FadilArdiansyah = "delete from tabel_databarang where id_barang="+Integer.parseInt(id_barangTextField.getText());
                PreparedStatement stat_FadilArdiansyah = conn_FadilArdiansyah.prepareStatement(sql_FadilArdiansyah);
                stat_FadilArdiansyah.executeUpdate();
                JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            } catch (Exception e) {
                //TODO: handle exception
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal"+e);
            }
        }
        tabel();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void refresh_tabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_tabelButtonActionPerformed
        // TODO add your handling code here:
        tabel();
    }//GEN-LAST:event_refresh_tabelButtonActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_kembaliButtonActionPerformed

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
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Barang;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField harga_barangTextField;
    private javax.swing.JTextField id_barangTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JTextField nama_barangTextField;
    private javax.swing.JButton refresh_tabelButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField stok_barangTextField;
    private javax.swing.JComboBox<String> tipe_barangComboBox;
    private javax.swing.JComboBox<String> ukuran_barangComboBox;
    // End of variables declaration//GEN-END:variables

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn_FadilArdiansyah = DriverManager.getConnection("jdbc:mysql://127.0.0.1/toko_galon", "root", "");
            stat_FadilArdiansyah = conn_FadilArdiansyah.createStatement();
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void kosongkan() {
        id_barangTextField.setText("");
        nama_barangTextField.setText("");
        tipe_barangComboBox.setSelectedIndex(-1);
        ukuran_barangComboBox.setSelectedIndex(-1);
        stok_barangTextField.setText("");
        harga_barangTextField.setText("");
    }

    private void tabel(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Ukuran");
        tabel.addColumn("Isi Volume");
        tabel.addColumn("Stok Barang");
        tabel.addColumn("Harga RP");
        Tabel_Barang.setModel(tabel);

        try {
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery("select * from tabel_databarang");
            while (res_FadilArdiansyah.next()) {
                tabel.addRow(new Object[]
                {
                    res_FadilArdiansyah.getString("id_barang"),
                    res_FadilArdiansyah.getString("nama_barang"),
                    res_FadilArdiansyah.getString("tipe"),
                    res_FadilArdiansyah.getString("ukuran"),
                    res_FadilArdiansyah.getString("stok_barang"),
                    res_FadilArdiansyah.getString("harga_barang")
                });
            }
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
