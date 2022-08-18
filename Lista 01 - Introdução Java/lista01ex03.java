package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex03 {
	public static void main(String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		*/
		
		int seg,min,horas,x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite, em segundos, o tempo de duração do evento na fábrica: ");
		x = leia.nextInt();
		
		horas=x/3600;
		min=(x%3600)/60;
		seg=(x%3600)%60;
		
		System.out.println("O tempo de duração foi de "+horas+" horas, "+min+" minutos e "+seg+" segundos.");		
		
	}

}