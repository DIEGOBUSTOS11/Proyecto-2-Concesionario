/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class MenuInicial {

    public void MenuPrincipal() {

        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\n\n\n1. MENU DE CLIENTES "
                    + "\n2. MENU DE EMPLEADOS "
                    + "\n3. MENU DE VENTAS"
                    + "\n4. MENU DE CARROS PERSONALIZADOS"
                    + "\n5. MENU DE CARROS ESTANDAR"
                    + "\n6. MENU DE CARROS DEPORTIVO"
                    + "\n7. MENU DE CARROS MAQUINARIA"
                    + "\n8. SALIR\n");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    MenuClientes menuCliente = new MenuClientes();
                    menuCliente.MenuInicialClientes();
                    break;
                case 2:
                    MenuEmpleados menuEmpleado = new MenuEmpleados();
                    menuEmpleado.MenuInicialClientes();
                    break;
                case 3:
                    MenuVentas menuVentas = new MenuVentas();
                    menuVentas.MenuInicialVentas();
                    break;
                case 4:
                    MenuCarroPersonalizado menuCarroPersonalizado = new MenuCarroPersonalizado();
                    menuCarroPersonalizado.MenuInicialPersonalizado();
                    break;
                case 5:
                    MenuCarroEstandar menuCarroEstandar = new MenuCarroEstandar();
                    menuCarroEstandar.MenuInicialEstandar();
                    break;
                case 6:
                    MenuCarroDeportivo menuCarroDeportivo = new MenuCarroDeportivo();
                    menuCarroDeportivo.MenuInicialDeportivo();
                    break;
                case 7:
                    MenuCarroMaquinaria menuCarroMaquinaria = new MenuCarroMaquinaria();
                    menuCarroMaquinaria.MenuInicialMaquinaria();
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

}
