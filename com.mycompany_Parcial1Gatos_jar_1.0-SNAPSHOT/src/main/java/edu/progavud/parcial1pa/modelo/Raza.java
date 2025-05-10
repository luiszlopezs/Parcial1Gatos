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
    private String razaString; // es el que se sube a la base de datos "raza" y es el que se muestra en el jcombobox

    public Raza(String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola) {
        this.nombreRaza = nombreRaza;
        this.colorPelaje = colorPelaje;
        this.patron = patron;
        this.colorOjos = colorOjos;
        this.cola = cola;
    } 
    
    public String obtenerRazaString() { // metodo para conccatenar los atributos de Raza, RECUERDE USARLO DENTRO DEL SET RAZASTRING
        this.razaString =  getNombreRaza() + "-"
                + getColorPelaje() + "-"
                + getPatron() + "-"
                + getColorOjos() + "-"
                + getCola();
        return this.razaString;
    }

    public void setTodaRaza(String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola) {
        this.nombreRaza = nombreRaza;
        this.colorPelaje = colorPelaje;
        this.patron = patron;
        this.colorOjos = colorOjos;
        this.cola = cola;
        obtenerRazaString();
    }

    public String getNombreRaza() {
        return nombreRaza;
        
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
        obtenerRazaString();
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
        obtenerRazaString();
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
        obtenerRazaString();
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
        obtenerRazaString();
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
        obtenerRazaString();
    }

    public String getRazaString() {
        return razaString;
    }

    public void setRazaString(String razaString) {
        this.razaString = razaString;
        
    }

}
