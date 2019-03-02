/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorVentas;
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
    
    public MenuVentas(){
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
               
                    administradorVentas = new AdministradorVentas();
                    administradorVentas.agregar();
                    break;
                case 2:
                    //modificarVentas();
                    break;
                case 3:
                    
                    break;
                case 4:
                   
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

        } while (opcion != 3);
    }
}
