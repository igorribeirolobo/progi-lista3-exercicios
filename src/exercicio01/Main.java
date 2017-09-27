package exercicio01;

public class Main {

	public static void main(String[] args) {
	    funcoes f = new funcoes();
	    f.setCaixas(25);
	    for(int i = 1;i <= f.getCaixas();i++)
	    {
	    	f.Calcular(f.lerNumero("Favor informar o peso da "+ i + " caixa: "));
	    }
	    
	    f.getResultado();

	}

}
