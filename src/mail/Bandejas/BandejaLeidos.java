/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Bandejas;

import java.util.ArrayList;
import java.util.Scanner;
import static mail.Bandejas.BandejaArchivados.ClasificarMensajesArchivados;
import static mail.Bandejas.BandejaNoDeseado.ClasificarMensajesNoDeseados;
import static mail.Bandejas.MenuBandeja.MenuOpcionesBandeja;
import static mail.Main.Main.menuopcionesMain;
import static mail.resources.Colors.ANSI_CYAN;
import static mail.resources.Colors.ANSI_WHITE;

/**
 *
 * @author Sebas
 */
public class BandejaLeidos {
    
    public static void MensajesLeidos(){
        ArrayList<ConstructorBandeja> MensajesLeidos = new ArrayList<>();
        System.out.println("in: Read");
        MensajesLeidos.add(new ConstructorBandeja("al064909@uacam.mx", "[Sin asunto]", "Miss u...", "02:43","06/05/2023", "Leido"));
        MensajesLeidos.add(new ConstructorBandeja("rrsalaza@uacam.mx", "Fecha de entrega mañana: \"Tarea 5...\"", "[Cuerpo parcialmente no visible debido a que es muy largo]", "23:58", "04/05/2023", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("rrsalaza@uacam.mx", "Nueva tarea: \"Examen Ordinario\"", "[Cuerpo parcialmente no visible debido a que es muy largo]", "20:16", "04/05/2023", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("rrsalaza@uacam.mx", "Nueva tarea: \"Cuestionario y Ejercicios (35%)\"", "[Cuerpo parcialmente no visible debido a que es muy largo]", "20:12", "04/05/2023", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("rrsalaza@uacam.mx", "Nueva tarea: \"2o. Examen Estandarizado (10%)\"", "[Cuerpo parcialmente no visible debido a que es muy largo]", "20:09", "04/05/2023", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("avisosuacam@uacam.mx", "Invitacion a la conferencia \"Problemas de...\"", "[Cuerpo parcialmente no visible debido a que es muy largo]", "16:54", "04/05/2023", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("edcaamal@uacam.mx","Programa de mail", "Te recuerdo finalizar el programa que quedo pendiente... ", "14:56", "04/05/2023", "Leido"));
        MensajesLeidos.add(new ConstructorBandeja("marketing@engage.canva.com", "Relajate con el #CanvaDesignChallenge de esta semana", "Tu desafio: colorea con dibujo", "16:06", "03/05/2023)", "No leido"));
        MensajesLeidos.add(new ConstructorBandeja("manmay21@gmail.com", "Nueva publicacion de Ranks", "No se te vaya a pasar la fecha porfa tio", "21:45", "29/04/2023", "Leido"));
        MensajesLeidos.add(new ConstructorBandeja ("al064124@uacam.mx", "Actualizando Campeche ingresos", "Tenemos que ir viendo el dinero que...", "03:57", "03/11/22", "Leido"));
        for (ConstructorBandeja constructorBandeja : MensajesLeidos) {
            if (constructorBandeja.getMailStatus() == "Leido") {
                System.out.println( ANSI_WHITE + constructorBandeja.getUsuarioRemitente() +  ""  + "|" + "" + constructorBandeja.getMailAsunto() + "" + "|"+ "" + constructorBandeja.getMailCuerpo() + "" + "|"+ "" + ANSI_CYAN + constructorBandeja.getMailStatus());
            }
        }
        ClasificarMensajesArchivados();
        ClasificarMensajesNoDeseados();
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
    
    public static void MenuOpcionesLeidos() {
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
