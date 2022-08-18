package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex05 {

	public static void main(String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		*/
		
		String nome;
		int n1,n2,n3,res;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = leia.nextLine();
		System.out.println("Digite sua primeira nota: ");
		n1 = leia.nextInt();
		System.out.println("Digite sua segunda nota: ");
		n2 = leia.nextInt();
		System.out.println("Digite sua terceira nota: ");
		n3 = leia.nextInt();
		
		res=((2*n1)+(3*n2)+(5*n3))/10;
		
		System.out.println(nome+", sua média final é: "+res);
	
	}	
}
