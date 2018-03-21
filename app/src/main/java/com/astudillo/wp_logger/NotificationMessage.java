package com.astudillo.wp_logger;

/**
 * Created by astudillo on 3/19/18.
 */

public class NotificationMessage {
    private String contacto;
    private String mensaje;

    public NotificationMessage(String contacto, String mensaje){
        this.contacto = contacto;
        this.mensaje = mensaje;
    }

    public String GetContacto(){ return this.contacto; }
    public void SetContacto(String val) { this.contacto = val; }
    public String GetMensaje() { return this.mensaje; }
    public void SetMensaje(String val) { this.mensaje = val; }
}
