public class  recursividad1{

private static int factorial(int num){
    int fact =1;
    if(num!=0){
        for(int i=num; i>0; i--){
        fact *= i;
        }
    }
    return fact;
}
public static void main(String[] args){
    int numero=5;
    int resultado;
    resultado= factorial(numero);
    System.out.println("el factorial de "+ numero +" es "+ resultado);

}
}