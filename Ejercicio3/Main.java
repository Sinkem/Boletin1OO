package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca el nombre de la segunda persona: ");
        String n = scn.next();

        System.out.println("Introduzca los apellidos: ");
        String a = scn.next();

        System.out.println("Introduzca la edad: ");
        int e = scn.nextInt();
        if (e <= 0 || e > 110) {
            System.out.println("Introduzca una edad valida: ");
            e = scn.nextInt();
        }
        System.out.println("Introduzca el sexo: ");
        char s = scn.next().charAt(0);

        Persona persona2 = new Persona(n, a, e, s);

        persona1.getNombre();
        persona1.getApellidos();
        persona1.getEdad();
        persona1.getSexo();

        persona2.getNombre();
        persona2.getApellidos();
        persona2.getEdad();
        persona2.getSexo();

        Persona.saludar(persona1, persona2);

        scn.close();
    }
}
