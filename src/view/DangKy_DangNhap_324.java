
package view;

import controller.KiemTraEmail_324;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;

public class DangKy_DangNhap_324 extends javax.swing.JFrame {
    public DangKy_DangNhap_324() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Thiet lap mat dinh cho not dang nhap 
        dangNhap_Label_324.setBorder(new MatteBorder(0, 0, 3 , 0, Color.white));
        dangNhap_Label_324.setForeground(Color.red);
        DangNhap_Panel_324.setVisible(true);
        
        //Thiet lam mat dinh cho not dang ky
        dangKy_Label_324.setBorder(new MatteBorder(0, 0, 0, 0, Color.GREEN));
        dangKy_Label_324.setForeground(Color.white);
        DangKy_Panel_324.setVisible(false);
        
        hide.setVisible(false);
        hide1_Lable.setVisible(false);
        hidePassDn_Lable.setVisible(false);
        
        quenMatKhau_Label.setBorder(new MatteBorder(0, 0, 1 , 0, Color.white));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        dangNhapDangKy_Panel_324 = new javax.swing.JPanel();
        trangThai_Panel_324 = new javax.swing.JPanel();
        dangNhap_Label_324 = new javax.swing.JLabel();
        dangKy_Label_324 = new javax.swing.JLabel();
        DangNhap_Panel_324 = new javax.swing.JPanel();
        tenTaiKhoan_Label_324 = new javax.swing.JLabel();
        matKhau_Label_324 = new javax.swing.JLabel();
        tenTaiKhoan_textField_324 = new javax.swing.JTextField();
        matKhauDN_PassWordField_324 = new javax.swing.JPasswordField();
        showPassDn_Lable = new javax.swing.JLabel();
        hidePassDn_Lable = new javax.swing.JLabel();
        quenMatKhau_Label = new javax.swing.JLabel();
        dangNhap_JLabel_324 = new javax.swing.JLabel();
        DangKy_Panel_324 = new javax.swing.JPanel();
        tenTaiKhoanDK_Label_324 = new javax.swing.JLabel();
        EmailDK_Label_324 = new javax.swing.JLabel();
        matKhau1DK_Label_324 = new javax.swing.JLabel();
        maKhau2DK_Label_324 = new javax.swing.JLabel();
        tenTaiKhoan_TextField_324 = new javax.swing.JTextField();
        emailDK_TextField_324 = new javax.swing.JTextField();
        matKhau1DK_PassWordField_324 = new javax.swing.JPasswordField();
        matKhau2DK_PassWordField_324 = new javax.swing.JPasswordField();
        showPass1_Lable1 = new javax.swing.JLabel();
        hide1_Lable = new javax.swing.JLabel();
        showPass2_Lable2 = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        dangKy_JLabel_324 = new javax.swing.JLabel();
        KeoNgang_jSeparator = new javax.swing.JSeparator();
        KyTucXa_Label_324 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitSystem = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormDangNhapDangKy");
        setBackground(new java.awt.Color(0, 204, 255));
        setForeground(new java.awt.Color(102, 204, 255));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("FormDangNhapDangKy_324"); // NOI18N
        setUndecorated(true);

