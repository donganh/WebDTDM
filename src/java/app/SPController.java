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
@Named(value = "SPController")
@SessionScoped
public class SPController implements Serializable {

    /**
     * Creates a new instance of SPController
     */
    DataModel useList;
    SpHelper sphelper;
    private Sanpham current;
    
    public SPController() {
        sphelper = new SpHelper();
    }
    public Sanpham getSelected() {
        if (current == null) {
            current = new Sanpham();
        }
        return current;
    }

    public DataModel getUseList() {
        if (useList == null) {
            useList = new ListDataModel(sphelper.getSPList());
        }
        return useList;
    }
}
