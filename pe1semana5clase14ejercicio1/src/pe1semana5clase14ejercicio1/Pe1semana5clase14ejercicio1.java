
package pe1semana5clase14ejercicio1;
import java.util.Scanner;
public class Pe1semana5clase14ejercicio1 {
    public static void main(String[] args) {
     Scanner Entrada = new Scanner (System.in);
     int reglas;
     double nota;
     System.out.println("Usted cimple con las reglas de la universidad: ");
     System.out.println("Ingrese u numero: \n 1. Siempre \n 2. Aveces \3. Nunca");
     reglas = Entrada.nextInt ();
     System.out.println("Que nota obtuvo en el laboratorio: ");
     nota = Entrada.nextDouble();
     if (reglas == 1){
     if (nota >= 8 & nota <= 10){
     nota = 10;
     } else {
     System.out.println("Nota invalida");
     }
         } else if (reglas ==2 ){
         if (nota < 6){
         nota = nota + 0.5;
         } else if (nota >=6 & nota < 8){
         nota = nota + 7.0;
         } else {
         System.out.println("Nota invalida");
         }
         } else {
             System.out.println("Usted debe cu plir las reglas");
             }
     System.out.println("La nueva notas es: " + nota);
    }
    
}
