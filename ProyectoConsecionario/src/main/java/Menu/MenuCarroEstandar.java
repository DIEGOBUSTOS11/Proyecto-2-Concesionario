/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorCarroEstandar;
import Datos.Pojos.Carros.CarroEstandar;
import java.util.Scanner;

/**
 *
 * @author diego y alejandro
 */
public class MenuCarroEstandar {
    
    /**
     * Objeto de la clase carro estandar
     * objeto de la clase AdministradorCarroEstandar
     */
    CarroEstandar nuevoCarroEstadar;
    AdministradorCarroEstandar administradorCarrosEstandar;
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor inicial 
     * de la clase MenuCarroEstandar
     */
    public MenuCarroEstandar(){
        super();
    }
    
    /**
     * Metodo menuInicialEstandar encargado
     * de agregar, modificar, eliminar,ver,
     * listar un carro estandar
     */
     public void MenuInicialEstandar() {

        int opcion = 0;
        int codigo = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarCarroEstandar();
                    administradorCarrosEstandar = new AdministradorCarroEstandar(nuevoCarroEstadar);
                    administradorCarrosEstandar.agregar();
                    break;
                case 2:
                    modificarCarroEstandar();
                    break;
                case 3:
                    System.out.print("\nIngrese el codigo del carro estandar a eliminar:\n");
                    codigo = scan.nextInt();
                    administradorCarrosEstandar= new AdministradorCarroEstandar(codigo);
                    administradorCarrosEstandar.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el codigo del carro estandar a ver:\n");
                    codigo=scan.nextInt();
                    administradorCarrosEstandar = new AdministradorCarroEstandar(codigo);
                    administradorCarrosEstandar.ver();
                    break;
                case 5:
                    administradorCarrosEstandar = new AdministradorCarroEstandar();
                    administradorCarrosEstandar.listar();
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
     * Metodo agregarCarroEstandar encargado
     * de agregar un carro estandar
     */
    public void agregarCarroEstandar() {
        nuevoCarroEstadar = new CarroEstandar();
       
        System.out.print("\nIngrese la cantidad:\n");
        nuevoCarroEstadar.setCantidad(scan.nextInt());
        System.out.print("\nIngrese la cantidad minima:\n");
        nuevoCarroEstadar.setCantidadMinima(scan.nextInt());
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        nuevoCarroEstadar.setCodigoVehiculo(scan.nextInt());
        System.out.print("\nIngrese su color:\n");
        nuevoCarroEstadar.setColor(scan.next());
        System.out.print("\nIngrese su estado:\n");
        nuevoCarroEstadar.setEstado(scan.nextBoolean());
        System.out.print("\nIngrese su marca:\n");
        nuevoCarroEstadar.setMarca(scan.next());
        System.out.print("\nIngrese su matricula:\n");
        nuevoCarroEstadar.setMatricula(scan.next());
        System.out.print("\nIngrese su modelo:\n");
        nuevoCarroEstadar.setModelo(scan.next());
        System.out.print("\nIngrese su precio:\n");
        nuevoCarroEstadar.setPrecio(scan.nextInt());
        System.out.print("\nIngrese su referencia:\n");
        nuevoCarroEstadar.setReferencia(scan.next());

    }

    /**
     * Metodo modificarCarroEstandar encargado
     * de modificar un carro estandar
     */
    public void modificarCarroEstandar() {
        System.out.print("\nIngrese el documento del carro estandar  a modificar:\n");
        int codigo= scan.nextInt();
        administradorCarrosEstandar = new AdministradorCarroEstandar(codigo);
        nuevoCarroEstadar = administradorCarrosEstandar.obtener();

        if (nuevoCarroEstadar == null) {

        } else {
            
            System.out.print("\nIngrese la cantidad:\n");
            nuevoCarroEstadar.setCantidad(scan.nextInt());
            System.out.print("\nIngrese la cantidad minima:\n");
            nuevoCarroEstadar.setCantidadMinima(scan.nextInt());
          
             nuevoCarroEstadar.setCodigoVehiculo(codigo);
            
            System.out.print("\nIngrese su color:\n");
            nuevoCarroEstadar.setColor(scan.next());
            System.out.print("\nIngrese su estado:\n");
            nuevoCarroEstadar.setEstado(scan.nextBoolean());
            System.out.print("\nIngrese su marca:\n");
            nuevoCarroEstadar.setMarca(scan.next());
            System.out.print("\nIngrese su matricula:\n");
            nuevoCarroEstadar.setMatricula(scan.next());
            System.out.print("\nIngrese su modelo:\n");
            nuevoCarroEstadar.setModelo(scan.next());
            System.out.print("\nIngrese su precio:\n");
            nuevoCarroEstadar.setPrecio(scan.nextInt());
            System.out.print("\nIngrese su referencia:\n");
            nuevoCarroEstadar.setReferencia(scan.next());

            administradorCarrosEstandar = new AdministradorCarroEstandar(nuevoCarroEstadar);
            administradorCarrosEstandar.modificar();

        }
    }
}
