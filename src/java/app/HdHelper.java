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
public class HdHelper {
    Session session = null;
    List<Hoadon> hdList;

    public HdHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Hoadon> getHDList() {
        hdList = new ArrayList<Hoadon>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Hoadon as hoadon");
            hdList = (List<Hoadon>) q.list();
        } catch (Exception e) {
            hdList = null;
            e.printStackTrace();
        }
        return hdList;
    }

    public Hoadon getHDByID(int HdId) {
        Hoadon hoadon = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Hoadon as hoadon where hoadon.maHd=" + HdId);
            hoadon = (Hoadon) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoadon;
    }
}
