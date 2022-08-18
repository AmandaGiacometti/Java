package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex04 {
	
	public static void main(String args[])
	{
	/*
	ENUNCIADO DO EXERCÍCIO:
	Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	e calcule a seguinte expressão: 
	D=(R+S)/2
	R=(A+B) ao quadrado
	S=(B+C) ao quadrado
	*/
		
		int A,B,C,R,S;
		double D;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		A = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		B = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = leia.nextInt();
		
		R=(A+B)*(A+B);
		S=(B+C)*(B+C);
		D=(R+S)/2;
		System.out.println("Resultado = "+D+"\n");
		
	}	
}
