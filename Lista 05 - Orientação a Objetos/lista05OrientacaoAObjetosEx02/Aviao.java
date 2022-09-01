package lista05OrientacaoAObjetosEx02;

public class Aviao {
	public static void main (String args[])
	{
		DadosAviao aviao1 = new DadosAviao ("Boeing 737","140","Latam","Brasil");
		System.out.println(aviao1.getFichaAviao());
		
		System.out.println("\n");
		
		DadosAviao aviao2 = new DadosAviao ("Boeing 747","400","Emirates Airlines","Emirados árabes");
		System.out.println(aviao2.getFichaAviao());
		
		System.out.println("\n");
		
		DadosAviao aviao3 = new DadosAviao ("Boeing 777","420","United Airlines","Estados Unidos");
		System.out.println(aviao3.getFichaAviao());
	}
}
