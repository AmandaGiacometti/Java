package lista03LacosDeRepeticao;
import java.util.Scanner;
public class lista03ex01 {
	public static void main(String args [])
	{
		/*
		 ENUNCIADO DO EXERCÍCIO:
		 Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 */
		
		int a;
		
		System.out.println("Descubra a seguir quais números que, divididos por 11, deixam resto 05 (apenas entre 1000 e 1999): ");
		
		for(a=1000;a<=1999;a++)
		{
			if(a % 11 == 5) 
			{
				System.out.println(a+"\n");
			}	
		}
	
	/*
	 Não fiz tudo sozinha, olhei o que o Luís resolveu e copiei algumas coisas.
	 Mas acho que entendi.
	 */

	}
}
