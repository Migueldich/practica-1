import java.util.Scanner;

class Sesion3 {

    static int menu(int num1) {
        // primera funcion, lo que hace es comprobar que un numero esta comprendido entre 1 y 6 y devuelve ese numero
        Scanner uno = new Scanner(System.in);
        System.out.println("1. Comprobar si un numero es primo \n" +
                "2. Escribir los n primeros numeros primos \n" +
                "3. Escribir numeros primos gemelos entre dos valores\n" +
                "4. Numero par como suma de dos primos\n" +
                "5. Comprobar si un numero es primo de manera recursiva\n" +
                "6. Calcular potencia \n" +
                "0. Finalizar la ejecucion\n " +
                "Escriba un numero comprendido entre 1 y 6: ");
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
        boolean primo = true;
        //se inicializa en true porque si falla, es cuando es falsa
        // creo una variable de tipo booleano que me va a decir si un numero es primo
        for (int i = 2; i < num1; i++) {
            //bucle que empieza desde dos y va aumentando hasta que es un valor menor (entero) que el numero que hemos puesto
            if (num1 % i == 0) {
                //si divido el numero entre cualquier menor a este y el resto es cero, ya no es primo (omitiendo el 1)
                primo = false;
                return primo;
                //me devuelve false
            }
        }
        if (primo)
            return primo;
        //como es de tipo booleano me devuelve el valor de primo (en este caso true)
        return primo;
    }

    static void escribePrimos(int n) {
        Scanner uno = new Scanner(System.in);
        int num = 2;
        int j = 1;
        while (j <= n) {
            //bucle que me sirve de contador hasta llegar al numero de numeros primos indicado
            boolean esPrimo = true;
            for (int m = 2; m < num; m++) {
                if (num % m == 0)
                    esPrimo = false;
            }
            //hace lo mismo que la funcion esPrimo
            if (esPrimo) {
                System.out.printf("%8d", num);
                //escribe el numero primo con formato en caso de que sea primo
                if (j % 4 == 0)
                    System.out.printf("\n");
                //cada vez que halla 4 numeros primos en la misma linea se hace un salto de linea
                j++;
                //al ser primo, añado uno al contador de numeros primos que tengo
            }
            num++;
            //sea primo o no, añado uno a la variable num para que mire si el siguiente numero es primo
        }
        System.out.println("\n");
        //simplemente para que quede bonito
    }

    public static void main(String[] args) {
        int num5 = 1;
        while (num5 != 0) {
            // como queremos que el codigo pare cuando escribamos 0, el bucle se cumplira mientras el valor que demos no sea 0, y empieza en uno para que la primera vez funcione al menos.
            num5 = menu(num5);
            //un switch simple en el que actua la funcion menu, para ver si el numero es valido.
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