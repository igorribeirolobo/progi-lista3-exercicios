package exercicio03;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		f.setDias(30);
		for(int i = 0; i < f.getDias(); i++)
		{
			f.horasTrabalhadas(f.lerNumeroDouble("Informe a hora trabalhada hoje: "));
		}
	   f.getHoras();
	}

}
