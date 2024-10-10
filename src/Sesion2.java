import java.util.Scanner;
public class Sesion2 {
    public static void main(String[] args) {
        Scanner uno = new Scanner(System.in);
        // para escribir por teclado valores
        int num1;
        boolean primo= true;
        System.out.println("Vamos a ver si un numero es primo");
        System.out.println("Introduzca un numero");
        num1 = uno.nextInt();
        while (num1<1 || num1>1000){
            System.out.println("Escriba un numero comprendido entre  1 y 1000");
            num1 = uno.nextInt();
        }
        //escribe el valor por teclado
        for (int i = 2; i < num1; i++) {
            // nueva variable = 2 porque todos los numeros son divisibles entre 1, asi que nos lo quitamos de enmedio, que es menor
            //al numero que hemos introducido en el teclado y hasta que llegue a este va sumandose 1.
            if (num1 % i == 0) {
                primo = false;
                // si el numero escogido es divisible entre alguno de los valores menores a el dando como resultado 0 no es primo
            }
        }
        // hasta aquí ve si un numero es primo dividiendolo entre todos los numeros anteriores al que le hemos puesto
        if(primo){
            System.out.println("el numero "+ num1 + " es primo");
        }
        else{
            System.out.println("el numero "+ num1 + " no es primo");
        }
        int numPrimos;
        System.out.println("Escriba cuantos numeros primos desea escribir: ");
        numPrimos = uno.nextInt();
        //ponemos el numero de numeros primos que queremos impresos en pantalla
        while (numPrimos > 20 || numPrimos < 5) {
            System.out.println("el numero debe ser mayor que 5 y menor que 20.");
            numPrimos = uno.nextInt();
            // bucle para que el numero este comprendido entre 5 y 20, en caso contrario, vuelve a preguntar.
        }
        int num = 2;
        // variable que va a cambiar en un futuro y que es la base en la que voy a observar numeros primos.
        int j = 1;
        // variable que hace de contador de numeros primos hasta que coincide con el valor mencionado anteriormente
        while (j <= numPrimos) {
            boolean esPrimo = true;
            for (int m = 2; m < num; m++) {
                if (num % m == 0)
                    esPrimo = false;
                //calculadora de numeros primos
            }
            if (esPrimo)
            {
                System.out.printf("%8d",num);
                // printeo con formato en el que hay espacios de dos tabuladores entre numeros primos
                if (j%4==0)
                    System.out.printf("\n");
                // cada 4 numeros primos se crea un salto de linea de manera que quedan ordenados
                j++;
                //si el numero es primo (cumple la condicion) le sumamos 1 al valor de j
            }

            num++;
            // sumamos uno al valor de num para que siga contando hacia arriba hasta cumplir la condicion del bucle
        }
    }
}