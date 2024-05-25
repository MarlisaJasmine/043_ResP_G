/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import modul.DAOHewan;
import modul.ModelHewan;
import modul.ModelTabel;
import modul.interfaceDAOHewan;
import connector.*;
import frame.mainView;
import javax.swing.JOptionPane;
/**
 *
 * @author PC PRAKTIKUM
 */
public class controllerMainView {
    mainView frame;
   
    interfaceDAOHewan impdatahewan;
    List<ModelHewan> dm;
    
    public controllerMainView(mainView frame){
    this.frame = frame;
    impdatahewan = new DAOHewan();
    dm = impdatahewan.getAll();
    }
    public void isitabel (){
        dm = impdatahewan.getAll();
        ModelTabel mm = new ModelTabel(dm);
        frame.getTabelhewan().setModel(mm);
    }
        
}
