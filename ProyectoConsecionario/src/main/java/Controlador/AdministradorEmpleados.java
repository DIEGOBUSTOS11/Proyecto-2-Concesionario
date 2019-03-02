/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Personas.Empleado;

/**
 *
 * @author ferch
 */
public class AdministradorEmpleados extends AdministradorPadre{
    
    Empleado nuevoEmpleado;
    int documentoEmpleado;
  
    public AdministradorEmpleados(){
        super();
    }
    
    public AdministradorEmpleados(Empleado empleado){
        super();
        nuevoEmpleado= new Empleado();
        nuevoEmpleado=empleado;
    }
    
    public AdministradorEmpleados(int documento){
        super();
        documentoEmpleado=documento;
    }
    
    @Override
    public void agregar() {
       
        listaDatos.getEmpleados().add(nuevoEmpleado);
        guardarDatos();
        System.out.println("Empleado agregado correctamente");
    }

    @Override
    public void modificar() {

        boolean existe=false;
       
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == nuevoEmpleado.getDocumento()) {
                existe=true;
                empleado.setCiudad(nuevoEmpleado.getCiudad());
                empleado.setCorreo(nuevoEmpleado.getCorreo());
                empleado.setCuentaBancaria(nuevoEmpleado.getCuentaBancaria());
                empleado.setDireccion(nuevoEmpleado.getDireccion());
                empleado.setDocumento(nuevoEmpleado.getDocumento());
                empleado.setCiudad(nuevoEmpleado.getCiudad());
                empleado.setNombreCompleto(nuevoEmpleado.getNombreCompleto());
                empleado.setTipoDocumento(nuevoEmpleado.getTipoDocumento());
            }
        }
         if(!existe){
            System.out.println("Empleado no encontrado");
        }else{
            System.out.println("Empleado modificado");
            guardarDatos();
        }
    }

    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                existe=true;
                listaDatos.getEmpleados().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }else{
            System.out.println("Empleado eliminado");
            guardarDatos();
        }
        
    }
    
    @Override
    public void ver() {
        
        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                System.out.println("Nombre: " + empleado.getNombreCompleto());
                System.out.println("Tipo de Documento: " + empleado.getTipoDocumento());
                System.out.println("Documento: " + empleado.getDocumento());
                System.out.println("Ciudad: " + empleado.getCiudad());
                System.out.println("Correo: " + empleado.getCorreo());
                System.out.println("Cuenta Bancaria: " + empleado.getCuentaBancaria());
                System.out.println("Direccion: " + empleado.getDireccion());
                
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }

    }
    
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (Empleado empleado : listaDatos.getEmpleados()) {

            System.out.println("Nombre: " + empleado.getNombreCompleto());
            System.out.println("Tipo de Documento: " + empleado.getTipoDocumento());
            System.out.println("Documento: " + empleado.getDocumento());
            System.out.println("Ciudad: " + empleado.getCiudad());
            System.out.println("Correo: " + empleado.getCorreo());
            System.out.println("Cuenta Bancaria: " + empleado.getCuentaBancaria());
            System.out.println("Direccion: " + empleado.getDireccion());
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen empleados registrados");
        }
    }
    
     public Empleado obtener() {
        
        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                return empleado;
                
            }
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }
        return null;
    }
}
