package GestorArchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Venta.*;
import Vehiculo.*;

public class GestorArchivo {
    public static boolean guardarDatos(Venta venta, String direccionArchivo) {
        direccionArchivo = "Venta.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            // Si el documento no es nuevo y tiene datos registrados, añadir una nueva línea
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(venta.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al relizar compra, favor contactar con administrador");
            return false;
        }
    }
}
