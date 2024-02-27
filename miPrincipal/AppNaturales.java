package miPrincipal;
import java.util.Scanner;

public class AppNaturales {

    public static void menu(){
        System.out.println("************************************");
        System.out.println("numeros naturales");
        System.out.println("************************************");
        Scanner sc = new Scanner(system.in);
        System.out.println("VERSION ITERATIVA");
        mostrarNumerosIte(numero);
        System.out.println("VERSION RECURSIVA");
    }
    public static void mostrarNumerosIte(int numero){
        for(int i=1; i<numero; i++){
            system.out.println(i+"  ");
        }
    }
    public static void mostrarNumerosRec(int numero){
        if(numero>0){
            mostrarNumerosRec(numero-1);
            System.out.println(numero +"  ");
        }
    }
}
