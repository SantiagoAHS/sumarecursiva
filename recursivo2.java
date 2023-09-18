public class recursivo2 {
    private static int factorial(int num){
        if(num == 0){
            return 1;
        }else {
            return num * factorial(num-1);
        }
    }
    public static void main(String[]args){
        int numero=5;
        int resultado;

        System.out.println("Programa que calcula el factorila de un numero");
        resultado = factorial(numero);
        System.out.println("El factorial de "+numero+" es: "+resultado);
    }
}
