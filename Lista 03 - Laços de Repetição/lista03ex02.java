package lista03LacosDeRepeticao;
import java.util.Scanner;
public class lista03ex02 {
	public static void main(String args [])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		*/
		
		int num,contagempar=0,contagemimpar=0,p;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva 10 números e eu te direi quantos são pares e quantos são ímpares!");
		
		for(p=1;p<=10;p++)
		{
			System.out.println("Digite aqui: ");
			num = leia.nextInt();
			
			if(num%2 == 0)
			{
				contagempar++;
			}
			else
			{
				contagemimpar++;
			}			
		}
		
		System.out.println("\n"+"Quantidade de pares: "+contagempar+"\n"+"Quantidade de ímpares: "+contagemimpar);
		
		/*
		 Precisei da ajuda dos meninos porque tava muito confusa e não sabia exatamente como fazer.
		 Mas acho que agora entendi.
		 Eu confundo o FOR com o WHILE!
		 */	
		
	}

}
