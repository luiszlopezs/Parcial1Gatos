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
        String insercion = "INSERT INTO Estudiantes VALUES('" + gatoVO.getId() + "','" + gatoVO.getRazaString() + "'," + gatoVO.getCodigoEMS() + ")";
        st.executeUpdate(insercion);
        st.close();
        ConexionBD.desconectar();

    }

    public ArrayList<GatoVO> listaDeGatos() {
        ArrayList<GatoVO> misGatos = new ArrayList<GatoVO>();
        String consulta = "SELECT * FROM GatosTabla";
        try {
            con = ConexionBD.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                GatoVO gato = new GatoVO();
                gato.setId(rs.getInt("id"));
                gato.setRazaString(rs.getString("Raza String"));
                gato.setCodigoEMS(rs.getString("Codigo EMS"));
                misGatos.add(gato);
            }
            st.close();
            ConexionBD.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return misGatos;

    }

    public boolean eliminarGato(int id);

    public boolean modificarGato(Gato gato);

    public ArrayList<GatoVo> consultarGatos(String string);

}
