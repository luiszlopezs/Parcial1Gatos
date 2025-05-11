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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hailen
 */
public class SerializacionDatos {
    
        //Canal de salida para escribir en el archivo de serializacion
    private FileOutputStream fileOut;
    private ObjectOutputStream salida;

    //Canal de salida para escribir en el archivo de serializacion
    private FileInputStream fileIn;
    private ObjectInputStream entrada;

    //Metodo Cosntructor que prepara los canales para leer / escribir 
    //en el archivo de serializacion
    public SerializacionDatos() {

            //Para escribir
            
    }

    
    
    public void cerrarArchivoSerializadoOut() throws IOException {
        salida.close();
               
            
    }

    public void cerrarArchivoSerializadoIn() throws IOException {
        entrada.close();
 
        }
    

    public void escribirArchivoSerializado(ArrayList<List> datosASerializar) throws IOException {
   
        salida.writeObject(datosASerializar);
    
        
    }

        //Metodos para escribir en el archivo de serializacion
    //Para recosntruir los objetos desde los bytes del archivo
    public ArrayList<List> leerArchivoSerializado() throws IOException, ClassNotFoundException {
        ArrayList<List> datosASerializar = null;
                datosASerializar = (ArrayList<List>) entrada.readObject();
   
        
        return datosASerializar;
    }

    public FileOutputStream getFileOut() {
        return fileOut;
    }

    public void setFileOut(FileOutputStream fileOut) {
        this.fileOut = fileOut;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }

    public FileInputStream getFileIn() {
        return fileIn;
    }

    public void setFileIn(FileInputStream fileIn) {
        this.fileIn = fileIn;
    }

    public ObjectInputStream getEntrada() {
        return entrada;
    }

    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }
    
    
}

