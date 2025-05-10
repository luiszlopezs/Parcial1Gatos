/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.util.ArrayList;
import edu.progavud.parcial1pa.modelo.*;
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
    private GatoVO gato;

    public ControlGatos(List gatos) {
        registrarGato();
        obtenerRegistros();
        buscarGato();
    }

    public void registrarGato() throws SQLException {
        gatoDAO = new GatoDAO();

        GatoVO gatoVO = new GatoVO();
        gatoVO.setId("202210200032");
        gatoVO.setCodigoEMS("EMS");
        gatoVO.setRazaString("raza");
        gatoVO.setNombre("nombre");
        gatoVO.setDescripcion("descripcion");
        gatoDAO.insertarGato(gatoVO);

    }
    
    public void asignarRaza(String nombreRaza, String colorPelaje,String Patron, String ColorOjos, String Cola){
        
    }

    private void obtenerRegistros() throws SQLException {
        gatoDAO = new GatoDAO();
        GatoVO gatoVO;
        ArrayList<GatoVO> listaGatos = gatoDAO.listaDeGatos();
        if (!listaGatos.isEmpty()) {
            int numeroGato = 0;
            for (int i = 0; i < listaGatos.size(); i++) {
                numeroGato++;
                gatoVO = listaGatos.get(i);
                System.out.println("****************Estudiante No. " + numeroGato + "**********");
                System.out.println("Codigo Estudiante: " + gatoVO.getRaza());
                System.out.println("Nombre Estudiante: " + gatoVO.getCodigoEMS());
                System.out.println("Edad Estudiante: " + gatoVO.getNombre());
                System.out.println("*************************************************\n");
            }
        } else {
            System.out.println("Actualmente no existen registros de estudiantes");
        }
    }

    private void buscarGato() throws SQLException{
        gatoDAO = new GatoDAO();
        String codigo = "202210200030";
        for (GatoVO gatoVO : gatoDAO.consultarGatos(codigo)) {
            if (gatoVO != null) {
                System.out.println("**************** Estudiante Consultado *************************");
                System.out.println("Codigo Estudiante: " + gatoVO.getRaza());
                System.out.println("Nombre Estudiante: " + gatoVO.getCodigoEMS());
                System.out.println("Edad Estudiante : " + gatoVO.getNombre());
                System.out.println("*************************************************\n");

            } else {
                System.out.println("No existen un estudiante con ese codigo");
            }
        }
    }

    private void eliminarGato(GatoVO gatoVO) throws SQLException {
       
        GatoVO gatoEncontrado = gatoDAO.consultarGatoAEliminar(gatoVO.getId());
        if (gatoEncontrado != null) {
            System.out.println("************Mascota a Eliminar****************");
            System.out.println("Id Mascota: " + gatoEncontrado.getRaza());
            System.out.println("Nombre Mascota: " + gatoEncontrado.getCodigoEMS());
            System.out.println("Edad Mascota: " + gatoEncontrado.getNombre());
            System.out.println("********************************************\n");
            if (gatoDAO.eliminarGato(gatoVO.getId())) {
                System.out.println("Estudiante Eliminado");
            } else {
                System.out.println("No se pudo eliminar el estudiante");
            }
        } else {
            System.out.println("No existen un estudiante con ese codigo");
        }
    }

    private void modificarGato(GatoVO gatoVO) throws SQLException {
        
        GatoVO gatoEncontrado = gatoDAO.consultarGatoAEliminar(gatoVO.getId());
        if (gatoEncontrado != null) {
            System.out.println("****************Estudiante a Modificar****************");
            System.out.println("Codigo Estudiante: " + gatoEncontrado.getRazaString());
            System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
            System.out.println("Edad Estudiante: " + gatoEncontrado.getNombre());
            System.out.println("*************************************************\n");

            if (gatoDAO.modificarGato(gatoVO)) {
                System.out.println("Estudiante Modificado");
                gatoEncontrado = gatoDAO.consultarGatoAEliminar(gatoVO.getId()); //Cambiar nombre a consultarGatoIndividual
                System.out.println("****************Estudiante Modificado****************");
                System.out.println("Codigo Estudiante: " + gatoEncontrado.getRazaString());
                System.out.println("Nombre Estudiante: " + gatoEncontrado.getCodigoEMS());
                System.out.println("Edad Estudiante: " + gatoEncontrado.getNombre());
                System.out.println("*************************************************\n");
            } else {
                System.out.println("No se pudo modificar el estudiante");
            }
        } else {
            System.out.println("No existen una mascota con ese codigo");
        }
    }
}
