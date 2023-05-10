/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mail.Main;

import java.util.Scanner;
import static mail.Bandejas.MenuBandeja.MenuOpcionesBandeja;
import static mail.CrearEnviarCorreo.NuevoCorreo;
import static mail.LongIn.menuLogIn;
import static mail.Usuarios.Usuarios.MenuOpcionesUsuario;
/**
 *
 * @author Sebas
 */

public class Main {
   
    /**
     * @param args the command line arguments
     */
        
    static Scanner console = new Scanner (System.in);
    
   
    static void Menu(){
        System.out.println("Que deseas hacer?");
        System.out.println("Ir al menu de bandejas...........................1");
        System.out.println("Enviar correo....................................2");
        System.out.println("Ir al menu de opciones de usuarios...............3");        
    }
    
    static void menuOpciones(int Opcion){
        switch (Opcion) {
            case 0:
                System.out.println("Saliendo de la cuenta, redirigiendo al menu de inicio de sesion...");
                
            case 1: MenuOpcionesBandeja(); break;
            case 2: NuevoCorreo(); break;
            case 3: MenuOpcionesUsuario(); break;
        }
    }
    
    public static void menuopcionesMain(){
        int Opcion;
        do{
            Menu();
            Opcion = console.nextInt();
            menuOpciones (Opcion);
        } while (Opcion != 0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        menuLogIn();
    }
}
