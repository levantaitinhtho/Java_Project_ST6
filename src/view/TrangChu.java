
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TrangChu extends javax.swing.JFrame {
    List<JPanel> listPanel_317 = new ArrayList<>();
    List<JLabel> listLabel_317 = new ArrayList<>();
    public TrangChu() {
        initComponents();
        Add_listPanel();
        Add_listLabel();
        Choose_Lable(0);
        setLocationRelativeTo(null);
    }
    public void Add_listPanel(){
        listPanel_317.add(jpn_TrangChu_317);
        listPanel_317.add(jpn_CaiDat_317);
        listPanel_317.add(jpn_DangXuat_317);
    }
    
    public void Add_listLabel(){
        listLabel_317.add(jlb_TrangChu_317);
        listLabel_317.add(jlb_phong_317);
        listLabel_317.add(jlb_ThongKe_317);
    }
    public void Choose_Lable(int index_317){
        for(int i=0; i<listPanel_317.size();i++){
            for(int x=0; x<listLabel_317.size();x++)
                if(i == index_317){
                    listPanel_317.get(i).setVisible(true);
                    listLabel_317.get(i).setBorder(new MatteBorder(0 , 4 , 0 , 0 , Color.red));
                    listLabel_317.get(i).setBackground(new Color(85,65,118));
                }
                else{
                    listPanel_317.get(i).setVisible(false);
                    listLabel_317.get(i).setBorder(new MatteBorder(0, 0 , 0 , 0 , Color.red));
                    listLabel_317.get(i).setBackground(new Color(64,43,100));
                }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_Chung_317 = new javax.swing.JPanel();
        jpn_DieuKhien_317 = new javax.swing.JPanel();
        jlb_TrangChu_317 = new javax.swing.JLabel();
        jlb_phong_317 = new javax.swing.JLabel();
        jlb_ThongKe_317 = new javax.swing.JLabel();
        Name_KTX_317 = new javax.swing.JLabel();
        jSeparator1_317 = new javax.swing.JSeparator();
        jpn_ThietKe_317 = new javax.swing.JPanel();
        jpn_CaiDat_317 = new javax.swing.JPanel();
        jpn_TrangChu_317 = new javax.swing.JPanel();
        jPanel1_QuanLySinhVien_317 = new javax.swing.JPanel();
        jLabel2_qlsv_317 = new javax.swing.JLabel();
        icon_qlsv_317 = new javax.swing.JLabel();
        jPanel2_DangKiKTX_317 = new javax.swing.JPanel();
        jLabel2_dkktx_317 = new javax.swing.JLabel();
        icon_dkktx_317 = new javax.swing.JLabel();
        jPanel3_QuanLyPhongKTX_317 = new javax.swing.JPanel();
        jLabel2_qlpktx_317 = new javax.swing.JLabel();
        jLabel4_icon_qlpktx_317 = new javax.swing.JLabel();
        jPanel4_ThongKe_317 = new javax.swing.JPanel();
        jLabel2_tk_317 = new javax.swing.JLabel();
        jLabel8_icon_tk_317 = new javax.swing.JLabel();
        jPanel5_ThuPhi_317 = new javax.swing.JPanel();
        jLabel2_tp_317 = new javax.swing.JLabel();
        jLabel7_icon_tp_317 = new javax.swing.JLabel();
        jPanel1_QuanLyNhaXe_317 = new javax.swing.JPanel();
        jLabel1_qlnx_317 = new javax.swing.JLabel();
        jLabel6_icon_qlnx_317 = new javax.swing.JLabel();
        jpn_DangXuat_317 = new javax.swing.JPanel();
        thanh_Xoa_phongTo_317 = new javax.swing.JPanel();
        thoat_317 = new javax.swing.JLabel();
        Phongto_ThuNho_317 = new javax.swing.JLabel();
        an_317 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpn_Chung_317.setPreferredSize(new java.awt.Dimension(1064, 555));

        jpn_DieuKhien_317.setBackground(new java.awt.Color(54, 33, 89));

        jlb_TrangChu_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_TrangChu_317.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_TrangChu_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TrangChu_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_TrangChu_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/go_home_icon_181144.png"))); // NOI18N
        jlb_TrangChu_317.setText("  Trang Chủ");
        jlb_TrangChu_317.setOpaque(true);
        jlb_TrangChu_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_TrangChu_317MouseClicked(evt);
            }
        });

        jlb_phong_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_phong_317.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_phong_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_phong_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_phong_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3592840-cog-gear-machine-office-radio-settings-setting-settings_107729.png"))); // NOI18N
        jlb_phong_317.setText("   Cài Đặt");
        jlb_phong_317.setOpaque(true);
        jlb_phong_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_phong_317MouseClicked(evt);
            }
        });

        jlb_ThongKe_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_ThongKe_317.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_ThongKe_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_ThongKe_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_ThongKe_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/system_log_out_icon_181207.png"))); // NOI18N
        jlb_ThongKe_317.setText("Đăng Xuất");
        jlb_ThongKe_317.setOpaque(true);
        jlb_ThongKe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_ThongKe_317MouseClicked(evt);
            }
        });

        Name_KTX_317.setBackground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Name_KTX_317.setForeground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_KTX_317.setText("Quản Lý Ký Túc Xá");

        javax.swing.GroupLayout jpn_DieuKhien_317Layout = new javax.swing.GroupLayout(jpn_DieuKhien_317);
        jpn_DieuKhien_317.setLayout(jpn_DieuKhien_317Layout);
        jpn_DieuKhien_317Layout.setHorizontalGroup(
            jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_phong_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_TrangChu_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Name_KTX_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1_317)
                .addGap(20, 20, 20))
        );
        jpn_DieuKhien_317Layout.setVerticalGroup(
            jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addComponent(Name_KTX_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1_317, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jlb_TrangChu_317, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlb_phong_317, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlb_ThongKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn_ThietKe_317.setBackground(new java.awt.Color(51, 153, 255));
        jpn_ThietKe_317.setLayout(new java.awt.CardLayout());

        jpn_CaiDat_317.setBackground(new java.awt.Color(120, 100, 200));

        javax.swing.GroupLayout jpn_CaiDat_317Layout = new javax.swing.GroupLayout(jpn_CaiDat_317);
        jpn_CaiDat_317.setLayout(jpn_CaiDat_317Layout);
        jpn_CaiDat_317Layout.setHorizontalGroup(
            jpn_CaiDat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpn_CaiDat_317Layout.setVerticalGroup(
            jpn_CaiDat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_CaiDat_317, "card5");

        jpn_TrangChu_317.setBackground(new java.awt.Color(120, 100, 200));

        jPanel1_QuanLySinhVien_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel1_QuanLySinhVien_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_qlsv_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_qlsv_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlsv_317.setText("QUẢN LÝ SINH VIÊN");
        jLabel2_qlsv_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_qlsv_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/management_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_QuanLySinhVien_317Layout = new javax.swing.GroupLayout(jPanel1_QuanLySinhVien_317);
        jPanel1_QuanLySinhVien_317.setLayout(jPanel1_QuanLySinhVien_317Layout);
        jPanel1_QuanLySinhVien_317Layout.setHorizontalGroup(
            jPanel1_QuanLySinhVien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLySinhVien_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(icon_qlsv_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_qlsv_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1_QuanLySinhVien_317Layout.setVerticalGroup(
            jPanel1_QuanLySinhVien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLySinhVien_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(icon_qlsv_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_qlsv_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2_DangKiKTX_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel2_DangKiKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_dkktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_dkktx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_dkktx_317.setText("ĐĂNG KÍ KTX");
        jLabel2_dkktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_dkktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student_registration_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_DangKiKTX_317Layout = new javax.swing.GroupLayout(jPanel2_DangKiKTX_317);
        jPanel2_DangKiKTX_317.setLayout(jPanel2_DangKiKTX_317Layout);
        jPanel2_DangKiKTX_317Layout.setHorizontalGroup(
            jPanel2_DangKiKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_DangKiKTX_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(icon_dkktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_dkktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2_DangKiKTX_317Layout.setVerticalGroup(
            jPanel2_DangKiKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_DangKiKTX_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(icon_dkktx_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_dkktx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3_QuanLyPhongKTX_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel3_QuanLyPhongKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_qlpktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_qlpktx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlpktx_317.setText("QUẢN LÝ PHÒNG KTX");
        jLabel2_qlpktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4_icon_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_icon_qlpktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunk_bed_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3_QuanLyPhongKTX_317Layout = new javax.swing.GroupLayout(jPanel3_QuanLyPhongKTX_317);
        jPanel3_QuanLyPhongKTX_317.setLayout(jPanel3_QuanLyPhongKTX_317Layout);
        jPanel3_QuanLyPhongKTX_317Layout.setHorizontalGroup(
            jPanel3_QuanLyPhongKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_QuanLyPhongKTX_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4_icon_qlpktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_qlpktx_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3_QuanLyPhongKTX_317Layout.setVerticalGroup(
            jPanel3_QuanLyPhongKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_QuanLyPhongKTX_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4_icon_qlpktx_317)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2_qlpktx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4_ThongKe_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel4_ThongKe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_tk_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_tk_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tk_317.setText("THỐNG KÊ");
        jLabel2_tk_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8_icon_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8_icon_tk_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/statistics_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4_ThongKe_317Layout = new javax.swing.GroupLayout(jPanel4_ThongKe_317);
        jPanel4_ThongKe_317.setLayout(jPanel4_ThongKe_317Layout);
        jPanel4_ThongKe_317Layout.setHorizontalGroup(
            jPanel4_ThongKe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ThongKe_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8_icon_tk_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_tk_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4_ThongKe_317Layout.setVerticalGroup(
            jPanel4_ThongKe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ThongKe_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8_icon_tk_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_tk_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5_ThuPhi_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel5_ThuPhi_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_tp_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_tp_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tp_317.setText("THU PHÍ");
        jLabel2_tp_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7_icon_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7_icon_tp_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/expensive_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5_ThuPhi_317Layout = new javax.swing.GroupLayout(jPanel5_ThuPhi_317);
        jPanel5_ThuPhi_317.setLayout(jPanel5_ThuPhi_317Layout);
        jPanel5_ThuPhi_317Layout.setHorizontalGroup(
            jPanel5_ThuPhi_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_ThuPhi_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7_icon_tp_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_tp_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5_ThuPhi_317Layout.setVerticalGroup(
            jPanel5_ThuPhi_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_ThuPhi_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7_icon_tp_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_tp_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1_QuanLyNhaXe_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel1_QuanLyNhaXe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1_qlnx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel1_qlnx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_qlnx_317.setText("QUẢN LÝ NHÀ XE");
        jLabel1_qlnx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6_icon_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_icon_qlnx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garage_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_QuanLyNhaXe_317Layout = new javax.swing.GroupLayout(jPanel1_QuanLyNhaXe_317);
        jPanel1_QuanLyNhaXe_317.setLayout(jPanel1_QuanLyNhaXe_317Layout);
        jPanel1_QuanLyNhaXe_317Layout.setHorizontalGroup(
            jPanel1_QuanLyNhaXe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLyNhaXe_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6_icon_qlnx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel1_qlnx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1_QuanLyNhaXe_317Layout.setVerticalGroup(
            jPanel1_QuanLyNhaXe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLyNhaXe_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6_icon_qlnx_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel1_qlnx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpn_TrangChu_317Layout = new javax.swing.GroupLayout(jpn_TrangChu_317);
        jpn_TrangChu_317.setLayout(jpn_TrangChu_317Layout);
        jpn_TrangChu_317Layout.setHorizontalGroup(
            jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TrangChu_317Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLySinhVien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2_DangKiKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5_ThuPhi_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1_QuanLyNhaXe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3_QuanLyPhongKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        jpn_TrangChu_317Layout.setVerticalGroup(
            jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TrangChu_317Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3_QuanLyPhongKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2_DangKiKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLySinhVien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(jpn_TrangChu_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5_ThuPhi_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLyNhaXe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195))
        );

        jpn_ThietKe_317.add(jpn_TrangChu_317, "card2");

        jpn_DangXuat_317.setBackground(new java.awt.Color(120, 100, 200));

        javax.swing.GroupLayout jpn_DangXuat_317Layout = new javax.swing.GroupLayout(jpn_DangXuat_317);
        jpn_DangXuat_317.setLayout(jpn_DangXuat_317Layout);
        jpn_DangXuat_317Layout.setHorizontalGroup(
            jpn_DangXuat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpn_DangXuat_317Layout.setVerticalGroup(
            jpn_DangXuat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_DangXuat_317, "card5");

        thanh_Xoa_phongTo_317.setBackground(new java.awt.Color(122, 72, 211));
        thanh_Xoa_phongTo_317.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                thanh_Xoa_phongTo_317MouseDragged(evt);
            }
        });
        thanh_Xoa_phongTo_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thanh_Xoa_phongTo_317MousePressed(evt);
            }
        });

        thoat_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thoat_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown_30px.png"))); // NOI18N
        thoat_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoat_317MouseClicked(evt);
            }
        });

        Phongto_ThuNho_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phongto_ThuNho_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/expand_30px.png"))); // NOI18N
        Phongto_ThuNho_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Phongto_ThuNho_317MouseClicked(evt);
            }
        });

        an_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        an_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/subtract_30px.png"))); // NOI18N

        javax.swing.GroupLayout thanh_Xoa_phongTo_317Layout = new javax.swing.GroupLayout(thanh_Xoa_phongTo_317);
        thanh_Xoa_phongTo_317.setLayout(thanh_Xoa_phongTo_317Layout);
        thanh_Xoa_phongTo_317Layout.setHorizontalGroup(
            thanh_Xoa_phongTo_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thanh_Xoa_phongTo_317Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(an_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Phongto_ThuNho_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(thoat_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        thanh_Xoa_phongTo_317Layout.setVerticalGroup(
            thanh_Xoa_phongTo_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(thoat_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Phongto_ThuNho_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(an_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpn_Chung_317Layout = new javax.swing.GroupLayout(jpn_Chung_317);
        jpn_Chung_317.setLayout(jpn_Chung_317Layout);
        jpn_Chung_317Layout.setHorizontalGroup(
            jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Chung_317Layout.createSequentialGroup()
                .addComponent(jpn_DieuKhien_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_ThietKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thanh_Xoa_phongTo_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpn_Chung_317Layout.setVerticalGroup(
            jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Chung_317Layout.createSequentialGroup()
                .addComponent(thanh_Xoa_phongTo_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpn_ThietKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jpn_DieuKhien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlb_TrangChu_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_TrangChu_317MouseClicked
        Choose_Lable(0);
    }//GEN-LAST:event_jlb_TrangChu_317MouseClicked

    private void jlb_phong_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_phong_317MouseClicked
       Choose_Lable(1);
    }//GEN-LAST:event_jlb_phong_317MouseClicked

    private void jlb_ThongKe_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_ThongKe_317MouseClicked
        Choose_Lable(2);
    }//GEN-LAST:event_jlb_ThongKe_317MouseClicked

    private void thoat_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoat_317MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_thoat_317MouseClicked
    int xx_317,xy_317;
    private void thanh_Xoa_phongTo_317MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanh_Xoa_phongTo_317MousePressed
         xx_317 = evt.getX();
        xy_317 = evt.getY();
    }//GEN-LAST:event_thanh_Xoa_phongTo_317MousePressed

    private void thanh_Xoa_phongTo_317MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanh_Xoa_phongTo_317MouseDragged
        int x_317 = evt.getXOnScreen();
        int y_317 = evt.getYOnScreen();
        this.setLocation(x_317-xx_317,y_317-xy_317);
    }//GEN-LAST:event_thanh_Xoa_phongTo_317MouseDragged

    private void Phongto_ThuNho_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Phongto_ThuNho_317MouseClicked
        // TODO add your handling code here:
        if(this.getExtendedState()!= TrangChu.MAXIMIZED_BOTH){
          this.setExtendedState(TrangChu.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(TrangChu.NORMAL);
        }
    }//GEN-LAST:event_Phongto_ThuNho_317MouseClicked

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name_KTX_317;
    private javax.swing.JLabel Phongto_ThuNho_317;
    private javax.swing.JLabel an_317;
    private javax.swing.JLabel icon_dkktx_317;
    private javax.swing.JLabel icon_qlsv_317;
    private javax.swing.JLabel jLabel1_qlnx_317;
    private javax.swing.JLabel jLabel2_dkktx_317;
    private javax.swing.JLabel jLabel2_qlpktx_317;
    private javax.swing.JLabel jLabel2_qlsv_317;
    private javax.swing.JLabel jLabel2_tk_317;
    private javax.swing.JLabel jLabel2_tp_317;
    private javax.swing.JLabel jLabel4_icon_qlpktx_317;
    private javax.swing.JLabel jLabel6_icon_qlnx_317;
    private javax.swing.JLabel jLabel7_icon_tp_317;
    private javax.swing.JLabel jLabel8_icon_tk_317;
    private javax.swing.JPanel jPanel1_QuanLyNhaXe_317;
    private javax.swing.JPanel jPanel1_QuanLySinhVien_317;
    private javax.swing.JPanel jPanel2_DangKiKTX_317;
    private javax.swing.JPanel jPanel3_QuanLyPhongKTX_317;
    private javax.swing.JPanel jPanel4_ThongKe_317;
    private javax.swing.JPanel jPanel5_ThuPhi_317;
    private javax.swing.JSeparator jSeparator1_317;
    private javax.swing.JLabel jlb_ThongKe_317;
    private javax.swing.JLabel jlb_TrangChu_317;
    private javax.swing.JLabel jlb_phong_317;
    private javax.swing.JPanel jpn_CaiDat_317;
    private javax.swing.JPanel jpn_Chung_317;
    private javax.swing.JPanel jpn_DangXuat_317;
    private javax.swing.JPanel jpn_DieuKhien_317;
    private javax.swing.JPanel jpn_ThietKe_317;
    private javax.swing.JPanel jpn_TrangChu_317;
    private javax.swing.JPanel thanh_Xoa_phongTo_317;
    private javax.swing.JLabel thoat_317;
    // End of variables declaration//GEN-END:variables
}
