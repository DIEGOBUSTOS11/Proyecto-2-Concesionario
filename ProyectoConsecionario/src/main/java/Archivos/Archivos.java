/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Datos.Listas.ListasDatos;
import java.io.File;

/**
 *
 * @author alejandro
 */
public class Archivos {
    
    public ListasDatos listaDatos;
    private static final String ruta = "../ProyectoConsecionario/src/main/java/Archivos/Listas.txt";
           

    public Archivos() {
       validarArchivo();
    }
    
    private void validarArchivo(){
     try {
            
            File file = new File(ruta);
           
            if (!file.exists()) {
                file.createNewFile();
                listaDatos=new ListasDatos();
                guardarRegistro(listaDatos);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    
    }
 
    public ListasDatos obtenerListasActuales() {
        listaDatos=new ListasDatos();
       
        try {
            ObjectInputStream entrada =  new ObjectInputStream(new FileInputStream(ruta));
            listaDatos = (ListasDatos) entrada.readObject();
  
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        return listaDatos;
    }
      
       public void guardarRegistro(ListasDatos listaDatos) {

        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(listaDatos);
            salida.close();
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
       
    
}
