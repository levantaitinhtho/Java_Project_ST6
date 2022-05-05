/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.StudentDao;
import connect.KetNoiSQL;
import model.Student;
import service.StudentService;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Huynh Hau
 */
public class QuanLyPhong_140 extends javax.swing.JFrame {
    
 //Hau bo sung code lan 1
 //o đay co su thay doi lan 2
 //o day co su thay doi lan 3
 //Hau bo sung code lan 4
    
    /**
     * Creates new form QuanLyPhong_140
     */
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    ThongTinPhong_140 h40 = new ThongTinPhong_140();
    Student st40 = new Student();
    StudentDao stDao;
    
    StudentService service = new StudentService();
    public QuanLyPhong_140() {
        
       
        stDao = new StudentDao();
        
        initComponents();
        
        setLocationRelativeTo(null);

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // khong cho phep nguoi dung Edit du lieu trong bang
            }

        };
        BangThongTin_Table.setModel(defaultTableModel);

        defaultTableModel.addColumn("Mã sinh viên");
        defaultTableModel.addColumn("Mã KTX");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("CMND");
        defaultTableModel.addColumn("Số điện thoại");
        
        BangThongTin_Table.setModel(defaultTableModel);
        setTableData(service.getAllStudents());
        //setTableModel(studentDao.getAlLStudents());
    }
    
    //tringBuilder sb = new StringBuilder();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void setTableData(List<Student> students){
        for (Student st: students) {
            defaultTableModel.addRow(new Object[]{ st.getMaSv_140(),st.getMaKTX_140(),
                (st.getHo_140()+" "+st.getTen_140()), st.getCMND_140(), st.getSDT_140()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ThongTin_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SoSinhVienToiDa_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_TextField = new javax.swing.JTextField();
        Them_Button = new javax.swing.JButton();
        TinhTrangPhong_TextField = new javax.swing.JTextField();
        Sua_Button = new javax.swing.JButton();
        SoSinhVienToiDa_TextField = new javax.swing.JTextField();
        Xoa_Button = new javax.swing.JButton();
        Thoat_Button = new javax.swing.JButton();
        TenPhong_TextField = new javax.swing.JTextField();
        MaPhong_TextField = new javax.swing.JTextField();
        PhongCanTim_Label = new javax.swing.JLabel();
        PhongCanTim_TextField = new javax.swing.JTextField();
        TimKiem_Button = new javax.swing.JButton();
        TenPhong_Label = new javax.swing.JLabel();
        MaPhong_Label = new javax.swing.JLabel();
        LoaiPhong_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangThongTin_Table = new javax.swing.JTable();
        TinhTrangPhong_Label = new javax.swing.JLabel();
        LoaiPhong_ComboBox = new javax.swing.JComboBox<>();
        PhongCanTim_ComboBox = new javax.swing.JComboBox<>();
        ThongBaoTimKiem_Label = new javax.swing.JLabel();
        ThongBaoTimKiem1_Label = new javax.swing.JLabel();
        MaSv_TextField = new javax.swing.JTextField();
        MaKTX_TextField = new javax.swing.JTextField();
        Hoten_TextField = new javax.swing.JTextField();
        CMND_TextField = new javax.swing.JTextField();
        SDT_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ThongTin_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThongTin_Label.setForeground(new java.awt.Color(204, 0, 0));
        ThongTin_Label.setIcon(new javax.swing.ImageIcon("D:\\HOCKY_221\\LT_JavaNC\\Java_Project_ST6\\QuanLyKTX\\src\\image\\img1\\home1.png")); // NOI18N
        ThongTin_Label.setText("THÔNG TIN TỪNG PHÒNG TẠI KÝ TÚC XÁ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(53, 111, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết của phòng:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setToolTipText("");

        SoSinhVienToiDa_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienToiDa_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienToiDa_Label.setText("Số Sinh Viên Tối Đa: ");

        SoSinhVienHienTai_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoSinhVienHienTai_TextFieldActionPerformed(evt);
            }
        });

        Them_Button.setBackground(new java.awt.Color(0, 0, 0));
        Them_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Them_Button.setForeground(new java.awt.Color(255, 255, 255));
        Them_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/Login-icon-16.png"))); // NOI18N
        Them_Button.setText("Thêm ");
        Them_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them_ButtonActionPerformed(evt);
            }
        });

        Sua_Button.setBackground(new java.awt.Color(0, 0, 0));
        Sua_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sua_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sua_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/Actions-document-edit-icon-16.png"))); // NOI18N
        Sua_Button.setText("Sửa");
        Sua_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sua_ButtonActionPerformed(evt);
            }
        });

        Xoa_Button.setBackground(new java.awt.Color(0, 0, 0));
        Xoa_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Xoa_Button.setForeground(new java.awt.Color(255, 255, 255));
        Xoa_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/Actions-edit-delete-icon-16.png"))); // NOI18N
        Xoa_Button.setText("Xóa");
        Xoa_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa_ButtonActionPerformed(evt);
            }
        });

        Thoat_Button.setBackground(new java.awt.Color(0, 0, 0));
        Thoat_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Thoat_Button.setForeground(new java.awt.Color(255, 255, 255));
        Thoat_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img1/logout-icon-16.png"))); // NOI18N
        Thoat_Button.setText("Thoát");
        Thoat_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thoat_ButtonActionPerformed(evt);
            }
        });

        PhongCanTim_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhongCanTim_Label.setForeground(new java.awt.Color(255, 255, 255));
        PhongCanTim_Label.setText("Nhập tên phòng cần tìm: ");

        PhongCanTim_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhongCanTim_TextFieldActionPerformed(evt);
            }
        });

        TimKiem_Button.setBackground(new java.awt.Color(0, 0, 0));
        TimKiem_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimKiem_Button.setForeground(new java.awt.Color(255, 255, 255));
        TimKiem_Button.setIcon(new javax.swing.ImageIcon("D:\\HOCKY_221\\LT_JavaNC\\Java_Project_ST6\\QuanLyKTX\\src\\image\\img1\\search-icon-24.png")); // NOI18N
        TimKiem_Button.setText("Tìm Kiếm");
        TimKiem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiem_ButtonActionPerformed(evt);
            }
        });

        TenPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TenPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TenPhong_Label.setText("Tên Phòng:");

        MaPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MaPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        MaPhong_Label.setText("Mã Phòng: ");

        LoaiPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LoaiPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        LoaiPhong_Label.setText("Loại Phòng: ");

        SoSinhVienHienTai_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienHienTai_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienHienTai_Label.setText("Số Sinh Viên Hiện Tại: ");

        BangThongTin_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên ", "Mã KTX ", "Họ tên", "CMND", "Số điên thoại"
            }
        ));
        jScrollPane2.setViewportView(BangThongTin_Table);

        TinhTrangPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TinhTrangPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TinhTrangPhong_Label.setText("Tình Trạng Phòng: ");

        LoaiPhong_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        LoaiPhong_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiPhong_ComboBoxActionPerformed(evt);
            }
        });

        PhongCanTim_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A2.2", "A3.1", "A4.1", "B1.1", "C1.1" }));

        ThongBaoTimKiem1_Label.setText("TK");

        MaKTX_TextField.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 716, Short.MAX_VALUE)
                .addComponent(ThongBaoTimKiem1_Label)
                .addGap(18, 18, 18)
                .addComponent(ThongBaoTimKiem_Label)
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MaSv_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MaKTX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hoten_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CMND_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimKiem_Button)
                            .addComponent(SDT_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhongCanTim_Label)
                    .addComponent(TenPhong_Label)
                    .addComponent(MaPhong_Label)
                    .addComponent(LoaiPhong_Label)
                    .addComponent(SoSinhVienHienTai_Label)
                    .addComponent(SoSinhVienToiDa_Label)
                    .addComponent(TinhTrangPhong_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(PhongCanTim_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhongCanTim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TenPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MaPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LoaiPhong_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ThongBaoTimKiem1_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhongCanTim_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhongCanTim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhongCanTim_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThongBaoTimKiem_Label))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenPhong_Label)
                            .addComponent(TenPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaPhong_Label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoaiPhong_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoaiPhong_Label))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoSinhVienToiDa_Label)
                            .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TinhTrangPhong_Label))))
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaSv_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaKTX_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hoten_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CMND_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDT_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SoSinhVienHienTai_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoSinhVienHienTai_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoSinhVienHienTai_TextFieldActionPerformed

    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed
        // TODO add your handling code here:
        String MaSV = MaSv_TextField.getText();
        String MaKTX = MaKTX_TextField.getText();
        String HoTen = Hoten_TextField.getText();
        String CMND = CMND_TextField.getText();
        String SDT = SDT_TextField.getText();
        StringBuilder sb = new StringBuilder();
        
        st40.setMaSv_140(MaSv_TextField.getText());
        st40.setMaKTX_140(MaKTX_TextField.getText());
        st40.setHo_140(Hoten_TextField.getText());
        st40.setTen_140(Hoten_TextField.getText());
        st40.setCMND_140(CMND_TextField.getText());
        st40.setSDT_140(SDT_TextField.getText());
        BangThongTin_Table.setModel(defaultTableModel);
        defaultTableModel.addRow(new Object[]{ st40.getMaSv_140(),st40.getMaKTX_140(),
            (st40.getHo_140()+" "+st40.getTen_140()), st40.getCMND_140(), st40.getSDT_140()});
         if (MaSV.equals("")){
           sb.append("Mã sinh viên không được để trống!\n");
        }
        if(MaKTX.equals("")){
            sb.append("Mã kí túc xá không được để trống!\n");
        }
        if(HoTen.equals("")){
            sb.append("Họ và tên sinh viên không được để trống!\n");
        }
        if(CMND.equals("")){
            sb.append("CMND không được để trống!\n");
        }
        if(SDT.equals("")){
            sb.append("Số điện thoại không được để trống!\n");
        }
        if (sb.length()>0){
        JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo lỗi!",
            JOptionPane.ERROR_MESSAGE);           
        return;
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công 1 hàng dữ liệu!", "Thông báo", 
            JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_Them_ButtonActionPerformed

    private void Sua_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sua_ButtonActionPerformed
        // TODO add your handling code here:
        int row = BangThongTin_Table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn hàng dữ liệu bạn muốn chỉnh sửa!",
                "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            ThongTinPhong_140 h40 = new ThongTinPhong_140();

            st40.setMaSv_140((String) BangThongTin_Table.getValueAt(row, 0));
            st40.setMaKTX_140((String) BangThongTin_Table.getValueAt(row, 1));
            st40.setHo_140((String) BangThongTin_Table.getValueAt(row, 2));
            st40.setTen_140((String) BangThongTin_Table.getValueAt(row, 3));
            st40.setCMND_140((String) BangThongTin_Table.getValueAt(row, 4));
            st40.setSDT_140((String) BangThongTin_Table.getValueAt(row, 5));
            new QuanLyPhong_140().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Sua_ButtonActionPerformed
