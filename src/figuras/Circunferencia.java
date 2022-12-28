package figuras;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    private static final double PI = 3.1416;

/**Imprime el diámetro y calcula el área*/
    public void imprimir() {
        int diametro= (int) (2 * radio);
        String color = "rojo";
        System.out.println("Di�metro: " + diametro);
        System.out.println("Color: " + color);

        System.out.println(calcularArea());
    }

    /**Extraer el cálculo del área a un método llamado calcularArea*/
    int calcularArea(){
        double area = 2 * PI * radio * radio;
        return (int) area;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}

