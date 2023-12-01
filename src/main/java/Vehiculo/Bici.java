package Vehiculo;

public class Bici extends Vehiculo{
    public Bici(String marcaVehi, String modeloVehi, String anyoVehi, float pesoVehi) {
        super(marcaVehi, modeloVehi, anyoVehi, pesoVehi);
    }

    @Override
    public float velocidadVehi() {
        return 0;
    }
}
