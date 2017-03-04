/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Administrator
 */
@Named(value = "KHController")
@SessionScoped
public class KHController implements Serializable {

    /**
     * Creates a new instance of KHController
     */
    DataModel useList;
    KhHelper helper;
    private Khachhang current;
    
    public KHController() {
        helper = new KhHelper();
    }
    public Khachhang getSelected() {
        if (current == null) {
            current = new Khachhang();
        }
        return current;
    }

    public DataModel getUseList() {
        if (useList == null) {
            useList = new ListDataModel(helper.getUserList());
        }
        return useList;
    }
    
}
