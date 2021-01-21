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

}
