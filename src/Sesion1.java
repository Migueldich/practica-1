import java.util.Scanner;

public class Sesion1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEntero;
        int numero2, numero3, numero4;
        System.out.println("Comprobar si un numero es primo");
        System.out.println("Escribir los n primeros numeros primos");
        System.out.println("Escribir numeros primos gemelos entre dos valores");
        System.out.println("Numero par como suma de dos primos");
        System.out.println("Finalizar la ejecucion");
        System.out.println("Introduzca la opcion deseada: ");
        numeroEntero = teclado.nextInt();
        if (0 <= numeroEntero && numeroEntero <= 4) {
            System.out.println("Ha elegido la opcion " + numeroEntero);
        } else {
            System.out.println("Opcion incorrecta");
        }
        System.out.println("Introduzca un numero comprendido entre 0 y 1000");
        numero2 = teclado.nextInt();
        if (0 <= numero2 && numero2 <= 1000) {
            System.out.println("El numero " + numero2 + " es correcto");
        } else {
            System.out.println(" El numero " + numero2 + " es mayor que 1000");
        }
        System.out.println("Escriba a continuacion dos numeros enteros: ");
        numero3 = teclado.nextInt();
        numero4 = teclado.nextInt();
        if (numero3 >= numero4) {
            System.out.println("El numero " + numero3 + " es mayor o igual que " + numero4);
        } else {
            System.out.println("El numero " + numero3 + " es menor o igual que " + numero4);
        }
        if (numero4 % numero3 != 0) {
            System.out.println("El numero " + numero4 + " no es divisible entre " + numero3);
        } else {
            System.out.println("El numero " + numero4 + " es divisible entre " + numero3);
        }
    }
}
