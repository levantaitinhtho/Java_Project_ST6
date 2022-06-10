
package model;

public class TaoTaiKhoan_324 {
    private String tenTaiKhoan;
    private String email;
    private String matKhau;
    private String nhapLaiMatKhau;

    public TaoTaiKhoan_324() {
    }

    public TaoTaiKhoan_324(String tenTaiKhoan, String email, String matKhau, String nhapLaiMatKhau) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.email = email;
        this.matKhau = matKhau;
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNhapLaiMatKhau() {
        return nhapLaiMatKhau;
    }

    public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }
    
    
}
