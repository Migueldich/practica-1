import java.util.Scanner;

public class Sesion4 {
    public static void primosGemelos() {
        int m = Sesion3.leerNumero(1, 500);
        //creo una variable que me lee un numero comprendido entre 1 y 500
        int contador = 1;
        //inicializo un contador que subira al encontrar parejas de primos
        for (int j = Sesion3.leerNumero(m, 500); m < j; m++) {
            //inicio in bucle que empieza en un numero comprendido entre el anterior valor y 500, y el anterior valor va subiendo hasta que m y j coinciden.
            int i = m + 2;
            //esto sirve para que busque la pareja, haciendo que si un numero es primo, y un numero dos valores mayor tambien lo es, se cumple la condicion de abajo.
            if (Sesion3.esPrimo(m) == true && Sesion3.esPrimo(i) == true) {
                System.out.printf("%2d. %5d %5d \n", contador, m, i);
                //los imprime con formato en el orden de contador, el primer valor que hemos introducido y ese valor mas dos.
                contador++;
            }
        }
    }

    public static void mostrarSumasDePrimos(int n1) {
        n1 = Sesion3.leerNumero(4, 1000);
        //la funcion leerNumero me lee un numero entre 4 y 1000
        for (int i = 2; i < n1; i++) {
            int j = n1 - i;
            //creo una variable que es igual a el numero que he introducido menos la variable que me encuentra numeros primos
            if (Sesion3.esPrimo(i) == true && Sesion3.esPrimo(j) == true && j >= i) {

                System.out.println(i + " + " + j + " = " + n1);
            }
        }

    }

    public static boolean esPrimoRecursivo(int n1) {
        while (n1 != 0) {// hacer
        }
        n1 = 0;
        return true;
    }

    public static double potencia(double base, double exponente) {
        if (base == 0) {
            //si la base es cero, la potencia siempre va a ser 0
            return 0;
        } else if (exponente == 0) {
            // si el exponente es 0, la potencia siempre va a dar 1, ya que x^0=1
            return 1;
        } else if (exponente != 1) {
            //si el numero es distintoa 1 (excluyendo el 0)
            return base * potencia(base, exponente - 1);
            // se hace la funcion de manera recursiva
        } else {
            //en caso de que sea1 me devuelve la base.
            return base;
        }

    }

    public static void main(String[] args) {
        Scanner dos = new Scanner(System.in);
        int num5 = 1;
        while (num5 != 0) {
            // como queremos que el codigo pare cuando escribamos 0, el bucle se cumplira mientras el valor que demos no sea 0, y empieza en uno para que la primera vez funcione al menos.
            num5 = Sesion3.menu(num5);
            //un switch simple en el que actua la funcion menu, para ver si el numero es valido.
            switch (num5) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    int n1 = Sesion3.leerNumero(1, 1000);
                    if (Sesion3.esPrimo(n1) == true) {
                        System.out.println("el numero " + n1 + " es primo");
                    } else {
                        System.out.println(" el numero " + n1 + " no es primo ");
                    }
                    break;
                case 2:
                    System.out.println("Escriba cuantos numeros primos quiere: ");
                    int contadorNumPrimos = Sesion3.leerNumero(5, 20);
                    Sesion3.escribePrimos(contadorNumPrimos);
                    break;
                case 3:
                    primosGemelos();
                    break;
                case 4:
                    int n3 = 1;
                    mostrarSumasDePrimos(n3);
                    break;
                case 5:
                    System.out.println("Comprobar si un numero es primo de manera recursiva");
                    break;
                case 6:
                    System.out.println("Calcular potencia ");
                    int n4 = Sesion3.leerNumero(-100, 100);
                    int n2 = Sesion3.leerNumero(0, 10);
                    System.out.println(n4 + " elevado a " + n2 + " es " + potencia(n4, n2));
                    break;

            }
        }


    }


}