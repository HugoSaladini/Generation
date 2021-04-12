package entities;

public class Produto {
	
	private String descricao;
	private String codigo;
	private double valorunitario;
	private int qtdeEstoque = 10;
	
	public Produto(String descricao, String codigo, double valorunitario, int qtdeEstoque) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorunitario = valorunitario;
		
	}

	public String getDescricao() {
		return descricao;
	}
	/*
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}*/

	public String getCodigo() {
		return codigo;
	}
	/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/

	public double getValorunitario() {
		return valorunitario;
	}
	/*
	public void setValorunitario(String valorunitario) {
		this.valorunitario = valorunitario;
	}*/
	
	//int qtdeEstoque
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
		
	}
	
	public void tirarEstoque(int valorSerExcluido) {
		if(this.qtdeEstoque >= valorSerExcluido) {
		   this.qtdeEstoque -= valorSerExcluido;
		}
		else {
			System.out.println("Quantidade Indisponível !");
		}
		
	
	}
}
