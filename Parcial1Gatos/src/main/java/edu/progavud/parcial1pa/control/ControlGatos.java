/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.util.ArrayList;
import edu.progavud.parcial1pa.modelo.*;
import edu.progavud.parcial1pa.modelo.GatoDAO;
import edu.progavud.parcial1pa.modelo.GatoVO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class ControlGatos {

    private GatoDAO gatoDAO;
    private ControlPrincipal cPrinc;
//    private GatoVO gatoVO;

    public ControlGatos(ControlPrincipal cPrinc) {
        this.cPrinc = cPrinc;

//        obtenerRegistros();
//        buscarGato();
    }

    public void insertarGato(String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion) {
        try {
            gatoDAO = new GatoDAO();
            
            GatoVO gatoVO = new GatoVO();
            gatoVO.setCodigoEMS(codEMS);
            gatoVO.getRaza().setTodaRaza(nombreRaza, colorPelaje, patron, colorOjos, cola);
            gatoVO.setNombre(nombre);
            gatoVO.setDescripcion(descripcion);
            gatoDAO.insertarGato(gatoVO);
        } catch (SQLException ex) {
            Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void obtenerTodosLosGatos() {
        gatoDAO = new GatoDAO();
        GatoVO gatoVO;
        ArrayList<GatoVO> listaGatos = null;
        try {
            listaGatos = gatoDAO.listaDeGatos();
        } catch (SQLException ex) {
            Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!listaGatos.isEmpty()) {
            int numeroGato = 0;
            for (int i = 0; i < listaGatos.size(); i++) {
                numeroGato++;
                gatoVO = listaGatos.get(i);
                System.out.println("****************Gato No. " + numeroGato + "**********");
                System.out.println("Raza: " + gatoVO.getRaza());
                System.out.println("Codigo EMS : " + gatoVO.getCodigoEMS());
                System.out.println("Nombre : " + gatoVO.getNombre());
                System.out.println("*************************************************\n");
            }
        } else {
            System.out.println("Actualmente no existen registros de gatos");
        }
    }

    public void consultarGatos(String filtro) { try {
        //Se puede consultar por EMS, raza
        gatoDAO = new GatoDAO();
        
        for (GatoVO gatoVO : gatoDAO.consultarGatos(filtro)) {
            if (gatoVO != null) {
                System.out.println("**************** Gato Consultado *************************");
                System.out.println("raza: " + gatoVO.getRaza());
                System.out.println("Codigo EMS: " + gatoVO.getCodigoEMS());
                System.out.println("Nombre gato : " + gatoVO.getNombre());
                System.out.println("*************************************************\n");

            } else {
                System.out.println("No existen un gato con ese codigo");
            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarGato(String id){

        try {
            GatoVO gatoEncontrado = gatoDAO.consultarGatoIndividual(id);
            if (gatoEncontrado != null) {
                try {
                    System.out.println("************Mascota a Eliminar****************");
                    System.out.println("Id Mascota: " + gatoEncontrado.getRaza());
                    System.out.println("Nombre Mascota: " + gatoEncontrado.getCodigoEMS());
                    System.out.println("Edad Mascota: " + gatoEncontrado.getNombre());
                    System.out.println("********************************************\n");
                    if (gatoDAO.eliminarGato(id)) {
                        System.out.println("Estudiante Eliminado");
                    } else {
                        System.out.println("No se pudo eliminar el estudiante");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("No existen un estudiante con ese codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion) {

        try {
            GatoVO gatoEncontrado = gatoDAO.consultarGatoIndividual(id);
            if (gatoEncontrado != null) {
                
                
                
                System.out.println("****************Estudiante a Modificar****************");
                System.out.println("raza gato: " + gatoEncontrado.getRaza().getRazaString());
                System.out.println("codigo EMS: " + gatoEncontrado.getCodigoEMS());
                System.out.println("Nombre gato: " + gatoEncontrado.getNombre());
                System.out.println("*************************************************\n");
                
                gatoEncontrado.setCodigoEMS(codEMS);
                gatoEncontrado.getRaza().setTodaRaza(nombreRaza, colorPelaje, patron, colorOjos, cola);
                gatoEncontrado.setNombre(nombre);
                gatoEncontrado.setDescripcion(descripcion);
                
                if (gatoDAO.modificarGato(gatoEncontrado)) {
                    System.out.println("Estudiante Modificado");
                    gatoEncontrado = gatoDAO.consultarGatoIndividual(id);
                    System.out.println("****************Estudiante Modificado****************");
                    System.out.println("Codigo Estudiante: " + gatoEncontrado.getRaza().getRazaString());
                    System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
                    System.out.println("Edad Estudiante: " + gatoEncontrado.getNombre());
                    System.out.println("*************************************************\n");
                } else {
                    System.out.println("No se pudo modificar el estudiante");
                }
            } else {
                System.out.println("No existen una mascota con ese codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlGatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}