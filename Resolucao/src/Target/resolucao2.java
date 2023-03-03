package Target;

import java.util.InputMismatchException;
import java.util.Scanner;

public class resolucao2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0, sair = 1;
		
		do
		{
			try
			{
				System.out.println("Escolha um numero inteiro");
				escolha = sc.nextInt();
				sair = 0;
		
			}
		
			catch(InputMismatchException e)
			{
				System.out.println("Tente selecionar apenas numeros inteiros...\n\ntente novamente: ");
				sc.nextLine();
			}
			
		}
		while(sair == 1);
		
		int n1 = 0, sequencia = 1, resultado = 0;
		resultado = escolha;
		
		if(escolha == 0)
		{
			System.out.println("O numero " + resultado + " pertence a sequência de Fibonacci");
			System.exit(0);
			
		}
		
		for(int i = 0; i <= escolha + 1; i++) 
		{	
			
			sequencia = sequencia + n1;
			
			if( sequencia == escolha)
			{
				System.out.println("O numero " + resultado + " pertence a sequência de Fibonacci");
				System.exit(0);
			}
			
			n1 = sequencia - n1;
			
		}
		
		System.out.println("O numero " + resultado + " não pertence a sequência de Fibonacci");
		
		sc.close();

	}

}
