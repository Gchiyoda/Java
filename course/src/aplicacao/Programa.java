package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com os dados do produto: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(name, preco);
		
		produto.setName("Computer");
		System.out.println("Updated name: " + produto.getName());
		
		produto.setPreco(preco);
		System.out.println("Updated preco" + setPreco() );
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos adicionados no estoque: " );
		 int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos retirados no estoque: " );
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto);
		
	}

	private static String setPreco() {
		// TODO Auto-generated method stub
		return null;
	}

}
