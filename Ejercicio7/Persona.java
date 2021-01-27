package Ejercicio7;

public class Persona {

    private String nombre, apellidos;
    private int edad;
    private char sexo;
    private double saldo = 0;
    private Cuenta cuentaCorriente = null;

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

    public void crearCuenta(String iban, int nc, double interesMensual) {
        cuentaCorriente = new Cuenta(iban, nc, interesMensual);
    }

    public boolean sacarDinero(double dinero) {
        boolean exitoMetodo = false;

        if (cuentaCorriente != null && saldo > 0) {
            boolean exitoOperacion = cuentaCorriente.retirar(dinero);

            exitoMetodo = true;

            return exitoOperacion;
        } else {
            System.out.println("No existe cuenta");

            exitoMetodo = false;
        }

        return exitoMetodo;
    }

    public boolean ingresarDinero(double cantidad) {
        boolean exitoMetodo = false;

        if (cuentaCorriente != null) {
            saldo = saldo + cantidad;

            exitoMetodo = true;
        } else {
            System.out.println("No se puede realizar la operacion");

            exitoMetodo = false;
        }

        return exitoMetodo;
    }

    public boolean hacerTransferenciaA(Persona p, double cantidad) {
        boolean exitoMetodo = false;

        if (cuentaCorriente != null && saldo >= cantidad) {
            saldo = saldo - cantidad;

            p.ingresarDinero(cantidad);
            exitoMetodo = true;
        } else {
            System.out.println("No se puede realizar la operacion");

            exitoMetodo = false;
        }

        return exitoMetodo;
    }

    public void cerrarCuenta() {
        cuentaCorriente = null;
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

    public double getSaldo() {
        return saldo;
    }
}
