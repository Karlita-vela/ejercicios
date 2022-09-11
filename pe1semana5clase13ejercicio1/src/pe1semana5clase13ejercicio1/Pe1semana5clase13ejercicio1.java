
package pe1semana5clase13ejercicio1;
import java.util.Scanner;
public class Pe1semana5clase13ejercicio1 {
    public static void main(String[] args) {
        int plato, cantidad;
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese 1 o 2 segun el plato que sea: ");
        plato = Entrada.nextInt();
        System.out.println("Numero de ordenes: ");
        cantidad = Entrada.nextInt();
        double totalInicial = 0, descuento = 0, totalFinal = 0, precioPlato1 =5, precioPlato2 =7;
        if (plato ==1){
        if (cantidad>= 1 & cantidad<=5){
        totalFinal = totalInicial - (totalInicial * descuento);
        } else if (cantidad >= 6 & cantidad <= 10 ){
        totalInicial = cantidad * precioPlato2;
        descuento = 0.12;
        totalFinal = totalInicial - (totalInicial * descuento);
        } else {
        System.out.println("Plato equivocado");
        }
        System.out.println("El menu es: " + plato);
        System.out.println("La coantidad es: " + cantidad);
        System.out.println("El total inicial es: " + totalInicial);
        System.out.println("El total final es: " + totalFinal);
            }
    }
    
}
