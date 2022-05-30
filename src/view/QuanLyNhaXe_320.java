/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Xe_320;
import service.XeServices_320;

/**
 *
 * @author LÊ HOÀNG ANH TUẤN
 */
public class QuanLyNhaXe_320 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNhaXe_320
     */
    XeServices_320 xeServices_320 = new XeServices_320();
    DefaultTableModel defaultTableModel;
    public QuanLyNhaXe_320() {
        initComponents();
        setLocationRelativeTo(null);
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       
        BangThongTin_Table.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã xe");
        defaultTableModel.addColumn("Mã sinh viên");
        defaultTableModel.addColumn("Biển số");
        defaultTableModel.addColumn("Ngày gửi");
      
        setTableData(xeServices_320.getAllMotobike());
    }
     private void setTableData(List<Xe_320> Motos) {
        for (Xe_320 moto :Motos ) {
            defaultTableModel.addRow(new Object[]{moto.getMaXe(), moto.getMSV(), moto.getBienSo(),  moto.getNgayGui()});
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

        jPanel2 = new javax.swing.JPanel();
        ThongTin_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SoSinhVienToiDa_Label = new javax.swing.JLabel();
        BienSo_TextField = new javax.swing.JTextField();
        Them_Button = new javax.swing.JButton();
        Sua_Button = new javax.swing.JButton();
        NgayGui_TextField = new javax.swing.JTextField();
        Xoa_Button = new javax.swing.JButton();
        Thoat_Button = new javax.swing.JButton();
        MaXe_TextField = new javax.swing.JTextField();
        MaSinhVien_TextField = new javax.swing.JTextField();
        TenPhong_Label = new javax.swing.JLabel();
        MaPhong_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangThongTin_Table = new javax.swing.JTable();
        ThongBaoTimKiem_Label = new javax.swing.JLabel();
        LamMoi_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ThongTin_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThongTin_Label.setForeground(new java.awt.Color(204, 0, 0));
        ThongTin_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garage_64px.png"))); // NOI18N
        ThongTin_Label.setText("THÔNG TIN NHÀ XE KÝ TÚC XÁ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(53, 111, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết của phòng:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setToolTipText("");

        SoSinhVienToiDa_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienToiDa_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienToiDa_Label.setText("Ngày gửi: ");

        BienSo_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BienSo_TextFieldActionPerformed(evt);
            }
        });

        Them_Button.setBackground(new java.awt.Color(0, 0, 0));
        Them_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Them_Button.setForeground(new java.awt.Color(255, 255, 255));
        Them_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login-icon-16.png"))); // NOI18N
        Them_Button.setText("Thêm ");
        Them_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them_ButtonActionPerformed(evt);
            }
        });

        Sua_Button.setBackground(new java.awt.Color(0, 0, 0));
        Sua_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sua_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sua_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-document-edit-icon-16.png"))); // NOI18N
        Sua_Button.setText("Sửa");
        Sua_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sua_ButtonActionPerformed(evt);
            }
        });

        Xoa_Button.setBackground(new java.awt.Color(0, 0, 0));
        Xoa_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Xoa_Button.setForeground(new java.awt.Color(255, 255, 255));
        Xoa_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-edit-delete-icon-16.png"))); // NOI18N
        Xoa_Button.setText("Xóa");
        Xoa_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa_ButtonActionPerformed(evt);
            }
        });

        Thoat_Button.setBackground(new java.awt.Color(0, 0, 0));
        Thoat_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Thoat_Button.setForeground(new java.awt.Color(255, 255, 255));
        Thoat_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout-icon-16.png"))); // NOI18N
        Thoat_Button.setText("Thoát");
        Thoat_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thoat_ButtonActionPerformed(evt);
            }
        });

        MaXe_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaXe_TextFieldActionPerformed(evt);
            }
        });

        TenPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TenPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TenPhong_Label.setText("Mã xe");

        MaPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MaPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        MaPhong_Label.setText("Mã sinh viên: ");

        SoSinhVienHienTai_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienHienTai_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienHienTai_Label.setText("Biển số xe: ");

        BangThongTin_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã xê", "Mã sinh viên", "Biển số", "Ngày gửi"
            }
        ));
        BangThongTin_Table.setName(""); // NOI18N
        BangThongTin_Table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BangThongTin_TableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(BangThongTin_Table);

        LamMoi_Button.setBackground(new java.awt.Color(0, 0, 0));
        LamMoi_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LamMoi_Button.setForeground(new java.awt.Color(255, 255, 255));
        LamMoi_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new-icon-16.png"))); // NOI18N
        LamMoi_Button.setText("Làm mới");
        LamMoi_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoi_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThongBaoTimKiem_Label)
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaPhong_Label)
                            .addComponent(TenPhong_Label))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MaXe_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(SoSinhVienHienTai_Label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(LamMoi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MaSinhVien_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(SoSinhVienToiDa_Label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NgayGui_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BienSo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ThongBaoTimKiem_Label)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenPhong_Label)
                            .addComponent(MaXe_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BienSo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaSinhVien_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaPhong_Label)
                            .addComponent(SoSinhVienToiDa_Label)))
                    .addComponent(NgayGui_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LamMoi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BienSo_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BienSo_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BienSo_TextFieldActionPerformed

    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed

//        String TenPhong = MaXe_TextField.getText();
//        String MaPhong = MaSinhVien_TextField.getText();
//        String LoaiPhong = LoaiPhong_TextField.getText();
//        String SoSVHienTai = BienSo_TextField.getText();
//        String SoSVToiDa = NgayGui_TextField.getText();
//        String TinhTrangPhong = TinhTrangPhong_TextField.getText();
//        StringBuilder sb = new StringBuilder();
//
//        if (TenPhong.equals("")){
//            sb.append("Tên phòng không được để trống!\n");
//        }
//        if(MaPhong.equals("")){
//            sb.append("Mã phòng không được để trống!\n");
//        }
//        if(LoaiPhong.equals("")){
//            sb.append("Loại phòng không được để trống!\n");
//        }
//        if(SoSVHienTai.equals("")){
//            sb.append("Nhập số sinh viên hiện tại của phòng!\n");
//        }
//        if(SoSVToiDa.equals("")){
//            sb.append("Nhập số sinh viên tối đa của phòng!\n");
//        }
//        if(TinhTrangPhong.equals("")){
//            sb.append("Tình trạng phòng hiện tại như thế nào!\n");
//        }
//        if (sb.length()>0){
//            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo lỗi!",
//                JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        else{
//            st40.setTenPhong_140(MaXe_TextField.getText());
//            st40.setMaPhong_140(MaSinhVien_TextField.getText());
//            st40.setLoaiPhong_140(LoaiPhong_TextField.getText());
//            st40.setSoSinhVienHienTai_140(BienSo_TextField.getText());
//            st40.setSoSinhVienToiDa_140(NgayGui_TextField.getText());
//            st40.setTinhTrangPhong_140(TinhTrangPhong_TextField.getText());
//            BangThongTin_Table.setModel(defaultTableModel);
//            defaultTableModel.addRow(new Object[]{ st40.getTenPhong_140(),st40.getMaPhong_140(),
//                st40.getLoaiPhong_140(), st40.getSoSinhVienHienTai_140(), st40.getSoSinhVienToiDa_140(),st40.getTinhTrangPhong_140()});
//        JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công 1 hàng dữ liệu!", "Thông báo",
//            JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_Them_ButtonActionPerformed

    private void Sua_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sua_ButtonActionPerformed

//        int row = BangThongTin_Table.getSelectedRow();
//        if (row == -1)//nguoi dung chua chon hang naoư
//        {
//            JOptionPane.showMessageDialog(QuanLyPhong_140.this, "Vui lòng chọn hàng thông tin cần xóa trước", "Lỗi", JOptionPane.ERROR_MESSAGE);
//
//        } else {
//            int confirm = JOptionPane.showConfirmDialog(QuanLyPhong_140.this, "Bạn chắc chắn muốn xóa không?");
//            if (confirm == JOptionPane.YES_OPTION) {
//
//                try {
//                    String slId = String.valueOf(BangThongTin_Table.getValueAt(row, 0));
//
//                    stService.DeleteTTPhong(slId);
//
//                    defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
//                    setTableData(stService.getAllStudents2());
//                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
//                } catch (SQLException ex) {
//                    Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//
//        }
//        if (MaXe_TextField.getText().equals("") || MaSinhVien_TextField.getText().equals("") || LoaiPhong_TextField.getText().equals("")
//            || BienSo_TextField.getText().equals("") || NgayGui_TextField.getText().equals("")
//            || TinhTrangPhong_TextField.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
//        } else {
//            try {
//
//                st40.setTenPhong_140(MaXe_TextField.getText());
//                st40.setMaPhong_140(MaSinhVien_TextField.getText());
//                st40.setLoaiPhong_140(LoaiPhong_TextField.getText());
//                st40.setSoSinhVienHienTai_140(BienSo_TextField.getText());
//                st40.setSoSinhVienToiDa_140(NgayGui_TextField.getText());
//                st40.setTinhTrangPhong_140(TinhTrangPhong_TextField.getText());
//
//                stService.addTTPhong(st40);
//                JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công!");
//            } catch (SQLException ex) {
//                Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//        defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
//        setTableData(stService.getAllStudents2());
//
//        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");

    }//GEN-LAST:event_Sua_ButtonActionPerformed

    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed

        

    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    private void Thoat_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thoat_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Thoat_ButtonActionPerformed

    private void MaXe_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaXe_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaXe_TextFieldActionPerformed

    private void LamMoi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoi_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LamMoi_ButtonActionPerformed

    private void BangThongTin_TableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BangThongTin_TableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_BangThongTin_TableComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new QuanLyNhaXe_320().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThongTin_Table;
    private javax.swing.JTextField BienSo_TextField;
    private javax.swing.JButton LamMoi_Button;
    private javax.swing.JLabel MaPhong_Label;
    private javax.swing.JTextField MaSinhVien_TextField;
    private javax.swing.JTextField MaXe_TextField;
    private javax.swing.JTextField NgayGui_TextField;
    private javax.swing.JLabel SoSinhVienHienTai_Label;
    private javax.swing.JLabel SoSinhVienToiDa_Label;
    private javax.swing.JButton Sua_Button;
    private javax.swing.JLabel TenPhong_Label;
    private javax.swing.JButton Them_Button;
    private javax.swing.JButton Thoat_Button;
    private javax.swing.JLabel ThongBaoTimKiem_Label;
    private javax.swing.JLabel ThongTin_Label;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
