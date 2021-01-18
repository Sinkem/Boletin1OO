public class Piratagochi {

    String nombre;
    int energia, nivelFelicidad;
    boolean estaHambriento;

    public Piratagochi(String nombre) {
        this.nombre = nombre;
        energia = 2;
        nivelFelicidad = 2;
        estaHambriento = false;
    }

    public void comer() {
        if (estaHambriento == true) {
            estaHambriento = false;
        } else {
            nivelFelicidad--;
        }
    }

    public void dormir(int horasDurmiendo) {
        int contador = 1;

        while (contador != horasDurmiendo) {
            if (energia <= 10) {
                energia++;
                if (energia > 10) {
                    energia = 10;
                }
            } else {
                nivelFelicidad--;
                if (nivelFelicidad < 1) {
                    nivelFelicidad = 1;
                }
            }
            contador++;
        }
    }

    public void jugar(int horasJugando) {
        int contador = 1;

        while (contador != horasJugando) {
            if (estaHambriento == true) {
                nivelFelicidad = nivelFelicidad + horasJugando;
                if (nivelFelicidad > 10) {
                    nivelFelicidad = 10;
                    estaHambriento = false;
                }
                energia--;
                if (energia < 1) {
                    energia = 1;
                }
            } else {
                energia--;
                if (energia < 1) {
                    energia = 1;
                }
                nivelFelicidad--;
                if (nivelFelicidad < 1) {
                    nivelFelicidad = 1;
                }
            }
        }
    }

    public String getNecesidades() {
        if (nivelFelicidad < 3) {
            System.out.println(nombre + " quiere jugar!");
        }
        if (estaHambriento = true) {
            System.out.println(nombre + " tine hambre :(");
        }
        if (energia < 3) {
            System.out.println(nombre + " esta cansado zzz");
        }
        return "";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivelFelicidad() {
        return this.nivelFelicidad;
    }

    public void setNivelFelicidad(int nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
    }

    public boolean isEstaHambriento() {
        return this.estaHambriento;
    }

    public void setEstaHambriento(boolean estaHambriento) {
        this.estaHambriento = estaHambriento;
    }

}
