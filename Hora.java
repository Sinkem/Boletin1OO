public class Hora {

    private int hora, minutos, segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        if (hora > 24 || hora < 0) {
            System.out.println("Pon una hora valida anda");
        }
        this.minutos = minutos;
        if (minutos > 60 || minutos < 0) {
            System.out.println("Pon un minuto valido anda");
        }
        this.segundos = segundos;
        if (segundos > 60 || segundos < 0) {
            System.out.println("Pon un segundo valido anda");
        }
    }

    public void sumarSegundos(int segundosSumados) {
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
        if (hora > 24 || hora < 0) {
            System.out.println("Pon una hora valida anda");
        }
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        if (minutos > 60 || minutos < 0) {
            System.out.println("Pon un minuto valido anda");
        }
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if (segundos > 60 || segundos < 0) {
            System.out.println("Pon un segundo valido anda");
        }
    }

}
