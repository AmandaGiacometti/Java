package lista03LacosDeRepeticao;
import java.util.Scanner;
public class lista03ex06 {
	
	public static void main (String args [])
	{
		/*
		Escrever um programa que receba vários números inteiros no teclado. 
		E no final imprimir a média dos números múltiplos de 3. 
		Para sair digitar 0(zero)
		(DO...WHILE)
		*/
		
		int num,multiplos=0,tot=0,media;
		Scanner leia = new Scanner(System.in);
				
		do 
		{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
				if(num%3 == 0)
				{
					multiplos++;
					tot += num;
				}						
		}
		while(num != 0); 
		
		media=tot/multiplos;
		System.out.println("A média dos múltiplos de três inseridos foi: "+media);
		
	}	
}
