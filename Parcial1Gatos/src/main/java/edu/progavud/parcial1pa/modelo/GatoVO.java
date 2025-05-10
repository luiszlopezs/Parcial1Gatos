/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.modelo;

/**
 *
 * @author hailen
 */
public class GatoVO {

    private Raza raza;
    private int id;
    private String codigoEMS;
    private String nombre;
    private String descripcion;
    private String razaString = "";

    public GatoVO(Raza raza, int id, String codigoEMS, String nombre, String descripcion) {
        this.raza = raza;
        this.id = id;
        this.codigoEMS = codigoEMS;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public GatoVO() {
    }

    public String obtenerRazaString() {
        razaString = razaString.concat(raza.getNombreRaza() + "-");
        razaString = razaString.concat(raza.getColorPelaje() + "-");
        razaString = razaString.concat(raza.getPatron() + "-");
        razaString = razaString.concat(raza.getColorOjos() + "-");
        razaString = razaString.concat(raza.getCola());
        return razaString;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoEMS() {
        return codigoEMS;
    }

    public void setCodigoEMS(String codigoEMS) {
        this.codigoEMS = codigoEMS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public String getRazaString() {
        return razaString;
    }

    public void setRazaString(String razaString) {
        this.razaString = razaString;
    }
    
    

}
