
package pe1semana4clase11ejercicio1;

import java.util.Scanner;

public class Pe1semana4clase11ejercicio1 {

    public static void main(String[] args) {
       Scanner Entrada = new Scanner (System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota");
        nota1 = Entrada.nextFloat();
        System.out.println("Ingrese la primera nota");
        nota2 = Entrada.nextFloat();
        System.out.println("Ingrese la primera nota");
        nota3 = Entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) /3;
        System.out.println("El promedio es: " + promedio);
        if (promedio >= 8){
        System.out.println("Promocionado");
        } else if (promedio >= 5){
        System.out.println("Regular");
        } else {
        System.out.println("Reprobado");
        }
    }
    
}
