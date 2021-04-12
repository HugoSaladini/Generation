package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calca;
import entities.Casaco;
import entities.Meia;
import entities.Roupa;
import entities.Tenis;

public class CadVendas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
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
				
		
		char opcao;

		do {
			System.out.println("Bem vindes a loja Geener!");
			System.out.println("\nEscolha uma categoria para navegar em nosso site");
			System.out.println();
			System.out.println("1 - Camisa \n2 - Meia \n3 - Calça \n4 - Casaco \n5 - Tenis \n6-Sair");
			opcao = leia.next().charAt(0);
			
			if (opcao < '1' || opcao > '6') {
				System.out.println("Opção invalida, tenta de novo ai...");
		
			}	else if (opcao == '1') {

				Roupa prod = new Roupa("Camisa ", "CDC 0123 R$", 21.50, 10, " Genner ");

				System.out.println(prod.getDescricao() + prod.getCodigo() + prod.getValorunitario() 
				+ prod.getMarca() + " QNT ESTOQUE: " + prod.getQtdeEstoque());
				System.out.println("Qnts unidades deseja? ");

				int quntRoupa = leia.nextInt();
				prod.tirarEstoque(quntRoupa);

				System.out.println("QNT ESTOQUE ATUAL: " + prod.getQtdeEstoque());
				
				totalRoupa =  quntRoupa * 21.50;
				System.out.println("Total Roupas R$"+ totalRoupa);
				

			} else if (opcao == '2') {

				Meia prod2 = new Meia("Meia Top", " CDC 1245 R$", 50.05, 10, " Genner");
				System.out.println(prod2.getDescricao() + prod2.getCodigo() + prod2.getValorunitario()
						+ prod2.getMarca() + " QNT ESTOQUE: " + prod2.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntMeia = leia.nextInt();

				prod2.tirarEstoque(quntMeia);

				System.out.println("QNT ESTOQUE ATUAL: " + prod2.getQtdeEstoque());
				
				totalMeia =  quntMeia * 50.05;
				System.out.println("Total Meia R$"+ totalMeia);

			} else if (opcao == '3') {

				Calca prod3 = new Calca("Calça Top", " CDC 9856 R$", 159.99, 0, " Genner");
				System.out.println(prod3.getDescricao() + prod3.getCodigo() + prod3.getValorunitario()
						+ prod3.getMarca() + " QNT ESTOQUE: " + prod3.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntCalca = leia.nextInt();

				prod3.tirarEstoque(quntCalca);

				System.out.println("QNT ESTOQUE ATUAL: " + prod3.getQtdeEstoque());
				
				totalCalca =  quntCalca * 159.99;
				System.out.println("Total Calça R$"+ totalCalca);

			} else if (opcao == '4') {

				Casaco prod4 = new Casaco("Casaco de Frio", " CDC 2587 R$", 120.99, 0, " Genner");
				System.out.println(prod4.getDescricao() + prod4.getCodigo() + prod4.getValorunitario()
						+ prod4.getMarca() + " QNT ESTOQUE: " + prod4.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntCasaco = leia.nextInt();

				prod4.tirarEstoque(quntCasaco);

				System.out.println("QNT ESTOQUE ATUAL: " + prod4.getQtdeEstoque());
				
				totalCasaco =  quntCasaco * 120.99;
				System.out.println("Total Casaco R$"+ totalCasaco);

			} else if (opcao == '5') {

				Tenis prod5 = new Tenis("Tenis ", " CDC 4650 R$", 200.99, 0, " Genner");
				System.out.println(prod5.getDescricao() + prod5.getCodigo() + prod5.getValorunitario()
						+ prod5.getMarca() + " QNT ESTOQUE: " + prod5.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntTenis = leia.nextInt();

				prod5.tirarEstoque(quntTenis);

				System.out.println("QNT ESTOQUE ATUAL: " + prod5.getQtdeEstoque());
				
				totalTenis =  quntTenis * 200.99;
				System.out.println("Total Tenis R$"+ totalTenis);

			}
			
		} while (opcao !='6' );
		
		totalFinal = totalCalca + totalCasaco + totalMeia +	totalRoupa + totalTenis;
		System.out.println(" Ce gasto issu: R$"+ totalFinal);
		
		System.out.println("Vai paga como? 1- A vista no Cacau 2- No Debito 3- Vai parcela em 1 veix 4- Vai parcela em 2 veix");
		
		char formaPg=leia.next().charAt(0);
		
		if (formaPg =='1') {
			
			desconto = totalFinal * 0.10;
			totalFinal = totalFinal - desconto;
			
			System.out.println("Valor do desconto" + desconto + " Valor a ser Pago R$" + totalFinal);
			
		} else if (formaPg =='2') {
			
			System.out.println("Valor a ser Pago R$: " + totalFinal);
			
		} else if (formaPg =='3') {
			
			juros1 = totalFinal * 0.10;
			totalFinal = totalFinal + juros1;
			System.out.println("Valor em juros" + juros1 + "Valor a ser Pago R$: " + totalFinal);
			
		} else if (formaPg =='4') {
			
			juros2 = totalFinal * 0.20;
			totalFinal = totalFinal + juros2;
			System.out.println("Valor em juros" + juros2 + "Valor a ser Pago R$: " + totalFinal);
			
		}			
		
		imposto = totalFinal * 0.09;
		
		System.out.println("Loja GEENER");
		System.out.println("00.123.987/0001-05");
		System.out.println("NUMERO NF-134658");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		System.out.println("Loja GEENER");
		
	}
	
}
