package br.com.concessionaria.oficina;

import java.util.ArrayList;
import java.util.Random;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {

	// Atributos.
	private String nome;
	private ArrayList<Mecanico> listaMecanicos;
	private ArrayList<Peca> listaPecas;
	private ArrayList<Veiculo> listaVeiculos;
	private int pecasNecessarias;

	// Métodos construtor.
	public Oficina(String nome) {
		super();
		this.nome = nome;
		listaMecanicos = new ArrayList<Mecanico>();
		listaPecas = new ArrayList<Peca>();
		listaVeiculos = new ArrayList<Veiculo>();
	}

	// Métodos Específicos.
	public void adicionarMecanico(Mecanico mecanico) {
		this.getListaMecanicos().add(mecanico);
		System.out.println("--> Mecânico adicionado com sucesso!");
	}

	public void removerMecanico(Mecanico mecanico) {

	}

	public void adicionarPeca(Peca peca) {
		this.getListaPecas().add(peca);
		System.out.println("--> Peça adicionada com sucesso!");
	}

	public void removerPeca(Peca peca) {

	}

	public void adicionarVeiculo(Veiculo veiculo) {
		int numeroDePecasNecessariasIncluidas = verificarPecasRevisao();
		this.pecasNecessarias += numeroDePecasNecessariasIncluidas;
		this.getListaVeiculos().add(veiculo);
		System.out.println(
				"--> Veículo adicionado com sucesso! E necessita de " + numeroDePecasNecessariasIncluidas + " Peças.");

	}

	public void removerVeiculo(Veiculo veiculo) {
		int numeroDePecasNecessariasRemovidas = verificarPecasRevisao();
		this.pecasNecessarias -= numeroDePecasNecessariasRemovidas;
		this.getListaVeiculos().remove(veiculo);
		System.out.println(
				"--> Veículo removido com sucesso! Sendo " + numeroDePecasNecessariasRemovidas + " Peças removidas.");
	}

	public int verificarPecasRevisao() {
		Random numeroAleatorio = new Random();
		int numeroDePecasUtilizadas = numeroAleatorio.nextInt(3) + 1;
		return numeroDePecasUtilizadas;
	}

	public boolean realizarRevisaoVeiculos() {

		boolean possoRevisar = false;
		int carrosSimultaneos = 0;

		for (Mecanico mecanico : this.getListaMecanicos()) {
			carrosSimultaneos += mecanico.getCarrosSimultaneos();
		}

		if (this.getListaVeiculos().size() > 0) {
			if (this.getListaPecas().size() >= this.pecasNecessarias) {
				if ((this.getListaMecanicos().size() > 0) && (carrosSimultaneos >= this.getListaMecanicos().size())) {
					possoRevisar = true;
				} else {
					System.out.println("--> Não existem Mecânicos ou eles não dão conta do atendimento dos veículos.");
					possoRevisar = false;
				}
			} else {
				System.out.println("--> Não há Peças suficientes na Oficina!");
				possoRevisar = false;
			}
		} else {
			System.out.println("--> Não há veículos na Oficina!");
			possoRevisar = false;
		}

		return possoRevisar;
	}

	public float valorTotalPecas() {
		
		float somatorioTotalDasPecas = 0;

		for (Peca peca : this.getListaPecas()) {
			System.out.println("");
			System.out.println("Nome da Peça.: " + peca.getNome());
			System.out.println("Valor da Peça: R$" + peca.getValor());
			somatorioTotalDasPecas += peca.getValor();
		}
	
		return somatorioTotalDasPecas;
	}

	// Métodos getters and Setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Mecanico> getListaMecanicos() {
		return listaMecanicos;
	}

	public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
		this.listaMecanicos = listaMecanicos;
	}

	public ArrayList<Peca> getListaPecas() {
		return listaPecas;
	}

	public void setListaPecas(ArrayList<Peca> listaPecas) {
		this.listaPecas = listaPecas;
	}

	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public int getPecasNecessarias() {
		return pecasNecessarias;
	}

	public void setPecasNecessarias(int pecasNecessarias) {
		this.pecasNecessarias = pecasNecessarias;
	}

}
