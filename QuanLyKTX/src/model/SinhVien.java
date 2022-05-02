
package model;


public class SinhVien {
    private String maPhong;
    private String msv;
    private String ten;
    private String cmnd;
    private boolean gioTinh;
    private String queQuan;

    public SinhVien() {
    }

    public SinhVien(String maPhong, String msv, String ten, String cmnd, boolean gioTinh, String queQuan) {
        this.maPhong = maPhong;
        this.msv = msv;
        this.ten = ten;
        this.cmnd = cmnd;
        this.gioTinh = gioTinh;
        this.queQuan = queQuan;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public boolean isGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(boolean gioTinh) {
        this.gioTinh = gioTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    
    
}
