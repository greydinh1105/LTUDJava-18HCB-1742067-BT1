/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADmin
 */
public class NhapDiem extends javax.swing.JFrame {

    /**
     * Creates new form NhapDiem
     */
    public NhapDiem() throws IOException {
        initComponents();
        try {
            //Đọc file dssinhvien
            File danhSachSinhVien = new File("dssinhvien.txt");
            Scanner scanner = new Scanner(danhSachSinhVien, "UTF-8");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                cboSinhVien.addItem(line);
            }
            scanner.close();

            //Đọc file diem
//            File diem = new File("D:\\DoAnJavaHL\\LTUDJava-18HCB-1742067-BT1\\QuanLyDiem\\src\\quanlydiem\\diem.txt");
            File diem = new File("diem.txt");
            Scanner scanner2 = new Scanner(diem);
            ArrayList<String> dsDiem = new ArrayList<String>();
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String[] thongTinDiem = line.split(",");
                for (int i = 0; i < thongTinDiem.length; i++) {
                    dsDiem.add(thongTinDiem[i]);
                }
            }
            scanner2.close();

            //In ra noi dung
//            Iterator<String> i = dsDiem.iterator();
//            while (i.hasNext()) {
//                System.out.println(i.next());
//            }
            FileCapNhatTableDiem();
        } catch (FileNotFoundException e) {
            System.out.println("Khong co file.");
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboSinhVien = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDiem1 = new javax.swing.JTextField();
        btnNhap = new javax.swing.JButton();
        txtDiem2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiem3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiem4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiem5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Điểm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sinh viên:");

        cboSinhVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Môn Học 1:");

        txtDiem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        txtDiem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Môn Học 2:");

        txtDiem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Môn Học 3:");

        txtDiem4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Môn Học 4:");

        txtDiem5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Môn Học 5:");

        tblDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboSinhVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiem5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDiem5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        DefaultTableModel modelDiem = (DefaultTableModel) tblDiem.getModel();
        System.out.println(modelDiem.getValueAt(0, 0).toString().equals(cboSinhVien.getSelectedItem().toString()));
        System.out.println(cboSinhVien.getSelectedItem().toString());
        //Duyệt dữ liệu để tìm dòng khớp với dl nhập vào
        for (int row = 0; row < modelDiem.getRowCount(); row++) {
            //Neu dong do co ten sinh vien trung voi sinh vien dang duoc chon o combobox

            if (modelDiem.getValueAt(row, 0).toString().equals(cboSinhVien.getSelectedItem().toString())) {
                //Update table
                modelDiem.setValueAt(txtDiem1.getText(), row, 1);
                modelDiem.setValueAt(txtDiem2.getText(), row, 2);
                modelDiem.setValueAt(txtDiem3.getText(), row, 3);
                modelDiem.setValueAt(txtDiem4.getText(), row, 4);
                modelDiem.setValueAt(txtDiem5.getText(), row, 5);
                try {
                    //Từ table update vào file
                    TableDiemCapNhatFile();
                } catch (IOException ex) {
                    Logger.getLogger(NhapDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Thoat khoi ham
                return;
            }
        }
        //Trường hợp không tồn tại thì thêm dòng mới vào file và dùng hàm đổ dữ liệu vào table
        Path file = Paths.get("diem.txt");
        String svMoi = cboSinhVien.getSelectedItem().toString() + "," + txtDiem1.getText() + "," + txtDiem2.getText() + "," + txtDiem3.getText() + "," + txtDiem4.getText() + "," + txtDiem5.getText() + "\r\n";
        try {
            Files.write(file, svMoi.getBytes(), StandardOpenOption.APPEND);
            FileCapNhatTableDiem();
        } catch (IOException ex) {
            Logger.getLogger(NhapDiem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNhapActionPerformed

    //Tu file do du lieu vao table
    private void FileCapNhatTableDiem() throws IOException {
//        File diem = new File("D:\\DoAnJavaHL\\LTUDJava-18HCB-1742067-BT1\\QuanLyDiem\\src\\quanlydiem\\diem.txt");
//        BufferedReader br = new BufferedReader(new FileReader(diem));
        File fileDir = new File("diem.txt");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), "UTF8"));
        DefaultTableModel modelDiem = (DefaultTableModel) tblDiem.getModel();

        //Header
        String firstLine = br.readLine().trim();
        String[] columnsName = firstLine.split(",");

        modelDiem.setColumnIdentifiers(columnsName);

        //Clear dong cu
        modelDiem.setRowCount(0);

        //Add du lieu
        Object[] tableLines = br.lines().toArray();
        for (int dem = 0; dem < tableLines.length; dem++) {
            String dong = tableLines[dem].toString().trim();
            String[] dongDuLieu = dong.split(",");
            modelDiem.addRow(dongDuLieu);
        }
    }

    //Từ table đổ dữ liệu vào file
    private void TableDiemCapNhatFile() throws IOException {
        DefaultTableModel modelDiem = (DefaultTableModel) tblDiem.getModel();
        //Lấy dữ liệu của jtable ra
        String dsDiem = "Ho Ten SV,Mon Hoc 1,Mon Hoc 2,Mon Hoc 3,Mon Hoc 4,Mon Hoc 5\r\n";
        for (int row = 0; row < modelDiem.getRowCount(); row++) {
            for (int col = 0; col < modelDiem.getColumnCount(); col++) {
                if (col < modelDiem.getColumnCount() - 1) { //Không phải là cột cuối thì phẩy
                    dsDiem += modelDiem.getValueAt(row, col).toString() + ",";
                } else { //Là cột cuối cùng thì xuồng dòng
                    dsDiem += modelDiem.getValueAt(row, col).toString() + "\r\n";
                }
            }
        }
        //Ghi vào file
//        Path file = Paths.get("D:\\DoAnJavaHL\\LTUDJava-18HCB-1742067-BT1\\QuanLyDiem\\src\\quanlydiem\\diem.txt");
//        Files.write(file, dsDiem.getBytes(), StandardOpenOption.CREATE);
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("diem.txt"), "UTF8"));
        out.write(dsDiem);
        out.flush();
        out.close();
    }

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
            java.util.logging.Logger.getLogger(NhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NhapDiem().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NhapDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhap;
    private javax.swing.JComboBox<String> cboSinhVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDiem;
    private javax.swing.JTextField txtDiem1;
    private javax.swing.JTextField txtDiem2;
    private javax.swing.JTextField txtDiem3;
    private javax.swing.JTextField txtDiem4;
    private javax.swing.JTextField txtDiem5;
    // End of variables declaration//GEN-END:variables
}
