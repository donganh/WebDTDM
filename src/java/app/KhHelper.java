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
public class KhHelper {
    Session session = null;
    List<Khachhang> userList;

    public KhHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Khachhang> getUserList() {
        userList = new ArrayList<Khachhang>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Khachhang as khachhang");
            userList = (List<Khachhang>) q.list();
        } catch (Exception e) {
            userList = null;
            e.printStackTrace();
        }
        return userList;
    }

    public Khachhang getUserByID(int userId) {
        Khachhang khachhang = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Khachhang as khachhnag where khachhang.maKh=" + userId);
            khachhang = (Khachhang) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return khachhang;
    }
}
