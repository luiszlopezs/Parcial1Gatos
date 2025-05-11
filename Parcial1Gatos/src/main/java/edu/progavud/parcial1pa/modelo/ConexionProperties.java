/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.modelo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConexionProperties {

    private Properties propiedades;
    private FileInputStream archivoIn;
    private FileOutputStream archivoOut;

    public ConexionProperties(Properties propiedades, FileInputStream archivoIn) {
        this.propiedades = propiedades;
        this.archivoIn = archivoIn;
    }

    public Properties cargar() throws IOException {
        propiedades.load(archivoIn);
        archivoIn.close();
        return propiedades;
    }

    public void guardar() throws IOException {
        propiedades.store(archivoOut, "Datos guardados");
        archivoOut.close();
    }

    // Getters y Setters
    public Properties getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Properties propiedades) {
        this.propiedades = propiedades;
    }

    public FileInputStream getArchivoIn() {
        return archivoIn;
    }

    public void setArchivoIn(FileInputStream archivoIn) {
        this.archivoIn = archivoIn;
    }

    public FileOutputStream getArchivoOut() {
        return archivoOut;
    }

    public void setArchivoOut(FileOutputStream archivoOut) {
        this.archivoOut = archivoOut;
    }
}
