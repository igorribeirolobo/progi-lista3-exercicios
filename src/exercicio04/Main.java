package exercicio04;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		f.setSalarioHora(10.00);
		for(int i = 0; i < 30;i++)
		{
			f.setHr(f.lerNumeroDouble("Informe a hora trabalhada hoje: "));
		}
		f.caluloSalarioBruto();
		f.getSalarioBruto();
	}

}
