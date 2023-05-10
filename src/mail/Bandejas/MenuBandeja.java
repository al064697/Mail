
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Bandejas;

import java.util.Scanner;
import static mail.Bandejas.BandejaArchivados.MensajesArchivados;
import static mail.Bandejas.BandejaEliminados.MensajesEliminados;
import static mail.Bandejas.BandejaEnviados.MensajesEnviados;
import static mail.Bandejas.BandejaLeidos.MensajesLeidos;
import static mail.Bandejas.BandejaNoLeidos.MensajesNoLeidos;
import static mail.Bandejas.BandejaEntrada.BandejaEntrada;
import static mail.Bandejas.BandejaNoDeseado.MensajesNoDeseados;
import static mail.Main.Main.menuopcionesMain;

/**
 *
 * @author Sebas
 */
public class MenuBandeja {

    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 0: menuopcionesMain();
            case 1: BandejaEntrada(); break;
            case 2: MensajesLeidos(); break;
            case 3: MensajesNoLeidos(); break;
            case 4: MensajesEnviados(); break;
            case 5: MensajesArchivados(); break;
            case 6: MensajesEliminados(); break;
            case 7: MensajesNoDeseados(); break; 
        }
    }
    
    public static void MenuOpcionesBandeja(){
        Scanner console = new Scanner (System.in);
        int Opcion;
        do {
            System.out.println("Menu de bandejas");
            System.out.println("Que desea hacer?");
            System.out.println("Acceder a la bandeja de entrada..............1");
            System.out.println("Acceder a correos leidos.....................2");
            System.out.println("Acceder a los correos no leidos..............3");
            System.out.println("Acceder a los correos enviados...............4");
            System.out.println("Acceder a los correos archivados.............5");
            System.out.println("Acceder a los correos eliminados.............6");
            System.out.println("Acceder a los correos no deseados............7");
            System.out.println("Volver al menu principal.....................0");
            Opcion = console.nextInt();
            Opciones (Opcion);
        } while (Opcion != 1);
    }
}
