public class Cuadrado {

    private int lado, area;

    public Cuadrado() {
        lado = 6;
    }

    public int getLado() {
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        area = lado * lado;
        return area;
    }

    public void printCuadrado() {
        if (lado >= 2) {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado();

        cuadrado1.printCuadrado();
    }

}
