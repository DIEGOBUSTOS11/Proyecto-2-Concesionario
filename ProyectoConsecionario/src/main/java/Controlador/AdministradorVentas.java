/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroDeportivo;
import Datos.Pojos.Carros.CarroEstandar;
import Datos.Pojos.Carros.CarroMaquinaria;
import Datos.Pojos.Carros.CarroPersonalizado;
import Datos.Pojos.Ventas.Venta;

/**
 *
 * @author Alejndro y Diego
 */
public class AdministradorVentas extends AdministradorPadre {
   
    /**
     * Objeto de la clase Venta
     * Variable global documentoVenta
     */
    Venta nuevaVenta;
    int documentoVenta;

    /**
     * Constructor inicial 
     * de la clase AdministradorVentas
     */
    public AdministradorVentas() {
        super();
    }

    /**
     * Constructor con carga del objeto Venta
     * @param venta nombre del objeto de la clase Venta
     */
    public AdministradorVentas(Venta venta) {
        super();
        nuevaVenta = new Venta();
        nuevaVenta = venta;
    }

    /**
     * Constructor con carga de la variabale documento cliente
     * @param documento numero del documento de cliente
     */
    public AdministradorVentas(int documento) {
        documentoVenta = documento;
    }

    /**
      * Metodo encargado de agregar
      * Venta marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
        descontarCarro();
        listaDatos.getVentas().add(nuevaVenta);
        guardarDatos();
        System.out.println("Venta agregado correctamente");
    }

    /**
      * Metodo encargado de 
      * descontar los carros 
      * vendidos del inventario
      */
    public void descontarCarro() {
        switch (nuevaVenta.getTipoVehiculo()) {
            case 1:

                descontarDeportivo();

                break;
            case 2:
                descontarMaquinaria();
                break;
            case 3:
                descontarPersonalizado();
                break;
            case 4:
                descontarEstandar();
                break;

        }
        listaDatos.getVentas().add(nuevaVenta);
        guardarDatos();
        System.out.println("Venta agregado correctamente");
    }

    /**
      * Metodo encargado de 
      * descontar los carros deportivo
      * vendidos del inventario
      */
    public void descontarDeportivo() {
        int indice = 0;

        for (CarroDeportivo carroDeportivo : listaDatos.getCarrosDeportivos()) {

            if (carroDeportivo.getCodigoVehiculo() == nuevaVenta.getCodigoVehiculo()) {

                int cantidadNueva = listaDatos.getCarrosDeportivos().get(indice).getCantidad() - 1;
                listaDatos.getCarrosDeportivos().get(indice).setCantidad(cantidadNueva);

                if (listaDatos.getCarrosDeportivos().get(indice).getCantidadMinima() <= cantidadNueva) {
                    System.out.println("LIMITE DE CANTIDAD MINIMA, no podra vender mas carros de esta referencia");
                }

                break;
            }
            indice++;
        }
    }

    /**
      * Metodo encargado de 
      * descontar los carros estandar
      * vendidos del inventario
      */
    public void descontarEstandar() {
        int indice = 0;

        for (CarroEstandar carroEstandar : listaDatos.getCarrosEstandar()) {

            if (carroEstandar.getCodigoVehiculo() == nuevaVenta.getCodigoVehiculo()) {

                int cantidadNueva = listaDatos.getCarrosEstandar().get(indice).getCantidad() - 1;
                listaDatos.getCarrosEstandar().get(indice).setCantidad(cantidadNueva);

                if (listaDatos.getCarrosEstandar().get(indice).getCantidadMinima() <= cantidadNueva) {
                    System.out.println("LIMITE DE CANTIDAD MINIMA, no podra vender mas carros de esta referencia");
                }

                break;
            }
            indice++;
        }
    }

    /**
      * Metodo encargado de 
      * descontar los carros personalizado
      * vendidos del inventario
      */
    public void descontarPersonalizado() {
        int indice = 0;

        for (CarroPersonalizado carroPersonalizado : listaDatos.getCarrosPersonalizados()) {

            if (carroPersonalizado.getCodigoVehiculo() == nuevaVenta.getCodigoVehiculo()) {

                int cantidadNueva = listaDatos.getCarrosPersonalizados().get(indice).getCantidad() - 1;
                listaDatos.getCarrosPersonalizados().get(indice).setCantidad(cantidadNueva);

                if (listaDatos.getCarrosPersonalizados().get(indice).getCantidadMinima() <= cantidadNueva) {
                    System.out.println("LIMITE DE CANTIDAD MINIMA, no podra vender mas carros de esta referencia");
                }

                break;
            }
            indice++;
        }
    }

    /**
      * Metodo encargado de 
      * descontar los carro maquinaria
      * vendidos del inventario
      */
    public void descontarMaquinaria() {
        int indice = 0;

        for (CarroMaquinaria carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            if (carroMaquinaria.getCodigoVehiculo() == nuevaVenta.getCodigoVehiculo()) {

                int cantidadNueva = listaDatos.getCarrosMaquinaria().get(indice).getCantidad() - 1;
                listaDatos.getCarrosMaquinaria().get(indice).setCantidad(cantidadNueva);

                if (listaDatos.getCarrosMaquinaria().get(indice).getCantidadMinima() <= cantidadNueva) {
                    System.out.println("LIMITE DE CANTIDAD MINIMA, no podra vender mas carros de esta referencia");
                }

                break;
            }
            indice++;
        }
    }

    /**
     * Metodo encargado de modificar
     * venta marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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

     /**
     * Metodo encargado de eliminar
     * venta marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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

    /**
     * Metodo encargado de ver
     * ventas marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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

    /**
     * Metodo encargado de listar
     * ventas marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado obtener la 
     * lista de Ventas
     * @return retorna el objeto 
     * de la clase Venta
     */
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

    /**
     * Metodo encargado de
     * calcular el carro mas caro
     * vendido y el carro mas barato
     * vendio
     */
    public void topeVenta(int tipoTope) {

        int valorMenor = 0;
        int indiceMenor = 0;
        int indiceMayor = 0;

        if (listaDatos.getVentas().size() > 0) {
            valorMenor = listaDatos.getVentas().get(0).getPrecio();
        }

        int valorMayor = 0;

        int indice = 0;
        for (Venta venta : listaDatos.getVentas()) {
            if (venta.getPrecio() < valorMenor) {
                valorMenor = venta.getPrecio();
                indiceMenor = indice;
            }
            if (venta.getPrecio() > valorMayor) {
                valorMayor = venta.getPrecio();
                indiceMayor = indice;
            }
            indice++;
        }
        if (indice == 0) {
            System.out.println("No existen ventas registrados");
        } else {
            Venta ventaTope;
            if (tipoTope == 1) {
                ventaTope = listaDatos.getVentas().get(indiceMenor);
            } else {
                ventaTope = listaDatos.getVentas().get(indiceMayor);
            }

            System.out.println("Codigo vehiculo: " + ventaTope.getCodigoVehiculo());
            System.out.println("Documento cliente: " + ventaTope.getDocumentoCliente());
            System.out.println("Documento  empleado: " + ventaTope.getDocumentoEmpleado());
            System.out.println("Tipo pago: " + ventaTope.getTipoPago());
            System.out.println("Precio: " + ventaTope.getPrecio());
            System.out.println("Cuotas: " + ventaTope.getCuotas());
            System.out.println("Saldo: " + ventaTope.getSaldo());
            System.out.println("Tipo vehiculo: " + ventaTope.getTipoVehiculo());
        }

    }

}
