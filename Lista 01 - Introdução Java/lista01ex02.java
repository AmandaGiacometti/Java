package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex02 {
	public static void main(String args[])
	{
	/*
	 ENUNCIADO DO EXERCÍCIO:
	 Faça um sistema que leia a idade de uma pessoa expressa em dias e 
	 mostre-a expressa em anos, meses e dias. 
	 */
				
		int dias,meses,anos,x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		x = leia.nextInt();
		
		anos=x/365;
		meses=(x%354)/30;
		dias=(x%365)%30;
		
		System.out.println("Sua idade é: "+anos+" anos, "+meses+" meses e "+dias+" dias!");	
		
	}

}