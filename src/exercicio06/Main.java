package exercicio06;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		f.setN(f.lerNumero("Informe um número inteiro: "));
		for(int i = 1; i<= f.getN(); i++)
		{
			f.setH(i);
		}
		
		f.getH();

	}

}
