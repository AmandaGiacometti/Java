package lista02LacosDeDecisao;
import java.util.Scanner;
public class lista02ex02 {
	
	public static void main(String args[]) 
	{
		/*
		 ENUNCIADO DO EXERCÍCIO:
		 Faça um programa que entre com três números e coloque em ordem crescente
		 */
		
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um primeiro número: ");
		a = ler.nextInt();
		System.out.println("Digite um segundo número: ");
		b = ler.nextInt();
		System.out.println("Digite um terceiro número: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\n"+"Ordem crescente: "+a+", "+b+", "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\n"+"Ordem crescente: "+a+", "+c+", "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\n"+"Ordem crescente: "+b+", "+a+", "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\n"+"Ordem crescente: "+b+", "+c+", "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\n"+"Ordem crescente: "+c+", "+a+", "+b);
		}
		else
		{
			System.out.println("\n"+"Ordem crescente: "+c+", "+b+", "+a);
		}
		
		/*
		 Não copiei do professor. Eu olhei como ele fez, entendi e então depois tentei fazer sozinha!
		 */		
	}

}
