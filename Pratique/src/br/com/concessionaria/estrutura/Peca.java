package br.com.concessionaria.estrutura;

public class Peca {

	// Atributos.
	private String nome;
	private float valor;
	private String dataCompra;

	// Método Construtor.
	public Peca(String nome, float valor, String dataCompra) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.dataCompra = dataCompra;
	}

	// Métodos getters and Setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

}
