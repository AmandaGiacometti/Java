package lista04ExerciciosdeArrays;
import java.util.Scanner;
public class lista04ex03 {

	public static void main(String[] args)
	{
	/*
	ENUNCIADO DO EXERCÍCIO:
	Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	*/
		double[][] matriz = new double[3][3];
		int maiores=0,x=0;
		Scanner leia = new Scanner (System.in);
						
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
			{
				System.out.printf("Insira o ememento M[%d][%d]: ",l+1,c+1);
				matriz[l][c]=leia.nextInt();
				if(matriz[l][c]>10)
				{
					maiores++;
				}
				
			}
			
		}		
		System.out.println("De todos os valores inseridos, "+maiores+" foram maiores do que 10");
		
	}
}
