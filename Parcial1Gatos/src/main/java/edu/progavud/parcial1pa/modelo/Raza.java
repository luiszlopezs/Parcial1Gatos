/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.modelo;

/**
 *
 * @author hailen
 */
public class Raza {
    
    private String nombreRaza;
    private String colorPelaje;
    private String patron;
    private String colorOjos;
    private String cola;

    public Raza(String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola) {
        this.nombreRaza = nombreRaza;
        this.colorPelaje = colorPelaje;
        this.patron = patron;
        this.colorOjos = colorOjos;
        this.cola = cola;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }
    
    
    
}
