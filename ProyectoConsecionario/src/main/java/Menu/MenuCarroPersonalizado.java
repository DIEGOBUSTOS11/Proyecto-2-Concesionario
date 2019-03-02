/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorCarroPersonalizado;
import Datos.Pojos.Carros.CarroPersonalizado;
import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class MenuCarroPersonalizado {
    
    CarroPersonalizado nuevoCarroPersonalizado;
    AdministradorCarroPersonalizado administradorCarroPersonalizado;
    Scanner scan = new Scanner(System.in);
    
    public MenuCarroPersonalizado(){
       super();
    }
    
    
    public void MenuInicialClientes() {

        int opcion = 0;
        int codigo = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    agregarCarroPersonalizado();
                    administradorCarroPersonalizado = new AdministradorCarroPersonalizado(nuevoCarroPersonalizado);
                    administradorCarroPersonalizado.agregar();
                    break;
                case 2:
                    modificarCarroPersonalizado();
                    break;
                case 3:
                    System.out.print("\nIngrese el codigo del carro personalizado a eliminar:\n");
                    codigo = scan.nextInt();
                    administradorCarroPersonalizado = new AdministradorCarroPersonalizado(codigo);
                    administradorCarroPersonalizado.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el codigo del carro personalizada a ver:\n");
                    codigo=scan.nextInt();
                    administradorCarroPersonalizado = new AdministradorCarroPersonalizado(codigo);
                    administradorCarroPersonalizado.ver();
                    break;
                case 5:
                    administradorCarroPersonalizado  = new AdministradorCarroPersonalizado();
                    administradorCarroPersonalizado.listar();
                    break;
                case 6:
                    System.out.print("\nGRACIAS POR USAR ESTE PROGRAMA");
                    break;
                default:
                    System.out.print("\nOPCION INCORRECTA");
                    break;
            }

        } while (opcion != 3);
    }

    public void agregarCarroPersonalizado() {
        nuevoCarroPersonalizado = new CarroPersonalizado();
       
        System.out.print("\nIngrese la cantidad:\n");
        nuevoCarroPersonalizado.setCantidad(scan.nextInt());
        System.out.print("\nIngrese la cantidad minima:\n");
       nuevoCarroPersonalizado.setCantidadMinima(scan.nextInt());
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        nuevoCarroPersonalizado.setCodigoVehiculo(scan.nextInt());
        System.out.print("\nIngrese su color:\n");
        nuevoCarroPersonalizado.setColor(scan.next());
        System.out.print("\nIngrese su estado:\n");
        nuevoCarroPersonalizado.setEstado(scan.nextBoolean());
        System.out.print("\nIngrese su marca:\n");
        nuevoCarroPersonalizado.setMarca(scan.next());
        System.out.print("\nIngrese su matricula:\n");
       nuevoCarroPersonalizado.setMatricula(scan.next());
        System.out.print("\nIngrese su modelo:\n");
        nuevoCarroPersonalizado.setModelo(scan.next());
        System.out.print("\nIngrese su precio:\n");
       nuevoCarroPersonalizado.setPrecio(scan.nextInt());
        System.out.print("\nIngrese su referencia:\n");
        nuevoCarroPersonalizado.setReferencia(scan.next());

    }

    public void modificarCarroPersonalizado() {
        System.out.print("\nIngrese el documento del carro personalizado  a modificar:\n");
        int codigo= scan.nextInt();
        administradorCarroPersonalizado= new AdministradorCarroPersonalizado(codigo);
        nuevoCarroPersonalizado = administradorCarroPersonalizado.obtener();

        if (nuevoCarroPersonalizado == null) {

        } else {
            
            System.out.print("\nIngrese la cantidad:\n");
            nuevoCarroPersonalizado.setCantidad(scan.nextInt());
            System.out.print("\nIngrese la cantidad minima:\n");
            nuevoCarroPersonalizado.setCantidadMinima(scan.nextInt());
          
            nuevoCarroPersonalizado.setCodigoVehiculo(codigo);
            
            System.out.print("\nIngrese su color:\n");
            nuevoCarroPersonalizado.setColor(scan.next());
            System.out.print("\nIngrese su estado:\n");
            nuevoCarroPersonalizado.setEstado(scan.nextBoolean());
            System.out.print("\nIngrese su marca:\n");
            nuevoCarroPersonalizado.setMarca(scan.next());
            System.out.print("\nIngrese su matricula:\n");
            nuevoCarroPersonalizado.setMatricula(scan.next());
            System.out.print("\nIngrese su modelo:\n");
            nuevoCarroPersonalizado.setModelo(scan.next());
            System.out.print("\nIngrese su precio:\n");
            nuevoCarroPersonalizado.setPrecio(scan.nextInt());
            System.out.print("\nIngrese su referencia:\n");
            nuevoCarroPersonalizado.setReferencia(scan.next());

            administradorCarroPersonalizado = new AdministradorCarroPersonalizado(nuevoCarroPersonalizado);
            administradorCarroPersonalizado.modificar();

        }
    }
    
}