        dangNhapDangKy_Panel_324.setBackground(new java.awt.Color(0, 40, 120));
        dangNhapDangKy_Panel_324.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 120), 2));

        trangThai_Panel_324.setBackground(new java.awt.Color(0, 40, 120));
        trangThai_Panel_324.setDoubleBuffered(false);
        trangThai_Panel_324.setLayout(new java.awt.GridLayout(1, 2));

        dangNhap_Label_324.setBackground(new java.awt.Color(0, 40, 120));
        dangNhap_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangNhap_Label_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangNhap_Label_324.setText("ĐĂNG NHẬP");
        dangNhap_Label_324.setAlignmentY(0.0F);
        dangNhap_Label_324.setOpaque(true);
        dangNhap_Label_324.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangNhap_Label_324MouseClicked(evt);
            }
        });
        trangThai_Panel_324.add(dangNhap_Label_324);

        dangKy_Label_324.setBackground(new java.awt.Color(0, 40, 120));
        dangKy_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangKy_Label_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangKy_Label_324.setText("ĐĂNG KÝ");
        dangKy_Label_324.setOpaque(true);
        dangKy_Label_324.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dangKy_Label_324MousePressed(evt);
            }
        });
        trangThai_Panel_324.add(dangKy_Label_324);

        DangNhap_Panel_324.setBackground(new java.awt.Color(0, 40, 120));

        tenTaiKhoan_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tenTaiKhoan_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        tenTaiKhoan_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        tenTaiKhoan_Label_324.setText(" TÊN TÀI KHOẢN:");

        matKhau_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matKhau_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        matKhau_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/padlock.png"))); // NOI18N
        matKhau_Label_324.setText(" MẬT KHẨU:");

        tenTaiKhoan_textField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tenTaiKhoan_textField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tenTaiKhoan_textField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        matKhauDN_PassWordField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        matKhauDN_PassWordField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matKhauDN_PassWordField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        showPassDn_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/showPass.png"))); // NOI18N
        showPassDn_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassDn_LableMousePressed(evt);
            }
        });

        hidePassDn_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/show.png"))); // NOI18N
        hidePassDn_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePassDn_LableMousePressed(evt);
            }
        });

        quenMatKhau_Label.setForeground(new java.awt.Color(0, 255, 255));
        quenMatKhau_Label.setText("Quên mật khẩu ?");
        quenMatKhau_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quenMatKhau_LabelMousePressed(evt);
            }
        });

        dangNhap_JLabel_324.setBackground(new java.awt.Color(51, 255, 255));
        dangNhap_JLabel_324.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangNhap_JLabel_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangNhap_JLabel_324.setText("Đăng Nhập");
        dangNhap_JLabel_324.setOpaque(true);
        dangNhap_JLabel_324.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dangNhap_JLabel_324MousePressed(evt);
            }
        });

        javax.swing.GroupLayout DangNhap_Panel_324Layout = new javax.swing.GroupLayout(DangNhap_Panel_324);
        DangNhap_Panel_324.setLayout(DangNhap_Panel_324Layout);
        DangNhap_Panel_324Layout.setHorizontalGroup(
            DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangNhap_Panel_324Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tenTaiKhoan_Label_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matKhau_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quenMatKhau_Label)
                    .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tenTaiKhoan_textField_324)
                        .addComponent(matKhauDN_PassWordField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPassDn_Lable)
                    .addComponent(hidePassDn_Lable)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangNhap_Panel_324Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dangNhap_JLabel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        DangNhap_Panel_324Layout.setVerticalGroup(
            DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangNhap_Panel_324Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenTaiKhoan_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenTaiKhoan_textField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DangNhap_Panel_324Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassDn_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hidePassDn_Lable)))
                    .addGroup(DangNhap_Panel_324Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DangNhap_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matKhau_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matKhauDN_PassWordField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quenMatKhau_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(dangNhap_JLabel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        DangKy_Panel_324.setBackground(new java.awt.Color(0, 40, 120));

        tenTaiKhoanDK_Label_324.setBackground(new java.awt.Color(255, 255, 204));
        tenTaiKhoanDK_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tenTaiKhoanDK_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        tenTaiKhoanDK_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        tenTaiKhoanDK_Label_324.setText(" TÊN TÀI KHOẢN:");

        EmailDK_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailDK_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        EmailDK_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email.png"))); // NOI18N
        EmailDK_Label_324.setText(" EMAIL:");

        matKhau1DK_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matKhau1DK_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        matKhau1DK_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/padlock.png"))); // NOI18N
        matKhau1DK_Label_324.setText(" MẬT KHẨU:");

        maKhau2DK_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maKhau2DK_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        maKhau2DK_Label_324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/padlock.png"))); // NOI18N
        maKhau2DK_Label_324.setText(" NHẬP LẠI MẬT KHẨU:");

        tenTaiKhoan_TextField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tenTaiKhoan_TextField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tenTaiKhoan_TextField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tenTaiKhoan_TextField_324.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenTaiKhoan_TextField_324ActionPerformed(evt);
            }
        });

        emailDK_TextField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        emailDK_TextField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailDK_TextField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        matKhau1DK_PassWordField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        matKhau1DK_PassWordField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matKhau1DK_PassWordField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        matKhau1DK_PassWordField_324.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matKhau1DK_PassWordField_324ActionPerformed(evt);
            }
        });

        matKhau2DK_PassWordField_324.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        matKhau2DK_PassWordField_324.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matKhau2DK_PassWordField_324.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        showPass1_Lable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/showPass.png"))); // NOI18N
        showPass1_Lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPass1_Lable1MousePressed(evt);
            }
        });

        hide1_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/show.png"))); // NOI18N
        hide1_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1_LableMousePressed(evt);
            }
        });

        showPass2_Lable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/showPass.png"))); // NOI18N
        showPass2_Lable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPass2_Lable2MousePressed(evt);
            }
        });

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/show.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });

        dangKy_JLabel_324.setBackground(new java.awt.Color(0, 255, 255));
        dangKy_JLabel_324.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangKy_JLabel_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangKy_JLabel_324.setText("Đăng Ký");
        dangKy_JLabel_324.setOpaque(true);
        dangKy_JLabel_324.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dangKy_JLabel_324MousePressed(evt);
            }
        });

        javax.swing.GroupLayout DangKy_Panel_324Layout = new javax.swing.GroupLayout(DangKy_Panel_324);
        DangKy_Panel_324.setLayout(DangKy_Panel_324Layout);
        DangKy_Panel_324Layout.setHorizontalGroup(
            DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangKy_Panel_324Layout.createSequentialGroup()
                .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DangKy_Panel_324Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(dangKy_JLabel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DangKy_Panel_324Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EmailDK_Label_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tenTaiKhoanDK_Label_324))
                            .addComponent(matKhau1DK_Label_324)
                            .addComponent(maKhau2DK_Label_324))
                        .addGap(18, 18, 18)
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(matKhau1DK_PassWordField_324, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailDK_TextField_324, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenTaiKhoan_TextField_324, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matKhau2DK_PassWordField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPass1_Lable1)
                            .addComponent(hide1_Lable)
                            .addComponent(showPass2_Lable2)
                            .addComponent(hide))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        DangKy_Panel_324Layout.setVerticalGroup(
            DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangKy_Panel_324Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DangKy_Panel_324Layout.createSequentialGroup()
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenTaiKhoanDK_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenTaiKhoan_TextField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailDK_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailDK_TextField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matKhau1DK_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matKhau1DK_PassWordField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showPass1_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hide1_Lable)))
                .addGap(18, 18, 18)
                .addGroup(DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maKhau2DK_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matKhau2DK_PassWordField_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showPass2_Lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hide)))
                .addGap(38, 38, 38)
                .addComponent(dangKy_JLabel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        KeoNgang_jSeparator.setForeground(new java.awt.Color(255, 255, 255));

        KyTucXa_Label_324.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        KyTucXa_Label_324.setForeground(new java.awt.Color(255, 255, 255));
        KyTucXa_Label_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KyTucXa_Label_324.setText("KÝ TÚC XÁ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        exitSystem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dongcuoi.png"))); // NOI18N
        exitSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitSystemMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dangNhapDangKy_Panel_324Layout = new javax.swing.GroupLayout(dangNhapDangKy_Panel_324);
        dangNhapDangKy_Panel_324.setLayout(dangNhapDangKy_Panel_324Layout);
        dangNhapDangKy_Panel_324Layout.setHorizontalGroup(
            dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KeoNgang_jSeparator)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                        .addComponent(trangThai_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                        .addComponent(KyTucXa_Label_324, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
            .addGroup(dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(DangNhap_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
            .addGroup(dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(DangKy_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        dangNhapDangKy_Panel_324Layout.setVerticalGroup(
            dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(trangThai_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KeoNgang_jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KyTucXa_Label_324)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(DangNhap_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
            .addGroup(dangNhapDangKy_Panel_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dangNhapDangKy_Panel_324Layout.createSequentialGroup()
                    .addContainerGap(215, Short.MAX_VALUE)
                    .addComponent(DangKy_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dangNhapDangKy_Panel_324, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dangNhapDangKy_Panel_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //day len git
    private void dangNhap_Label_324MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangNhap_Label_324MouseClicked
        
        dangKy_Label_324.setBorder(null);
        dangKy_Label_324.setForeground(Color.white);
        dangNhap_Label_324.setForeground(Color.red);
        dangNhap_Label_324.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
        DangNhap_Panel_324.setVisible(true);
        
        DangKy_Panel_324.setVisible(false);
    }//GEN-LAST:event_dangNhap_Label_324MouseClicked

    private void dangKy_Label_324MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKy_Label_324MousePressed
        dangNhap_Label_324.setBorder(null);
        dangNhap_Label_324.setForeground(Color.white);
        DangNhap_Panel_324.setVisible(false);
        
        dangKy_Label_324.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
        dangKy_Label_324.setForeground(Color.red);
        DangKy_Panel_324.setVisible(true);
    }//GEN-LAST:event_dangKy_Label_324MousePressed

    private void showPass1_Lable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1_Lable1MousePressed
        hide1_Lable.setVisible(true);
        matKhau1DK_PassWordField_324.setEchoChar((char) 0);
        showPass1_Lable1.setVisible(false);
    }//GEN-LAST:event_showPass1_Lable1MousePressed

    private void hide1_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1_LableMousePressed
        hide1_Lable.setVisible(false);
        matKhau1DK_PassWordField_324.setEchoChar('*');
        showPass1_Lable1.setVisible(true);
        
    }//GEN-LAST:event_hide1_LableMousePressed

    private void matKhau1DK_PassWordField_324ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matKhau1DK_PassWordField_324ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matKhau1DK_PassWordField_324ActionPerformed

    private void tenTaiKhoan_TextField_324ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenTaiKhoan_TextField_324ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenTaiKhoan_TextField_324ActionPerformed

    private void showPass2_Lable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass2_Lable2MousePressed
        hide.setVisible(true);
        matKhau2DK_PassWordField_324.setEchoChar((char) 0);
        showPass2_Lable2.setVisible(false);
    }//GEN-LAST:event_showPass2_Lable2MousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        hide.setVisible(false);
        matKhau2DK_PassWordField_324.setEchoChar('*');
        showPass2_Lable2.setVisible(true);
    }//GEN-LAST:event_hideMousePressed

    private void hidePassDn_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassDn_LableMousePressed
        hidePassDn_Lable.setVisible(false);
        matKhauDN_PassWordField_324.setEchoChar('*');
        showPassDn_Lable.setVisible(true);

    }//GEN-LAST:event_hidePassDn_LableMousePressed

    private void showPassDn_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassDn_LableMousePressed
        hidePassDn_Lable.setVisible(true);
        matKhauDN_PassWordField_324.setEchoChar((char) 0);
        showPassDn_Lable.setVisible(false);
    }//GEN-LAST:event_showPassDn_LableMousePressed

    private void quenMatKhau_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quenMatKhau_LabelMousePressed
        JOptionPane.showMessageDialog(this,"Co cai mat khau ma cung quen , tao lay may");
    }//GEN-LAST:event_quenMatKhau_LabelMousePressed

    private void dangNhap_JLabel_324MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangNhap_JLabel_324MousePressed
        dangNhap_JLabel_324.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        //Nhan vao ten dang nhap va luot bo 2 ky tu trang o dau
        String tenTaiKhoan = tenTaiKhoan_textField_324.getText();

        //Nhan vao mat khau va chuyen thanh chuoi de kiem tra
        String matKhau = new String(matKhauDN_PassWordField_324.getPassword());

        //Su dung StringBuider de dua ra thong bao neu cac truong khong dung quy tac
        StringBuilder sb = new StringBuilder();
        if(tenTaiKhoan.isEmpty()&& matKhau.isEmpty()){
            sb.append("Ban can nhap cac thong tin");
        }else{
            if(tenTaiKhoan.isEmpty()) {
                sb.append("Tên đăng nhập không được để trống!");
            }
            if(matKhau.isEmpty()) {
                sb.append("\nMật khẩu không được để trống!");
            }
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi đăng nhập!", JOptionPane.ERROR_MESSAGE);
            dangNhap_JLabel_324.setBorder(new MatteBorder(1, 1, 1, 1, Color.cyan));
            return;
        }else{
            TrangChu trangChu = new TrangChu();
            trangChu.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_dangNhap_JLabel_324MousePressed

    private void dangKy_JLabel_324MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKy_JLabel_324MousePressed
        dangKy_JLabel_324.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
        
        //Nhan vao ten
        String tenTaiKhoan = tenTaiKhoan_TextField_324.getText();
        
        //Nhan vao email
        String email = emailDK_TextField_324.getText();
        KiemTraEmail_324 kiemTra = new KiemTraEmail_324();
                
        //Nhan mat khau nhap vao va chuyen thanh chuoi de kiem tra
        String matKhauLan1 = new String(matKhau1DK_PassWordField_324.getPassword());
        
        //Nhan mat khau nhap lai vao va chuyen thanh chuoi de kiem tra
        String matKhauLan2 = new String(matKhau2DK_PassWordField_324.getPassword());

        
        //Su dung StringBuilder de dua ra thong bao neu cac truong khong dung quy tac
        StringBuilder sb = new StringBuilder();
        if(tenTaiKhoan.isEmpty()) {
            sb.append("Ten khong duoc de trong!");
        }
        if(email.isEmpty()){
            sb.append("\nEmai khong duoc de trong!");
        }
        if(false==kiemTra.validate(email)) {
            sb.append("\nEmail ban nhap vao khong dung, vui long kiem tra lai! (vd : abc123@Gmail.com)");
        }
        if(matKhauLan1.isEmpty()){
            sb.append("\nMat khau khong duoc de trong!");
        }
        if(matKhauLan2.isEmpty()){
            sb.append("\nBan phai nhap lai mat khau!");
        }
        if(matKhauLan1.equals(matKhauLan2)==false){
            sb.append("\nMat khau nhap lai khong dung!");
        }
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi đăng ký!", JOptionPane.ERROR_MESSAGE);
            dangKy_JLabel_324.setBorder(new MatteBorder(1, 1, 1, 1, Color.cyan));
            return;
        }
        else{
            JOptionPane.showMessageDialog(this, "Tuyet vơi");
            
        }
    }//GEN-LAST:event_dangKy_JLabel_324MousePressed

    private void exitSystemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitSystemMousePressed
       System.exit(0);
    }//GEN-LAST:event_exitSystemMousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DangKy_DangNhap_324.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DangKy_DangNhap_324.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DangKy_DangNhap_324.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DangKy_DangNhap_324.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DangKy_DangNhap_324().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DangKy_Panel_324;
    private javax.swing.JPanel DangNhap_Panel_324;
    private javax.swing.JLabel EmailDK_Label_324;
    private javax.swing.JSeparator KeoNgang_jSeparator;
    private javax.swing.JLabel KyTucXa_Label_324;
    private javax.swing.JLabel dangKy_JLabel_324;
    private javax.swing.JLabel dangKy_Label_324;
    private javax.swing.JPanel dangNhapDangKy_Panel_324;
    private javax.swing.JLabel dangNhap_JLabel_324;
    private javax.swing.JLabel dangNhap_Label_324;
    private javax.swing.JTextField emailDK_TextField_324;
    private javax.swing.JLabel exitSystem;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide1_Lable;
    private javax.swing.JLabel hidePassDn_Lable;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maKhau2DK_Label_324;
    private javax.swing.JLabel matKhau1DK_Label_324;
    private javax.swing.JPasswordField matKhau1DK_PassWordField_324;
    private javax.swing.JPasswordField matKhau2DK_PassWordField_324;
    private javax.swing.JPasswordField matKhauDN_PassWordField_324;
    private javax.swing.JLabel matKhau_Label_324;
    private javax.swing.JLabel quenMatKhau_Label;
    private javax.swing.JLabel showPass1_Lable1;
    private javax.swing.JLabel showPass2_Lable2;
    private javax.swing.JLabel showPassDn_Lable;
    private javax.swing.JLabel tenTaiKhoanDK_Label_324;
    private javax.swing.JLabel tenTaiKhoan_Label_324;
    private javax.swing.JTextField tenTaiKhoan_TextField_324;
    private javax.swing.JTextField tenTaiKhoan_textField_324;
    private javax.swing.JPanel trangThai_Panel_324;
    // End of variables declaration//GEN-END:variables
}
