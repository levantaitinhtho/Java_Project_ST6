/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class TaiKhoanDangNhap_324 {
    private String username;
    private String password;

    public TaiKhoanDangNhap_324() {
    }

    public TaiKhoanDangNhap_324(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TaiKhoanDangNhap_324{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
