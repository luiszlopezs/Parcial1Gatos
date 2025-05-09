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
    private String pelaje;
    private String orejas;
    private String nariz;
    private String ojos;

    public GatoVO(Raza raza, int id, String codigoEMS, String nombre, String pelaje, String orejas, String nariz, String ojos) {
        this.raza = raza;
        this.id = id;
        this.codigoEMS = codigoEMS;
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.orejas = orejas;
        this.nariz = nariz;
        this.ojos = ojos;
    }    

    
    

    public GatoVO() {
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

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getOrejas() {
        return orejas;
    }

    public void setOrejas(String orejas) {
        this.orejas = orejas;
    }

    public String getNariz() {
        return nariz;
    }

    public void setNariz(String nariz) {
        this.nariz = nariz;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }
    
    
    
}
