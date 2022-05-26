/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import model.Thongke_NS_317;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import service.ThongKeService;

/**
 *
 * @author Admin
 */
public class QuanLyThongKeContrller {
    private ThongKeService thongKeService = null;

    public QuanLyThongKeContrller() {
        this.thongKeService = new ThongKeService();
    }

    public void setDataToChart1(JPanel jpnItem) {
        List<Thongke_NS_317> listItem = thongKeService.getListBySinhVien();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (Thongke_NS_317 item : listItem) {
                dataset.addValue(item.getSoLuongSV() , "Sinh viên" , item.getNamSinh());
            }
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng học viên đăng ký theo năm sinh".toUpperCase(),
                "Năm Sinh", "Số Lượng",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
