package exercicio07;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		int n = 0;
		f.setN(f.lerNumero("Informe um numero inteiro positivo: "));
		if(f.getN() > 0)
		{ n = 1;
		for(int i = 1; i <= f.getN(); i++)
		{
			n =  i * n;
		}
		}
		else if(f.getN() < 0)
		{
			f.setN(0);
		}
		else
		{
			f.setN(1);
		}
		f.getResultado(n);

	}

}
