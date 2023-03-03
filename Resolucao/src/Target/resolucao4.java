package Target;

public class resolucao4 
{
	
	public static void main (String[] args) 
	{
		double SP = 67836.47, RJ = 36678.66, MG = 29229.88;
		double ES = 27165.53, OUTROS = 19849.53, total = 0;	
		
		double[] porcentagem = new double[5];		
		double[] estado = new double[5];
		
		estado[0] = SP;
		estado[1] = RJ;
		estado[2] = MG;
		estado[3] = ES;
		estado[4] = OUTROS;
		
		for(int i = 0; i < estado.length; i++)
		{
			total += estado[i];
			
		}
		
		for(int i = 0; i < estado.length; i++)
		{
			porcentagem[i] = (estado[i] * 100) / total;
			
		}
		
		for(int i = 0; i < estado.length; i++)
		{
			if( i == 0 )
			{
				System.out.printf("SP = %.2f%% %n", (porcentagem[i]));
				
			 } else if( i == 1 )
					{
				
						System.out.printf("RJ = %.2f%% %n", (porcentagem[i]));
					
					 } else if( i == 2 )
							{
				
								System.out.printf("MG = %.2f%% %n", (porcentagem[i]));
					
							 } else if( i == 3 )
									{
				
										System.out.printf("ES = %.2f%% %n", (porcentagem[i]));
					
									 } else if( i == 4 )
											{
				
												System.out.printf("Outros estados = %.2f%% %n", (porcentagem[i]));
					
											 }	
			
		}
	
		
	}

}
