/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros.Personas;

/**
 *
 * @author alejandro
 */
public class Empleado extends Persona{
    
     private int coidgoInterno;
     private int salario;

    public Empleado(int coidgoInterno, int salario, String tipoDocumento, int documento, String nombreCompleto, String direccion, String ciudad, String correo, int telefono, boolean estado, int cuentaBancaria) {
        super(tipoDocumento, documento, nombreCompleto, direccion, ciudad, correo, telefono, estado, cuentaBancaria);
        this.coidgoInterno = coidgoInterno;
        this.salario = salario;
    }
      
}
