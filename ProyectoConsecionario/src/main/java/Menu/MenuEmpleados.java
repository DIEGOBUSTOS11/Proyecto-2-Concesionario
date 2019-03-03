/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorEmpleados;
import Datos.Pojos.Personas.Empleado;
import java.util.Scanner;

/**
 *
 * @author diego y alejandro
 */
public class MenuEmpleados {
    
    /**
     * Objeto de la clase Empleado
     * objeto de la clase AdministradorEmpleados
     */
    Empleado nuevoEmpleado;
    AdministradorEmpleados administradorEmpleados;
    Scanner scan = new Scanner(System.in);
    
     /**
     * Constructor inicial 
     * de la clase MenuEmpleados
     */
    public MenuEmpleados(){
        super();
    }
    
    /**
     * Metodo menuInicialEmpleados encargado
     * de agregar, modificar, eliminar,ver,
     * listar un  Empleados
     */
    public void MenuInicialClientes() {

        int opcion = 0;
        int documento = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    administradorEmpleados = new AdministradorEmpleados(nuevoEmpleado);
                    administradorEmpleados.agregar();
                    break;
                case 2:
                    modificarEmpleado();
                    break;
                case 3:
                    System.out.print("\nIngrese el documento del empleado a eliminar:\n");
                    documento = scan.nextInt();
                    administradorEmpleados= new AdministradorEmpleados(documento);
                    administradorEmpleados.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el documento del empleado a ver:\n");
                    documento=scan.nextInt();
                    administradorEmpleados = new AdministradorEmpleados(documento);
                    administradorEmpleados.ver();
                    break;
                case 5:
                    administradorEmpleados = new AdministradorEmpleados();
                    administradorEmpleados.listar();
                    break;
                case 6:
                    System.out.print("\nGRACIAS POR USAR ESTE PROGRAMA");
                    break;
                default:
                    System.out.print("\nOPCION INCORRECTA");
                    break;
            }

        } while (opcion != 6);
    }

    /**
     * Metodo agregarEmpleado encargado
     * de agregar un empleado nuevo
     */
     public void agregarEmpleado() {
        nuevoEmpleado = new Empleado();

        System.out.print("\nIngrese el nombre:\n");
        nuevoEmpleado.setNombreCompleto(scan.next());
        System.out.print("\nIngrese el tipo de documento:\n");
        nuevoEmpleado.setTipoDocumento(scan.next());
        System.out.print("\nIngrese su ducumento:\n");
        nuevoEmpleado.setDocumento(scan.nextInt());
        System.out.print("\nIngrese su direccion:\n");
        nuevoEmpleado.setDireccion(scan.next());
        System.out.print("\nIngrese la ciudad:\n");
        nuevoEmpleado.setCiudad(scan.next());
        System.out.print("\nIngrese su correo:\n");
        nuevoEmpleado.setCorreo(scan.next());
        System.out.print("\nIngrese su cuenta bancaria:\n");
        nuevoEmpleado.setCuentaBancaria(scan.nextInt());

    }

     /**
     * Metodo modificarEmpleado encargado
     * de modificar un empleado
     */
    public void modificarEmpleado() {
        System.out.print("\nIngrese el documento del cliente a modificar:\n");
        int documento = scan.nextInt();
        administradorEmpleados = new AdministradorEmpleados(documento);
        nuevoEmpleado = administradorEmpleados.obtener();

        if (nuevoEmpleado== null) {

        } else {
            
            System.out.print("\nIngrese el nombre:\n");
            nuevoEmpleado.setNombreCompleto(scan.next());
            System.out.print("\nIngrese el tipo de documento:\n");
            nuevoEmpleado.setTipoDocumento(scan.next());

            nuevoEmpleado.setDocumento(documento);

            System.out.print("\nIngrese su direccion:\n");
            nuevoEmpleado.setDireccion(scan.next());
            System.out.print("\nIngrese la ciudad:\n");
            nuevoEmpleado.setCiudad(scan.next());
            System.out.print("\nIngrese su correo:\n");
            nuevoEmpleado.setCorreo(scan.next());
            System.out.print("\nIngrese su cuenta bancaria:\n");
            nuevoEmpleado.setCuentaBancaria(scan.nextInt());

            administradorEmpleados= new AdministradorEmpleados(nuevoEmpleado);
            administradorEmpleados.modificar();

        }
    }
    
}
