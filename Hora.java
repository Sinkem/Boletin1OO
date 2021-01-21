import java.util.Scanner;

public class Hora {

    int hora, minutos, segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        if (hora > 24 || hora < 0) {
            System.out.println("Pon una hora valida anda");
        }
        this.minutos = minutos;
        if (minutos > 60 || hora < 0) {
            System.out.println("Pon un minuto valido anda");
        }
        this.segundos = segundos;
        if (segundos > 60 || segundos < 0) {
            System.out.println("Pon un segundo valido anda");
        }
    }

    public void sumarSegundos() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce los segundos que quieras sumar");
        int segundosSumados = scn.nextInt();
        if (segundosSumados < 1) {
            System.out.println("Pon un numero valido");
            segundosSumados = scn.nextInt();
        }

        segundos = segundos + segundosSumados;

        while (segundos > 60) {
            segundos = segundos - 60;
            minutos++;
            if (minutos > 60) {
                hora++;
                if (hora > 24) {
                    hora = 0;
                }
            }
        }
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
