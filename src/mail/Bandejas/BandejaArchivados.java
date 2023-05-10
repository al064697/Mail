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
public class BandejaArchivados {
    
    static ArrayList <ConstructorBandeja> CorreosArchivados = new ArrayList<ConstructorBandeja>();
    
    public static void MensajesArchivados() {
        CorreosArchivados.add(new ConstructorBandeja("no-reply@coinbase.com", "¡Todo está listo para que pueda invertir!", "Hemos verificado su cuenta...", "18:10", "08/01/2023", "Leido"));
        CorreosArchivados.add(new ConstructorBandeja("friends@unsplash.com", "Welcome to Unsplash", "[Enlace]", "17:58", "08/01/2023", "No leido"));
        CorreosArchivados.add(new ConstructorBandeja("googlenews-noreply@google.com", "Resumen de noticias de hoy", "[Enlace]", "15:20", "07/01/2023", "No leido"));
        CorreosArchivados.add(new ConstructorBandeja("no-reply@email.tp-link.com", "Your password has been changed", "[Texto]", "04:15", "08/01/2023", "Leido"));
        CorreosArchivados.add(new ConstructorBandeja("no-reply@email.tp-link.com","TP-Link ID: Your password was changed","Hi...","23:18","07/01/2023","Leido"));
        CorreosArchivados.add(new ConstructorBandeja("noreply@hola.hey.in","¡Hey! Lee el newsletter del 6 de enero por Hey Media","Quizá este año la cuesta de enero cueste menos...","","","No leido"));
        System.out.println("in: Spam");
        for (ConstructorBandeja CorreosArchivado : CorreosArchivados) {
            System.out.println(CorreosArchivado.toString());
            
        }
    }
    
    public static void ClasificarMensajesArchivados() {
        ArrayList<ConstructorBandeja> MensajesLeidos = new ArrayList<ConstructorBandeja>();
        ArrayList<ConstructorBandeja> MensajesNoLeidos = new ArrayList<ConstructorBandeja>();
        for (ConstructorBandeja CorreosArchivado : CorreosArchivados) {
            if (CorreosArchivado.getMailStatus() == "Leido"){
                MensajesLeidos.add(new ConstructorBandeja(CorreosArchivado.getUsuarioRemitente(), CorreosArchivado.getMailAsunto(), CorreosArchivado.getMailCuerpo(), CorreosArchivado.getMailHoraEnvio(), CorreosArchivado.getMailFechaEnvio(),CorreosArchivado.getMailStatus()));
            } else
                if (CorreosArchivado.getMailStatus() == "No leido") {
                MensajesNoLeidos.add(new ConstructorBandeja(CorreosArchivado.getUsuarioRemitente(), CorreosArchivado.getMailAsunto(), CorreosArchivado.getMailCuerpo(), CorreosArchivado.getMailHoraEnvio(), CorreosArchivado.getMailFechaEnvio(),CorreosArchivado.getMailStatus()));

                }
        }
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 2: 
                System.out.println("Redireccionando al menu de bandejas......2");
                MenuOpcionesBandeja();
                break;
            case 3: 
                System.out.println("Redireccionando al menu principal........3");
                menuopcionesMain();
                break;
        }
    }
    
    public static void MenuOpcionesArchivados() {
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
