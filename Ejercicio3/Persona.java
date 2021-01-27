package Ejercicio3;

public class Persona {

    private String nombre, apellidos;
    private int edad;
    private char sexo;

    public Persona() {
        nombre = "Agustin";
        apellidos = "Agusto";
        edad = 8;
        sexo = 'H';

    }

    public Persona(String n, String a, int e, char s) {

        this.nombre = n;
        this.apellidos = a;
        this.edad = e;
        this.sexo = s;
    }

    public static void saludar(Persona persona1, Persona persona2) {
        System.out.println(persona1.nombre + " saluda a " + persona2.nombre);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
