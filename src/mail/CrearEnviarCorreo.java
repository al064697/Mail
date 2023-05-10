/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail;

import mail.Usuarios.ConstructorUsuarios;
import mail.ConstructorCrearEnviarCorreo;
import java.util.ArrayList;
import java.util.Scanner;
import static mail.Main.Main.menuopcionesMain;


/**
 *
 * @author Sebas
 */
public class CrearEnviarCorreo {
    static ArrayList <ConstructorUsuarios> usuarios = new ArrayList<>();
    static ArrayList <ConstructorCrearEnviarCorreo> NuevoCorreo = new ArrayList<>();
    static Scanner console = new Scanner (System.in);
    static int ID, Confirmacion;
    static String Usuario, Nombre, Asunto, Cuerpo, Remitente, Hora, Fecha;
    
    public static void NuevoCorreo() {
        Remitente = "al064697@uacam.mx";
        System.out.print("Para: ");
        Usuario = console.next();
        System.out.println("Quieres agregar el contacto de correo electrónico?");
        System.out.println("1. Si");
        System.out.println("2. No");
        Confirmacion = console.nextInt();
        if (Confirmacion == 1){
            System.out.println("Agrega un ID al contacto: ");
            ID = console.nextInt(); 
            System.out.println("Agrega un nombre al contacto: ");
            Nombre = console.next();
            Nombre = console.nextLine();
            usuarios.add(new ConstructorUsuarios(ID, Usuario, Nombre));
            System.out.println("El contacto se ha agregado exitosamente");
        } else {
        if (Confirmacion == 0) {
            System.out.println("El contacto no se agregara");
        }
        }
        System.out.print("Asunto: ");
        Asunto = console.next();
        System.out.println("Mensaje...:");
        System.out.print("");
        Cuerpo = console.next();
        Cuerpo = console.nextLine();
        System.out.println("");
        System.out.println("A qué hora estás escribiendo este mesaje?");
        String Hora = console.next();
        System.out.println("En que fecha estas escribiendo este mensaje");
        Fecha = console.next();
        Fecha = console.nextLine();
        System.out.println("Quieres enviarlo");
        System.out.println("1. Si");
        System.out.println("2. No");
        Confirmacion = console.nextInt();
        if (Confirmacion == 1){
            NuevoCorreo.add(new ConstructorCrearEnviarCorreo(Remitente, Usuario, Asunto, Cuerpo, Hora, Fecha));
            System.out.println("El mensaje se ha enviado exitosamente");
        } else {
        if (Confirmacion == 0) {
            System.out.println("El mensaje no se enviara");
        }
    }
    }
    
    public static void soutNuevoCorreo() {
        System.out.println(NuevoCorreo.toString());
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
                case 1: 
                    System.out.println("Rediriendo al menu principal");
                    menuopcionesMain();
                    break;
            }
    }

    public static void MenuOpcionesNuevoCorreo(){
        int Opcion;
        do {
            System.out.println("Ir al menu principal?");
            System.out.println("Si........................................1");
            Opcion = console.nextInt();
            Opciones(Opcion);
        } while(Opcion != 1);
    }
}