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
        String insercion = "INSERT INTO GatosTabla VALUES(" + gatoVO.getId() + ",'" + gatoVO.getCodigoEMS() + "','" + gatoVO.getRazaString() + "','" + gatoVO.getNombre() + "','" + gatoVO.getDescripcion() + "')";
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
            gato.setId(rs.getInt("id"));
            gato.setCodigoEMS(rs.getString("codigoEMS"));
            gato.setRazaString(rs.getString("razaString"));
            
            gato.setNombre(rs.getString("nombre"));
            gato.setDescripcion(rs.getString("descripcion"));
            
            misGatos.add(gato);
        }
        st.close();
        ConexionBD.desconectar();

        return misGatos;

    }

    public boolean eliminarGato(int id) throws SQLException {

        String consulta = "DELETE FROM GatosTabla WHERE id=" + id + "";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        st.executeUpdate(consulta);
        st.close();
        ConexionBD.desconectar();
        return true;

    }

    public boolean modificarGato(GatoVO gatoVO) throws SQLException {

        //Update estudiantes set nombre='Maria Perez' where codigo=202210200031
        String consulta = "UPDATE GatosTabla SET codigoEMS=" + gatoVO.getCodigoEMS() + "SET razaString=" + gatoVO.getRazaString() +"SET nombre="+ gatoVO.getNombre() +"SET descripcion="+gatoVO.getDescripcion()+"WHERE id=" + gatoVO.getId() + "";
        
            con = ConexionBD.getConexion();
            st = con.createStatement();
            st.executeUpdate(consulta);
            st.close();
            ConexionBD.desconectar();
            return true;
    

    }

    public ArrayList<GatoVO> consultarGatos(String filtro) throws SQLException{
        ArrayList<GatoVO> misGatosConsultados= new ArrayList<GatoVO>();
        String consulta = "SELECT * FROM GatosTabla WHERE razaString LIKE '%" + filtro + "%' OR codigoEMS LIKE '%" + filtro + "%'";

        con = ConexionBD.getConexion();
        st = con.createStatement();
        rs = st.executeQuery(consulta);
        while (rs.next()) {
            GatoVO gato = new GatoVO();
            gato.setId(rs.getInt("id"));
            gato.setCodigoEMS(rs.getString("codigoEMS"));
            gato.setRazaString(rs.getString("razaString"));
            
            gato.setNombre(rs.getString("nombre"));
            gato.setDescripcion(rs.getString("descripcion"));
            
            misGatosConsultados.add(gato);
        }
        st.close();
        ConexionBD.desconectar();

        return misGatosConsultados;
    }

}
