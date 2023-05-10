/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Usuarios;

import java.util.ArrayList;
import java.util.Scanner;
import static mail.Main.Main.menuopcionesMain;

/**
 *
 * @author Sebas
 */
public class Usuarios {
    
    static ArrayList <ConstructorUsuarios> usuarios = new ArrayList<>();
    
    static int ID, Confirmacion;
    
    static String Usuario, Nombre;
    
    static Scanner console = new Scanner (System.in);

    static void AgregarUsuario(){
        System.out.println("Agrega un nuevo usuario: ");
        System.out.println("Ingresa un ID para este usuario: ");
        ID = console.nextInt();
        System.out.println("Ingrese la direccion de correo electronico de este nuevo usuario: ");
        Usuario = console.next();
        System.out.println("Ingrese un nombre: ");
        Nombre = console.next();
        Nombre = console.next();
        Nombre = console.nextLine();
        System.out.println("Deseas guardar el contaacto? Revisa los cambios antes de aceptar");
        System.out.println("1. Si");
        System.out.println("2. No");
        Confirmacion = console.nextInt();
        if (Confirmacion == 1){
            System.out.println("El contacto se ha agregado exitosamente");
            usuarios.add(new ConstructorUsuarios(ID, Usuario, Nombre));
        } else {
        if (Confirmacion == 0) {
            System.out.println("El contacto no se agregara");
        }
        }
    }
    
    static void LeerLista() {
        System.out.println(usuarios.toString());
    }
    
    static void ActualizarContacto() {
        System.out.println("Escriba el ID del contacto que desea actualizar");
        ID = console.nextInt();
        System.out.println("Actualice la direccion de correo electronico");
        Usuario = console.next();
        System.out.println("Actualice el nombre");
        
    }
    
    static void EliminarUsuario() {
        System.out.println("Ingrese el ID del usuario para eliminar");
        System.out.print("ID: ");
        int ID=console.nextInt();
        usuarios.remove(ID);
        System.out.println("El continente se ha eliminado de forma exitosa");
    }
    
    static void Menu() {
        System.out.println("Que deseas hacer?");
        System.out.println("Añadir usuarios...............................1");
        System.out.println("Leer lista de usuarios........................2");
        System.out.println("Eliminar usuario..............................3");
        System.out.println("");
    }
    
    static void Opciones (int Opcion) {
        switch (Opcion) {
            case 1: menuopcionesMain(); break; 
            case 2: AgregarUsuario(); break;
            case 3: LeerLista(); break; 
            case 4: EliminarUsuario(); break;
        }
    }
    
    public static void MenuOpcionesUsuario() {
        int Opcion;
        do {
            Menu();
            Opcion = console.nextInt();
            Opciones (Opcion);
        } while( Opcion !=1);
    }
}