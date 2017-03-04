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
@Named(value = "HDController")
@SessionScoped
public class HDController implements Serializable {

    /**
     * Creates a new instance of HDController
     */
        DataModel useList;
        HdHelper hdhelper;
     private Hoadon current;
    
    public HDController() {
        hdhelper = new HdHelper();
    }
    public Hoadon getSelected() {
        if (current == null) {
            current = new Hoadon();
        }
        return current;
    }

    public DataModel getUseList() {
        if (useList == null) {
            useList = new ListDataModel(hdhelper.getHDList());
        }
        return useList;
    }
    
}
