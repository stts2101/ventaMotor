package Venta;

public class Cliente {
    protected String rutCliente;
    protected String nombreCliente;
    protected String emailCliente;

    public Cliente(String rutCliente, String nombreCliente, String emailCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
