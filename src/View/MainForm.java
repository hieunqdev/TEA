package View;
import Model.DongVat;
import DAO.DongVatDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class MainForm extends javax.swing.JFrame {
    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SOF203_DE2;"
                + "user=sa;password=1234;instanceName=Admin\\SQLEXPRESS;encrypt=true;"
                + "trustServerCertificate=true";
    
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMoTa = new javax.swing.JTextArea();
        txtMaDV = new javax.swing.JTextField();
        txtTenDV = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnHienThi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDongVat = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ ĐỘNG VẬT");

        jLabel2.setText("Mã DV");

        jLabel3.setText("Tên DV");

        jLabel4.setText("Mô tả");

        jLabel5.setText("Loại");

        jLabel6.setText("Giới tính");

        txtAreaMoTa.setColumns(20);
        txtAreaMoTa.setRows(5);
        jScrollPane1.setViewportView(txtAreaMoTa);

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        btnHienThi.setText("Hiển thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tableDongVat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã DV", "Tên DV", "Loại", "Mô tả", "Giới tính"
            }
        ));
        jScrollPane3.setViewportView(tableDongVat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDV)
                            .addComponent(txtMaDV))
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHienThi)
                                .addGap(92, 92, 92)
                                .addComponent(btnThem))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoNam)
                            .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoNu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSua)
                            .addComponent(jLabel6))
                        .addGap(86, 86, 86)
                        .addComponent(btnXoa)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtMaDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtTenDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rdoNam)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(rdoNu)))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienThi)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            DongVatDAO dongVatDAO = new DongVatDAO(con);
            List<DongVat> dongVatLst = dongVatDAO.readDongVat();
            
            DefaultTableModel tableDongVat = (DefaultTableModel) this.tableDongVat.getModel();
            tableDongVat.setRowCount(0);
            
            for (DongVat dongVat : dongVatLst) {
                tableDongVat.addRow(new Object[]{
                    dongVat.getMaDV(),
                    dongVat.getTenDV(),
                    dongVat.getLoai(),
                    dongVat.getMoTa(),
                    dongVat.isGioiTinh()?"Nam":"Nữ"
                });
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnHienThiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String MaDV = txtMaDV.getText();
            String TenDV = txtTenDV.getText();
            String Loai = txtLoai.getText();
            String MoTa = txtAreaMoTa.getText();
            boolean GioiTinh = rdoNam.isSelected();
            
            if(MaDV.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma DV khong duoc trong");
                return;
            }
            if(TenDV.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ten DV khong duoc trong");
                return;
            }
            if(Loai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Loai khong duoc trong");
                return;
            }
            if(MoTa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mo ta khong duoc trong");
                return;
            }
            if(!rdoNam.isSelected() && !rdoNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Chua chon gioi tinh");
                return;
            }
            
            DongVatDAO dongVatDAO = new DongVatDAO(con);
            DongVat dongVat = new DongVat(MaDV, TenDV, Loai, MoTa, GioiTinh);
            
            int ketQua = dongVatDAO.createDongVat(dongVat);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Them thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String MaDV = txtMaDV.getText();
            String TenDV = txtTenDV.getText();
            String Loai = txtLoai.getText();
            String MoTa = txtAreaMoTa.getText();
            boolean GioiTinh = rdoNam.isSelected();
            
            if(MaDV.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma DV khong duoc trong");
                return;
            }
            if(TenDV.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ten DV khong duoc trong");
                return;
            }
            if(Loai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Loai khong duoc trong");
                return;
            }
            if(MoTa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mo ta khong duoc trong");
                return;
            }
            if(!rdoNam.isSelected() && !rdoNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Chua chon gioi tinh");
                return;
            }
            
            DongVatDAO dongVatDAO = new DongVatDAO(con);
            DongVat dongVat = new DongVat(MaDV, TenDV, Loai, MoTa, GioiTinh);
            
            int ketQua = dongVatDAO.updateDongVat(dongVat);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Sua thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String MaDV = txtMaDV.getText();
            
            if(MaDV.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma DV khong duoc trong");
                return;
            }

            DongVatDAO dongVatDAO = new DongVatDAO(con);
            
            int ketQua = dongVatDAO.deleteDongVat(MaDV);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tableDongVat;
    private javax.swing.JTextArea txtAreaMoTa;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextField txtTenDV;
    // End of variables declaration//GEN-END:variables
}
