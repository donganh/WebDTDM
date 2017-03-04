/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class SpHelper {
    Session session = null;
    List<Sanpham> spList;

    public SpHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Sanpham> getSPList() {
        spList = new ArrayList<Sanpham>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Sanpham as sanpham");
            spList = (List<Sanpham>) q.list();
        } catch (Exception e) {
            spList = null;
            e.printStackTrace();
        }
        return spList;
    }

    public Sanpham getSPByID(int SpId) {
        Sanpham sanpham = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Sanpham as sanpham where sanpham.maSp=" + SpId);
            sanpham = (Sanpham) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanpham;
    }
}
