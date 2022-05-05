
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TrangChu extends javax.swing.JFrame {
    List<JPanel> listPanel = new ArrayList<>();
    List<JLabel> listLabel = new ArrayList<>();
    public TrangChu() {
        initComponents();
        Add_listPanel();
        Add_listLabel();
        Choose_Lable(0);
        setLocationRelativeTo(null);
    }
    public void Add_listPanel(){
        listPanel.add(jpn_TrangChu);
        listPanel.add(jpn_Phong);
        listPanel.add(jpn_ThongKe);
        listPanel.add(jpn_CaiDat);
    }
    
    public void Add_listLabel(){
        listLabel.add(jlb_TrangChu);
        listLabel.add(jlb_phong);
        listLabel.add(jlb_ThongKe);
        listLabel.add(jlb_CaiDat);
    }
    public void Choose_Lable(int index){
        for(int i=0; i<listPanel.size();i++){
            for(int x=0; x<listLabel.size();x++)
                if(i == index){
                    listPanel.get(i).setVisible(true);
                    listLabel.get(i).setBorder(new MatteBorder(0 , 4 , 0 , 0 , Color.red));
                }
                else{
                    listPanel.get(i).setVisible(false);
                    listLabel.get(i).setBorder(new MatteBorder(0, 0 , 0 , 0 , Color.red));
                }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_Chung = new javax.swing.JPanel();
        jpn_DieuKhien = new javax.swing.JPanel();
        jlb_TrangChu = new javax.swing.JLabel();
        jlb_phong = new javax.swing.JLabel();
        jlb_ThongKe = new javax.swing.JLabel();
        jlb_CaiDat = new javax.swing.JLabel();
        jpn_ThietKe = new javax.swing.JPanel();
        jpn_TrangChu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jpn_Phong = new javax.swing.JPanel();
        jpn_ThongKe = new javax.swing.JPanel();
        jpn_CaiDat = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_DieuKhien.setBackground(new java.awt.Color(54, 33, 89));

        jlb_TrangChu.setBackground(new java.awt.Color(64, 43, 100));
        jlb_TrangChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_TrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_TrangChu.setText("Trang Chủ");
        jlb_TrangChu.setOpaque(true);
        jlb_TrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_TrangChuMouseClicked(evt);
            }
        });

        jlb_phong.setBackground(new java.awt.Color(64, 43, 100));
        jlb_phong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_phong.setForeground(new java.awt.Color(255, 255, 255));
        jlb_phong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_phong.setText("jLabel5");
        jlb_phong.setOpaque(true);
        jlb_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_phongMouseClicked(evt);
            }
        });

        jlb_ThongKe.setBackground(new java.awt.Color(64, 43, 100));
        jlb_ThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_ThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlb_ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_ThongKe.setText("jLabel6");
        jlb_ThongKe.setOpaque(true);
        jlb_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_ThongKeMouseClicked(evt);
            }
        });

        jlb_CaiDat.setBackground(new java.awt.Color(64, 43, 100));
        jlb_CaiDat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb_CaiDat.setForeground(new java.awt.Color(255, 255, 255));
        jlb_CaiDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_CaiDat.setText("jLabel7");
        jlb_CaiDat.setOpaque(true);
        jlb_CaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_CaiDatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpn_DieuKhienLayout = new javax.swing.GroupLayout(jpn_DieuKhien);
        jpn_DieuKhien.setLayout(jpn_DieuKhienLayout);
        jpn_DieuKhienLayout.setHorizontalGroup(
            jpn_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DieuKhienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_CaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_phong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpn_DieuKhienLayout.setVerticalGroup(
            jpn_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DieuKhienLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jlb_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jlb_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jlb_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jlb_CaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn_ThietKe.setBackground(new java.awt.Color(51, 153, 255));
        jpn_ThietKe.setLayout(new java.awt.CardLayout());

        jpn_TrangChu.setBackground(new java.awt.Color(120, 100, 200));

        jPanel2.setBackground(new java.awt.Color(204, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jpn_TrangChuLayout = new javax.swing.GroupLayout(jpn_TrangChu);
        jpn_TrangChu.setLayout(jpn_TrangChuLayout);
        jpn_TrangChuLayout.setHorizontalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_TrangChuLayout.setVerticalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(522, 522, 522))
        );

        jpn_ThietKe.add(jpn_TrangChu, "card2");

        jpn_Phong.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpn_PhongLayout = new javax.swing.GroupLayout(jpn_Phong);
        jpn_Phong.setLayout(jpn_PhongLayout);
        jpn_PhongLayout.setHorizontalGroup(
            jpn_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jpn_PhongLayout.setVerticalGroup(
            jpn_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jpn_ThietKe.add(jpn_Phong, "card3");

        jpn_ThongKe.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jpn_ThongKeLayout = new javax.swing.GroupLayout(jpn_ThongKe);
        jpn_ThongKe.setLayout(jpn_ThongKeLayout);
        jpn_ThongKeLayout.setHorizontalGroup(
            jpn_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jpn_ThongKeLayout.setVerticalGroup(
            jpn_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jpn_ThietKe.add(jpn_ThongKe, "card4");

        jpn_CaiDat.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout jpn_CaiDatLayout = new javax.swing.GroupLayout(jpn_CaiDat);
        jpn_CaiDat.setLayout(jpn_CaiDatLayout);
        jpn_CaiDatLayout.setHorizontalGroup(
            jpn_CaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jpn_CaiDatLayout.setVerticalGroup(
            jpn_CaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jpn_ThietKe.add(jpn_CaiDat, "card5");

        javax.swing.GroupLayout jpn_ChungLayout = new javax.swing.GroupLayout(jpn_Chung);
        jpn_Chung.setLayout(jpn_ChungLayout);
        jpn_ChungLayout.setHorizontalGroup(
            jpn_ChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ChungLayout.createSequentialGroup()
                .addComponent(jpn_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_ThietKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_ChungLayout.setVerticalGroup(
            jpn_ChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_DieuKhien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn_ThietKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_Chung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_Chung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlb_TrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_TrangChuMouseClicked
        Choose_Lable(0);
    }//GEN-LAST:event_jlb_TrangChuMouseClicked

    private void jlb_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_phongMouseClicked
       Choose_Lable(1);
    }//GEN-LAST:event_jlb_phongMouseClicked

    private void jlb_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_ThongKeMouseClicked
        Choose_Lable(2);
    }//GEN-LAST:event_jlb_ThongKeMouseClicked

    private void jlb_CaiDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_CaiDatMouseClicked
        Choose_Lable(3);
    }//GEN-LAST:event_jlb_CaiDatMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlb_CaiDat;
    private javax.swing.JLabel jlb_ThongKe;
    private javax.swing.JLabel jlb_TrangChu;
    private javax.swing.JLabel jlb_phong;
    private javax.swing.JPanel jpn_CaiDat;
    private javax.swing.JPanel jpn_Chung;
    private javax.swing.JPanel jpn_DieuKhien;
    private javax.swing.JPanel jpn_Phong;
    private javax.swing.JPanel jpn_ThietKe;
    private javax.swing.JPanel jpn_ThongKe;
    private javax.swing.JPanel jpn_TrangChu;
    // End of variables declaration//GEN-END:variables
}
