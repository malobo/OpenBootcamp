/**
 *
 * @author mjlb
 */
public class Tema3 {

    public static void main(String[] args) {
        // Ejercicio Tema 3 - Parte 1
        int resultado;
        int a = 10;
        int b = 20;
        int c = 30;
        resultado = sumar(a, b, c);
        System.out.println("El resultado de la función sumar con los parámetros (" + a + "," + b + "," + c
                + ") es igual a " + resultado);

        // Ejercicio Tema 3 - Parte 2
        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println("Después de llamar al procedimiento sumarPuerta del objeto miCoche, el objeto miCoche tiene "
                + miCoche.puertas + " puertas");

    }

    public static int sumar(int sumando1, int sumando2, int sumando3) {
        return sumando1 + sumando2 + sumando3;
    }
}

class Coche {
    public int puertas = 0;

    public void sumarPuerta() {
        this.puertas++;
    }

}
