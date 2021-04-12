package entities;

public class Meia extends Produto {
	
	private String marca;

	public Meia(String descricao, String codigo, double valorunitario, int qtdeEstoque, String marca) {
		super(descricao, codigo, valorunitario, qtdeEstoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
