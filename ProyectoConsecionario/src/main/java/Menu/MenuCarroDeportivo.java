/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorCarroDeportivo;
import Datos.Pojos.Carros.CarroDeportivo;
import java.util.Scanner;

/**
 *
 * @author diego y alejandro
 */
public class MenuCarroDeportivo {
  
    /**
     * Objeto de la clase carro deportivo
     * objeto de la clase AdministradorCarroDeportivo
     */
    CarroDeportivo nuevoCarroDeportivo;
    AdministradorCarroDeportivo administradorCarrosDeportivo;
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructor inicial 
     * de la clase MenuCarroDeportivo
     */
    public MenuCarroDeportivo(){
        super();
    }
    
    /**
     * Metodo menuInicialDeportivo encargado
     * de agregar, modificar, eliminar,ver,
     * listar un carro deportivo
     */
    public void MenuInicialDeportivo() {

        int opcion = 0;
        int codigo = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarCarroDeportivo();
                    administradorCarrosDeportivo = new AdministradorCarroDeportivo(nuevoCarroDeportivo);
                    administradorCarrosDeportivo.agregar();
                    break;
                case 2:
                    modificarCarroDeportivo();
                    break;
                case 3:
                    System.out.print("\nIngrese el codigo del carro deportivo a eliminar:\n");
                    codigo = scan.nextInt();
                    administradorCarrosDeportivo= new AdministradorCarroDeportivo(codigo);
                    administradorCarrosDeportivo.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el codigo del carro deportivo a ver:\n");
                    codigo=scan.nextInt();
                    administradorCarrosDeportivo = new AdministradorCarroDeportivo(codigo);
                    administradorCarrosDeportivo.ver();
                    break;
                case 5:
                    administradorCarrosDeportivo = new AdministradorCarroDeportivo();
                    administradorCarrosDeportivo.listar();
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
     * Metodo agregarCarroDeportivo encargado
     * de agregar un carro deportivo
     */
    public void agregarCarroDeportivo() {
        nuevoCarroDeportivo = new CarroDeportivo();
        
        System.out.print("\nIngrese la cantidad:\n");
        nuevoCarroDeportivo.setCantidad(scan.nextInt());
        System.out.print("\nIngrese la cantidad minima:\n");
        nuevoCarroDeportivo.setCantidadMinima(scan.nextInt());
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        nuevoCarroDeportivo.setCodigoVehiculo(scan.nextInt());
        System.out.print("\nIngrese su color:\n");
        nuevoCarroDeportivo.setColor(scan.next());
        System.out.print("\nIngrese su estado:\n");
        nuevoCarroDeportivo.setEstado(scan.nextBoolean());
        System.out.print("\nIngrese su marca:\n");
        nuevoCarroDeportivo.setMarca(scan.next());
        System.out.print("\nIngrese su matricula:\n");
        nuevoCarroDeportivo.setMatricula(scan.next());
        System.out.print("\nIngrese su modelo:\n");
        nuevoCarroDeportivo.setModelo(scan.next());
        System.out.print("\nIngrese su precio:\n");
        nuevoCarroDeportivo.setPrecio(scan.nextInt());
        System.out.print("\nIngrese su referencia:\n");
        nuevoCarroDeportivo.setReferencia(scan.next());

    }
    
    /**
     * Metodo modificarCarroDeportivo encargado
     * de modificar un carro deportivo
     */
    public void modificarCarroDeportivo() {
        System.out.print("\nIngrese el documento del carro deportivo a modificar:\n");
        int codigo= scan.nextInt();
        administradorCarrosDeportivo = new AdministradorCarroDeportivo(codigo);
        nuevoCarroDeportivo = administradorCarrosDeportivo.obtener();

        if (nuevoCarroDeportivo == null) {

        } else {
            
            System.out.print("\nIngrese la cantidad:\n");
            nuevoCarroDeportivo.setCantidad(scan.nextInt());
            System.out.print("\nIngrese la cantidad minima:\n");
            nuevoCarroDeportivo.setCantidadMinima(scan.nextInt());
          
            nuevoCarroDeportivo.setCodigoVehiculo(codigo);
            
            System.out.print("\nIngrese su color:\n");
            nuevoCarroDeportivo.setColor(scan.next());
            System.out.print("\nIngrese su estado:\n");
            nuevoCarroDeportivo.setEstado(scan.nextBoolean());
            System.out.print("\nIngrese su marca:\n");
            nuevoCarroDeportivo.setMarca(scan.next());
            System.out.print("\nIngrese su matricula:\n");
            nuevoCarroDeportivo.setMatricula(scan.next());
            System.out.print("\nIngrese su modelo:\n");
            nuevoCarroDeportivo.setModelo(scan.next());
            System.out.print("\nIngrese su precio:\n");
            nuevoCarroDeportivo.setPrecio(scan.nextInt());
            System.out.print("\nIngrese su referencia:\n");
            nuevoCarroDeportivo.setReferencia(scan.next());

            administradorCarrosDeportivo = new AdministradorCarroDeportivo(nuevoCarroDeportivo);
            administradorCarrosDeportivo.modificar();

        }
    }
}
