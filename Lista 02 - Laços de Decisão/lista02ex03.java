package lista02LacosDeDecisao;
import java.util.Scanner;
public class lista02ex03 {

	public static void main(String args[])
	{
		/*
		 ENUNCIADO DO EXERCÍCIO:
		Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 */
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Descubra em qual categoria você se encontra!"+"\n"+"Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\n"+"Você faz parte da categoria INFANTIL!");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\n"+"Você faz parte da categoria JUVENIL!");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\n"+"Você faz parte da categoria ADULTO!");
		}
		else if(idade>0 && idade<=9) 		
		{
			System.out.println("\n"+"Você não pertence a nenhuma categoria!");
		}
		else if(idade>=26 && idade<=122)
		{
			System.out.println("\n"+"Você não pertence a nenhuma categoria!");
		}
		else
		{
			System.out.println("\n"+"Idade inválida...");
		}
		
		/*
		 Meu primeiro exercício Java!!! Fiz tudo sozinha!!! TÔ MUITO FELIZZZZ
		 */		
	}
}
