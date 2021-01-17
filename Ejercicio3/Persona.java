package Ejercicio3;

import java.util.Scanner;

public class Persona {

    private String nombre, apellidos;
    private int edad;
    private char sexo;

    public Persona() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca el nombre de la primera persona: ");
        nombre = scn.next();
        System.out.println("Introduzca los apellidos: ");
        apellidos = scn.next();
        System.out.println("Introduzca la edad: ");
        edad = scn.nextInt();
        if (edad <= 0 || edad > 110) {
            System.out.println("Introduzca una edad valida: ");
            edad = scn.nextInt();
        }
        System.out.println("Introduzca el sexo: ");
        sexo = scn.next().charAt(0);

    }

    public Persona(String n, String a, int e, char s) {
        Scanner scn = new Scanner(System.in);

        this.nombre = n;
        System.out.println("Introduzca el nombre de la segunda persona: ");
        n = scn.next();
        this.apellidos = a;
        System.out.println("Introduzca los apellidos: ");
        a = scn.next();
        this.edad = e;
        System.out.println("Introduzca la edad: ");
        e = scn.nextInt();
        if (edad <= 0 || edad > 110) {
            System.out.println("Introduzca una edad valida: ");
            edad = scn.nextInt();
        }
        this.sexo = s;
        System.out.println("Introduzca el sexo: ");
        s = scn.next().charAt(0);
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
