package entities;

public class Roupa extends Produto{

	private String marca;

	public Roupa(String descricao, String codigo, double valorunitario, int qtdeEstoque, String marca) {
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
