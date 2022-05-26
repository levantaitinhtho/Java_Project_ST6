
package view;

import model.ThongTinPhong_140;
import dao.StudentDao;
import connect.KetNoiSQL;
import model.SinhVien_tatCaThongTin_140;
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
import javax.xml.soap.Detail;

public  class QuanLyPhong_140 extends javax.swing.JFrame {
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    ThongTinPhong_140 h40 = new ThongTinPhong_140();
    SinhVien_tatCaThongTin_140 st40 = new SinhVien_tatCaThongTin_140();
    StudentDao stDao;
    StudentService stService;
    StudentService service = new StudentService();
    public QuanLyPhong_140() {
        service = new StudentService();
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
        
        defaultTableModel.addColumn("Tên phòng");
        defaultTableModel.addColumn("Mã phòng");
        defaultTableModel.addColumn("Loại phòng");
        defaultTableModel.addColumn("Số sinh viên hiện tại");
        defaultTableModel.addColumn("Số sinh viên tối đa");
       defaultTableModel.addColumn("Tình trạng phòng");
//        
        setTableData(service.getAllStudents2());
       
    }
   public void setBang(String maPhong){
       System.out.println(maPhong);
       stDao = new StudentDao();
        defaultTableModel.setRowCount(0);
        setTableData(stDao.getSinhVienTrongPhong_140(maPhong));
   }
    
    
    //tringBuilder sb = new StringBuilder();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     
     */
    
    public void setTableData(List<SinhVien_tatCaThongTin_140> students){
       for (SinhVien_tatCaThongTin_140 st: students) {
            defaultTableModel.addRow(new Object[]{ st.getTenPhong_140(), st.getMaPhong_140(),
                st.getLoaiPhong_140(), st.getSoSinhVienHienTai_140(), st.getSoSinhVienToiDa_140(),
                st.getTinhTrangPhong_140()
            });
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
        TimKiemPhong_TextField = new javax.swing.JTextField();
        TimKiem_Button = new javax.swing.JButton();
        TenPhong_Label = new javax.swing.JLabel();
        MaPhong_Label = new javax.swing.JLabel();
        LoaiPhong_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangThongTin_Table = new javax.swing.JTable();
        TinhTrangPhong_Label = new javax.swing.JLabel();
        ThongBaoTimKiem_Label = new javax.swing.JLabel();
        ThongBaoTimKiem1_Label = new javax.swing.JLabel();
        LoaiPhong_TextField = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ThongTin_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThongTin_Label.setForeground(new java.awt.Color(204, 0, 0));
        ThongTin_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home1.png"))); // NOI18N
        ThongTin_Label.setText("THÔNG TIN TỪNG PHÒNG TẠI KÝ TÚC XÁ");

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
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        TenPhong_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenPhong_TextFieldActionPerformed(evt);
            }
        });

        PhongCanTim_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PhongCanTim_Label.setForeground(new java.awt.Color(255, 255, 255));
        PhongCanTim_Label.setText("Nhập mã phòng cần tìm: ");

        TimKiemPhong_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemPhong_TextFieldActionPerformed(evt);
            }
        });

        TimKiem_Button.setBackground(new java.awt.Color(255, 153, 0));
        TimKiem_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimKiem_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon-24.png"))); // NOI18N
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên phòng", "Mã phòng ", "Loại phòng", "Số sinh viên hiện tại", "Số sinh viên tối đa", "Tình trạng phòng"
            }
        ));
        BangThongTin_Table.setName(""); // NOI18N
        BangThongTin_Table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BangThongTin_TableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(BangThongTin_Table);

        TinhTrangPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TinhTrangPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TinhTrangPhong_Label.setText("Tình Trạng Phòng: ");

        ThongBaoTimKiem1_Label.setText("TK");

        LoaiPhong_TextField.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThongBaoTimKiem1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongBaoTimKiem_Label)
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaPhong_Label)
                            .addComponent(TenPhong_Label)
                            .addComponent(LoaiPhong_Label))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PhongCanTim_Label)
                                .addGap(18, 18, 18)
                                .addComponent(TimKiemPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TimKiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TenPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(185, 185, 185)
                                        .addComponent(SoSinhVienHienTai_Label))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67)
                                            .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                            .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(MaPhong_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                                .addComponent(LoaiPhong_TextField))
                                            .addGap(185, 185, 185)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SoSinhVienToiDa_Label)
                                                .addComponent(TinhTrangPhong_Label)))))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ThongBaoTimKiem1_Label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ThongBaoTimKiem_Label)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhongCanTim_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimKiemPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimKiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenPhong_Label)
                            .addComponent(TenPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaPhong_Label)
                            .addComponent(SoSinhVienToiDa_Label)
                            .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LoaiPhong_Label)
                                .addComponent(TinhTrangPhong_Label)
                                .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoaiPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiem_ButtonActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        String TimKiem = TimKiemPhong_TextField.getText();
       if (TimKiemPhong_TextField.getText().equals(""))
        {
            sb.append("Mời bạn nhập tên phòng cần tìm! \n");
            TimKiemPhong_TextField.setBackground(Color.YELLOW);
            TimKiemPhong_TextField.requestFocus();
       }
        if (sb.length()>0)
        {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            if(h40!= null){
               MaPhong_TextField.setText(h40.getMaPhong());
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thông báo" + e.getMessage());
            e.printStackTrace();

        List<SinhVien_tatCaThongTin_140> resultSearch = stDao.GetResultSearch(TimKiem, TimKiemPhong_TextField.getText());
        defaultTableModel.setRowCount(0);

        if (!resultSearch.isEmpty()) {
            setTableData(resultSearch);
           ThongBaoTimKiem1_Label.setText(TimKiem+ "Đã tìm thấy phòng này!"); 
        } else {
            ThongBaoTimKiem1_Label.setText(TimKiem+ "Phòng này không tồn tại trong kí túc xá!");
        }
        }
    }//GEN-LAST:event_TimKiem_ButtonActionPerformed

    private void TimKiemPhong_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemPhong_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemPhong_TextFieldActionPerformed

    private void Thoat_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thoat_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Thoat_ButtonActionPerformed
    
    
   
    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed
        // TODO add your handling code here:
   
