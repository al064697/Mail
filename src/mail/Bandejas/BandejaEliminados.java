/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Bandejas;

import java.util.ArrayList;
import java.util.Scanner;
import static mail.Bandejas.MenuBandeja.MenuOpcionesBandeja;
import static mail.Main.Main.menuopcionesMain;

/**
 *
 * @author Sebas 
 */
public class BandejaEliminados {
    
    static ArrayList<ConstructorBandeja> Eliminados = new ArrayList<>();
    
    public static void MensajesEliminados() {
        System.out.println("in: Trash");
        Eliminados.add(new ConstructorBandeja("", "", "", "", "", ""));
        Eliminados.add(new ConstructorBandeja("", "", "", "", "", ""));
        Eliminados.add(new ConstructorBandeja("", "", "", "", "", ""));
        Eliminados.add(new ConstructorBandeja("", "", "", "", "", ""));
        System.out.println(Eliminados.toString());
        for (ConstructorBandeja Eliminado : Eliminados) {
            if ((Eliminado.getUsuarioRemitente() == "") && (Eliminado.getMailCuerpo() == "") && (Eliminado.getMailCuerpo() == "") && (Eliminado.getMailHoraEnvio() == "") && (Eliminado.getMailFechaEnvio() == "") && (Eliminado.getMailStatus() == ""));
            System.out.println("No tienes correos eliminados actuales");
        }
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 2: 
                System.out.println("Redireccionando al menu de bandejas....................2");
                MenuOpcionesBandeja();
                break;
            case 3: 
                System.out.println("Redireccionando al menu principal......................3");
                menuopcionesMain();
                break;
        }
    }
    
    public static void MenuOpcionesEliminados() {
        int Opcion;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Que desea hacer ahora?");
            System.out.println("Volver al menu de bandejas...................2");
            System.out.println("Volver al menu principal.....................3");
            Opcion = console.nextInt(); 
            Opciones(Opcion);
        } while (Opcion != 3);
    }
}
