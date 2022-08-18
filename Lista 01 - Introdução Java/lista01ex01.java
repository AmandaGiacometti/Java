package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex01 {

	public static void main(String args[])
	{
	/*
	ENUNCIADO DO EXERCÍCIO:
	Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
	e mostre-a expressa apenas em dias. 
	*/
		
		int anos,meses,dias,res;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Pense quantos anos completos você tem.");
		System.out.println("Depois, quantos meses passaram desde seu último aniversário.");
		System.out.println("Por fim, quantos dias passaram desde o último mês completo.");
		System.out.println("Pensou? \nDigite sua idade em ANOS completos: ");
		anos = leia.nextInt();
		System.out.println("Agora digite o valor dos MESES: ");
		meses = leia.nextInt();
		System.out.println("Por último, digite quantos dias se passaram desde o último mês completo: ");
		dias = leia.nextInt();
		
		res=dias+(meses*30)+(anos*365);
		
		System.out.println("Sua idade em dias é: "+res+" dias");		
	}
}
