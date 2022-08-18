package lista02LacosDeDecisao;
import java.util.Scanner;
public class lista02ex01 {
	
	public static void main(String args[]) 
	{
		/*
		 ENUNCIADO DO EXERCÍCIO:
		 Faça um programa que receba três inteiros e diga qual deles é o maior
		 */
		
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 números e eu te direi qual deles é o maior!"+"\n"+"Digite o primeiro número: ");
		a = ler.nextInt();
		System.out.println("\n"+"Digite o segundo número: ");
		b = ler.nextInt();
		System.out.println("\n"+"Digite o terceiro número: ");
		c = ler.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("\n"+"O maior número é: "+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("\n"+"O maior número é: "+b);
		}
		else
		{
			System.out.println("\n"+"O maior número é: "+c);
		}
		
		/*
		 Esse eu também fiz sozinhaaaaaaaa 
		 Os humilhados serão exaltados kkkk		  
		 */		
	}
}
