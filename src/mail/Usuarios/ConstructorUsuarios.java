
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Usuarios;

/**
 *
 * @author Sebas
 */
public class ConstructorUsuarios {
    
    private int ID;
    private String Usuario;
    private String Nombre;

    public ConstructorUsuarios() {
    }

    public ConstructorUsuarios(int ID, String Usuario, String Nombre) {
        this.ID = ID;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }
 
    @Override
    public String toString() {
        return "Usuario:" + ID + "" + "|" + "" + Usuario + "" + "|" + "" + Nombre;
    }
    
    
}
