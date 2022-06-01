/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SinhVienTheoPhong_Dao_324;
import java.util.List;
import javax.swing.JLabel;


public class Phong_Controller_324 {
    private JLabel labelA1,labelA2,labelA3,labelA4,labelB1,labelB2,labelB3,labelB4,labelC1,labelC2,labelC3,labelC4;
    SinhVienTheoPhong_Dao_324 svDao = new SinhVienTheoPhong_Dao_324();
    public Phong_Controller_324() {
    }

    public Phong_Controller_324(JLabel labelA1, JLabel labelA2, JLabel labelA3,  JLabel labelA4, JLabel labelB1, JLabel labelB2, JLabel labelB3, JLabel labelB4, JLabel labelC1, JLabel labelC2, JLabel labelC3, JLabel labelC4) {
        this.labelA1 = labelA1;
        this.labelA2 = labelA2;
        this.labelA3 = labelA3;
        this.labelA3 = labelA3;
        this.labelA4 = labelA4;
        this.labelB1 = labelB1;
        this.labelB2 = labelB2;
        this.labelB3 = labelB3;
        this.labelB4 = labelB4;
        this.labelC1 = labelC1;
        this.labelC2 = labelC2;
        this.labelC3 = labelC3;
        this.labelC4 = labelC4;
    }

    public JLabel getLabelA1() {
        return labelA1;
    }

    public void setLabelA1(JLabel labelA1) {
        this.labelA1 = labelA1;
    }
    public JLabel getLabelA4() {
        return labelA1;
    }

    public void setLabelA4(JLabel labelA4) {
        this.labelA4 = labelA4;
    }

    public JLabel getLabelA2() {
        return labelA2;
    }

    public void setLabelA2(JLabel labelA2) {
        this.labelA2 = labelA2;
    }

    public JLabel getLabelA3() {
        return labelA3;
    }

    public void setLabelA3(JLabel labelA3) {
        this.labelA3 = labelA3;
    }

    public JLabel getLabelB1() {
        return labelB1;
    }

    public void setLabelB1(JLabel labelB1) {
        this.labelB1 = labelB1;
    }

    public JLabel getLabelB2() {
        return labelB2;
    }

    public void setLabelB2(JLabel labelB2) {
        this.labelB2 = labelB2;
    }

    public JLabel getLabelB3() {
        return labelB3;
    }

    public void setLabelB3(JLabel labelB3) {
        this.labelB3 = labelB3;
    }

    public JLabel getLabelB4() {
        return labelB4;
    }

    public void setLabelB4(JLabel labelB4) {
        this.labelB4 = labelB4;
    }

    public JLabel getLabelC1() {
        return labelC1;
    }

    public void setLabelC1(JLabel labelC1) {
        this.labelC1 = labelC1;
    }

    public JLabel getLabelC2() {
        return labelC2;
    }

    public void setLabelC2(JLabel labelC2) {
        this.labelC2 = labelC2;
    }

    public JLabel getLabelC3() {
        return labelC3;
    }

    public void setLabelC3(JLabel labelC3) {
        this.labelC3 = labelC3;
    }

    public JLabel getLabelC4() {
        return labelC4;
    }

    public void setLabelC4(JLabel labelC4) {
        this.labelC4 = labelC4;
    }
    public int setDemSoChoTrong(String maPhong){
        return svDao.demSV(maPhong);
    }
    public void hienThiSoSinhVien(JLabel labelA1, JLabel labelA2, JLabel labelA3, JLabel labelA4 ,JLabel labelB1, JLabel labelB2, JLabel labelB3, JLabel labelB4, JLabel labelC1, JLabel labelC2, JLabel labelC3, JLabel labelC4){
        String maPhongA1 = "MPA1";
        String maPhongA2 = "MPA2";
        String maPhongA3 = "MPA3";
        String maPhongA4 = "MPA4";
        String maPhongB1 = "MPB1";
        String maPhongB2 = "MPB2";
        String maPhongB3 = "MPB3";
        String maPhongB4 = "MPB4";
        String maPhongC1 = "MPC1";
        String maPhongC2 = "MPC2";
        String maPhongC3 = "MPC3";
        String maPhongC4 = "MPC4";
     
        
        labelA1.setText("So cho con trong: " +( 8 - setDemSoChoTrong(maPhongA1)));
        labelA2.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongA2)));
        labelA3.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongA3)));
        labelA4.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongA4)));
        labelB1.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongB1)));
        labelB2.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongB2)));
        labelB3.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongB3)));
        labelB4.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongB4)));
        labelC1.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongC1)));
        labelC2.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongC2)));
        labelC3.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongC3)));
        labelC4.setText("So cho con trong: " + (8 - setDemSoChoTrong(maPhongC4)));
    }
}
