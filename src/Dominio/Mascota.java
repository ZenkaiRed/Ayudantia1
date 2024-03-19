package Dominio;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private String raza;
    private String rutDueño;


    public Mascota(String nombre, String especie, int edadEnMeses, String raza, String rutDueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edadEnMeses;
        this.raza = raza;
        this.rutDueño = rutDueño;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRutDueño() {
        return rutDueño;
    }

    public void setRutDueño(String rutDueño) {
        this.rutDueño = rutDueño;
    }
}
