
package dao;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

public class Controller {
    DaoSinhVien dao;
    private String a ;
    private String ten;
    private JTable tbl = new JTable();
    DefaultListModel model = new DefaultListModel();
    JList list = new JList();

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    public Controller() {
    }
    
    public Controller(String a,JTable tbls) {
        this.a = a;
        this.tbl = tbl;
    }
    public void tiemKiemTheoTinh(String tenTT ,JTable tbl,DefaultTableModel defaultTableModel){
        this.tbl = tbl;
        dao = new DaoSinhVien();
        setListSinhVien(dao.getSinhVienQueQuan(tenTT),defaultTableModel); 
    }
    
    public void tiemKiemTheoCMND(String soCMND ,JTable tbl,DefaultTableModel defaultTableModel){
        this.tbl = tbl;
        dao = new DaoSinhVien();
        setListSinhVien(dao.getAllCMND(),defaultTableModel); 
    }
    
    public void quanLy_jList_queQuan(JList list){
        this.list = list;
        dao = new DaoSinhVien();
        List<SinhVien> sv = dao.getAllQueQuan();
        for(SinhVien svn : sv ){
              model.addElement(svn.getQueQuan());
        }
        list.setModel(model);
    }
    
    public void quanLy_jList_CMND(JTable tbl,String cmnd,DefaultTableModel defaultTableModel){
        this.tbl = tbl;
        dao = new DaoSinhVien();
        String theLoai = "CMND";
        setListSinhVien(dao.getSinhVienName(theLoai, cmnd),defaultTableModel);    
    }
    
    public void SetTable(JTable tbl,DefaultTableModel defaultTableModel){
        this.tbl = tbl;
        dao = new DaoSinhVien();
        setListSinhVien(dao.getAllUsers(),defaultTableModel);   
    }
    
    public void SetTableTiemKiem(JTable tbl, String ten, DefaultTableModel defaultTableModel){
        this.tbl = tbl;
        dao = new DaoSinhVien();
        String theLoai = "Ten";
        setListSinhVien(dao.getSinhVienName(theLoai,ten),defaultTableModel);   
    }
    
    private void setListSinhVien(List<SinhVien> listSV,DefaultTableModel defaultTableModel){
        this.defaultTableModel = defaultTableModel;
        tbl.setModel(defaultTableModel);
        for(SinhVien sn1 : listSV){
            defaultTableModel.addRow(new Object[]{sn1.getMaPhong(),sn1.getMsv(), sn1.getTen(), sn1.getCmnd(), sn1.isGioTinh(), sn1.getQueQuan()});
        }
    }
}
