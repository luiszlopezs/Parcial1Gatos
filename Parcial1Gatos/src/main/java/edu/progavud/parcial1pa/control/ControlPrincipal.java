/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class ControlPrincipal {
    private ControlGatos cGatos;
    private ControlVentana cVentana;
    
    public ControlPrincipal(){
        cGatos = new ControlGatos(this);
        cVentana = new ControlVentana(this);
        inicializar();
    }
    
    //CRUD
    
    public void eliminarGato(String id){
        try {
            cGatos.eliminarGato(id);
        } catch (SQLException ex) {
            Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion){
        try {
            cGatos.modificarGato(id, codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);
        } catch (SQLException ex) {
            Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion){
        try {
            cGatos.insertarGato(codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);
        } catch (SQLException ex) {
            Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void consultarGato(String filtro){
        
        cGatos.consultarGatos(filtro);
    }
    
    
    
}
