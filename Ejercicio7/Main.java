package Ejercicio7;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("pepe", "pep", 18, 'H');
        Persona persona2 = new Persona("Manuel", "Borrachp", 45, 'H');

        persona1.crearCuenta("Sss", 8838, 8.2);
        persona2.crearCuenta("adfa", 12341234, 2.7);
        System.out.println(persona1.ingresarDinero(60000));
        System.out.println(persona1.sacarDinero(20000));
        System.out.println(persona1.hacerTransferenciaA(persona2, 10000));
        persona1.cerrarCuenta();
    }

}
