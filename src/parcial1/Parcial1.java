
package parcial1;
import java.util.Scanner;

/**
 *
 * @author Jonatan
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota,nota1 = 0,nota2 = 0,nota3 = 0, pro1=0, pro2=0, pro3=0 ;
        int i, not1 = 0,not2 = 0,not3 = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Notas");
        for(i=1;i<11;i++){
            System.out.println("Ingrese nota "+ i +": ");
            nota = lectura.nextDouble();
            if(nota>7){
                not1=not1+1;
                nota1=nota1+nota;
                
            }else if(nota<7 && nota>=4){
                not2=not2+1;
                nota2=nota2+nota;
                
            }else if(nota<4){
                not3=not3+1;
                nota3=nota3+nota;
                
            }
        }
        System.out.println("Notas mayores a 7: "+not1+" Promocionado. Promedio: "+(nota1/not1));
        System.out.println("Notas entre 7 y 4: "+not2+" Regular1" + ". Promedio: "+(nota2/not2));
        System.out.println("Notas menor a 4: "+not3+" Reprobado. Promedio: "+(nota3/not3));
            
    }
    
}
