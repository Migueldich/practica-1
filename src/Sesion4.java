import java.util.Scanner;

public class Sesion4 {
    public static void primosGemelos() {
        int m = Sesion3.leerNumero(1, 500);
        int contador = 1;
        for (int j = Sesion3.leerNumero(m, 500); m < j; m++) {
            int i = m + 2;
            if (Sesion3.esPrimo(m) == true && Sesion3.esPrimo(i) == true) {
                System.out.printf("%2d. %5d %5d \n", contador, m, i);
                contador++;
            }
        }
    }

    public static void mostrarSumasDePrimos(int n1) {
        n1=Sesion3.leerNumero(4, 1000);
        int j=0;
        for (int i = 2; i<n1; i++){
            j= n1-i;
            if (Sesion3.esPrimo(i) == true && Sesion3.esPrimo(j)== true && j!=1 && j>i){
                System.out.println( i + " + " + j + " = " + n1);
            }
        }

    }

    public static double potencia(double num1, double exponente) {
        double multiplo = 1;
        while (exponente > 0) {
            return num1 * potencia(num1, exponente--);
        }
        return potencia(num1, exponente);

    }

    public static void main(String[] args) {
        int n3 = 1;
        mostrarSumasDePrimos(n3);
        int n1 = Sesion3.leerNumero(-100, 100);;
        int n2 = Sesion3.leerNumero(0, 10);;
        potencia(n1, n2);
    }


}