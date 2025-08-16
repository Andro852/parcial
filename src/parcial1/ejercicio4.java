
package parcial1;
import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class ejercicio4 {
    public static void main(String[] args) {
        
        double med,des,tot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese precio de la medicina:");
        med = sc.nextDouble();
        des=med*0.10;
        tot=med-des;
        System.out.println("Total sin descueto: "+med);
        System.out.println("Descuento: "+des);
        System.out.println("Total con descuento: "+tot);
    }
    
}
