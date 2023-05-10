/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail;

import java.util.Scanner;
import static mail.Main.Main.menuopcionesMain;

/**
 *
 * @author Sebas
 */
public class LongIn {
    
    public static void menuLogIn(){
        Scanner inputData = new Scanner (System.in);
        String Usuario;
        int Contraseña;
        do { 
        System.out.println("Ingresa a tu cuenta para consultar tus correos electronicos");
        System.out.print("Usuario: ");
        Usuario = inputData.next();
        System.out.print("Contraseña: ");
        Contraseña = inputData.nextInt();
        if (Contraseña == 101001000){
            System.out.println("Hola " + Usuario + ", en breve estaras en el menu principal de tu cuenta");
            menuopcionesMain();  
        } else {
            if (Contraseña != 101001000) {
                System.out.println("Usuario y/o contraseña incorrectos, intente de nuevo");
            }
        }
        } while (Contraseña != 101001000);
    }
}
