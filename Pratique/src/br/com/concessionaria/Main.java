package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculo;

public class Main {

	public static void main(String[] args) {

		// Instanciamento da Oficina.
		Oficina oficina = new Oficina("Oficina");

		// Declara��o de 3 Objetos da Classe Ve�culos.
		Veiculo veiculo01 = new Veiculo("ABC0101", 2001, 1, "ABC1DEF", "BRANCO", 2010);
		Veiculo veiculo02 = new Veiculo("ABC0202", 2002, 2, "ABC2DEF", "VERDE", 2020);
		Veiculo veiculo03 = new Veiculo("ABC0303", 2003, 3, "ABC3DEF", "PRETO", 2030);

		// Inclus�o dos Ve�culos na Oficina.
		oficina.adicionarVeiculo(veiculo01);
		oficina.adicionarVeiculo(veiculo02);
		oficina.adicionarVeiculo(veiculo03);

		// Quantidade de Pe�as neces�rias na Oficina ap�s a inclus�o dos Ve�culos.
		System.out.println("");
		System.out.println("1. Quantidade de Pe�as neces�rias na Oficina: " + oficina.getPecasNecessarias());

		// Exclus�o dos Ve�culos na Oficina.
		oficina.removerVeiculo(veiculo01);

		// Quantidade de Pe�as neces�rias na Oficina ap�s a exclus�o de um Ve�culo.
		System.out.println("");
		System.out.println("2. Quantidade de Pe�as neces�rias na Oficina: " + oficina.getPecasNecessarias());
		System.out.println("");

		// Declara��o de 10 Objetos da Classe Pe�as.
		Peca peca01 = new Peca("PNEU", 201.50f, "16/01/2022");
		Peca peca02 = new Peca("RODA", 202.50f, "16/02/2022");
		Peca peca03 = new Peca("COROA", 203.50f, "16/03/2022");
		Peca peca04 = new Peca("VOLANTE", 204.50f, "16/04/2022");
		Peca peca05 = new Peca("MOTOR", 205.50f, "16/05/2022");
		Peca peca06 = new Peca("MOLA", 206.50f, "16/06/2022");
		Peca peca07 = new Peca("AMORTECEDOR", 207.50f, "16/07/2022");
		Peca peca08 = new Peca("FREIO", 208.50f, "16/08/2022");
		Peca peca09 = new Peca("PORTA", 209.50f, "16/09/2022");
		Peca peca10 = new Peca("VIDRO", 210.50f, "16/10/2022");

		// Inclus�o das Pe�as na Oficina.
		oficina.adicionarPeca(peca01);
		oficina.adicionarPeca(peca02);
		oficina.adicionarPeca(peca03);
		oficina.adicionarPeca(peca04);
		oficina.adicionarPeca(peca05);
		oficina.adicionarPeca(peca06);
		oficina.adicionarPeca(peca07);
		oficina.adicionarPeca(peca08);
		oficina.adicionarPeca(peca09);
		oficina.adicionarPeca(peca10);

		// Declara��o de 3 Objetos da Classe Mec�nicos.
		Mecanico mecanico01 = new Mecanico("FAB�OLA", 1, 1);
		Mecanico mecanico02 = new Mecanico("JOS�", 2, 2);
		Mecanico mecanico03 = new Mecanico("MARIO", 3, 3);

		// Inclus�o dos Mec�nicos na Oficina.
		oficina.adicionarMecanico(mecanico01);
		oficina.adicionarMecanico(mecanico02);
		oficina.adicionarMecanico(mecanico03);

		// Implementa��o do M�todo valorTotalPecas().
		System.out.println("--------------------------");
		System.out.println("Implementa��o do M�todo valorTotalPecas().");
		System.out.println("--------------------------");
		float valorTotalPecas = oficina.valorTotalPecas();
		System.out.println("");
		System.out.println("Somat�rio Total das Pe�as na Oficina: R$ " + valorTotalPecas);

		// Implementa��o do M�todo realizarRevisaoVeiculos().
		System.out.println("");
		System.out.println("Pode haver revis�o dos Ve�culos na Oficina?");
		boolean resposta = oficina.realizarRevisaoVeiculos();
		if (resposta) {
			
			System.out.println("--> Sim! Os Ve�culos podem ser revisados.");
			
			for (Veiculo veiculo : oficina.getListaVeiculos()) {
				System.out.println("");
				System.out.println("Placa: " + veiculo.getPlaca());
			}

			System.out.println("");

			for (Mecanico mecanico : oficina.getListaMecanicos()) {
				System.out.println("");
				System.out.println("Nome..............: " + mecanico.getNome());
				System.out.println("Carros Simult�neos: " + mecanico.getCarrosSimultaneos());
			}

			System.out.println("");

			for (Peca peca : oficina.getListaPecas()) {
				System.out.println("");
				System.out.println("Nome..........: " + peca.getNome());
				System.out.println("Valor.........: " + peca.getValor());
				System.out.println("Data da Compra: " + peca.getDataCompra());
			}

		} else {
			System.out.println("--> N�o! Os Ve�culos N�O podem ser revisados.");
		}

	}

}
