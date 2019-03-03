/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorCarroDeportivo;
import Controlador.AdministradorCarroEstandar;
import Controlador.AdministradorCarroMaquinaria;
import Controlador.AdministradorCarroPersonalizado;
import Controlador.AdministradorEmpleados;
import Controlador.AdministradorVentas;
import Controlador.AdministrarClientes;
import Datos.Pojos.Ventas.Venta;
import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class MenuVentas {

    Venta nuevaVenta;
    AdministradorVentas administradorVentas;
    Scanner scan = new Scanner(System.in);

    public MenuVentas() {
        super();
    }

    public void MenuInicialVentas() {

        int opcion = 0;
        int documento = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR\n6. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    if (agregarVenta()) {
                        administradorVentas = new AdministradorVentas(nuevaVenta);
                        administradorVentas.agregar();
                    } else {
                        System.out.println("No fue posible crear la venta)");
                    }

                    break;
                case 2:
                    if (modificarVenta()) {
                        administradorVentas = new AdministradorVentas(nuevaVenta);
                        administradorVentas.modificar();
                    } else {
                        System.out.println("No fue posible modificar la venta)");
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese el documento del cliente en la venta a eliminar:\n");
                    documento = scan.nextInt();
                    administradorVentas = new AdministradorVentas(documento);
                    administradorVentas.eliminar();
                    break;
                case 4:
                    System.out.print("\nIngrese el documento del cliente en la venta a ver:\n");
                    documento = scan.nextInt();
                    administradorVentas = new AdministradorVentas(documento);
                    administradorVentas.ver();
                    break;
                case 5:
                    administradorVentas = new AdministradorVentas();
                    administradorVentas.listar();
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

    int tipo = 0;
    int codigoVehiculo = 0;
    int documentoEmpleado = 0;
    int documentoCliente = 0;

    public boolean agregarVenta() {

        nuevaVenta = new Venta();

        if (validarVehiculo() && validarCliente() && validarEmpleado()) {

            nuevaVenta.setCodigoVehiculo(codigoVehiculo);
            nuevaVenta.setTipoVehiculo(tipo);
            nuevaVenta.setDocumentoCliente(documentoCliente);
            nuevaVenta.setDocumentoEmpleado(documentoEmpleado);

            System.out.print("\nIngrese el tipo de pago:\n");
            nuevaVenta.setTipoPago(scan.next());
            System.out.print("\nIngrese el monto a pagar:\n");
            nuevaVenta.setPrecio(scan.nextInt());
            System.out.print("\nIngrese la cantidad de cuotas:\n");
            nuevaVenta.setCuotas(scan.nextInt());
            System.out.print("\nIngrese el saldo restante:\n");
            nuevaVenta.setSaldo(scan.nextInt());

            return true;
        } else {
            return false;
        }

    }

    public boolean modificarVenta() {

        nuevaVenta = new Venta();

        System.out.print("\nIngrese el documento del cliente en la venta a modificar:\n");
        documentoCliente = scan.nextInt();
        AdministradorVentas venta
                = new AdministradorVentas(documentoCliente);

        if (validarVehiculo() && validarCliente() && validarEmpleado() && (venta.obtener() != null)) {

            nuevaVenta.setCodigoVehiculo(codigoVehiculo);
            nuevaVenta.setTipoVehiculo(tipo);
            nuevaVenta.setDocumentoCliente(documentoCliente);
            nuevaVenta.setDocumentoEmpleado(documentoEmpleado);

            System.out.print("\nIngrese el tipo de pago:\n");
            nuevaVenta.setTipoPago(scan.next());
            System.out.print("\nIngrese el monto a pagar:\n");
            nuevaVenta.setPrecio(scan.nextInt());
            System.out.print("\nIngrese la cantidad de cuotas:\n");
            nuevaVenta.setCuotas(scan.nextInt());
            System.out.print("\nIngrese el saldo restante:\n");
            nuevaVenta.setSaldo(scan.nextInt());

            return true;
        } else {
            return false;
        }

    }

    public boolean validarCliente() {
        System.out.print("\nIngrese el documento del cliente:\n");
        documentoCliente = scan.nextInt();

        AdministrarClientes administrarCliente
                = new AdministrarClientes(documentoCliente);
        if (administrarCliente.obtener() == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean validarEmpleado() {
        System.out.print("\nIngrese el documento del empleado:\n");
        documentoEmpleado = scan.nextInt();

        AdministradorEmpleados administrarEmpleado
                = new AdministradorEmpleados(documentoEmpleado);
        if (administrarEmpleado.obtener() == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean validarVehiculo() {

        System.out.print("\nIngrese el tipo de vehiculo a comprar:"
                + "\n1. Deportivo"
                + "\n1. Maquinaria"
                + "\n1. Personalizado"
                + "\n1. Estandar"
        );

        tipo = scan.nextInt();
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        codigoVehiculo = scan.nextInt();

        switch (tipo) {
            case 1:
                AdministradorCarroDeportivo deportivo
                        = new AdministradorCarroDeportivo(codigoVehiculo);
                if (deportivo.obtener() == null) {
                    System.out.print("\nCodigo de deportivo  no encontrado\n");
                    return false;
                }

                break;
            case 2:
                AdministradorCarroMaquinaria maquinaria
                        = new AdministradorCarroMaquinaria(codigoVehiculo);
                if (maquinaria.obtener() == null) {
                    System.out.print("\nCodigo de maquinaria  no encontrado\n");
                    return false;
                }
                break;
            case 3:
                AdministradorCarroPersonalizado personalizado
                        = new AdministradorCarroPersonalizado(codigoVehiculo);
                if (personalizado.obtener() == null) {
                    System.out.print("\nCodigo de personalizado  no encontrado\n");
                    return false;
                }
                break;
            case 4:
                AdministradorCarroEstandar estandar
                        = new AdministradorCarroEstandar(codigoVehiculo);
                if (estandar.obtener() == null) {
                    System.out.print("\nCodigo de extandar  no encontrado\n");
                    return false;
                }

                break;

            default:
                System.out.print("\ntipo de auto no encontrado\n");
                return false;

        }
        return true;
    }
}
