/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Personas;

/**
 *
 * @author alejandro y diego
 */
public class Empleado extends Persona{
    
     private int codigoInterno;
     private int salario;

     /**
     * Constructor inicial 
     * de la clase Empleado
     */
     public Empleado(){
         super();
     }
     
     /**
      * Constructor con los atributos
      * de la clase de Empleado
      * @param codigoInterno
      * @param salario
      * @param tipoDocumento
      * @param documento
      * @param nombreCompleto
      * @param direccion
      * @param ciudad
      * @param correo
      * @param telefono
      * @param estado
      * @param cuentaBancaria 
      */
    public Empleado(int codigoInterno, int salario, String tipoDocumento, int documento, String nombreCompleto, String direccion, String ciudad, String correo, int telefono, boolean estado, int cuentaBancaria) {
        super(tipoDocumento, documento, nombreCompleto, direccion, ciudad, correo, telefono, estado, cuentaBancaria);
        this.codigoInterno = codigoInterno;
        this.salario = salario;
    }
      
}
