package lista01IntroducaoJava;
import java.util.Scanner;
import java.math.*;
public class lista01ex06 {

	public static void main(String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
		d = raiz quadrada de: (x2-x1) ao quadrado + (y2-y1) ao quadrado
		*/
		
		Double d,x1,x2,y1,y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Descubra a distância entre dois pontos quaisquer em um plano cartesiano!"+"\nDigite o valor de x do primeiro ponto: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de y do primeiro ponto: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de x do segundo ponto: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y do segundo ponto: ");
		y2 = leia.nextDouble();
		
		d=Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((x1-x2), 2));

		System.out.println("\n"+"A distância entre os dois pontos é: "+d);
			
	}
}
