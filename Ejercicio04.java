package semana04;
import java.util.Scanner;

public class Ejercicio04{

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
       
       int year;
       
        System.out.println("Ingrese el año");
        
        year=entrada.nextInt();

            switch (year % 12) {
                case 0:
                    System.out.println(year + " es el año del mono.");
                    break;
                case 1:
                    System.out.println(year + " es el año del gallo.");
                    break;
                case 2:
                    System.out.println(year + " es el año del perro.");
                    break;
                case 3:
                    System.out.println(year + " es el año del cerdo.");
                    break;
                case 4:
                    System.out.println(year + " es el año de la rata.");
                    break;
                case 5:
                    System.out.println(year + " es el año del buey.");
                    break;
                case 6:
                    System.out.println(year + " es el año del tigre.");
                    break;
                case 7:
                    System.out.println(year + " es el año del conejo.");
                    break;
                case 8:
                    System.out.println(year + " es el año del dragón.");
                    break;
                case 9:

                case 10:
                    System.out.println(year + " es el año del caballo.");
                    break;
                case 11:
                    System.out.println(year + " es el año de la cabra.");
                    break;
                default:
                    System.out.println("Año no válido.");
            }
            entrada.close();
    }
}