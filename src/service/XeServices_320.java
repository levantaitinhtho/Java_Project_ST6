/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.XeDao_320;
import java.util.List;
import model.Xe_320;

/**
 *
 * @author LÊ HOÀNG ANH TUẤN
 */
public class XeServices_320 {

    XeDao_320 xeDao_320 = new XeDao_320();

    public List<Xe_320> getAllMotobike() {
        return xeDao_320.getAllMotobike();
    }

}
