package Vehiculo;

public abstract class Vehiculo {
    protected String marcaVehi;
    protected String modeloVehi;
    protected String anyoVehi;
    protected float pesoVehi;

    public Vehiculo(String marcaVehi, String modeloVehi, String anyoVehi, float pesoVehi) {
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

    public float getPesoVehi() {
        return pesoVehi;
    }

    public void setPesoVehi(float pesoVehi) {
        this.pesoVehi = pesoVehi;
    }
    public abstract float velocidadVehi();
}
