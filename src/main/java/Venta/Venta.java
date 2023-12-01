package Venta;

import Vehiculo.*;
import java.util.ArrayList;

public class Venta {
    private ArrayList<AutoM> autos;
    private ArrayList<Moto> motos;
    private ArrayList<Bici> bicis;
    public static void main(String[] args){
        generarVenta();
    }

    public Venta(ArrayList<AutoM> autos, ArrayList<Moto> motos, ArrayList<Bici> bicis) {
        this.autos = autos;
        this.motos = motos;
        this.bicis = bicis;
    }
    public void generarVenta(){
        Cliente c1 = new Cliente("","","");

    }
}
