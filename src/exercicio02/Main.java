package exercicio02;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		for(int i = 0; i < 45; i++)
		{
			f.setQtd(f.lerNumero("Informe a quantidade do produto em estoque "+ i +": "), i);
			f.setPreco(f.lerNumeroDouble("Informe o valor unitário do produto "+ i +": "), i);
			f.setGasto(i);
		}
		
		f.listaTotal();

	}

}
