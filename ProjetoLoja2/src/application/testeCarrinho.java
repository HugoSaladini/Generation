package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Calca;
import entities.Casaco;
import entities.Loja;
import entities.Meia;
import entities.Produto;
import entities.Roupa;
import entities.Tenis;

public class testeCarrinho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Loja notaFical = new Loja("GEENER", "00.123.987/0001-05");
		List<Produto> carrinho = new ArrayList<>();
		List<Produto> vendas = new ArrayList<>();

		int quntRoupa = 0, quntMeia = 0, quntCalca = 0, quntCasaco = 0, quntTenis = 0;
		double totalCalca = 0;
		double totalCasaco = 0;
		double totalMeia = 0;
		double totalRoupa = 0;
		double totalTenis = 0;
		double totalFinal = 0;
		double desconto = 0;
		double juros1 = 0;
		double juros2 = 0;
		double imposto = 0;
		double valorParcela = 0;

		String opcao;

		carrinho.add(new Roupa("CAMISA", "CD-159", 21.99, 10, " GENNER "));
		carrinho.add(new Meia("MEIA", "CD-147", 50.99, 10, " Genner"));
		carrinho.add(new Calca("CALÇA", "CD-258", 159.99, 0, " Genner"));
		carrinho.add(new Casaco("CASACO", "CD-369", 120.99, 0, " Genner"));
		carrinho.add(new Tenis("TENIS", "CD-954", 200.99, 0, " Genner"));

		// System.out.println(y.getNome() + " " + y.getAnoNascimento());

		do {
			linha();
			System.out.println("\t\t---- LOJA GENNER ----");
			System.out.println("\nEscolha uma categoria para navegar em nosso site");
			System.out.println();
			System.out.println("DESCRIÇÃO\tCODIGO\t\t\tVALOR\t\t\tESTOQUE");
			System.out.println();
			for (Produto tela : carrinho) {
				System.out.println(tela.getDescricao() + "\t\t" + tela.getCodigo() + "\t\t\t" + "R$ " + tela.getValorunitario()+ 
						 "\t\t" + tela.getQtdeEstoque());

			}

			linha();
			System.out.println("LISTA ATUAL");

			// System.out.println("DESCRIÇÃO\tCODIGO\t\t\tVALOR\t\tESTOQUE");

			for (Produto p : vendas) {

				// System.out.println("DESCRIÇÃO\tCODIGO\t\t\tVALOR\t\tESTOQUE");
				System.out.println(p.getCodigo() + "\t" + p.getDescricao() + "\t" + p.getQtdeEstoque() + "\t"
						+ p.getValorunitario());

			}

			// List<Produto> vendas = new ArrayList<>();

			System.out.println("1 - Camisa \n2 - Meia \n3 - Calça \n4 - Casaco \n5 - Tenis \n6 - Pagamento");
			opcao = leia.next();

			// if (opcao) {
			// System.out.println("Opção invalida, tenta de novo ai...");

			// } else
			if (opcao.equals("1")) {

				// contatos.add(new Pessoa("MARIA" , 2001, 'F'));
				// carrinho.add(new Roupa("Camisa ", "CDC 0123 R$", 21.50, 10, " Genner "));

			//	System.out.println(carrinho.get(0).getDescricao() + "\t " + carrinho.get(0).getCodigo() + "\t R$"
			//			+ carrinho.get(0).getValorunitario() + "\t " + " QNT ESTOQUE: "
			//			+ carrinho.get(0).getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				quntRoupa = leia.nextInt();
				carrinho.get(0).tirarEstoque(quntRoupa);

				System.out.println("QNT ESTANTE EM ESTOQUE: " + carrinho.get(0).getQtdeEstoque());

				totalRoupa = quntRoupa * 21.50;
				System.out.println("\nTotal Total das Roupas R$" + totalRoupa);
				System.out.println("============================");
				// carrinho.add(new Calca("Calça", "CDC 9856", 159.99, 0, " Genner"));
				vendas.add(new Roupa(carrinho.get(0).getDescricao(), carrinho.get(0).getCodigo(), totalRoupa, quntRoupa,
						" Genner"));

			} else if (opcao.equals("2")) {

				System.out.println(carrinho.get(1).getDescricao() + carrinho.get(1).getCodigo()
						+ carrinho.get(1).getValorunitario() + " QNT ESTOQUE: " + carrinho.get(1).getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");

				quntMeia = leia.nextInt();
				carrinho.get(1).tirarEstoque(quntMeia);

				System.out.println("QNT ESTOQUE ATUAL: " + carrinho.get(1).getQtdeEstoque());

				totalMeia = quntMeia * 50.05;
				System.out.println("Total Meia R$" + totalMeia);

				vendas.add(new Meia(carrinho.get(1).getDescricao(), carrinho.get(1).getCodigo(), totalMeia, quntMeia,
						" Genner"));

			} else if (opcao.equals("3")) {

				System.out.println(carrinho.get(2).getDescricao() + carrinho.get(2).getCodigo()
						+ carrinho.get(2).getValorunitario() + " QNT ESTOQUE: " + carrinho.get(2).getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");

				quntCalca = leia.nextInt();

				carrinho.get(2).tirarEstoque(quntCalca);

				System.out.println("QNT ESTOQUE ATUAL: " + carrinho.get(2).getQtdeEstoque());

				totalCalca = quntCalca * 159.99;
				System.out.println("Total Calça R$" + totalCalca);

			} else if (opcao.equals("4")) {

				System.out.println(carrinho.get(3).getDescricao() + carrinho.get(3).getCodigo()
						+ carrinho.get(3).getValorunitario() + " QNT ESTOQUE: " + carrinho.get(3).getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				quntCasaco = leia.nextInt();

				carrinho.get(3).tirarEstoque(quntCasaco);

				System.out.println("QNT ESTOQUE ATUAL: " + carrinho.get(3).getQtdeEstoque());

				totalCasaco = quntCasaco * 120.99;
				System.out.println("Total Casaco R$" + totalCasaco);

			} else if (opcao.equals("5")) {

				System.out.println(carrinho.get(4).getDescricao() + carrinho.get(4).getCodigo()
						+ carrinho.get(4).getValorunitario() + " QNT ESTOQUE: " + carrinho.get(4).getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				quntTenis = leia.nextInt();

				carrinho.get(4).tirarEstoque(quntTenis);

				System.out.println("QNT ESTOQUE ATUAL: " + carrinho.get(4).getQtdeEstoque());

				totalTenis = quntTenis * 200.99;
				System.out.println("Total Tenis R$" + totalTenis);

			}

			else if (opcao.equals("6")) {

				totalFinal = totalCalca + totalCasaco + totalMeia + totalRoupa + totalTenis;
				linha();
				System.out.println("VALOR GASTO R$" + totalFinal);

				System.out.println(
						"Qual a forma de Pagamento? \n1- PG a Vista | 2- No Cartão \n3- Parcelado em 1X | 4- Parcelado em 2X");
				linha();

				char formaPg = leia.next().charAt(0);

				if (formaPg == '1') {

					desconto = totalFinal * 0.10;
					imposto = totalFinal * 0.09;
					totalFinal = totalFinal - desconto;
					
					linhaNotaFiscal();
					notaFical.notaFiscal();
					System.out.println("DESCRIÇÃO\tCODIGO\t\t\tVALOR"); //COLOCAR QUANTIDADE DE PRODUTOS COMPRADOR

					for (Produto p : vendas) {

						System.out.println();
						System.out.println(p.getDescricao() + "\t\t" + p.getCodigo() + "\t\t\t" + "R$" +p.getValorunitario());

					}
					System.out.println();
					System.out.printf("Valor do desconto R$%.2f \nValor a ser Pago R$%.2f", desconto, totalFinal);
					System.out.println();
					System.out.printf("\nValor Imposto R$%.2f", imposto);
					linhaNotaFiscal();

					vendas.clear();

				} else if (formaPg == '2') {					
					
					imposto = totalFinal * 0.09;
					
					linhaNotaFiscal();
					notaFical.notaFiscal();
					System.out.println("DESCRIÇÃO\tCODIGO\t\t\tVALOR");

					for (Produto p : vendas) {

						System.out.println();
						System.out.println(p.getDescricao() + "\t\t" + p.getCodigo() + "\t\t\t" + "R$" +p.getValorunitario());

					}
					System.out.println();
					System.out.printf("Valor a ser Pago R$%.2f", totalFinal);
					System.out.println();
					System.out.printf("\nValor Imposto R$%.2f", imposto);
					linhaNotaFiscal();

					vendas.clear();

				} else if (formaPg == '3') {

					juros1 = totalFinal * 0.10;
					imposto = totalFinal * 0.09;
					totalFinal = totalFinal + juros1;

					notaFical.notaFiscal();
					System.out.printf("Valor em juros R$ %.2f \nValor a ser Pago R$:%.2f ", juros1, totalFinal);
					System.out.printf("\nValor Imposto %.2f", imposto);

				} else if (formaPg == '4') {

					juros2 = totalFinal * 0.20;
					totalFinal = totalFinal + juros2;
					valorParcela = totalFinal / 2;
					imposto = totalFinal * 0.09;

					notaFical.notaFiscal();
					System.out.printf(
							"Valor em juros R$ %.2f \nValor a ser Pago R$ %.2f \nValor de cada Pacela R$ %.2f", juros2,
							totalFinal, valorParcela);
					System.out.printf("\nValor Imposto %.2f", imposto);

				}

			}

		} while (opcao != "7");

	}

	public static void linha() {

		System.out.println("\n=====================================================================\n");

	}
	public static void linhaNotaFiscal() {

		System.out.println("\n**********************************************************************\n");

	}

}
