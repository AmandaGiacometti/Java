package lista02LacosDeDecisao;
import java.util.Scanner;
public class lista02ex04 {

	public static void main(String args []) 
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		
		int a;
		double res;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		a = ler.nextInt();
		
		if(a % 2 == 0)
		{
			res = Math.sqrt(a);
			System.out.println("\n"+"Esse número é par!"+"\n"+"Raiz quadrada de "+a+" = "+res);
		}
		else
		{
			res = Math.pow(a, 2);
			System.out.println("\n"+"Esse número é ímpar!"+"\n"+a+" elevado ao quadrado = "+res);
		}
		
		/*
		 Esse eu não fiz sozinha... Copiei algumas linhas do que o Luís fez em sala...
		 As linhas que eu copiei eu não tenho certeza se entendi, mas vamo que vamo
		 */
	}
}
