
package parcial1;
import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class ejercicio2 {
    public static void main(String[] args) {
        double pre, des, tot ; 
        int num, ed;
        char nom;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = lectura.nextInt();
        if(num == 1){
            System.out.println("Ingrese un nombre: ");
            nom = lectura.next().toLowerCase().charAt(0);
            System.out.println("Ingrese su edad: ");
            ed = lectura.nextInt();
            System.out.println("Su nombre es: "+nom);
             System.out.println("Su edad es: "+ed);
            
        }else if(num == 2){
            System.out.println("Descuento del 30%");
            System.out.println("Ingrese precio del prducto: ");
            pre = lectura.nextDouble();
            des=pre*0.30;
            tot=pre-des;
            System.out.println("Valor final con descuento: "+tot);
        }
        
    }
    
}
