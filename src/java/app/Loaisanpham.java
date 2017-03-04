package app;
// Generated Mar 2, 2017 11:04:18 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Loaisanpham generated by hbm2java
 */
public class Loaisanpham  implements java.io.Serializable {


     private String maLsp;
     private String tenLsp;
     private Set<Sanpham> sanphams = new HashSet<Sanpham>(0);

    public Loaisanpham() {
    }

	
    public Loaisanpham(String maLsp, String tenLsp) {
        this.maLsp = maLsp;
        this.tenLsp = tenLsp;
    }
    public Loaisanpham(String maLsp, String tenLsp, Set<Sanpham> sanphams) {
       this.maLsp = maLsp;
       this.tenLsp = tenLsp;
       this.sanphams = sanphams;
    }
   
    public String getMaLsp() {
        return this.maLsp;
    }
    
    public void setMaLsp(String maLsp) {
        this.maLsp = maLsp;
    }
    public String getTenLsp() {
        return this.tenLsp;
    }
    
    public void setTenLsp(String tenLsp) {
        this.tenLsp = tenLsp;
    }
    public Set<Sanpham> getSanphams() {
        return this.sanphams;
    }
    
    public void setSanphams(Set<Sanpham> sanphams) {
        this.sanphams = sanphams;
    }




}

