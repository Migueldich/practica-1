import java.sql.SQLOutput;
import java.util.Scanner;

class Sesion3 {

    static int menu(int num1) {
        // primera funcion, lo que hace es comprobar que un numero esta comprendido entre 1 y 6 y devuelve ese numero
        Scanner uno = new Scanner(System.in);
        num1 = uno.nextInt();
        // lee el numero que le damos
        while (num1 < 0 || num1 > 6) {
            // mientras el numero que pongamos no este comprendido entre 1 y 6:
            System.out.println("ese no se puede");
            System.out.println("Escriba un numero entre 1 y 6");
            num1 = uno.nextInt();
            //te vuelve a pedir el numero
        }
        return num1;
       // si el numero esta comprendido entre 1 y 6 lo devuelve
    }

    static int leerNumero(int n1, int n2) {
        //hace lo mismo que la funcion menu pero esta
        System.out.println("Escriba un numero entre " + n1 + " y " + n2);
        Scanner tres = new Scanner(System.in);
        int n3;
        n3 = tres.nextInt();
        while (n3 < n1 || n3 > n2) {
            System.out.print("Ese no sirve, elige un numero comprendido entre " + n1 + " y " + n2 + " ");
            n3 = tres.nextInt();
        }
        return n3;
    }

    static boolean esPrimo(int num1) {
        Scanner uno = new Scanner(System.in);
        boolean primo = true;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                primo = false;
                return primo;
            }
        }
        if (primo)
            return primo;

        return primo;
    }

    static void escribePrimos(int n) {
        Scanner uno = new Scanner(System.in);
        int num = 2;
        int j = 1;
        while (j <= n) {
            boolean esPrimo = true;
            for (int m = 2; m < num; m++) {
                if (num % m == 0)
                    esPrimo = false;
            }
            if (esPrimo) {
                System.out.printf("%8d", num);
                if (j % 4 == 0)
                    System.out.printf("\n");
                j++;
            }
            num++;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner dos = new Scanner(System.in);
        int num5 = 1;
        while (num5 != 0) {
            System.out.print("1. Comprobar si un numero es primo \n" +
                    "2. Escribir los n primeros numeros primos \n" +
                    "3. Escribir numeros primos gemelos entre dos valores\n" +
                    "4. Numero par como suma de dos primos\n" +
                    "5. Comprobar si un numero es primo de manera recursiva\n" +
                    "6. Calcular potencia \n" +
                    "0. Finalizar la ejecucion\n " +
                    "Escriba un numero comprendido entre 1 y 6: ");
            num5 = menu(num5);
            switch (num5) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    int n1 = leerNumero(1, 1000);
                    if (esPrimo(n1) == true) {
                        System.out.println("el numero " + n1 + " es primo");
                    } else {
                        System.out.println(" el numero " + n1 + " no es primo ");
                    }
                    break;
                case 2:
                    System.out.println("Escriba cuantos numeros primos quiere: ");
                    int contadorNumPrimos = leerNumero(5, 20);
                    escribePrimos(contadorNumPrimos);
                    break;
                case 3:
                    System.out.println("Escribir numeros primos gemelos entre dos valores");
                    break;
                case 4:
                    System.out.println("Numero par como suma de dos primos");
                    break;
                case 5:
                    System.out.println("Comprobar si un numero es primo de manera recursiva");
                    break;
                case 6:
                    System.out.println("Calcular potencia ");
                    break;

            }
        }
    }
}