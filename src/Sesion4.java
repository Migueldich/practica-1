import java.util.Scanner;
public class Sesion4 {
    public static void primosGemelos(){
        int m= Sesion3.leerNumero(1,500);
        int contador = 1;
        for (int j= Sesion3.leerNumero(m, 500);m<j;m++ ){
            int i = m+2;
            if (Sesion3.esPrimo(m)==true && Sesion3.esPrimo(i)== true){
                System.out.printf("%2d. %5d %5d \n", contador, m, i);
                contador++;
            }
        }
    }
    public static void mostrarSumasDePrimos(int number1){
        while(Sesion3.leerNumero(4, 1000)%2 !=0){
            System.out.println("Escriba un numero par: ");
        }

    }
    public static boolean esPrimoRecursivo(int number2){
        number2 =Sesion3.leerNumero(1, 1000);
        do {
            number2%
        }
        while (number2>0);
    }
    public static double potencia(double num1, double num2){
        num1 =Sesion3.leerNumero(-100, 100);
        
    }
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    primosGemelos();
        int n3 =teclado.nextInt();
        mostrarSumasDePrimos(n3);
    }
}