//      int row = BangThongTin_Table.getSelectedRow();
//        if (row == -1)//nguoi dung chua chon hang nao
//        {
//            JOptionPane.showMessageDialog(QuanLyPhong_140.this, "Vui lòng chọn hàng thông tin cần xóa trước", "loi", JOptionPane.ERROR_MESSAGE);
//
//        } else {
//            int confirm = JOptionPane.showConfirmDialog(QuanLyPhong_140.this, "Bạn chắc chắn muốn xóa không?");
//            if (confirm == JOptionPane.YES_OPTION) {
//
//                
//                    String data = String.valueOf(BangThongTin_Table.getValueAt(row, 1));
//                    System.out.println(data);
//                try {
//                    stService.DeleteTTPhong(data);
//                } catch (SQLException ex) {
//                    Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                    
//                    defaultTableModel.setRowCount(1);//de xoa het du lieu hien tai
//                    setTableData(stService.getAllStudents2());
//                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
//               
//              
//
//            }
//        }

 int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa không");
        if(result == 0 ){
            int position = BangThongTin_Table.getSelectedRow();
            String data = BangThongTin_Table.getModel().getValueAt(position, 0).toString();
              try{
                Connection connection = KetNoiSQL.getConnection();
                String query = "DELETE FROM dbo.[Phong] WHERE tenPhong = ? ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,data);
                ps.executeUpdate();
                showDuLieu();
                KetNoiSQL.closeConnection(connection);
                JOptionPane.showMessageDialog(null,"Xóa thành công");
        
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }       
        
    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    
 
    private void Sua_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sua_ButtonActionPerformed
         // TODO add your handling code here:
//        int row = BangThongTin_Table.getSelectedRow();
//        if (row == 0)//nguoi dung chua chon hang nao
//        {
//            JOptionPane.showMessageDialog(QuanLyPhong_140.this, "Vui lòng chọn hàng thông tin cần xóa trước", "Lỗi", JOptionPane.ERROR_MESSAGE);
//
//        } else {
//           int confirm = JOptionPane.showConfirmDialog(QuanLyPhong_140.this, "Bạn chắc chắn muốn xóa không?");
//            if (confirm == JOptionPane.YES_OPTION) {
//
//                String data = String.valueOf(BangThongTin_Table.getValueAt(row, 1));
//                
//              try {
//                   stService.DeleteTTPhong(data);
//               } catch (SQLException ex) {
//                   Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              
//                defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
//                setTableData(stService.getAllStudents2());
//                JOptionPane.showMessageDialog(this, "Xóa thành công!");
//             
//
//            }
//        }
      int result = JOptionPane.showConfirmDialog(null,"Vui lòng chọn hàng thông tin cần xóa trước");
        if(result == 0 ){
            
            int position = BangThongTin_Table.getSelectedRow();
            String data = BangThongTin_Table.getModel().getValueAt(position, 0).toString();
              try{
                Connection connection = KetNoiSQL.getConnection();
                String query = "DELETE FROM dbo.[Phong] WHERE tenPhong = ? ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,data);
                ps.executeUpdate();
                showDuLieu();
                KetNoiSQL.closeConnection(connection);
                JOptionPane.showMessageDialog(null,"Xóa thành công");
        
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }       
        else{
        if (TenPhong_TextField.getText().equals("") || MaPhong_TextField.getText().equals("") || LoaiPhong_TextField.getText().equals("") 
                || SoSinhVienHienTai_TextField.getText().equals("") || SoSinhVienToiDa_TextField.getText().equals("") 
                || TinhTrangPhong_TextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        } else {
            try {
                
                st40.setTenPhong_140(TenPhong_TextField.getText());
                st40.setMaPhong_140(MaPhong_TextField.getText());
                st40.setLoaiPhong_140(LoaiPhong_TextField.getText());
                
                st40.setSoSinhVienHienTai_140(SoSinhVienHienTai_TextField.getText());
                st40.setSoSinhVienToiDa_140(SoSinhVienToiDa_TextField.getText());
                st40.setTinhTrangPhong_140(TinhTrangPhong_TextField.getText());
                
                stService.addTTPhong(st40);
                JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
 
        defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
        setTableData(stService.getAllStudents2());
        
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
    
    }//GEN-LAST:event_Sua_ButtonActionPerformed
}
    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed
 
        String TenPhong = TenPhong_TextField.getText();
        String MaPhong = MaPhong_TextField.getText();
        String LoaiPhong = LoaiPhong_TextField.getText();
        String SoSVHienTai = SoSinhVienHienTai_TextField.getText();
        String SoSVToiDa = SoSinhVienToiDa_TextField.getText();
        String TinhTrangPhong = TinhTrangPhong_TextField.getText();
        StringBuilder sb = new StringBuilder();

        if (TenPhong.equals("")){
            sb.append("Tên phòng không được để trống!\n");
        }
        if(MaPhong.equals("")){
            sb.append("Mã phòng không được để trống!\n");
        }
        if(LoaiPhong.equals("")){
           sb.append("Loại phòng không được để trống!\n");
        }
        if(SoSVHienTai.equals("")){
            sb.append("Nhập số sinh viên hiện tại của phòng!\n");
        }
        if(SoSVToiDa.equals("")){
            sb.append("Nhập số sinh viên tối đa của phòng!\n");
        }
        if(TinhTrangPhong.equals("")){
            sb.append("Tình trạng phòng hiện tại như thế nào!\n");
        }
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo lỗi!",
               JOptionPane.ERROR_MESSAGE);
            return;
       }
        else{
            st40.setTenPhong_140(TenPhong_TextField.getText());
            st40.setMaPhong_140(MaPhong_TextField.getText());
            st40.setLoaiPhong_140(LoaiPhong_TextField.getText());
            st40.setSoSinhVienHienTai_140(SoSinhVienHienTai_TextField.getText());
            st40.setSoSinhVienToiDa_140(SoSinhVienToiDa_TextField.getText());
            st40.setTinhTrangPhong_140(TinhTrangPhong_TextField.getText());
            BangThongTin_Table.setModel(defaultTableModel);
            defaultTableModel.addRow(new Object[]{ st40.getTenPhong_140(),st40.getMaPhong_140(),
           st40.getLoaiPhong_140(), st40.getSoSinhVienHienTai_140(), st40.getSoSinhVienToiDa_140(),st40.getTinhTrangPhong_140()});
            JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công 1 hàng dữ liệu!", "Thông báo",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Them_ButtonActionPerformed

    private void SoSinhVienHienTai_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoSinhVienHienTai_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoSinhVienHienTai_TextFieldActionPerformed

    private void TenPhong_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenPhong_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenPhong_TextFieldActionPerformed
   private void showDuLieu(){
        try{
            BangThongTin_Table.removeAll();
            String[] arr = {"Tên phòng", "Mã phòng", "Loại phòng", "Số sinh viên hiện tại","Số sinh viên tối đa", "Tình trạng phòng"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            BangThongTin_Table.setModel(model);
            Connection connection = KetNoiSQL.getConnection();
            String query = "SELECT *FROM dbo.[Phong]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("tenPhong"));
                vector.add(rs.getString("maPhong"));
                vector.add(rs.getString("loaiPhong"));
                vector.add(rs.getString("soNguoiHienTai"));
                vector.add(rs.getString("soNguoiToiDa"));
                vector.add(rs.getString("tinhTrangPhong"));
                
                model.addRow(vector);

            }
            //đóng kết nối 
            KetNoiSQL.closeConnection(connection);
            BangThongTin_Table.setModel((TableModel) model);
        }catch(SQLException ex){
           Logger.getLogger(QuanLyPhong_140.class.getName()).log(Level.SEVERE,null,ex);
           
        }
    }
    
    
    private void BangThongTin_TableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BangThongTin_TableComponentShown
        // TODO add your handling code here:
     
    }//GEN-LAST:event_BangThongTin_TableComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       //   showDuLieu();
    }//GEN-LAST:event_formComponentShown
    
  
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
    private javax.swing.JLabel LoaiPhong_Label;
    private javax.swing.JTextField LoaiPhong_TextField;
    private javax.swing.JLabel MaPhong_Label;
    private javax.swing.JTextField MaPhong_TextField;
    private javax.swing.JLabel PhongCanTim_Label;
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
    private javax.swing.JTextField TimKiemPhong_TextField;
    private javax.swing.JButton TimKiem_Button;
    private javax.swing.JLabel TinhTrangPhong_Label;
    private javax.swing.JTextField TinhTrangPhong_TextField;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
