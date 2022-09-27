package ExerciciosUdemy;

public class FuncoesString {

	public static void main(String[] args) {
		String original = "abcde FHGI ABC abc DEFG ";
		String s01 = original.toLowerCase();//Deixar letras minúsculas
		String s02 = original.toUpperCase();//Deixar letras maiúsculas
		String s03 = original.trim();//Elimina espaços
		String s04 = original.substring(2);//Gerar novas string a partir de determinado caracter
		String s05 = original.replace('a', 'x');//Substituir uma letra por outra
		
		
		System.out.println("ORIGINAL: - " + original);
		System.out.println("toLowerCase: -" + s01);
		System.out.println("toUpperCase: -" + s02 );
		System.out.println("trim: -" + s03);
		System.out.println("toSubstring: -" + s04 );
		System.out.println("replace: -" + s05);
		
		
	}

}
