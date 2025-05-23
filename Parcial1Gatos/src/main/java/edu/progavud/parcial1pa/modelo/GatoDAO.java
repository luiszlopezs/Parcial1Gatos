/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.modelo;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hailen
 */
public class GatoDAO {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public GatoDAO() {
        con = null;
        st = null;
        rs = null;
    }

    public void insertarGato(GatoVO gatoVO) throws SQLException {

        con = ConexionBD.getConexion();
        st = con.createStatement();
        String insercion = "INSERT INTO GatosTabla (codigoEMS,razaString,nombre,descripcion) VALUES('" + gatoVO.getCodigoEMS() + "','" + gatoVO.getRaza().getRazaString() + "','" + gatoVO.getNombre() + "','" + gatoVO.getDescripcion() + "')";
        st.executeUpdate(insercion);
        st.close();
        ConexionBD.desconectar();

    }

    public ArrayList<GatoVO> listaDeGatos() throws SQLException {
        ArrayList<GatoVO> misGatos = new ArrayList<GatoVO>();
        String consulta = "SELECT * FROM GatosTabla";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
            GatoVO gato = new GatoVO();
            gato.setId(rs.getString("id"));
            gato.setCodigoEMS(rs.getString("codigoEMS"));
            gato.getRaza().setRazaString(rs.getString("razaString"));

            gato.setNombre(rs.getString("nombre"));
            gato.setDescripcion(rs.getString("descripcion"));

            misGatos.add(gato);
        }
        st.close();
        ConexionBD.desconectar();

        return misGatos;

    }

    public boolean eliminarGato(String id) throws SQLException {

        String consulta = "DELETE FROM GatosTabla WHERE id=" + Integer.valueOf(id) + "";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        st.executeUpdate(consulta);
        st.close();
        ConexionBD.desconectar();
        return true;

    }

    public boolean modificarGato(GatoVO gatoVO) throws SQLException {

        //Update estudiantes set nombre='Maria Perez' where codigo=202210200031
        String consulta = "UPDATE GatosTabla SET "
                + "codigoEMS='" + gatoVO.getCodigoEMS() + "', "
                + "razaString='" + gatoVO.getRaza().getRazaString() + "', "
                + "nombre='" + gatoVO.getNombre() + "', "
                + "descripcion='" + gatoVO.getDescripcion() + "' "
                + "WHERE id=" + Integer.valueOf(gatoVO.getId()) + "";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        st.executeUpdate(consulta);
        st.close();
        ConexionBD.desconectar();
        return true;

    }

    public ArrayList<GatoVO> consultarGatos(String filtro) throws SQLException {
        ArrayList<GatoVO> misGatosConsultados = new ArrayList<GatoVO>();
        String consulta = "SELECT * FROM GatosTabla WHERE razaString LIKE '%" + filtro + "%' OR codigoEMS LIKE '%" + filtro + "%'";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
            GatoVO gato = new GatoVO();
            gato.setId(rs.getString("id"));
            gato.setCodigoEMS(rs.getString("codigoEMS"));
            gato.getRaza().setRazaString(rs.getString("razaString"));

            gato.setNombre(rs.getString("nombre"));
            gato.setDescripcion(rs.getString("descripcion"));

            misGatosConsultados.add(gato);
        }
        st.close();     
        ConexionBD.desconectar();

        return misGatosConsultados;
    }

    public GatoVO consultarGatoIndividual(String id) throws SQLException {
        GatoVO gatoVO = null;
        String consulta = "SELECT * FROM GatosTabla WHERE id=" + Integer.valueOf(id) + "";

        con = (Connection) ConexionBD.getConexion();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        if (rs.next()) {
            gatoVO = new GatoVO();
            gatoVO.setId(rs.getString("id"));
            gatoVO.getRaza().setRazaString(rs.getString("razaString"));
            gatoVO.setNombre(rs.getString("nombre"));
            gatoVO.setDescripcion(rs.getString("descripcion"));
        }
        st.close();
        ConexionBD.desconectar();

        return gatoVO;
    }
    
    
    public ArrayList<List> listaDeDatosSerializar() throws SQLException {
        ArrayList<List> datosASerializar = new ArrayList<List>();
        String consulta = "SELECT codigoEMS, razaString FROM GatosTabla";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
            List<String> parDeDatos = new ArrayList<>();
            parDeDatos.add(rs.getString("codigoEMS"));
            parDeDatos.add(rs.getString("razaString"));


            datosASerializar.add(parDeDatos);
        }
        st.close();
        ConexionBD.desconectar();

        return datosASerializar;

    }
}
