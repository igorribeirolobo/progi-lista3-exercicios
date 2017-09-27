package exercicio02;

import javax.swing.JOptionPane;

public class funcoes {
	private int[] qtd = new int[45];
	private double[] preco = new double[45];
	private double vrGasto;

	public void setQtd(int qtd, int pos) {
		this.qtd[pos] = qtd;
	}
	public void setPreco(double preco, int pos)
	{
		this.preco[pos] = preco;
	}
	public int getQtd(int pos)
	{
		return this.qtd[pos];
	}
	public double getPreco(int pos)
	{
		return this.preco[pos];
	}
	public void setGasto(int pos)
	{ 
		double vrSubtotal = this.preco[pos] * this.qtd[pos];
		
		this.vrGasto += vrSubtotal;
		
	}
	public void listaTotal()
	{
		String total = "";
		String resultado = String.format("%.2f", this.vrGasto);
		for(int i = 1; i < 45;i++)
		{
			total += "Produto: "+ i +" Quantidade: "+ this.qtd[i] +" Preço: "+this.preco[i]+" \n";
		}
		total += "\n Valor total gasto: R$"+ resultado;
		JOptionPane.showMessageDialog(null,total);
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
}
