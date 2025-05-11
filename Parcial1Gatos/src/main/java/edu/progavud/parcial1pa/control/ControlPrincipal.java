/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
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
        cGatos.eliminarGato(id);   
    }
    
    public void modificarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion){
        cGatos.modificarGato(id, codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);    
    }
    
    public void insertarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion){
        cGatos.insertarGato(codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);   
    }
    // En el GatoDAO ya está validado si el filtro corresponde a codigo EMS o raza, adecuándose a la elección del usuario
    public void consultarGato(String filtro){
        cGatos.consultarGatos(filtro);
    }
    
    public void limpiar(){
        
    }
    
    public void guardar(){
        
    }
    
//    public static List<String> validarArchivo(String ruta){
//        List<String> camposVacios = new ArrayList<>();
//        Properties props = new Properties();
//        
//        try(FileInputStream fis = new FileInputStream(ruta)){
//            props.load(fis);
//            for(String campos : props.stringPropertyNames()){
//                String [] valores =props.getProperty(campos).split(",");
//                //Se esperan 5 valores:
//                if(valores.length < 5 || Arrays.stream(valores).anyMatch(String :: isBlank)){
//                    camposVacios.add(campos);
//                }
//            }
//        }catch(IOS)
//        
//    }
        public void inicializar() {
        File archivo = cVentana.getvInicial().rutaJfileChooser();
        if (archivo != null) {
            Properties props = new Properties();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(archivo);
            } catch (IOException e) {
                
            }

            conxPro = new ConexionProperties(props, fis);

            try {
                conxPro.cargar();
            } catch (IOException e) {
                
            }

            cCrupier = new ControlCrupier(this);
            cJugador = new ControlJugador(this);

            cCrupier.inicializarDesdeProperties(props);
            cJugador.inicializarDesdeProperties(props);
        }
    }
    
    
    
}
