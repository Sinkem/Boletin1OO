package Ejercicio6;

import java.util.Scanner;

public class Cuenta {

    String iban;
    int numeroCuenta;
    double saldo, interesMensual;
    boolean descubierta;

    public Cuenta(String iban, int nc, double interesMensual) {
        Scanner scn = new Scanner(System.in);

        this.iban = iban;
        iban = scn.next();
        this.numeroCuenta = nc;
        nc = scn.nextInt();
        this.interesMensual = interesMensual;
        interesMensual = scn.nextDouble();
    }

    public void ingresar(double dinero) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce la cantidad a ingresar: ");
        dinero = scn.nextDouble();
        saldo = saldo + dinero;
        System.out.println("Saldo: " + saldo);
    }

    public boolean retirar(double dinero) {
        boolean exito;

        if (descubierta == true) {
            System.out.println("No puedes realizar esta operacion, tu cuenta esta descubierta");
            exito = false;
        } else {
            Scanner scn = new Scanner(System.in);

            System.out.println("Introduce la cantidad a retirar: ");
            dinero = scn.nextDouble();
            saldo = saldo + dinero;

            System.out.println("Saldo: " + saldo);
            exito = true;
        }
        return exito;
    }

    public boolean hacerTransferenciaA(Cuenta c, double cantidad) {
        boolean exito;

        if (descubierta == true) {
            System.out.println("No puedes realizar esta operacion, tu cuenta esta descubierta");
            exito = false;
        } else {
            Scanner scn = new Scanner(System.in);

            System.out.println("Introduce la cantidad a transferir: ");
            cantidad = scn.nextDouble();
            saldo = saldo + cantidad;

            System.out.println("Saldo: " + saldo);
            exito = true;
        }
        return exito;
    }

    public double beneciosFuturos(int numMeses) {
        double beneficios = 0.0;
        int contador = 1;

        while (contador < numMeses) {
            beneficios = saldo * interesMensual;
            contador++;
        }

        System.out.println("En " + numMeses + " meses tendrás un beneficio " + beneficios);
        return beneficios;
    }

    public String toString() {
        return "iban: " + iban + " Numero de cuenta: " + numeroCuenta + " Saldo: " + saldo + " Interes mensual: "
                + interesMensual + " Descubierta: " + descubierta;
    }

    public String getIban() {
        return this.iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        Scanner scn = new Scanner(System.in);

        saldo = scn.nextInt();
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresMensual() {
        return this.interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public boolean isDescubierta() {
        if (saldo < 0) {
            descubierta = true;
        } else {
            descubierta = false;
        }
        return this.descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

}
