package Target;

import java.util.Scanner;

public class resolucao5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.printf("Digite a palavra desejada: \n");
		s = sc.nextLine();
		
		System.out.printf("A palavra invertida fica: %s", inverter(s));
		
		sc.close();
	}
	
	public static String inverter(String s)
	{
		
		int i;
		String invert = "";
		
		for(i= s.length()-1; i >= 0; i--)
		{
			invert = invert + s.charAt(i);
		}
		
		return(invert);
		
	}

}
