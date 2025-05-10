/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.util.ArrayList;
import edu.progavud.parcial1pa.modelo.*;
import java.util.List;

/**
 *
 * @author sangr
 */
public class ControlGatos {
    private GatoDAO gatoDAO;
    private GatoVO gato;
    

    public ControlGatos(List gatos) {
        registrarGato();
        obtenerRegistros();
        buscarGato();
    }
    
    public void registrarGato(List<GatoVO> gatos){
        gatoDAO = new GatoDAO();
        
        for(GatoVO gato: gatos){
            gatoDAO.insertarGato(gato);
        }
    }
    
    private void obtenerRegistros() {
        gatoDAO = new GatoDAO();
        GatoVO gatoVO;
        ArrayList<GatoVO> listaGatos = gatoDAO.listaDeGatos();
        if (!listaGatos.isEmpty()) {
            int numeroGato = 0;
            for (int i = 0; i < listaGatos.size(); i++) {
                numeroGato++;
                gatoVO = listaGatos.get(i);
                System.out.println("****************Estudiante No. " + numeroGato+ "**********");
                System.out.println("Codigo Estudiante: " + gatoVO.getRaza());
                System.out.println("Nombre Estudiante: " + gatoVO.getCodigoEMS());
                System.out.println("Edad Estudiante: " + gatoVO.getOjos());
                System.out.println("*************************************************\n");
            }
        } else {
            System.out.println("Actualmente no existen registros de estudiantes");
        }
    }
    
    private void buscarGato() {
        gatoDAO = new GatoDAO();
        String codigo = "202210200030";
        GatoVO gatoEncontrado = gatoDAO.consultarGato(codigo);
        if (gatoEncontrado != null) {
            System.out.println("**************** Estudiante Consultado *************************");
            System.out.println("Codigo Estudiante: " + gatoEncontrado.getRaza());
            System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
            System.out.println("Edad Estudiante : " + gatoEncontrado.getOjos());
            System.out.println("*************************************************\n");

        } else {
            System.out.println("No existen un estudiante con ese codigo");
        }
    }
    
    private void eliminarEstudiante() {
        String codigo = "202210200033";
        GatoVO gatoEncontrado = gatoDAO.consultarGato(codigo);
        if (gatoEncontrado != null) {
            System.out.println("************Mascota a Eliminar****************");
            System.out.println("Id Mascota: " + gatoEncontrado.getRaza());
            System.out.println("Nombre Mascota: " + gatoEncontrado.getCodigoEMS());
            System.out.println("Edad Mascota: " + gatoEncontrado.getOjos());
            System.out.println("********************************************\n");
            if (gatoDAO.eliminarGato(codigo)) {
                System.out.println("Estudiante Eliminado");
            } else {
                System.out.println("No se pudo eliminar el estudiante");
            }
        } else {
            System.out.println("No existen un estudiante con ese codigo");
        }
    }
    
    private void modificarEstudiante() {
        String codigo = "202210200031";
        GatoVO gatoEncontrado = gatoDAO.consultarGato(codigo);
        if (gatoEncontrado != null) {
            System.out.println("****************Estudiante a Modificar****************");
            System.out.println("Codigo Estudiante: " + gatoEncontrado.getRaza());
            System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
            System.out.println("Edad Estudiante: " + gatoEncontrado.getOjos());
            System.out.println("*************************************************\n");
           
            if (gatoDAO.modificarGato(codigo)) {
                System.out.println("Estudiante Modificado");
                gatoEncontrado = gatoDAO.consultarGato(codigo);
                System.out.println("****************Estudiante Modificado****************");
                System.out.println("Codigo Estudiante: " + gatoEncontrado.getRaza());
                System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
                System.out.println("Edad Estudiante: " + gatoEncontrado.getOjos());
                System.out.println("*************************************************\n");
            } else {
                System.out.println("No se pudo modificar el estudiante");
            }
        } else {
            System.out.println("No existen una mascota con ese codigo");
        }
    }
}




   

