package entities;

public class Calca extends Produto{
	
	private String marca;

	public Calca(String descricao, String codigo, double valorunitario, int qtdeEstoque, String marca) {
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
