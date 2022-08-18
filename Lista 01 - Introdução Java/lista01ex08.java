package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex08 {

	public static void main(String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
		distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
		distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica 
		de um carro e escreva o custo ao consumidor. 
		*/
		
		Double consum,fabr;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: R$ "+"\n");
		fabr = leia.nextDouble();
		consum = fabr + ((28*fabr) / 100) + ((45*fabr) / 100);
		System.out.println("O custo final ao consumidor será: R$ "+consum+"\n");		
	}
}
