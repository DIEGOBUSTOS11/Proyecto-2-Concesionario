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
import Datos.Pojos.Carros.CarroDeportivo;
import Datos.Pojos.Carros.CarroEstandar;
import Datos.Pojos.Carros.CarroMaquinaria;
import Datos.Pojos.Carros.CarroPersonalizado;
import Datos.Pojos.Ventas.Venta;
import java.util.Scanner;

/**
 *
 * @author diego y alejandro
 */
public class MenuVentas {
    
    /**
     * Objeto de la clase Venta
     * objeto de la clase AdministradorVentas
     */
    Venta nuevaVenta;
    AdministradorVentas administradorVentas;
    Scanner scan = new Scanner(System.in);

     /**
     * Constructor inicial 
     * de la clase MenuEmpleados
     */
    public MenuVentas() {
        super();
    }

    /**
     * Metodo menuInicialVentas encargado
     * de agregar, modificar, eliminar,ver,
     * listar, menor venta, mayor venta,
     * de la ventas realizada por un cliente
     */
    public void MenuInicialVentas() {

        int opcion = 0;
        int documento = 0;
        do {
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR "
                    + "\n3. ELIMINAR\n4. VER"
                    + "\n5. LISTAR"
                    + "\n6. MENOR VENTA"
                    + "\n7. MAYOR VENTA"
                    + "\n6. SALIR\n");
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
                    administradorVentas = new AdministradorVentas();
                    administradorVentas.topeVenta(1);//menor
                    break;
                case 7:
                    administradorVentas = new AdministradorVentas();
                    administradorVentas.topeVenta(2);//menor
                    break;
                case 8:
                    System.out.print("\nGRACIAS POR USAR ESTE PROGRAMA");
                    break;
                default:
                    System.out.print("\nOPCION INCORRECTA");
                    break;
            }

        } while (opcion != 8);
    }

    
    int tipo = 0;
    int codigoVehiculo = 0;
    int documentoEmpleado = 0;
    int documentoCliente = 0;
    
    /**
     * Metodo agregarVenta encargado
     * de agregar un venta nueva
     */
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

     /**
     * Metodo modificarVenta encargado
     * de modificar una venta realizada
     */
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
    
     /**
     * Metodo modEmpleado encargado
     * de modificar un empleado
     */
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

     /**
     * Metodo validarEmpleado encargado
     * de validar el documento del empleado
     */
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

     /**
     * Metodo validarVehiculo encargado
     * de escoger el tipo de vehiculo 
     * que existe para realizar la compra
     * y validar si existe o no un vehiculo
     * con el codigo del vehculo
     */
    public boolean validarVehiculo() {

        System.out.print("\nIngrese el tipo de vehiculo a comprar:"
                + "\n1. Deportivo"
                + "\n2. Maquinaria"
                + "\n3. Personalizado"
                + "\n4. Estandar"
        );

        tipo = scan.nextInt();
        System.out.print("\nIngrese el codigo del vehiculo:\n");
        codigoVehiculo = scan.nextInt();

        switch (tipo) {
            case 1:
                AdministradorCarroDeportivo deportivo
                        = new AdministradorCarroDeportivo(codigoVehiculo);
                
                CarroDeportivo carroDeportivo=deportivo.obtener();
                if (carroDeportivo == null) {
                    System.out.print("\nCodigo de deportivo  no encontrado\n");
                    return false;
                }else{
                    if((carroDeportivo.getCantidad()-1)<carroDeportivo.getCantidadMinima()){
                    System.out.print("\nSin vehiculos disponibles\n");
                    return false; 
                    }
                }

                break;
            case 2:
                AdministradorCarroMaquinaria maquinaria
                        = new AdministradorCarroMaquinaria(codigoVehiculo);
                
                CarroMaquinaria carroMaquina=maquinaria.obtener();
                if ( carroMaquina== null) {
                    System.out.print("\nCodigo de maquinaria  no encontrado\n");
                    return false;
                }
                else{
                    if((carroMaquina.getCantidad()-1)<carroMaquina.getCantidadMinima()){
                    System.out.print("\nSin vehiculos disponibles\n");
                    return false; 
                    }
                }
                break;
            case 3:
                AdministradorCarroPersonalizado personalizado
                        = new AdministradorCarroPersonalizado(codigoVehiculo);
                
                CarroPersonalizado carroPersonal=personalizado.obtener();
                if ( carroPersonal== null) {
                    System.out.print("\nCodigo de personalizado  no encontrado\n");
                    return false;
                }else{
                    if((carroPersonal.getCantidad()-1)<carroPersonal.getCantidadMinima()){
                    System.out.print("\nSin vehiculos disponibles\n");
                    return false; 
                    }
                }
                break;
            case 4:
                AdministradorCarroEstandar estandar
                        = new AdministradorCarroEstandar(codigoVehiculo);
                
                CarroEstandar carroEstandar=estandar.obtener();
               
                if ( carroEstandar== null) {
                    System.out.print("\nCodigo de extandar  no encontrado\n");
                    return false;
                }else{
                    if((carroEstandar.getCantidad()-1)<carroEstandar.getCantidadMinima()){
                    System.out.print("\nSin vehiculos disponibles\n");
                    return false; 
                    }
                }

                break;

            default:
                System.out.print("\ntipo de auto no encontrado\n");
                return false;

        }
        return true;
    }
    
}
