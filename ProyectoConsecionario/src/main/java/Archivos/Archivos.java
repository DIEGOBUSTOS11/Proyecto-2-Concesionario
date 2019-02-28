/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Datos.Listas.ListasDatos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class Archivos {
    
    public ListasDatos listaDatos;

    public Archivos() {
       
    }
 
    public ListasDatos obtenerListasActuales() {
        listaDatos=new ListasDatos();
        
        try {
            ObjectInputStream entrada =  new ObjectInputStream(new FileInputStream("Listas.txt"));
            listaDatos = (ListasDatos) entrada.readObject();
        } catch (IOException ex) {
            System.out.println("No encontre el archivo");
        } catch (ClassNotFoundException ex2) {
            System.out.println("No encontre la clase");
        }
        
        return listaDatos;
    }
      
       public void guardarRegistro(ListasDatos listaDatos) {

        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Listas.txt"));
            salida.writeObject(listaDatos);
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
