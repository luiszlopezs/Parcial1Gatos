/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.parcial1pa.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class ControlPrincipal {

    private ControlGatos cGatos;
    //private ControlVentana cVentana;
    HashMap<String, String> nombreRazaHM;
    HashMap<String, String> colorPelajeHM;
    HashMap<String, String> patronHM;
    HashMap<String, String> colorOjosHM;
    HashMap<String, String> colaHM;

    public ControlPrincipal() {
        this.nombreRazaHM = new HashMap();
        this.colorPelajeHM = new HashMap();
        this.patronHM = new HashMap();
        this.colorOjosHM = new HashMap();
        this.colaHM = new HashMap();
        cGatos = new ControlGatos(this);
        //cVentana = new ControlVentana(this);
        inicializar();
    }

    //CRUD
    public void eliminarGato(String id) {
        cGatos.eliminarGato(id);
    }

    public void modificarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion) {
        cGatos.modificarGato(id, codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);
    }

    public void insertarGato(String id, String codEMS, String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola, String nombre, String descripcion) {
        cGatos.insertarGato(codEMS, nombreRaza, colorPelaje, patron, colorOjos, cola, nombre, descripcion);
    }

    // En el GatoDAO ya está validado si el filtro corresponde a codigo EMS o raza, adecuándose a la elección del usuario
    public void obtenerTodosLosGatos() {
        cGatos.obtenerTodosLosGatos();
    }

    public void consultarGatos(String filtro) {
        cGatos.consultarGatos(filtro);
    }
    //Método que inicializa toda la información del código EMS

    public void asignarValoresHashMap() {
        inicializarRazas();
        inicializarPelajes();
        inicializarPatrones();
        inicializarColoresOjos();
        inicializarColas();
        
    }
    
    //Falta colocar HASHMAP de cantidad blanco, y atributo en modelo y cGato
    //Método que le asigna el código EMS (abreviación) a cada atributo del gato, retorna la cadena de String con el código EMS completo

    public String generarCodigoEMS(String nombreRaza, String colorPelaje, String patron, String colorOjos, String cola) {
        String codigoEMS = "";

        String nombreRazaEMS = nombreRazaHM.get(nombreRaza);
        if (nombreRazaEMS != null) {
            codigoEMS += nombreRazaEMS;
        }

        String pelajeEMS = colorPelajeHM.get(colorPelaje);
        if (pelajeEMS != null) {
            codigoEMS += pelajeEMS;
        }

        String patronEMS = patronHM.get(patron);
        if (patronEMS != null) {
            codigoEMS += patronEMS;
        }

        String colorOjosEMS = colorOjosHM.get(colorOjos);
        if (colorOjosEMS != null) {
            codigoEMS += colorOjosEMS;
        }

        String colaEMS = colaHM.get(cola);
        if (colaEMS != null) {
            codigoEMS += colaEMS;
        }

        return codigoEMS;

    }

    public void limpiar() {

    }

    public void guardar() {

    }

