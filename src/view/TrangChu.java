
package view;

import java.awt.Desktop;
import java.net.URI;
import controller.Controller_DieuKhien_trangChu_324;
import controller.QuanLyThongKeContrller;
import dao.SinhVienDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TrangChu extends javax.swing.JFrame {
    List<JPanel> listPanel_317 = new ArrayList<>();
    List<JPanel> listPanelCon = new ArrayList<>();
    List<JLabel> listLabel_317 = new ArrayList<>();
    Controller_DieuKhien_trangChu_324 ctr ;
    String[] title = {"Ma phong","Ma sinh vien" , "Ten" , "CMND", "Gioi tinh", "Que Quan"}; 
    DefaultTableModel defaultTableModel = new DefaultTableModel(title,0){
        public boolean isCellEditable(int row, int column){
             return false;
            }
        };
    public TrangChu() {
        initComponents();
        Add_listPanel();
        Add_listLabel();
        Add_listPanelCon();
        Choose_Panel(0);
        Choose_Lable(0);
       jpn_QLSinhVien_324.setVisible(false);
        setLocationRelativeTo(null);
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
         
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
    public void Add_listPanelCon(){
        listPanelCon.add(jpn_QLSinhVien_324);
        listPanelCon.add(jpn_DangKyKTX_324);
        listPanelCon.add(jpn_QLPhongKTX_324);
        listPanelCon.add(jpn_QLThongKe_324);
        listPanelCon.add(jpn_ThuPhi_324);
        listPanelCon.add(jpn_QLNhanXe_324);
                
    }
     public void Choose_Panel(int index_324){
         
        for(int i=0; i<listPanelCon.size();i++){
                if(i == index_324){
                    listPanelCon.get(i).setVisible(true);
                    
                }
                else{
                    
                    listPanelCon.get(i).setVisible(false);
                    jpn_TrangChu_317.setVisible(false);
                }
        }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jpn_QLSinhVien_324 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSV = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtf_tiemKiem = new javax.swing.JTextField();
        jbt_tiemKiem = new javax.swing.JButton();
        jpn_quanLyTiemKiem = new javax.swing.JPanel();
        panelcon = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_queQuan = new javax.swing.JList<>();
        dongCS = new javax.swing.JLabel();
        jpnCMND = new javax.swing.JPanel();
        jtf_soCMND = new javax.swing.JTextField();
        jbt_tk_SoCMND = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jpn_MSV = new javax.swing.JPanel();
        jtf_timMaSV = new javax.swing.JTextField();
        btn_tk_MaSV = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_dong_tkMSV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jpn_DangKyKTX_324 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jpn_QLPhongKTX_324 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jpn_Tang1 = new javax.swing.JPanel();
        jpn_Phong1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jpn_Phong2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jpn_Tang2 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jpn_Tang3 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jpn_QLThongKe_324 = new javax.swing.JPanel();
        tk1_317 = new javax.swing.JPanel();
        jpn_ThuPhi_324 = new javax.swing.JPanel();
        jpn_QLNhanXe_324 = new javax.swing.JPanel();
        thanh_Xoa_phongTo_317 = new javax.swing.JPanel();
        thoat_317 = new javax.swing.JLabel();
        Phongto_ThuNho_317 = new javax.swing.JLabel();
        an_317 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpn_Chung_317.setPreferredSize(new java.awt.Dimension(1064, 555));

        jpn_DieuKhien_317.setBackground(new java.awt.Color(54, 33, 89));

        jlb_TrangChu_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_TrangChu_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_TrangChu_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TrangChu_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_TrangChu_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/go_home_icon_181144.png"))); // NOI18N
        jlb_TrangChu_317.setText("        Trang Chủ");
        jlb_TrangChu_317.setOpaque(true);
        jlb_TrangChu_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_TrangChu_317MouseClicked(evt);
            }
        });

        jlb_phong_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_phong_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_phong_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_phong_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_phong_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/caiDat.png"))); // NOI18N
        jlb_phong_317.setText("         Cài Đặt");
        jlb_phong_317.setOpaque(true);
        jlb_phong_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_phong_317MouseClicked(evt);
            }
        });

        jlb_ThongKe_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_ThongKe_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_ThongKe_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_ThongKe_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_ThongKe_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/system_log_out_icon_181207.png"))); // NOI18N
        jlb_ThongKe_317.setText("       Đăng Xuất");
        jlb_ThongKe_317.setOpaque(true);
        jlb_ThongKe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_ThongKe_317MouseClicked(evt);
            }
        });

        Name_KTX_317.setBackground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Name_KTX_317.setForeground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_KTX_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-truong-250.png"))); // NOI18N
        Name_KTX_317.setText("Quản Lý Ký Túc Xá");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facebook.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/youtube.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/twitter.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1_317)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name_KTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_DieuKhien_317Layout.setVerticalGroup(
            jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name_KTX_317, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1_317, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jlb_TrangChu_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jlb_phong_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jlb_ThongKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_ThietKe_317.setBackground(new java.awt.Color(51, 153, 255));
        jpn_ThietKe_317.setLayout(new java.awt.CardLayout());

        jpn_CaiDat_317.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_CaiDat_317Layout = new javax.swing.GroupLayout(jpn_CaiDat_317);
        jpn_CaiDat_317.setLayout(jpn_CaiDat_317Layout);
        jpn_CaiDat_317Layout.setHorizontalGroup(
            jpn_CaiDat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpn_CaiDat_317Layout.setVerticalGroup(
            jpn_CaiDat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_CaiDat_317, "card5");

        jpn_TrangChu_317.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1_QuanLySinhVien_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel1_QuanLySinhVien_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1_QuanLySinhVien_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1_QuanLySinhVien_317MouseClicked(evt);
            }
        });

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
        jPanel2_DangKiKTX_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2_DangKiKTX_317MouseClicked(evt);
            }
        });

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
        jPanel3_QuanLyPhongKTX_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3_QuanLyPhongKTX_317MouseClicked(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2_qlpktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4_ThongKe_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel4_ThongKe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4_ThongKe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4_ThongKe_317MouseClicked(evt);
            }
        });

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
        jPanel5_ThuPhi_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5_ThuPhi_317MouseClicked(evt);
            }
        });

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
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_DangXuat_317, "card5");

        jpn_QLSinhVien_324.setBackground(new java.awt.Color(153, 153, 255));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Đỗ màu nền");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbSV.setModel(new javax.swing.table.DefaultTableModel(
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
        tbSV.setAlignmentX(1.0F);
        tbSV.setAlignmentY(1.0F);
        tbSV.setGridColor(new java.awt.Color(255, 255, 255));
        tbSV.setRowHeight(28);
        tbSV.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jScrollPane4.setViewportView(tbSV);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xem chi tiết");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 51, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÝ THÔNG TIN CỦA TẤT CẢ CÁC SINH VIÊN TRONG KÝ TÚC XÁ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(0, 0, 255)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nhập vào tên để tìm kiếm:");

        jtf_tiemKiem.setBackground(new java.awt.Color(199, 196, 196));
        jtf_tiemKiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_tiemKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jtf_tiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiemKiemActionPerformed(evt);
            }
        });

        jbt_tiemKiem.setBackground(new java.awt.Color(0, 102, 255));
        jbt_tiemKiem.setForeground(new java.awt.Color(255, 255, 255));
        jbt_tiemKiem.setText("Tìm kiếm");
        jbt_tiemKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jbt_tiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tiemKiemActionPerformed(evt);
            }
        });

        jpn_quanLyTiemKiem.setLayout(new java.awt.CardLayout());

        panelcon.setBackground(new java.awt.Color(255, 51, 51));

        jl_queQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_queQuanMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jl_queQuan);

        dongCS.setForeground(new java.awt.Color(255, 255, 255));
        dongCS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dongCS.setText("TẮT");
        dongCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dongCSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelconLayout = new javax.swing.GroupLayout(panelcon);
        panelcon.setLayout(panelconLayout);
        panelconLayout.setHorizontalGroup(
            panelconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dongCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        panelconLayout.setVerticalGroup(
            panelconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dongCS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpn_quanLyTiemKiem.add(panelcon, "card3");

        jpnCMND.setBackground(new java.awt.Color(255, 153, 153));

        jtf_soCMND.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_soCMND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtf_soCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_soCMNDActionPerformed(evt);
            }
        });

        jbt_tk_SoCMND.setBackground(new java.awt.Color(51, 102, 255));
        jbt_tk_SoCMND.setForeground(new java.awt.Color(255, 255, 255));
        jbt_tk_SoCMND.setText("Tìm kiếm");
        jbt_tk_SoCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tk_SoCMNDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nhập vào số CMND:");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đóng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnCMNDLayout = new javax.swing.GroupLayout(jpnCMND);
        jpnCMND.setLayout(jpnCMNDLayout);
        jpnCMNDLayout.setHorizontalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCMNDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_soCMND)
                    .addGroup(jpnCMNDLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnCMNDLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jbt_tk_SoCMND)))
                .addContainerGap())
        );
        jpnCMNDLayout.setVerticalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCMNDLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_soCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_tk_SoCMND)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jpn_quanLyTiemKiem.add(jpnCMND, "card4");

        jtf_timMaSV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_timMaSV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtf_timMaSV.setName(""); // NOI18N
        jtf_timMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_timMaSVActionPerformed(evt);
            }
        });

        btn_tk_MaSV.setBackground(new java.awt.Color(51, 102, 255));
        btn_tk_MaSV.setForeground(new java.awt.Color(255, 255, 255));
        btn_tk_MaSV.setText("Tìm kiếm");
        btn_tk_MaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tk_MaSVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nhập vào mã sinh viên:");

        btn_dong_tkMSV.setBackground(new java.awt.Color(255, 0, 0));
        btn_dong_tkMSV.setForeground(new java.awt.Color(255, 255, 255));
        btn_dong_tkMSV.setText("Đóng");
        btn_dong_tkMSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dong_tkMSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_MSVLayout = new javax.swing.GroupLayout(jpn_MSV);
        jpn_MSV.setLayout(jpn_MSVLayout);
        jpn_MSVLayout.setHorizontalGroup(
            jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_timMaSV)
                    .addGroup(jpn_MSVLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpn_MSVLayout.createSequentialGroup()
                        .addComponent(btn_dong_tkMSV, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btn_tk_MaSV)))
                .addContainerGap())
        );
        jpn_MSVLayout.setVerticalGroup(
            jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_MSVLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_timMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tk_MaSV)
                    .addComponent(btn_dong_tkMSV))
                .addContainerGap())
        );

        jpn_quanLyTiemKiem.add(jpn_MSV, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        jpn_quanLyTiemKiem.add(jPanel2, "card5");

        jComboBox2.setBackground(new java.awt.Color(255, 102, 102));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quê quán", "CMND", "Mã sinh viên" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Bộ lọc:");
        jLabel3.setToolTipText("");

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Làm mới");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 51, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbt_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap(531, Short.MAX_VALUE)
                    .addComponent(jpn_quanLyTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jpn_quanLyTiemKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Quay lại");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_QLSinhVien_324Layout = new javax.swing.GroupLayout(jpn_QLSinhVien_324);
        jpn_QLSinhVien_324.setLayout(jpn_QLSinhVien_324Layout);
        jpn_QLSinhVien_324Layout.setHorizontalGroup(
            jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                        .addGroup(jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGap(34, 34, 34))))
        );
        jpn_QLSinhVien_324Layout.setVerticalGroup(
            jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpn_ThietKe_317.add(jpn_QLSinhVien_324, "card5");

        jpn_DangKyKTX_324.setBackground(new java.awt.Color(0, 51, 153));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangKy_ktx.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel9);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("BIỂU MẪU ĐĂNG KÝ CHO SINH VIÊN");

        jPanel10.setBackground(new java.awt.Color(0, 51, 153));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Quay lại");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Xuất file ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(88, 88, 88))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpn_DangKyKTX_324Layout = new javax.swing.GroupLayout(jpn_DangKyKTX_324);
        jpn_DangKyKTX_324.setLayout(jpn_DangKyKTX_324Layout);
        jpn_DangKyKTX_324Layout.setHorizontalGroup(
            jpn_DangKyKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DangKyKTX_324Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_DangKyKTX_324Layout.setVerticalGroup(
            jpn_DangKyKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DangKyKTX_324Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_ThietKe_317.add(jpn_DangKyKTX_324, "card6");

        jpn_QLPhongKTX_324.setBackground(new java.awt.Color(0, 102, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DANH SÁCH TẦNG PHÒNG");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jpn_Tang1.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tầng 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jpn_Phong1.setBackground(new java.awt.Color(121, 130, 222));
        jpn_Phong1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_Phong1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phong A1");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tổng số chỗ: 8");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jpn_Phong1Layout = new javax.swing.GroupLayout(jpn_Phong1);
        jpn_Phong1.setLayout(jpn_Phong1Layout);
        jpn_Phong1Layout.setHorizontalGroup(
            jpn_Phong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_Phong1Layout.setVerticalGroup(
            jpn_Phong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Phong1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(5, 5, 5)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn_Phong2.setBackground(new java.awt.Color(121, 130, 222));
        jpn_Phong2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_Phong2MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Phong A1");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tổng số chỗ: 8");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jpn_Phong2Layout = new javax.swing.GroupLayout(jpn_Phong2);
        jpn_Phong2.setLayout(jpn_Phong2Layout);
        jpn_Phong2Layout.setHorizontalGroup(
            jpn_Phong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_Phong2Layout.setVerticalGroup(
            jpn_Phong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Phong2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(5, 5, 5)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(121, 130, 222));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Phong A1");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Tổng số chỗ: 8");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(5, 5, 5)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(121, 130, 222));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Phong A1");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Tổng số chỗ: 8");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(5, 5, 5)
                .addComponent(jLabel41)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang1Layout = new javax.swing.GroupLayout(jpn_Tang1);
        jpn_Tang1.setLayout(jpn_Tang1Layout);
        jpn_Tang1Layout.setHorizontalGroup(
            jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jpn_Phong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jpn_Phong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang1Layout.setVerticalGroup(
            jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_Phong1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Phong2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        jpn_Tang2.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tầng 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel27.setBackground(new java.awt.Color(121, 130, 222));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Phong A1");

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Tổng số chỗ: 8");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(5, 5, 5)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(121, 130, 222));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Phong A1");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Tổng số chỗ: 8");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addGap(5, 5, 5)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(121, 130, 222));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Phong A1");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Tổng số chỗ: 8");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(5, 5, 5)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(121, 130, 222));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Phong A1");

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Tổng số chỗ: 8");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(5, 5, 5)
                .addComponent(jLabel53)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang2Layout = new javax.swing.GroupLayout(jpn_Tang2);
        jpn_Tang2.setLayout(jpn_Tang2Layout);
        jpn_Tang2Layout.setHorizontalGroup(
            jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang2Layout.setVerticalGroup(
            jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        jpn_Tang3.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tầng 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel31.setBackground(new java.awt.Color(121, 130, 222));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Phong A1");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Tổng số chỗ: 8");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addGap(5, 5, 5)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(121, 130, 222));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Phong A1");

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Tổng số chỗ: 8");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(5, 5, 5)
                .addComponent(jLabel59)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(121, 130, 222));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Phong A1");

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Tổng số chỗ: 8");

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(5, 5, 5)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(121, 130, 222));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Phong A1");

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Tổng số chỗ: 8");

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addGap(5, 5, 5)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang3Layout = new javax.swing.GroupLayout(jpn_Tang3);
        jpn_Tang3.setLayout(jpn_Tang3Layout);
        jpn_Tang3Layout.setHorizontalGroup(
            jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang3Layout.setVerticalGroup(
            jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn_Tang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Tang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Tang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_Tang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jpn_Tang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jpn_Tang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));

        jButton6.setText("Quay lại");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_QLPhongKTX_324Layout = new javax.swing.GroupLayout(jpn_QLPhongKTX_324);
        jpn_QLPhongKTX_324.setLayout(jpn_QLPhongKTX_324Layout);
        jpn_QLPhongKTX_324Layout.setHorizontalGroup(
            jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpn_QLPhongKTX_324Layout.setVerticalGroup(
            jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jpn_ThietKe_317.add(jpn_QLPhongKTX_324, "card7");

        jpn_QLThongKe_324.setBackground(new java.awt.Color(51, 51, 51));
        jpn_QLThongKe_324.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpn_QLThongKe_324AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout tk1_317Layout = new javax.swing.GroupLayout(tk1_317);
        tk1_317.setLayout(tk1_317Layout);
        tk1_317Layout.setHorizontalGroup(
            tk1_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        tk1_317Layout.setVerticalGroup(
            tk1_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpn_QLThongKe_324Layout = new javax.swing.GroupLayout(jpn_QLThongKe_324);
        jpn_QLThongKe_324.setLayout(jpn_QLThongKe_324Layout);
        jpn_QLThongKe_324Layout.setHorizontalGroup(
            jpn_QLThongKe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_QLThongKe_324Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tk1_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_QLThongKe_324Layout.setVerticalGroup(
            jpn_QLThongKe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLThongKe_324Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tk1_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        jpn_ThietKe_317.add(jpn_QLThongKe_324, "card8");

        jpn_ThuPhi_324.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jpn_ThuPhi_324Layout = new javax.swing.GroupLayout(jpn_ThuPhi_324);
        jpn_ThuPhi_324.setLayout(jpn_ThuPhi_324Layout);
        jpn_ThuPhi_324Layout.setHorizontalGroup(
            jpn_ThuPhi_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpn_ThuPhi_324Layout.setVerticalGroup(
            jpn_ThuPhi_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_ThuPhi_324, "card9");

        jpn_QLNhanXe_324.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jpn_QLNhanXe_324Layout = new javax.swing.GroupLayout(jpn_QLNhanXe_324);
        jpn_QLNhanXe_324.setLayout(jpn_QLNhanXe_324Layout);
        jpn_QLNhanXe_324Layout.setHorizontalGroup(
            jpn_QLNhanXe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpn_QLNhanXe_324Layout.setVerticalGroup(
            jpn_QLNhanXe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_QLNhanXe_324, "card10");

        thanh_Xoa_phongTo_317.setBackground(new java.awt.Color(75, 30, 155));
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

        an_317.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                    .addComponent(jpn_ThietKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
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

    private void jPanel1_QuanLySinhVien_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1_QuanLySinhVien_317MouseClicked
        Choose_Panel(0);
    }//GEN-LAST:event_jPanel1_QuanLySinhVien_317MouseClicked

    private void jPanel2_DangKiKTX_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2_DangKiKTX_317MouseClicked
        Choose_Panel(1);
    }//GEN-LAST:event_jPanel2_DangKiKTX_317MouseClicked

    private void jPanel3_QuanLyPhongKTX_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3_QuanLyPhongKTX_317MouseClicked
        Choose_Panel(2);
       
        
    }//GEN-LAST:event_jPanel3_QuanLyPhongKTX_317MouseClicked

    private void jPanel4_ThongKe_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4_ThongKe_317MouseClicked
        Choose_Panel(3);
    }//GEN-LAST:event_jPanel4_ThongKe_317MouseClicked

    private void jPanel5_ThuPhi_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5_ThuPhi_317MouseClicked
        Choose_Panel(4);
    }//GEN-LAST:event_jPanel5_ThuPhi_317MouseClicked

    private void jbt_tiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tiemKiemActionPerformed
        String ten = jtf_tiemKiem.getText();
        String theLoai = "Ten";
        if(ten.equals("")){
            JOptionPane.showMessageDialog(this, "Bạn phải nhập vào tên trước!");
        }
        else{   
            SinhVienDao dao = new SinhVienDao();
            if(ctr.getKiemTraTen(theLoai,ten)==1){
                defaultTableModel.setRowCount(0);
                ctr = new Controller_DieuKhien_trangChu_324();
                String timTen = "Ten";
                ctr.tiemKiemTheoThongTin(ten, timTen, tbSV,defaultTableModel);
            }
            else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có tên là: "+ ten , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbt_tiemKiemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Color color = JColorChooser.showDialog(this, "Chon mau", Color.yellow);
        jpn_QLSinhVien_324.setBackground(color);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String a = jComboBox2.getSelectedItem().toString();
        jpn_quanLyTiemKiem.setVisible(true);
        ctr = new Controller_DieuKhien_trangChu_324();
        System.out.println(a);
        if(a.equals("Quê quán")){
            ctr.quanLy_jList_queQuan(jl_queQuan);
            panelcon.setVisible(true);
            jpnCMND.setVisible(false);
        }
        else{
            if(a.equals("CMND")){
                panelcon.setVisible(false);
                jpnCMND.setVisible(true);
            }
            else{
                if(a.equals("Mã sinh viên"))
                jpn_MSV.setVisible(true);
                panelcon.setVisible(false);
                jpnCMND.setVisible(false);
            }
            }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jl_queQuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_queQuanMouseClicked
        String diaChi = jl_queQuan.getSelectedValue().toString();
        String timQQ = "queQuan";
        ctr = new Controller_DieuKhien_trangChu_324();
        defaultTableModel.setRowCount(0);
        ctr.tiemKiemTheoThongTin(diaChi, timQQ, tbSV, defaultTableModel);

    }//GEN-LAST:event_jl_queQuanMouseClicked

    private void dongCSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dongCSMouseClicked
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
        
    }//GEN-LAST:event_dongCSMouseClicked

    private void jbt_tk_SoCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tk_SoCMNDActionPerformed
        String cmnd = jtf_soCMND.getText();
        String timCMND = "CMND";
        if(ctr.getKiemTraTen(timCMND, cmnd)==1){
            defaultTableModel.setRowCount(0);
            ctr = new Controller_DieuKhien_trangChu_324();
            ctr.tiemKiemTheoThongTin(cmnd, timCMND, tbSV,defaultTableModel);
        }
        else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có so CMND là: "+ cmnd , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbt_tk_SoCMNDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ThongTinChiTietSinhVien thongTin = new ThongTinChiTietSinhVien("MSV01");
        thongTin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://ute.udn.vn/TinTuc/2262/1/Ky-tuc-xa-Truong-Dai-hoc-Su-pham-Ky-thuat--Dai-hoc-Da-Nang-tiep-don-sinh-vien-tro-lai-hoc-tap-luu-tru.aspx"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jtf_tiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tiemKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tiemKiemActionPerformed

    private void jtf_soCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_soCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_soCMNDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtf_tiemKiem.setText("");
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtf_timMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_timMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_timMaSVActionPerformed

    private void btn_tk_MaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tk_MaSVActionPerformed
        String maSV1 = jtf_timMaSV.getText();
        String select_maSV = "maSV";
        if(ctr.getKiemTraTen(select_maSV, maSV1)==1){
            defaultTableModel.setRowCount(0);
            ctr = new Controller_DieuKhien_trangChu_324();
            ctr.tiemKiemTheoThongTin(maSV1, select_maSV, tbSV,defaultTableModel);
        }
        else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã sinh viên là: "+ maSV1 , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_tk_MaSVActionPerformed

    private void btn_dong_tkMSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dong_tkMSVActionPerformed
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_btn_dong_tkMSVActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.youtube.com/watch?v=e5bjI7IUcKA&t=32shttps://www.youtube.com/watch?v=e5bjI7IUcKA&t=32s"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jpn_TrangChu_317.setVisible(true);
        jpn_QLSinhVien_324.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jpn_Phong1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_Phong1MouseClicked
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);
    }//GEN-LAST:event_jpn_Phong1MouseClicked

    private void jpn_Phong2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_Phong2MouseClicked
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MPA1";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jpn_Phong2MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
        // TODO add your handling code here:
        QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked
        // TODO add your handling code here:
         QuanLyPhong_140 qlphong = new QuanLyPhong_140();
        qlphong.setVisible(true);

        String phong = "MSV01";
        qlphong.setBang(phong);
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jpn_QLThongKe_324AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpn_QLThongKe_324AncestorAdded
                 
        QuanLyThongKeContrller contrller  = new QuanLyThongKeContrller();
        contrller.setDataToChart1(tk1_317);
    }//GEN-LAST:event_jpn_QLThongKe_324AncestorAdded

  
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
    private javax.swing.JButton btn_dong_tkMSV;
    private javax.swing.JButton btn_tk_MaSV;
    private javax.swing.JLabel dongCS;
    private javax.swing.JLabel icon_dkktx_317;
    private javax.swing.JLabel icon_qlsv_317;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel1_qlnx_317;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel2_dkktx_317;
    private javax.swing.JLabel jLabel2_qlpktx_317;
    private javax.swing.JLabel jLabel2_qlsv_317;
    private javax.swing.JLabel jLabel2_tk_317;
    private javax.swing.JLabel jLabel2_tp_317;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel4_icon_qlpktx_317;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel6_icon_qlnx_317;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7_icon_tp_317;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8_icon_tk_317;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel1_QuanLyNhaXe_317;
    private javax.swing.JPanel jPanel1_QuanLySinhVien_317;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel2_DangKiKTX_317;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel3_QuanLyPhongKTX_317;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4_ThongKe_317;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel5_ThuPhi_317;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1_317;
    private javax.swing.JButton jbt_tiemKiem;
    private javax.swing.JButton jbt_tk_SoCMND;
    private javax.swing.JList<String> jl_queQuan;
    private javax.swing.JLabel jlb_ThongKe_317;
    private javax.swing.JLabel jlb_TrangChu_317;
    private javax.swing.JLabel jlb_phong_317;
    private javax.swing.JPanel jpnCMND;
    private javax.swing.JPanel jpn_CaiDat_317;
    private javax.swing.JPanel jpn_Chung_317;
    private javax.swing.JPanel jpn_DangKyKTX_324;
    private javax.swing.JPanel jpn_DangXuat_317;
    private javax.swing.JPanel jpn_DieuKhien_317;
    private javax.swing.JPanel jpn_MSV;
    private javax.swing.JPanel jpn_Phong1;
    private javax.swing.JPanel jpn_Phong2;
    private javax.swing.JPanel jpn_QLNhanXe_324;
    private javax.swing.JPanel jpn_QLPhongKTX_324;
    private javax.swing.JPanel jpn_QLSinhVien_324;
    private javax.swing.JPanel jpn_QLThongKe_324;
    private javax.swing.JPanel jpn_Tang1;
    private javax.swing.JPanel jpn_Tang2;
    private javax.swing.JPanel jpn_Tang3;
    private javax.swing.JPanel jpn_ThietKe_317;
    private javax.swing.JPanel jpn_ThuPhi_324;
    private javax.swing.JPanel jpn_TrangChu_317;
    private javax.swing.JPanel jpn_quanLyTiemKiem;
    private javax.swing.JTextField jtf_soCMND;
    private javax.swing.JTextField jtf_tiemKiem;
    private javax.swing.JTextField jtf_timMaSV;
    private javax.swing.JPanel panelcon;
    private javax.swing.JTable tbSV;
    private javax.swing.JPanel thanh_Xoa_phongTo_317;
    private javax.swing.JLabel thoat_317;
    private javax.swing.JPanel tk1_317;
    // End of variables declaration//GEN-END:variables
}
