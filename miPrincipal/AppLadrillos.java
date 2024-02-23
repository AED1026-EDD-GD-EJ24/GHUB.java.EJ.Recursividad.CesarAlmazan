package miPrincipal;

public class AppLadrillos{

    public static void menu(){
        System.out.println("version iterativa");
     dibujar_pared_ite(10);
     System.out.println("version recursiva");
     dibujar_pared_rec(10);
    }
    public static void dibujar_pared_ite(int n){
        for(int i=0;i<9; i++){
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
          }
    }
    public static void dibujar_pared_rec(int n){
        if (n>0)

    dibujar_pared_rec(n-1);
    else
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
    
    }
    }
    
