
package pe2semana7calse21ejercicio7;
import java.util.Scanner;
public class Pe2semana7calse21ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int mul3,mul5,valor,f;
        mul3=0;
        mul5=0;
        for (f=1;f<=10;f++){
        System.out.println("Ingrese un valor: ");
        valor=teclado.nextInt();
        if (valor%3==0){
            mul3 = mul3+1;
        }
        if (valor%5==0){
            mul5=mul5+1;
        }
        }
        System.out.println("Cantidad de valores ingresaados múltiplos de 3:");
        System.out.println(mul3);
        System.out.println("Cantidad de valores ingresados múltiplos de 5:");
        System.out.println(mul5);
    }
    
}
