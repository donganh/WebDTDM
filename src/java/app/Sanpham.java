package app;
// Generated Mar 2, 2017 11:04:18 PM by Hibernate Tools 4.3.1



/**
 * Sanpham generated by hbm2java
 */
public class Sanpham  implements java.io.Serializable {


     private String maSp;
     private Loaisanpham loaisanpham;
     private String tenSp;
     private int soLuong;
     private String moTa;
     private Chitiethoadon chitiethoadon;

    public Sanpham() {
    }

	
    public Sanpham(String maSp, Loaisanpham loaisanpham, String tenSp, int soLuong, String moTa) {
        this.maSp = maSp;
        this.loaisanpham = loaisanpham;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }
    public Sanpham(String maSp, Loaisanpham loaisanpham, String tenSp, int soLuong, String moTa, Chitiethoadon chitiethoadon) {
       this.maSp = maSp;
       this.loaisanpham = loaisanpham;
       this.tenSp = tenSp;
       this.soLuong = soLuong;
       this.moTa = moTa;
       this.chitiethoadon = chitiethoadon;
    }
   
    public String getMaSp() {
        return this.maSp;
    }
    
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }
    public Loaisanpham getLoaisanpham() {
        return this.loaisanpham;
    }
    
    public void setLoaisanpham(Loaisanpham loaisanpham) {
        this.loaisanpham = loaisanpham;
    }
    public String getTenSp() {
        return this.tenSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public int getSoLuong() {
        return this.soLuong;
    }
    
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public Chitiethoadon getChitiethoadon() {
        return this.chitiethoadon;
    }
    
    public void setChitiethoadon(Chitiethoadon chitiethoadon) {
        this.chitiethoadon = chitiethoadon;
    }




}

