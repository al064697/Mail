/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Bandejas;

import java.util.ArrayList;
import java.util.Scanner;
import static mail.Bandejas.MenuBandeja.MenuOpcionesBandeja;
import static mail.CrearEnviarCorreo.soutNuevoCorreo;
import mail.ConstructorCrearEnviarCorreo;
import static mail.Main.Main.menuopcionesMain;

/**
 *
 * @author Sebas
 */
public class BandejaEnviados {
    
    public static void MensajesEnviados() {
        System.out.println("in: Send");
        String Remitente = "al064697@uacam.mx";
        ArrayList <ConstructorCrearEnviarCorreo> NuevosMensajes = new ArrayList<>();
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "manmay21@gmail.com", "Publicidad para Ranks", "[Archivo]", "06: 29", "07/05/2023"));
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "edcaamall@uacam.mx", "Codigo de modulos de control", "[Archivos Java]", "14:35", "04/05/2023"));
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "brayanchanpacheco@gmail.com", "Programa cajero", "Wey no se que hacer, please give me ideas jajaja", "18:00", "04/05/2023"));
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "soporte@amazon.org", "Devolucion", "Hola, quisiera devolver...", "10:20", "30/04/2023"));
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "ricaleo@gmail.com", "Factura electronica 25-04-23", "[Archivo PDF]", "17:48", "25/04/2023"));
        NuevosMensajes.add(new ConstructorCrearEnviarCorreo(Remitente, "denifu09@gmail.com", "Factura AT&T 15-04-2023", "[Archivo PDF]", "14:00", "16/04/2023"));
        System.out.println(NuevosMensajes.toString());
        soutNuevoCorreo();
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 2: 
                System.out.println("Redireccionando al menu de bandejas..................2");
                MenuOpcionesBandeja();
                break;
            case 3: 
                System.out.println("Redireccionando al menu principal....................3");
                menuopcionesMain();
                break;
        }
    }
    
    public static void MenuOpcionesEnviados() {
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
