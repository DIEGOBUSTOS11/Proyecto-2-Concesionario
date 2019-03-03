/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Ventas.Venta;

/**
 *
 * @author ferch
 */
public class AdministradorVentas extends AdministradorPadre {

    Venta nuevaVenta;
    int documentoVenta;

    public AdministradorVentas() {
        super();
    }

    public AdministradorVentas(Venta venta) {
        super();
        nuevaVenta = new Venta();
        nuevaVenta = venta;
    }

    public AdministradorVentas(int documento) {
        documentoVenta = documento;
    }

    @Override
    public void agregar() {

        listaDatos.getVentas().add(nuevaVenta);
        guardarDatos();
        System.out.println("Venta agregado correctamente");
    }

    @Override
    public void modificar() {

        boolean existe = false;

        for (Venta venta : listaDatos.getVentas()) {

            if (venta.getDocumentoCliente() == nuevaVenta.getDocumentoCliente()) {
                existe = true;
                venta.setCodigoVehiculo(nuevaVenta.getCodigoVehiculo());
                venta.setCuotas(nuevaVenta.getCuotas());
                venta.setDocumentoCliente(nuevaVenta.getDocumentoCliente());
                venta.setPrecio(nuevaVenta.getPrecio());
                venta.setSaldo(nuevaVenta.getSaldo());
                venta.setTipoPago(nuevaVenta.getTipoPago());
                venta.setTipoVehiculo(nuevaVenta.getTipoVehiculo());

            }
        }
        if (!existe) {
            System.out.println("Venta no encontrado");
        } else {
            System.out.println("Venta modificado");
            guardarDatos();
        }

    }

    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe = false;
        for (Venta venta : listaDatos.getVentas()) {

            if (venta.getDocumentoCliente() == documentoVenta) {

                existe = true;
                listaDatos.getVentas().remove(indice);
                break;
            }
            indice++;
        }
        if (!existe) {
            System.out.println("Venta no encontrado");
        } else {
            System.out.println("Venta eliminado");
            guardarDatos();
        }

    }

    @Override
    public void ver() {
        boolean existe = false;
        for (Venta venta : listaDatos.getVentas()) {

            if (venta.getDocumentoCliente() == documentoVenta) {

                System.out.println("Codigo vehiculo: " + venta.getCodigoVehiculo());
                System.out.println("Documento cliente: " + venta.getDocumentoCliente());
                System.out.println("Documento  empleado: " + venta.getDocumentoEmpleado());
                System.out.println("Tipo pago: " + venta.getTipoPago());
                System.out.println("Precio: " + venta.getPrecio());
                System.out.println("Cuotas: " + venta.getCuotas());
                System.out.println("Saldo: " + venta.getSaldo());
                System.out.println("Tipo vehiculo: " + venta.getTipoVehiculo());

                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Venta no encontrado");
        }

    }

    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (Venta venta : listaDatos.getVentas()) {

            System.out.println("Codigo vehiculo: " + venta.getCodigoVehiculo());
            System.out.println("Documento cliente: " + venta.getDocumentoCliente());
            System.out.println("Documento  empleado: " + venta.getDocumentoEmpleado());
            System.out.println("Tipo pago: " + venta.getTipoPago());
            System.out.println("Precio: " + venta.getPrecio());
            System.out.println("Cuotas: " + venta.getCuotas());
            System.out.println("Saldo: " + venta.getSaldo());
            System.out.println("Tipo vehiculo: " + venta.getTipoVehiculo());

            indice++;
        }
        if (indice == 1) {
            System.out.println("No existen ventas registrados");
        }

    }

    public Venta obtener() {

        boolean existe = false;
        for (Venta venta : listaDatos.getVentas()) {

            if (venta.getDocumentoCliente() == documentoVenta) {

                return venta;

            }
        }
        if (!existe) {
            System.out.println("Venta no encontrado");
        }
        return null;
    }

}
