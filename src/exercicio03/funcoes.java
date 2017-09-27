package exercicio03;

import javax.swing.JOptionPane;

public class funcoes {
   private double hr;
   private int dias;
	public void horasTrabalhadas(double hr)
	{
		this.hr += hr;
	}
	public void setDias(int dias)
	{
		this.dias = dias;
	}
	public int getDias()
	{
		return this.dias;
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
	   
	   public void getHoras()
	   {   
		    JOptionPane.showMessageDialog(null, this.hr);
	   }
}
