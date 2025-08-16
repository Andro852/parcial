
package parcial1;
import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        int i, cont100a300 = 0, contMas300 = 0;
        double total = 0, sueldo = 0;  
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de empleados: ");
        int n = sc.nextInt();
    
        for (i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldo = sc.nextDouble();

            if (sueldo < 100 || sueldo > 500) {
                System.out.println("El sueldo debe estar entre Q100 y Q500. Intente de nuevo.");
                i--; 
                continue;
            }

            if (sueldo <= 300) {
                cont100a300++;
            } else {
                contMas300++;
            }

            total += sueldo; 
        }

        System.out.println("Empleados que cobran entre Q100 y Q300: " + cont100a300);
        System.out.println("Empleados que cobran más de Q300: " + contMas300);
        System.out.println("Total que gasta la empresa en sueldos: Q" + total);
    }
}
    
    

