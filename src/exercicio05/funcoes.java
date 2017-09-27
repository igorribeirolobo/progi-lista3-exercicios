package exercicio05;

import javax.swing.JOptionPane;

public class funcoes {
  
	private int celsius;
	private int fahrenheit;
	private String lista;
	public void converterCelsius(int f)
	{   this.fahrenheit = f;
		this.celsius = ((5/9) * (f-32));
	}
	public double Celsius()
	{
		return this.celsius;
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
	public void getCelsius()
	{
		this.lista += this.fahrenheit+"f - "+this.celsius+"c \n";
	}
	public void getLista()
	{
		JOptionPane.showMessageDialog(null,this.lista);
	}
	
	
}
