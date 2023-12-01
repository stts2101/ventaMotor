package Vehiculo;

public class AutoM extends Vehiculo {
    private float potenciaAuto;
    private String nroPuerta;
    private String sizeMotor;

    public AutoM(String marcaVehi, String modeloVehi, String anyoVehi, float pesoVehi, float potenciaAuto, String nroPuerta, String sizeMotor) {
        super(marcaVehi, modeloVehi, anyoVehi, pesoVehi);
        this.potenciaAuto = potenciaAuto;
        this.nroPuerta = nroPuerta;
        this.sizeMotor = sizeMotor;
    }
    @Override
    public float velocidadVehi() {
        float veloA = 0;
        veloA = (getPotenciaAuto() / getPesoVehi()) *10;
        return veloA;
    }

    public float getPotenciaAuto() {
        return potenciaAuto;
    }

    public void setPotenciaAuto(float potenciaAuto) {
        this.potenciaAuto = potenciaAuto;
    }

    public String getNroPuerta() {
        return nroPuerta;
    }

    public void setNroPuerta(String nroPuerta) {
        this.nroPuerta = nroPuerta;
    }

    public String getSizeMotor() {
        return sizeMotor;
    }

    public void setSizeMotor(String sizeMotor) {
        this.sizeMotor = sizeMotor;
    }
}
