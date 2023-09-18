import java.util.Scanner;
public class sumarecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el límite inferior: ");
        int limiteI= scanner.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limiteS= scanner.nextInt();

        if (limiteI > limiteS) {
            System.out.println("El límite inferior debe ser menor o igual al límite superior.");
        } else {
            int resultado = sumaRecursivaCuadrados(limiteI, limiteS);
            System.out.println("La suma de los cuadrados dentro del rango "+limiteI+" y "+limiteS +" es: " + resultado);
        }
    }

    public static int sumaRecursivaCuadrados(int limiteI, int limiteS) {
        if (limiteI == limiteS) {
            return limiteI * limiteI;
        } else {
            int cuadradoActual = limiteI* limiteI;
            int sumaRecursiva = sumaRecursivaCuadrados(limiteI + 1, limiteS);
            return cuadradoActual + sumaRecursiva;
        }
    }
}
