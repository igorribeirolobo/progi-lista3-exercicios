package exercicio04;

import javax.swing.JOptionPane;

public class funcoes {
	private double salarioHora;
	private double hr;
	private double salarioBruto;
	
	public void setSalarioHora(double salario)
	{
		this.salarioHora = salario;
	}
	
	public void setHr(double hr)
	{
		this.hr += hr;
	}
	
	public void caluloSalarioBruto()
	{
		this.salarioBruto = this.hr * this.salarioHora;
	}
	public static double lerNumeroDouble(String mensagem)
	{  double numero = 0;
	   boolean valida = true;
	   while(valida)
	   {
		   try {
			   numero = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
			   valida = false;
		   }
		   catch(NumberFormatException e)
		   {
			   JOptionPane.showMessageDialog(null, "informe um numero válido, erro: "+ e.toString());
	       }
	   }
	   
	   return numero;
	}
   
	public void getSalarioBruto()
	{
		JOptionPane.showMessageDialog(null,"Seu salário bruto é: "+ this.salarioBruto );
	}
}
