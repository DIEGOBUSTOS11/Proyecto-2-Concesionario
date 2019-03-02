    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministrarClientes;
import Datos.Pojos.Personas.Cliente;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class MenuClientes {

    Cliente nuevoCliente;
    AdministrarClientes administrarCliente;
    Scanner scan = new Scanner(System.in);

    public MenuClientes() {
        super();
    }

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
                    agregarCliente();
                    administrarCliente = new AdministrarClientes(nuevoCliente);
                    administrarCliente.agregar();
                    break;
                case 2:
                    modificarCliente();
                    break;
                case 3:
                    System.out.print("\nIngrese el documento del cliente a eliminar:\n");
                    documento = scan.nextInt();
                    administrarCliente = new AdministrarClientes(documento);
                    administrarCliente.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el documento del cliente a ver:\n");
                    documento = scan.nextInt();
                    administrarCliente = new AdministrarClientes(documento);
                    administrarCliente.ver();
                    break;
                case 5:
                    administrarCliente = new AdministrarClientes();
                    administrarCliente.listar();
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

    public void agregarCliente() {
        nuevoCliente = new Cliente();

        System.out.print("\nIngrese el nombre:\n");
        nuevoCliente.setNombreCompleto(scan.next());
        System.out.print("\nIngrese el tipo de documento:\n");
        nuevoCliente.setTipoDocumento(scan.next());
        System.out.print("\nIngrese su ducumento:\n");
        nuevoCliente.setDocumento(scan.nextInt());
        System.out.print("\nIngrese su direccion:\n");
        nuevoCliente.setDireccion(scan.next());
        System.out.print("\nIngrese la ciudad:\n");
        nuevoCliente.setCiudad(scan.next());
        System.out.print("\nIngrese su correo:\n");
        nuevoCliente.setCorreo(scan.next());
        System.out.print("\nIngrese su cuenta bancaria:\n");
        nuevoCliente.setCuentaBancaria(scan.nextInt());

    }

    public void modificarCliente() {
        System.out.print("\nIngrese el documento del cliente a modificar:\n");
        int documento = scan.nextInt();
        administrarCliente = new AdministrarClientes(documento);
        nuevoCliente = administrarCliente.obtener();

        if (nuevoCliente == null) {

        } else {
            
            System.out.print("\nIngrese el nombre:\n");
            nuevoCliente.setNombreCompleto(scan.next());
            System.out.print("\nIngrese el tipo de documento:\n");
            nuevoCliente.setTipoDocumento(scan.next());

            nuevoCliente.setDocumento(documento);

            System.out.print("\nIngrese su direccion:\n");
            nuevoCliente.setDireccion(scan.next());
            System.out.print("\nIngrese la ciudad:\n");
            nuevoCliente.setCiudad(scan.next());
            System.out.print("\nIngrese su correo:\n");
            nuevoCliente.setCorreo(scan.next());
            System.out.print("\nIngrese su cuenta bancaria:\n");
            nuevoCliente.setCuentaBancaria(scan.nextInt());

            administrarCliente = new AdministrarClientes(nuevoCliente);
            administrarCliente.modificar();

        }
    }
}
