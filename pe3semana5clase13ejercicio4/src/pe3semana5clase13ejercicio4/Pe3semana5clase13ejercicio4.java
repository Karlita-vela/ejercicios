
package pe3semana5clase13ejercicio4;
import java.util.Scanner;
public class Pe3semana5clase13ejercicio4 {
    public static void main(String[] args) {
     Scanner datos = new Scanner (System.in);
     int valor;
     do{
         System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza): ");
         valor=datos.nextInt();
         if (valor>=100){
         System.out.println("Es de 3 ígitos.");
         } else {
         if (valor>10) {
             System.out.println("Es de 2 dígitos. ");
         } else {
         System.out.println("Es de 1 dígito. ");
         }
         }
     } while (valor !=0);
    }
    
}
