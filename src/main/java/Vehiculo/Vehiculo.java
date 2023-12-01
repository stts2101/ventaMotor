package Vehiculo;

public abstract class Vehiculo {
    protected String marcaVehi;
    protected String modeloVehi;
    protected String anyoVehi;
    protected String pesoVehi;

    public Vehiculo(String marcaVehi, String modeloVehi, String anyoVehi, String pesoVehi) {
        this.marcaVehi = marcaVehi;
        this.modeloVehi = modeloVehi;
        this.anyoVehi = anyoVehi;
        this.pesoVehi = pesoVehi;
    }

    public String getMarcaVehi() {
        return marcaVehi;
    }

    public void setMarcaVehi(String marcaVehi) {
        this.marcaVehi = marcaVehi;
    }

    public String getModeloVehi() {
        return modeloVehi;
    }

    public void setModeloVehi(String modeloVehi) {
        this.modeloVehi = modeloVehi;
    }

    public String getAnyoVehi() {
        return anyoVehi;
    }

    public void setAnyoVehi(String anyoVehi) {
        this.anyoVehi = anyoVehi;
    }

    public String getPesoVehi() {
        return pesoVehi;
    }

    public void setPesoVehi(String pesoVehi) {
        this.pesoVehi = pesoVehi;
    }
}
