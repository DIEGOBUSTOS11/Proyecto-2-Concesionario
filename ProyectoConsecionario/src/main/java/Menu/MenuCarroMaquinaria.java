/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorCarroMaquinaria;
import Datos.Pojos.Carros.CarroMaquinaria;
import java.util.Scanner;

/**
 *
 * @author diego y alejandro
 */
public class MenuCarroMaquinaria {
    
    /**
     * Objeto de la clase carro maquinaria
     * objeto de la clase AdministradorCarroMaquinaria
     */
    CarroMaquinaria nuevoCarroMaquinaria;
    AdministradorCarroMaquinaria administradorCarroMaquinaria;
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor inicial 
     * de la clase MenuCarroMaquinaria
     */
    public MenuCarroMaquinaria(){
        super();
    }
    
    /**
     * Metodo menuInicialMaquinaria encargado
     * de agregar, modificar, eliminar,ver,
     * listar un carro Maquinaria
     */
     public void MenuInicialMaquinaria() {

        int opcion = 0;
        int codigo = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarCarroMaquinaria();
                    administradorCarroMaquinaria = new AdministradorCarroMaquinaria(nuevoCarroMaquinaria);
                    administradorCarroMaquinaria.agregar();
                    break;
                case 2:
                    modificarCarroMaquinaria();
                    break;
                case 3:
                    System.out.print("\nIngrese el codigo del carro maquinaria a eliminar:\n");
                    codigo = scan.nextInt();
                    administradorCarroMaquinaria= new AdministradorCarroMaquinaria(codigo);
                    administradorCarroMaquinaria.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el codigo del carro maquinaria a ver:\n");
                    codigo=scan.nextInt();
                    administradorCarroMaquinaria = new AdministradorCarroMaquinaria(codigo);
                    administradorCarroMaquinaria.ver();
                    break;
                case 5:
                    administradorCarroMaquinaria = new AdministradorCarroMaquinaria();
                    administradorCarroMaquinaria.listar();
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
     * Metodo agregarCarroMaquinaria encargado
     * de agregar un carro maquinaria
     */
    public void agregarCarroMaquinaria() {
        nuevoCarroMaquinaria = new CarroMaquinaria();

        System.out.print("\nIngrese la cantidad:\n");
        nuevoCarroMaquinaria.setCantidad(scan.nextInt());
        System.out.print("\nIngrese la cantidad minima:\n");
        nuevoCarroMaquinaria.setCantidadMinima(scan.nextInt());
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        nuevoCarroMaquinaria.setCodigoVehiculo(scan.nextInt());
        System.out.print("\nIngrese su color:\n");
        nuevoCarroMaquinaria.setColor(scan.next());
        System.out.print("\nIngrese su estado:\n");
        nuevoCarroMaquinaria.setEstado(scan.nextBoolean());
        System.out.print("\nIngrese su marca:\n");
        nuevoCarroMaquinaria.setMarca(scan.next());
        System.out.print("\nIngrese su matricula:\n");
        nuevoCarroMaquinaria.setMatricula(scan.next());
        System.out.print("\nIngrese su modelo:\n");
        nuevoCarroMaquinaria.setModelo(scan.next());
        System.out.print("\nIngrese su precio:\n");
        nuevoCarroMaquinaria.setPrecio(scan.nextInt());
        System.out.print("\nIngrese su referencia:\n");
        nuevoCarroMaquinaria.setReferencia(scan.next());

    }

     /**
     * Metodo modificarCarroEstandar encargado
     * de modificar un carro maquinaria
     */
    public void modificarCarroMaquinaria() {
        System.out.print("\nIngrese el documento del carro estandar  a modificar:\n");
        int codigo = scan.nextInt();
        administradorCarroMaquinaria = new AdministradorCarroMaquinaria(codigo);
        nuevoCarroMaquinaria = administradorCarroMaquinaria.obtener();

        if (nuevoCarroMaquinaria == null) {

        } else {

            System.out.print("\nIngrese la cantidad:\n");
            nuevoCarroMaquinaria.setCantidad(scan.nextInt());
            System.out.print("\nIngrese la cantidad minima:\n");
            nuevoCarroMaquinaria.setCantidadMinima(scan.nextInt());

            nuevoCarroMaquinaria.setCodigoVehiculo(codigo);

            System.out.print("\nIngrese su color:\n");
            nuevoCarroMaquinaria.setColor(scan.next());
            System.out.print("\nIngrese su estado:\n");
            nuevoCarroMaquinaria.setEstado(scan.nextBoolean());
            System.out.print("\nIngrese su marca:\n");
            nuevoCarroMaquinaria.setMarca(scan.next());
            System.out.print("\nIngrese su matricula:\n");
            nuevoCarroMaquinaria.setMatricula(scan.next());
            System.out.print("\nIngrese su modelo:\n");
            nuevoCarroMaquinaria.setModelo(scan.next());
            System.out.print("\nIngrese su precio:\n");
            nuevoCarroMaquinaria.setPrecio(scan.nextInt());
            System.out.print("\nIngrese su referencia:\n");
            nuevoCarroMaquinaria.setReferencia(scan.next());

            administradorCarroMaquinaria = new AdministradorCarroMaquinaria(nuevoCarroMaquinaria);
            administradorCarroMaquinaria.modificar();

        }
    }
}
