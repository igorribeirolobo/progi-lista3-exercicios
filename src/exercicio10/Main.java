package exercicio10;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		f.setQtdProdutos(f.lerNumero("Informe a quantidade de Itens a ser inserido: "));
		f.setVetor();
		for (int i = 0; i < f.getQtdProdutos(); i++) {
			f.setPreco(f.lerNumeroDouble("Informe o preço unitário do produto: "), i);
			f.setQtdItem(f.lerNumero("informe a quantidade de item comprado: "), i);
			f.somar(f.getPreco(i) * f.getQtdItem(i));
		}
		f.getMessage();

	}

}
