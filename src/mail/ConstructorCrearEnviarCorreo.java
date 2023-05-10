/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail;

/**
 *
 * @author Sebas
 */
public class ConstructorCrearEnviarCorreo {
    
    static String Remitente;
    static String Destinatario;
    static String Asunto;
    static String Cuerpo;
    static String HoraEnvio;
    static String FechaEnvio;

    public ConstructorCrearEnviarCorreo() {
    }
    
    public ConstructorCrearEnviarCorreo(String Remitente, String Destinatario, String Asunto, String Cuerpo, String HoraEnvio, String FechaEnvio) {
        this.Remitente = Remitente;
        this.Destinatario = Destinatario;
        this.Asunto = Asunto;
        this.Cuerpo = Cuerpo;
        this.Cuerpo = Cuerpo;
        this.HoraEnvio = HoraEnvio;
        this.FechaEnvio = FechaEnvio;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        ConstructorCrearEnviarCorreo.Remitente = Remitente;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        ConstructorCrearEnviarCorreo.Destinatario = Destinatario;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        ConstructorCrearEnviarCorreo.Asunto = Asunto;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        ConstructorCrearEnviarCorreo.Cuerpo = Cuerpo;
    }
    
    public String getHoraEnvio() {
        return HoraEnvio;
    } 
    
    public void setHoraEnvio(String HoraEnvio) {
        this.HoraEnvio = HoraEnvio;
    }
    
    public String getFechaEnvio() {
        return FechaEnvio;
    }
    
    public void setFechaEnvio(String FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }
    
    @Override
    public String toString() {
        return Remitente + "" + "|" + Destinatario + "" + "|" + "" + Asunto  + "" + "|" + "" + Cuerpo  + "" + "|" + "" + HoraEnvio + "" + "|" + "" + FechaEnvio;
    }
}