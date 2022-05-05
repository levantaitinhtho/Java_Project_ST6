
package view;

import java.awt.Color;
import java.nio.channels.FileChannel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author tuanta
 */
public class KtxManager_Home_317 extends javax.swing.JFrame {

    public KtxManager_Home_317() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        background_main_317 = new javax.swing.JPanel();
        jpanel_menu_317 = new javax.swing.JPanel();
        jlabel1_menu_317 = new javax.swing.JLabel();
        jLabel2_menu_317 = new javax.swing.JLabel();
        jTextField1_menu_317 = new javax.swing.JTextField();
        jLabel3_search_menu_317 = new javax.swing.JLabel();
        jPanel1_sidebar_317 = new javax.swing.JPanel();
        jPanel1_trangchu_317 = new javax.swing.JPanel();
        jLabel1_icon_tc_317 = new javax.swing.JLabel();
        jLabel2_icon_tc_317 = new javax.swing.JLabel();
        jPanel2_caidat_317 = new javax.swing.JPanel();
        jLabel1_icon_cd_317 = new javax.swing.JLabel();
        jLabel2_icon_cd_317 = new javax.swing.JLabel();
        jPanel3_dangxuat = new javax.swing.JPanel();
        jLabel1_icon_dx_317 = new javax.swing.JLabel();
        jLabel2_icon_dx_317 = new javax.swing.JLabel();
        jLabel3_menu_317 = new javax.swing.JLabel();
        jPanel_header_317 = new javax.swing.JPanel();
        jLabel1_thoat_317 = new javax.swing.JLabel();
        jLabel_ten_317 = new javax.swing.JLabel();
        jPanel_TrangChu_317 = new javax.swing.JPanel();
        jPanel1_QuanLySinhVien_317 = new javax.swing.JPanel();
        jLabel1_icon_qlsv_317 = new javax.swing.JLabel();
        jLabel2_qlsv_317 = new javax.swing.JLabel();
        jPanel2_DangKiKTX_317 = new javax.swing.JPanel();
        jLabel1_icon_dkktx_317 = new javax.swing.JLabel();
        jLabel2_dkktx_317 = new javax.swing.JLabel();
        jPanel3_QuanLyPhongKTX_317 = new javax.swing.JPanel();
        jLabel1_icon_qlpktx_317 = new javax.swing.JLabel();
        jLabel2_qlpktx_317 = new javax.swing.JLabel();
        jPanel4_ThongKe_317 = new javax.swing.JPanel();
        jLabel1_icon_tk_317 = new javax.swing.JLabel();
        jLabel2_tk_317 = new javax.swing.JLabel();
        jPanel5_ThuPhi_317 = new javax.swing.JPanel();
        jLabel1_icon_tp_317 = new javax.swing.JLabel();
        jLabel2_tp_317 = new javax.swing.JLabel();
        jPanel1_QuanLyNhaXe_317 = new javax.swing.JPanel();
        jLabel1_icon_qlnx_317 = new javax.swing.JLabel();
        jLabel1_qlnx_317 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background_main_317.setBackground(new java.awt.Color(0, 0, 0));
        background_main_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_menu_317.setBackground(new java.awt.Color(35, 45, 49));
        jpanel_menu_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel1_menu_317.setBackground(new java.awt.Color(35, 45, 49));
        jlabel1_menu_317.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jlabel1_menu_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel1_menu_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login (1).png"))); // NOI18N
        jlabel1_menu_317.setOpaque(true);
        jpanel_menu_317.add(jlabel1_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        jLabel2_menu_317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_menu_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jLabel2_menu_317.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2_menu_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2_menu_317.setText("Online");
        jpanel_menu_317.add(jLabel2_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 40, 20));
        jpanel_menu_317.add(jTextField1_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 30));

        jLabel3_search_menu_317.setBackground(new java.awt.Color(35, 45, 49));
        jLabel3_search_menu_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_search_menu_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel3_search_menu_317.setOpaque(true);
        jpanel_menu_317.add(jLabel3_search_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 30));

        jPanel1_sidebar_317.setBackground(new java.awt.Color(35, 45, 49));
        jPanel1_sidebar_317.setLayout(new java.awt.GridLayout(3, 1));

        jPanel1_trangchu_317.setBackground(new java.awt.Color(35, 45, 49));
        jPanel1_trangchu_317.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jPanel1_trangchu_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1_trangchu_317MouseClicked(evt);
            }
        });
        jPanel1_trangchu_317.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 30));

        jLabel1_icon_tc_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jPanel1_trangchu_317.add(jLabel1_icon_tc_317);

        jLabel2_icon_tc_317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_tc_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_icon_tc_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_tc_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_icon_tc_317.setText("TRANG CHỦ");
        jPanel1_trangchu_317.add(jLabel2_icon_tc_317);

        jPanel1_sidebar_317.add(jPanel1_trangchu_317);

        jPanel2_caidat_317.setBackground(new java.awt.Color(35, 45, 49));
        jPanel2_caidat_317.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jPanel2_caidat_317.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 30));

        jLabel1_icon_cd_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1_icon_cd_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        jPanel2_caidat_317.add(jLabel1_icon_cd_317);

        jLabel2_icon_cd_317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_cd_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_icon_cd_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_cd_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_icon_cd_317.setText("CÀI ĐẶT");
        jPanel2_caidat_317.add(jLabel2_icon_cd_317);

        jPanel1_sidebar_317.add(jPanel2_caidat_317);

        jPanel3_dangxuat.setBackground(new java.awt.Color(35, 45, 49));
        jPanel3_dangxuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jPanel3_dangxuat.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 30));

        jLabel1_icon_dx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-out.png"))); // NOI18N
        jPanel3_dangxuat.add(jLabel1_icon_dx_317);

        jLabel2_icon_dx_317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_dx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_icon_dx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_icon_dx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_icon_dx_317.setText("ĐĂNG XUẤT");
        jPanel3_dangxuat.add(jLabel2_icon_dx_317);

        jPanel1_sidebar_317.add(jPanel3_dangxuat);

        jpanel_menu_317.add(jPanel1_sidebar_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 350));

        jLabel3_menu_317.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_menu_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel3_menu_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_menu_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_menu_317.setText("Sư Phạm Kỹ Thuật");
        jpanel_menu_317.add(jLabel3_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 20));

        background_main_317.add(jpanel_menu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 540));
        jpanel_menu_317.getAccessibleContext().setAccessibleDescription("");
        jpanel_menu_317.getAccessibleContext().setAccessibleParent(this);

        jPanel_header_317.setBackground(new java.awt.Color(60, 141, 166));
        jPanel_header_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_thoat_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_thoat_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        jLabel1_thoat_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_thoat_317MouseClicked(evt);
            }
        });
        jPanel_header_317.add(jLabel1_thoat_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        jLabel_ten_317.setBackground(new java.awt.Color(54, 127, 166));
        jLabel_ten_317.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel_ten_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ten_317.setText("Ký    Túc    Xá");
        jLabel_ten_317.setOpaque(true);
        jPanel_header_317.add(jLabel_ten_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 800, 40));

        background_main_317.add(jPanel_header_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 40));
        jPanel_header_317.getAccessibleContext().setAccessibleParent(this);

        jPanel_TrangChu_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel_TrangChu_317.setInheritsPopupMenu(true);
        jPanel_TrangChu_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_QuanLySinhVien_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1_QuanLySinhVien_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1_QuanLySinhVien_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_qlsv_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_qlsv_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_qlsv_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student.png"))); // NOI18N
        jLabel1_icon_qlsv_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1_QuanLySinhVien_317.add(jLabel1_icon_qlsv_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel2_qlsv_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_qlsv_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlsv_317.setText("QUẢN LÝ SINH VIÊN");
        jLabel2_qlsv_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1_QuanLySinhVien_317.add(jLabel2_qlsv_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel1_QuanLySinhVien_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 170));

        jPanel2_DangKiKTX_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2_DangKiKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_DangKiKTX_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_dkktx_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_dkktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_dkktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user.png"))); // NOI18N
        jLabel1_icon_dkktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2_DangKiKTX_317.add(jLabel1_icon_dkktx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel2_dkktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_dkktx_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_dkktx_317.setText("ĐĂNG KÍ KTX");
        jLabel2_dkktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2_DangKiKTX_317.add(jLabel2_dkktx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel2_DangKiKTX_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 230, 170));

        jPanel3_QuanLyPhongKTX_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3_QuanLyPhongKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_QuanLyPhongKTX_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_qlpktx_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_qlpktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_qlpktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/online-booking.png"))); // NOI18N
        jLabel1_icon_qlpktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3_QuanLyPhongKTX_317.add(jLabel1_icon_qlpktx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel2_qlpktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_qlpktx_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlpktx_317.setText("QUẢN LÝ PHÒNG KTX");
        jLabel2_qlpktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3_QuanLyPhongKTX_317.add(jLabel2_qlpktx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel3_QuanLyPhongKTX_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 170));

        jPanel4_ThongKe_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4_ThongKe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4_ThongKe_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_tk_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_tk_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_tk_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diagram.png"))); // NOI18N
        jLabel1_icon_tk_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4_ThongKe_317.add(jLabel1_icon_tk_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel2_tk_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_tk_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tk_317.setText("THỐNG KÊ");
        jLabel2_tk_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4_ThongKe_317.add(jLabel2_tk_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel4_ThongKe_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 170));

        jPanel5_ThuPhi_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5_ThuPhi_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5_ThuPhi_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_tp_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_tp_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_tp_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jLabel1_icon_tp_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5_ThuPhi_317.add(jLabel1_icon_tp_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel2_tp_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2_tp_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tp_317.setText("THU PHÍ");
        jLabel2_tp_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5_ThuPhi_317.add(jLabel2_tp_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel5_ThuPhi_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 230, 170));

        jPanel1_QuanLyNhaXe_317.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1_QuanLyNhaXe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1_QuanLyNhaXe_317.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_icon_qlnx_317.setBackground(new java.awt.Color(60, 141, 166));
        jLabel1_icon_qlnx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_icon_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_icon_qlnx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/management.png"))); // NOI18N
        jLabel1_icon_qlnx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1_QuanLyNhaXe_317.add(jLabel1_icon_qlnx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jLabel1_qlnx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1_qlnx_317.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_qlnx_317.setText("QUẢN LÝ NHÀ XE");
        jLabel1_qlnx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1_QuanLyNhaXe_317.add(jLabel1_qlnx_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        jPanel_TrangChu_317.add(jPanel1_QuanLyNhaXe_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 230, 170));

        background_main_317.add(jPanel_TrangChu_317, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 800, 500));
        jPanel_TrangChu_317.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_main_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_main_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1_thoat_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_thoat_317MouseClicked
        // TODO add your handling code here:
       this.setVisible(false);
    }//GEN-LAST:event_jLabel1_thoat_317MouseClicked

    private void jPanel1_trangchu_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1_trangchu_317MouseClicked
       jPanel1_trangchu_317.setBackground(Color.LIGHT_GRAY);
       jPanel1_trangchu_317.setBorder(new MatteBorder(0,3,0,0,Color.red));
    }//GEN-LAST:event_jPanel1_trangchu_317MouseClicked

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
            java.util.logging.Logger.getLogger(KtxManager_Home_317.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KtxManager_Home_317.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KtxManager_Home_317.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KtxManager_Home_317.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KtxManager_Home_317().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_main_317;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_icon_cd_317;
    private javax.swing.JLabel jLabel1_icon_dkktx_317;
    private javax.swing.JLabel jLabel1_icon_dx_317;
    private javax.swing.JLabel jLabel1_icon_qlnx_317;
    private javax.swing.JLabel jLabel1_icon_qlpktx_317;
    private javax.swing.JLabel jLabel1_icon_qlsv_317;
    private javax.swing.JLabel jLabel1_icon_tc_317;
    private javax.swing.JLabel jLabel1_icon_tk_317;
    private javax.swing.JLabel jLabel1_icon_tp_317;
    private javax.swing.JLabel jLabel1_qlnx_317;
    private javax.swing.JLabel jLabel1_thoat_317;
    private javax.swing.JLabel jLabel2_dkktx_317;
    private javax.swing.JLabel jLabel2_icon_cd_317;
    private javax.swing.JLabel jLabel2_icon_dx_317;
    private javax.swing.JLabel jLabel2_icon_tc_317;
    private javax.swing.JLabel jLabel2_menu_317;
    private javax.swing.JLabel jLabel2_qlpktx_317;
    private javax.swing.JLabel jLabel2_qlsv_317;
    private javax.swing.JLabel jLabel2_tk_317;
    private javax.swing.JLabel jLabel2_tp_317;
    private javax.swing.JLabel jLabel3_menu_317;
    private javax.swing.JLabel jLabel3_search_menu_317;
    private javax.swing.JLabel jLabel_ten_317;
    private javax.swing.JPanel jPanel1_QuanLyNhaXe_317;
    private javax.swing.JPanel jPanel1_QuanLySinhVien_317;
    private javax.swing.JPanel jPanel1_sidebar_317;
    private javax.swing.JPanel jPanel1_trangchu_317;
    private javax.swing.JPanel jPanel2_DangKiKTX_317;
    private javax.swing.JPanel jPanel2_caidat_317;
    private javax.swing.JPanel jPanel3_QuanLyPhongKTX_317;
    private javax.swing.JPanel jPanel3_dangxuat;
    private javax.swing.JPanel jPanel4_ThongKe_317;
    private javax.swing.JPanel jPanel5_ThuPhi_317;
    private javax.swing.JPanel jPanel_TrangChu_317;
    private javax.swing.JPanel jPanel_header_317;
    private javax.swing.JTextField jTextField1_menu_317;
    private javax.swing.JLabel jlabel1_menu_317;
    private javax.swing.JPanel jpanel_menu_317;
    // End of variables declaration//GEN-END:variables
}