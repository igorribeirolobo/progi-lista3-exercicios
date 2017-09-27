package exercicio01;

import javax.swing.JOptionPane;

public class funcoes {

	private int resultado;
	private int qtdcaixas;
	public void Calcular(int peso)
	{
		this.resultado += peso;
	}
	public void setCaixas(int caixa)
	{
		this.qtdcaixas = caixa;
	}
	public int getCaixas()
	{
		return this.qtdcaixas;
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
	public void getResultado()
	{
		JOptionPane.showMessageDialog(null,Integer.toString(this.resultado) + "Kg" );
	}
	
	
}
