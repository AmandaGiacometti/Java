package lista01IntroducaoJava;
import java.util.Scanner;
public class lista01ex07 {

	public static void main(String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Um sistema de equações lineares do tipo: 
		ax+by=c
		dx+ey=f
		pode ser resolvido segundo mostrado abaixo:
		x=(ce-bf)/(ae-bd)
		y=(af-cd)/(ae-bd)
		Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		*/
		
		int a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Veja a equação linear a seguir:"+"\n"+"AX+BY=C"+"\n"+"DX+EY=F"+"\n"+"\n"+"Para resolver o sistema, insira a seguir os valores de A, B, C, D, E, F: ");	
		System.out.println("\n"+"Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		d = leia.nextInt();
		System.out.println("Digite o valor de E: ");
		e = leia.nextInt();
		System.out.println("Digite o valor de F: ");
		f = leia.nextInt();

		x= ((c*e)-(b*f))/(a*e)-(b*d);
		y= ((a*f)-(c*d))/((a*e)-(b*d));

		System.out.println("\n"+"O valor de X é: "+x+", e o de Y é: "+y);
		
		
		
		
		
		
	}
}
