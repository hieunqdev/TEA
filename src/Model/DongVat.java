/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class DongVat {
    String MaDV;        
    String TenDV; 
    String Loai;
    String MoTa ;         
    boolean GioiTinh;

    public DongVat() {
    }

    public DongVat(String MaDV, String TenDV, String Loai, String MoTa, boolean GioiTinh) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.Loai = Loai;
        this.MoTa = MoTa;
        this.GioiTinh = GioiTinh;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaDV() {
        return MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public String getLoai() {
        return Loai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }
    
    
}