private void showDuLieu(){
        try{
            BangThongTin_Table.removeAll();
            String[] arr = {"Mã sinh viên", "Mã KTX", "Họ và tên", "CMND","Số điện thoại"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            BangThongTin_Table.setModel(model);
            Connection connection = KetNoiSQL.getConnection();
            String query = "SELECT *FROM dbo.[quanlycosovatchat]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("maSV"));
                vector.add(rs.getString("maKTX"));
                vector.add(rs.getString("hoTen"));
                vector.add(rs.getString("CMND"));
                vector.add(rs.getString("soDienThoai"));

                model.addRow(vector);

            }
            //đóng kết nối 
            KetNoiSQL.closeConnection(connection);
            BangThongTin_Table.setModel((TableModel) model);
        }catch(SQLException ex){
           Logger.getLogger(ThongTinPhong_140.class.getName()).log(Level.SEVERE,null,ex);
           
        }
    }
    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed
        // TODO add your handling code here:
        int position = BangThongTin_Table.getSelectedRow();
        System.out.println(position);
        if (position == -1 ){
            JOptionPane.showMessageDialog(QuanLyPhong_140.this,"Chọn hàng dữ liệu cần xóa!!!","Lỗi",JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa không?");
            if(result == JOptionPane.YES_OPTION){
            String data = (String) BangThongTin_Table.getValueAt(position, 0);
            service.DeleteTTPhong(data);
        }    
        }                    
    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    private void Thoat_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thoat_ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Thoat_ButtonActionPerformed

    private void PhongCanTim_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhongCanTim_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhongCanTim_TextFieldActionPerformed

    private void TimKiem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiem_ButtonActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (PhongCanTim_TextField.getText().equals(""))
        {
            sb.append("Mời bạn nhập tên phòng cần tìm! \n");
            PhongCanTim_TextField.setBackground(Color.YELLOW);
            PhongCanTim_TextField.requestFocus();
        }
        if (sb.length()>0)
        {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            if(h40!= null){
                TenPhong_TextField.setText(h40.getTenPhong());
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thông báo" + e.getMessage());
            e.printStackTrace();

        }
        String valueCombobox = PhongCanTim_ComboBox.getSelectedItem().toString();

        List<Student> resultSearch = stDao.GetResultSearch(valueCombobox, PhongCanTim_TextField.getText());
        defaultTableModel.setRowCount(0);

        if (!resultSearch.isEmpty()) {
           setTableData(resultSearch);
        } else {
            ThongBaoTimKiem1_Label.setText(valueCombobox + "Không tồn tại tên phòng mà bạn vừa nhập!");
        }            
    }//GEN-LAST:event_TimKiem_ButtonActionPerformed

    private void LoaiPhong_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiPhong_ComboBoxActionPerformed
        // TODO add your handling code here:
        //String selectedItem = (String) ComboBoxGioiTinh.getSelectedItem();
        //System.out.println("Lựa chọn loại phòng phù hợp: " + selectedItem);
    }//GEN-LAST:event_LoaiPhong_ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhong_140().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThongTin_Table;
    private javax.swing.JTextField CMND_TextField;
    private javax.swing.JTextField Hoten_TextField;
    private javax.swing.JComboBox<String> LoaiPhong_ComboBox;
    private javax.swing.JLabel LoaiPhong_Label;
    private javax.swing.JTextField MaKTX_TextField;
    private javax.swing.JLabel MaPhong_Label;
    private javax.swing.JTextField MaPhong_TextField;
    private javax.swing.JTextField MaSv_TextField;
    private javax.swing.JComboBox<String> PhongCanTim_ComboBox;
    private javax.swing.JLabel PhongCanTim_Label;
    private javax.swing.JTextField PhongCanTim_TextField;
    private javax.swing.JTextField SDT_TextField;
    private javax.swing.JLabel SoSinhVienHienTai_Label;
    private javax.swing.JTextField SoSinhVienHienTai_TextField;
    private javax.swing.JLabel SoSinhVienToiDa_Label;
    private javax.swing.JTextField SoSinhVienToiDa_TextField;
    private javax.swing.JButton Sua_Button;
    private javax.swing.JLabel TenPhong_Label;
    private javax.swing.JTextField TenPhong_TextField;
    private javax.swing.JButton Them_Button;
    private javax.swing.JButton Thoat_Button;
    private javax.swing.JLabel ThongBaoTimKiem1_Label;
    private javax.swing.JLabel ThongBaoTimKiem_Label;
    private javax.swing.JLabel ThongTin_Label;
    private javax.swing.JButton TimKiem_Button;
    private javax.swing.JLabel TinhTrangPhong_Label;
    private javax.swing.JTextField TinhTrangPhong_TextField;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