//    public static List<String> validarArchivo(String ruta){
//        List<String> camposVacios = new ArrayList<>();
//        Properties props = new Properties();
//        
//        try(FileInputStream fis = new FileInputStream(ruta)){
//            props.load(fis);
//            for(String campos : props.stringPropertyNames()){
//                String [] valores =props.getProperty(campos).split(",");
//                //Se esperan 5 valores:
//                if(valores.length < 5 || Arrays.stream(valores).anyMatch(String :: isBlank)){
//                    camposVacios.add(campos);
//                }
//            }
//        }catch(IOS)
//        
//    }
    public void inicializar() {
        File archivo = cVentana.getvInicial().rutaJfileChooser();
        if (archivo != null) {
            Properties props = new Properties();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(archivo);
            } catch (IOException e) {

            }

            conxPro = new ConexionProperties(props, fis);

            try {
                conxPro.cargar();
            } catch (IOException e) {
                
            }

            cCrupier = new ControlCrupier(this);
            cJugador = new ControlJugador(this);

            cCrupier.inicializarDesdeProperties(props);
            cJugador.inicializarDesdeProperties(props);
        }
    }
    
    public void inicializarRazas() {
    nombreRazaHM.put("Abyssinian", "ABY");
    nombreRazaHM.put("American Burmese", "AMB");
    nombreRazaHM.put("American Curl Longhair", "ACL");
    nombreRazaHM.put("American Curl Shorthair", "ACS");
    nombreRazaHM.put("American Shorthair", "ASH");
    nombreRazaHM.put("American Wirehair", "AWH");
    nombreRazaHM.put("Anatoli", "ANA");
    nombreRazaHM.put("Aphrodite’s Giant Longhair", "APL");
    nombreRazaHM.put("Aphrodite’s Giant Shorthair", "APS");
    nombreRazaHM.put("Arabian Mau", "ARM");
    nombreRazaHM.put("Asian", "ASI");
    nombreRazaHM.put("Australian Mist", "AUM");
    nombreRazaHM.put("Balinese", "BAL");
    nombreRazaHM.put("Bengal", "BEN");
    nombreRazaHM.put("Bombay", "BOM");
    nombreRazaHM.put("Brazilian Shorthair", "BRA");
    nombreRazaHM.put("British Longhair", "BLH");
    nombreRazaHM.put("British Shorthair", "BRI");
    nombreRazaHM.put("Burmese", "BUR");
    nombreRazaHM.put("Burmilla Longhair", "BML");
    nombreRazaHM.put("Burmilla Shorthair", "BMS");
    nombreRazaHM.put("Cashmere", "CAM");
    nombreRazaHM.put("Celtic Shorthair", "KKH");
    nombreRazaHM.put("Ceylon", "CEY");
    nombreRazaHM.put("Chartreux", "CHA");
    nombreRazaHM.put("Chausie", "CHS");
    nombreRazaHM.put("Cornish Rex", "CRX");
    nombreRazaHM.put("Cymric", "CYM");
    nombreRazaHM.put("Deutsch-Langhaar", "DLH");
    nombreRazaHM.put("Devon Rex", "DRX");
    nombreRazaHM.put("Don Sphynx", "DSX");
    nombreRazaHM.put("Egyptian Mau", "MAU");
    nombreRazaHM.put("Exotic Shorthair", "EXO");
    nombreRazaHM.put("German Rex", "GRX");
    nombreRazaHM.put("Havana", "HAV");
    nombreRazaHM.put("Highland Fold", "SFL");
    nombreRazaHM.put("Himalayan / Colourpoint", "PER");
    nombreRazaHM.put("Household Pet", "HHP");
    nombreRazaHM.put("Japanese Bobtail Longhair", "JBL");
    nombreRazaHM.put("Japanese Bobtail Shorthair", "JBS");
    nombreRazaHM.put("Kanaani", "KAN");
    nombreRazaHM.put("Karelian Bobtail Longhair", "KAL");
    nombreRazaHM.put("Karelian Bobtail Shorthair", "KAS");
    nombreRazaHM.put("Khao Manee", "KAM");
    nombreRazaHM.put("Korat", "KOR");
    nombreRazaHM.put("Kurilian Bobtail Langhaar", "KBL");
    nombreRazaHM.put("Kurilian Bobtail Shorthair", "KBS");
    nombreRazaHM.put("LaPerm Longhair", "LPL");
    nombreRazaHM.put("LaPerm Shorthair", "LPS");
    nombreRazaHM.put("Lykoi", "LYS");
    nombreRazaHM.put("Maine Coon", "MCO");
    nombreRazaHM.put("Manx", "MAN");
    nombreRazaHM.put("Mekong Bobtail", "MBT");
    nombreRazaHM.put("Minuet Longhair", "MIL");
    nombreRazaHM.put("Minuet Shorthair", "MIS");
    nombreRazaHM.put("Munchkin Longhair", "MNL");
    nombreRazaHM.put("Munchkin Shorthair", "MNS");
    nombreRazaHM.put("Nebelung", "NEB");
    nombreRazaHM.put("Norwegian Forest", "NFO");
    nombreRazaHM.put("Ocicat", "OCI");
    nombreRazaHM.put("Oriental Semilonghair", "OSL");
    nombreRazaHM.put("Oriental Shorthair", "OSH");
    nombreRazaHM.put("Original Longhair", "TLH");
    nombreRazaHM.put("Persian", "PER");
    nombreRazaHM.put("Peterbald", "PBD");
    nombreRazaHM.put("Ragamuffin", "RGM");
    nombreRazaHM.put("Ragdoll", "RAG");
    nombreRazaHM.put("Russian Blue", "RUS");
    nombreRazaHM.put("Sacred Birman", "SBI");
    nombreRazaHM.put("Scottish Fold", "SFS");
    nombreRazaHM.put("Selkirk Rex Longhair", "SRL");
    nombreRazaHM.put("Selkirk Rex Shorthair", "SRS");
    nombreRazaHM.put("Siamese", "SIA");
    nombreRazaHM.put("Siberian cat / Neva Masquerade", "SIB");
    nombreRazaHM.put("Singapura", "SIN");
    nombreRazaHM.put("Snowshoe", "SNO");
    nombreRazaHM.put("Somali", "SOM");
    nombreRazaHM.put("Sphynx", "SPH");
    nombreRazaHM.put("Thai", "THA");
    nombreRazaHM.put("Tiffanie", "TIF");
    nombreRazaHM.put("Tonkinese", "TON");
    nombreRazaHM.put("Toy Bob", "TOB");
    nombreRazaHM.put("Turkish Angora", "TUA");
    nombreRazaHM.put("Turkish Van", "TUV");
    nombreRazaHM.put("Ural Rex Longhair", "URL");
    nombreRazaHM.put("Ural Rex Shorthair", "URS");
    nombreRazaHM.put("York", "YOR");
}
    
    public void inicializarPelajes() {
    colorPelajeHM.put("black", "n");
    colorPelajeHM.put("black tortie", "f");
    colorPelajeHM.put("blue", "a");
    colorPelajeHM.put("blue tortie", "g");
    colorPelajeHM.put("chocolate", "b");
    colorPelajeHM.put("chocolate tortie", "h");
    colorPelajeHM.put("lilac", "c");
    colorPelajeHM.put("cinnamon", "o");
    colorPelajeHM.put("cinnamon tortie", "q");
    colorPelajeHM.put("red", "d");
    colorPelajeHM.put("cream", "e");
    colorPelajeHM.put("fawn", "p");
    colorPelajeHM.put("fawn tortie", "r");
    colorPelajeHM.put("lilac tortie", "j");
    colorPelajeHM.put("white", "w");
    colorPelajeHM.put("seal", "s");
    colorPelajeHM.put("unrecognized", "x");
}
    
    public void inicializarPatrones() {
    patronHM.put("shaded", "11");
    patronHM.put("shell", "12");
    patronHM.put("tabby", "21");
    patronHM.put("lynx", "21");
    patronHM.put("classic", "22");
    patronHM.put("mackerel", "23");
    patronHM.put("spotted", "24");
    patronHM.put("ticked", "25");
    patronHM.put("grizzled ticked", "26");
}
    
    public void inicializarColoresOjos() {
    colorOjosHM.put("blue", "61");
    colorOjosHM.put("orange", "62");
    colorOjosHM.put("odd", "63");
    colorOjosHM.put("green", "64");
    colorOjosHM.put("golden BUR", "65");
    colorOjosHM.put("aquamarine TON", "66");
    colorOjosHM.put("dark blue SIA", "67");
}
    
    public void inicializarColas() {
    colaHM.put("rumpy", "51");              // sin cola
    colaHM.put("rumpy riser", "52");        // solo un poco de cola al final de la columna
    colaHM.put("stumpy", "53");             // cola corta de aprox 3-4 cm
    colaHM.put("longie", "54");             // cola larga
}






}
