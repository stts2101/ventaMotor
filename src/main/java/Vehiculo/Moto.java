package Vehiculo;

public class Moto extends Vehiculo{
    private float potenciaMoto;
    private String tipoMotor;
    private String suspencion;

    public Moto(String marcaVehi, String modeloVehi, String anyoVehi, float pesoVehi, float potenciaMoto, String tipoMotor, String suspencion) {
        super(marcaVehi, modeloVehi, anyoVehi, pesoVehi);
        this.potenciaMoto = potenciaMoto;
        this.tipoMotor = tipoMotor;
        this.suspencion = suspencion;
    }

    @Override
    public float velocidadVehi() {
        float veloM = 0;
        veloM = (getPotenciaMoto()*2 / getPesoVehi()) *20;
        return veloM;
    }

    public float getPotenciaMoto() {
        return potenciaMoto;
    }

    public void setPotenciaMoto(float potenciaMoto) {
        this.potenciaMoto = potenciaMoto;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getSuspencion() {
        return suspencion;
    }

    public void setSuspencion(String suspencion) {
        this.suspencion = suspencion;
    }
}
