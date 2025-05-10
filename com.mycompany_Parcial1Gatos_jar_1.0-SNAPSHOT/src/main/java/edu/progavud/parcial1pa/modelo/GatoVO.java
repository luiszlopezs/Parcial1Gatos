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
    private String id;
    private String codigoEMS;
    private String nombre;
    private String descripcion;


    public GatoVO(Raza raza, String id, String codigoEMS, String nombre, String descripcion) {
        this.raza = raza;
        this.id = id;
        this.codigoEMS = codigoEMS;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public GatoVO() {
        this.raza = new Raza("", "", "", "", "");
    }



    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    

  
    
    

}

