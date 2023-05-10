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
public class BandejaNoDeseado {
             
    public static void MensajesNoDeseados() {
        System.out.println("in: Spam");
        ArrayList <ConstructorBandeja> CorreosNoDeseados = new ArrayList <ConstructorBandeja>();
        CorreosNoDeseados.add(new ConstructorBandeja("dispatch@nexo.com", "Dispatch #138: Banking Crisis? “No Problem!” Says Powell", "[Enlace]", "10:18", "05/05/2023", "No leido"));
        CorreosNoDeseados.add(new ConstructorBandeja("noreply@amazon.com.mx", "Esta semana: Cupones para...", "[Enlace]", "", "", ""));
        CorreosNoDeseados.add(new ConstructorBandeja("community@nexo.com", "See the Promo Rates You Can Start Earning Today", "[Enlace]", "12:35", "21/04/2023", "Leido"));
        CorreosNoDeseados.add(new ConstructorBandeja("noreply@amazon.com.mx", "¡Felicidades! Eres elegible para 3 meses GRATIS", "[Enlace]", "", "", ""));
        CorreosNoDeseados.add(new ConstructorBandeja("servicioalcliente@hey.inc", "Estado de Cuenta (03/2023)", "[Enlace]", "10:47", "12/04/23", "No leido"));
        for (ConstructorBandeja CorreosNoDeseado : CorreosNoDeseados) {
            System.out.println(CorreosNoDeseado.toString());
        }
    }
    
    public static void ClasificarMensajesNoDeseados() {
        ArrayList <ConstructorBandeja> CorreosNoDeseados = new ArrayList <ConstructorBandeja>();
        CorreosNoDeseados.add(new ConstructorBandeja("dispatch@nexo.com", "Dispatch #138: Banking Crisis? “No Problem!” Says Powell", "[Enlace]", "10:18", "05/05/2023", "No leido"));
        CorreosNoDeseados.add(new ConstructorBandeja("noreply@amazon.com.mx", "Esta semana: Cupones para...", "[Enlace]", "", "", ""));
        CorreosNoDeseados.add(new ConstructorBandeja("community@nexo.com", "See the Promo Rates You Can Start Earning Today", "[Enlace]", "12:35", "21/04/2023", "Leido"));
        CorreosNoDeseados.add(new ConstructorBandeja("noreply@amazon.com.mx", "¡Felicidades! Eres elegible para 3 meses GRATIS", "[Enlace]", "", "", ""));
        CorreosNoDeseados.add(new ConstructorBandeja("servicioalcliente@hey.inc", "Estado de Cuenta (03/2023)", "[Enlace]", "10:47", "12/04/23", "No leido"));
        ArrayList<ConstructorBandeja> MensajesLeidos = new ArrayList<ConstructorBandeja>();
        ArrayList<ConstructorBandeja> MensajesNoLeidos = new ArrayList<ConstructorBandeja>();
        for (ConstructorBandeja CorreoNoDeseado : CorreosNoDeseados) {
            if (CorreoNoDeseado.getMailStatus() == "Leido"){
                MensajesLeidos.add(new ConstructorBandeja(CorreoNoDeseado.getUsuarioRemitente(), CorreoNoDeseado.getMailAsunto(), CorreoNoDeseado.getMailCuerpo(), CorreoNoDeseado.getMailHoraEnvio(), CorreoNoDeseado.getMailFechaEnvio(),CorreoNoDeseado.getMailStatus()));
            } else {
                if (CorreoNoDeseado.getMailStatus() == "No leido") {
                    MensajesNoLeidos.add(new ConstructorBandeja(CorreoNoDeseado.getUsuarioRemitente(), CorreoNoDeseado.getMailAsunto(), CorreoNoDeseado.getMailCuerpo(), CorreoNoDeseado.getMailHoraEnvio(), CorreoNoDeseado.getMailFechaEnvio(),CorreoNoDeseado.getMailStatus()));  
                }
            }
        }
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 1: 
                System.out.println("Redireccionando al menu de bandejas");
                MenuOpcionesBandeja();
                break;
            case 2: 
                System.out.println("Redireccionando al menu principal");
                menuopcionesMain();
                break;
        }
    }
    
    public static void MenuOpcionesNoDeseado() {
        int Opcion;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Que desea hacer ahora?");
            System.out.println("Volver al menu de bandejas...................1");
            System.out.println("Volver al menu principal.....................2");
            Opcion = console.nextInt(); 
            Opciones(Opcion);
        } while (Opcion != 2);
    }
}