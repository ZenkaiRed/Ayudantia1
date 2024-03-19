import Dominio.Cita;
import Dominio.Dueño;
import Dominio.Mascota;
import edu.princeton.cs.stdlib.StdOut;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Dueño dueño1 = new Dueño("Jose", "Ramos", "12345678-9", 21);

        Mascota mascota1 = new Mascota("Firulais", "Perro", 24, "Labrador", dueño1.getRut());

        Cita cita = new Cita(mascota1.getNombre(), dueño1.getRut(), "Cirujia", new Date());

        StdOut.println(cita.getNombreMascota());
        StdOut.println(cita.getRutDueño());
        StdOut.println(cita.getTipoConsulta());
        StdOut.println(cita.getFecha());

        StdOut.println("chao");

    }
}