package app;
// Generated Mar 2, 2017 11:04:18 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Khachhang generated by hbm2java
 */
public class Khachhang  implements java.io.Serializable {


     private String maKh;
     private String tenKh;
     private String diaChi;
     private String sdt;
     private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);

    public Khachhang() {
    }

	
    public Khachhang(String maKh, String tenKh, String diaChi, String sdt) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public Khachhang(String maKh, String tenKh, String diaChi, String sdt, Set<Hoadon> hoadons) {
       this.maKh = maKh;
       this.tenKh = tenKh;
       this.diaChi = diaChi;
       this.sdt = sdt;
       this.hoadons = hoadons;
    }
   
    public String getMaKh() {
        return this.maKh;
    }
    
    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }
    public String getTenKh() {
        return this.tenKh;
    }
    
    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Set<Hoadon> getHoadons() {
        return this.hoadons;
    }
    
    public void setHoadons(Set<Hoadon> hoadons) {
        this.hoadons = hoadons;
    }




}


