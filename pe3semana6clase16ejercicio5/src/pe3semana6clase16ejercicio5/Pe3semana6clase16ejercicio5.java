
package pe3semana6clase16ejercicio5;
import java.util.Scanner;
public class Pe3semana6clase16ejercicio5 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
       int password;
       do{
       System.out.println("Introduzca su contraseña numérica: ");
       password = keyboard.nextInt ();
       if (password != 24190605)
           System.out.println ("La contraseña  no es correcta. ");
       }
       while (password != 24190605);
    }
    
}