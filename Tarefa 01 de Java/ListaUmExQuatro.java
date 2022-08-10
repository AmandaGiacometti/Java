package TarefasEntregues;

import java.util.Scanner;

public class ListaUmExQuatro {
	public static void main(String args []) 
	{
		/*
		 Esse eu não fiz sozinha... Copiei algumas linhas do que o Luís fez em sala...
		 As linhas que eu copiei eu não tenho certeza se entendi, mas vamo que vamo
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
		
	}
}
