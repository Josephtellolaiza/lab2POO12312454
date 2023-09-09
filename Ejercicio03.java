package semana04;
import java.util.Scanner;

public class Ejercicio03{

    public static void main(String[] args) {
        double currentSalary;
        double rating;
        double raise;
    
        Scanner scan = new Scanner(System.in);
     
        System.out.print("Ingrese el salario actual: ");
        currentSalary = scan.nextDouble();
     
        System.out.print("Ingrese la calificación de desempeño: ");
        rating = scan.nextDouble();
    
        if (rating == 1) {
            raise = currentSalary * 0.06; 
        } else if (rating == 2) {
            raise = currentSalary * 0.04; 
        } else if (rating == 3) {
            raise = currentSalary * 0.015; 
        } else {
            System.out.println("Calificación de desempeño no válida. Debe ser 1, 2 o 3.");
            return; 
        }
        
        double newSalary = currentSalary + raise;
        
        System.out.println("Cantidad de aumento: S/." + raise);
        System.out.println("Tu nuevo salario: S/." + newSalary);
    }
    
}
