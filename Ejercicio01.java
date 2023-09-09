package semana04;
import java.util.*;

public class Ejercicio01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese el numero a evaluar: ");
		
		try 
		{
			long x = sc.nextLong();
			
			System.out.println(x + " puede ser almacenado en: ");
			
			byte byteMaximoPositivo;
			byte byteMaximoNegativo;
			
			short shortMaximoPositivo;
			short shortMaximoNegativo;
			
			int intMaximoPositivo;
			int intMaximoNegativo;
			
			long longMaximoPositivo;
			long longMaximoNegativo;
			
			byteMaximoPositivo = Byte.MAX_VALUE;
			byteMaximoNegativo = Byte.MIN_VALUE;
			
			shortMaximoPositivo = Short.MAX_VALUE;
			shortMaximoNegativo = Short.MIN_VALUE;
			
			intMaximoPositivo = Integer.MAX_VALUE;
			intMaximoNegativo = Integer.MIN_VALUE;
			
			longMaximoPositivo = Long.MAX_VALUE;
			longMaximoNegativo = Long.MIN_VALUE;
			
			if (x >= byteMaximoNegativo && x <= byteMaximoPositivo)
			{
				System.out.println("(*) Byte");
			}
			
			if (x >= shortMaximoNegativo && x <= shortMaximoPositivo)
			{
				System.out.println("(*) Short");
			}
			
			if (x >= intMaximoNegativo && x <= intMaximoPositivo)
			{
				System.out.println("(*) Int");
			}
			
			if (x >= longMaximoNegativo || x <= longMaximoPositivo)
			{
				System.out.println("(*) Long");
			}
		}
		
		catch (Exception e)
		{
			System.out.println(sc.next() + " no puede ser alamacenado en ningun lado.");
		}
		
		sc.close();
	}
}
