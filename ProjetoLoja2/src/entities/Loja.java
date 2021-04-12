package entities;

public class Loja{
	
	private String nome; 
	private String cnpj;
	
	public Loja(String nome, String cnpj) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void notaFiscal() {
	
	System.out.println("\t\t--- Loja GENNER ---\n\nCNPJ: 00.123.987/0001-05  //  NUMERO: NF-134658");
	
	}
	

}
