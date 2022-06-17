package br.com.concessionaria.funcionarios;

public class Mecanico {

	// Atributos.
	private String nome;
	private int anosExperiencia;
	private int carrosSimultaneos;

	// Método Construtor.
	public Mecanico(String nome, int anosExperiencia, int carrosSimultaneos) {
		super();
		this.nome = nome;
		this.anosExperiencia = anosExperiencia;
		this.carrosSimultaneos = carrosSimultaneos;
	}

	// Métodos getters and Setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public int getCarrosSimultaneos() {
		return carrosSimultaneos;
	}

	public void setCarrosSimultaneos(int carrosSimultaneos) {
		this.carrosSimultaneos = carrosSimultaneos;
	}

}
