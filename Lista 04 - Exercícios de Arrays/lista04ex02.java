package lista04ExerciciosdeArrays;
import java.util.Scanner;
public class lista04ex02 {
	
	public static void main(String[] args)
	{
	/*
	ENUNCIADO DO EXERCÍCIO:
	Faça um programa que receba 6 números inteiros e mostre: 
	Os números pares digitados;  
	A soma dos números pares digitados; 
	Os números ímpares digitados; 
	A quantidade de números ímpares digitados.
	*/
		
		float[] vetor = new float[6]; 
		int qtdeimpares=0, x=0, somapares=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("Digite um número inteiro: ");
			vetor[x]=leia.nextFloat(); 
		}
		
		System.out.println("\n");
		System.out.println("Os numeros pares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(vetor[x]%2==0)
			{
				System.out.println(vetor[x]);
				somapares += vetor[x];	
			}
		}
		System.out.println("A soma dos numeros pares digitados foi de: "+"\n"+somapares);
		
		System.out.println("Os numeros ímpares digitados foram: ");
		
		for(x=0;x<6;x++)
		{
			if(vetor[x]%2==1)
			{
				System.out.println(vetor[x]);
				qtdeimpares++;					
			}
		}
		System.out.println("A quantidade de números ímpares digitados foi de: "+"\n"+qtdeimpares);	
	}
}
