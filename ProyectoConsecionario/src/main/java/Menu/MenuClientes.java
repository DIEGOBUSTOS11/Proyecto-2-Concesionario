/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Controlador.AdministradorInterface;
import Datos.Pojos.Personas.Cliente;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class MenuClientes  {
    
    Cliente nuevoCliente;
    
    public MenuClientes() {
    }
      
    public void MenuInicialClientes(){
        Scanner scan=new Scanner(System.in);
    
        int opcion=0;
        
        do{
            System.out.print("\n\n\n1. AGREGAR \n2. MODIFICAR \n3. SALIR\n");
            opcion= scan.nextInt();
            
            switch (opcion) {
                case 1:
                    //System.out.print("Introduzca el texto a encriptar: \n");
                    //texto = scan.next();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("\nGRACIAS POR USAR ESTE PROGRAMA");
                    break;
                default:
                    System.out.print("\nOPCION INCORRECTA");
                    break;
            }
            
            
        }while(opcion!=3);   
    }
}
