package exercicio07;

import javax.swing.JOptionPane;

public class funcoes {

	private int N;
	
	public void setN(int N)
	{
		this.N = N;
	}
	public int getN()
	{
		return this.N;
	}
	public static int lerNumero(String mensagem)
	{  int numero = 0;
	   boolean valida = true;
	   while(valida)
	   {
		   try {
			   numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			   valida = false;
		   }
		   catch(NumberFormatException e)
		   {
			   JOptionPane.showMessageDialog(null, "informe um numero válido, erro: "+ e.toString());
	       }
		  
	   }
	   return numero;	
	}
	public void getResultado(int z)
	{
		JOptionPane.showMessageDialog(null,z);
	}
}
