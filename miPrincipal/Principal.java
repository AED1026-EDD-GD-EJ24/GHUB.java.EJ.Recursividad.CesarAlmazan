package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("      Recursividad       ");
            System.out.println("*************************");
            System.out.println("1) Ladrillos ");
            System.out.println("2) Factorial");
            System.out.println("3) Numeros Naturales");
            System.out.println("4) suma digitos");
            System.out.println("5) Ladrillos ");
            System.out.println("6) Maximo comun divisor");
            System.out.println("7) Busqueda Binaria");
            System.out.println("8) Ordenamiento por Seleccion");
            System.out.println("9) Torres de Hanoi ");
            System.out.println("10) Serie De Fibonacci ");
            System.out.println("11) Performance Serie de Fibonacci");
            System.out.println("12) Ordenamiento por Mezcla");
            System.out.println("                 ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
               
               case 2:
               AppFactorial.menu();
               break;

               case 3:
               AppFactorial.menu();
               break;   
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}