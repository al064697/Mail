/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mail.Bandejas;

/**
 *
 * @author Sebas
 */
public class ConstructorBandeja {
    
    private String usuarioRemitente;
    private String mailAsunto; 
    private String mailCuerpo;
    private String mailHoraEnvio;
    private String mailFechaEnvio;
    String mailStatus;

    public ConstructorBandeja() {
    }

    public ConstructorBandeja(String usuarioRemitente, String mailAsunto, String mailCuerpo, String mailHoraEnvio, String mailFechaEnvio, String mailStatus) {
        this.usuarioRemitente = usuarioRemitente;
        this.mailAsunto = mailAsunto;
        this.mailCuerpo = mailCuerpo;
        this.mailHoraEnvio = mailHoraEnvio;
        this.mailFechaEnvio = mailFechaEnvio;
        this.mailStatus = mailStatus;
    }

    public String getUsuarioRemitente() {
        return usuarioRemitente;
    }

    public void setUsuarioRemitente(String usuarioRemitente) {
        this.usuarioRemitente = usuarioRemitente;
    }

    public String getMailAsunto() {
        return mailAsunto;
    }

    public void setMailAsunto(String mailAsunto) {
        this.mailAsunto = mailAsunto;
    }

    public String getMailCuerpo() {
        return mailCuerpo;
    }

    public void setMailCuerpo(String mailCuerpo) {
        this.mailCuerpo = mailCuerpo;
    }

    public String getMailHoraEnvio() {
        return mailHoraEnvio;
    }

    public void setMailHoraEnvio(String mailHoraEnvio) {
        this.mailHoraEnvio = mailHoraEnvio;
    }

    public String getMailFechaEnvio() {
        return mailFechaEnvio;
    }

    public void setMailFechaEnvio(String mailFechaEnvio) {
        this.mailFechaEnvio = mailFechaEnvio;
    }

    public String getMailStatus() {
        return mailStatus;
    }
    
    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus;
    }
    
    @Override
    public String toString() {
        return usuarioRemitente + " " + "|" + " Asunto: " + mailAsunto + " " + "|" + " " + mailCuerpo + " " + "|" + " " + mailHoraEnvio + " " + "-" + " " + mailFechaEnvio + "" + "|" + "" + mailStatus;
    }

    
    public String getDatos() {
        return usuarioRemitente + " " + "|" + " " + mailAsunto + " " + "|" + " " + mailCuerpo + " " + "|" + " " + mailHoraEnvio + " " + "-" + " " + mailFechaEnvio + "" + "|" + "" + mailStatus;
    }
}