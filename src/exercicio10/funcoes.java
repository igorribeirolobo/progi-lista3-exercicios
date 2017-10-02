package exercicio10;

import javax.swing.JOptionPane;

public class funcoes {
	private int qtdProdutos;
	private double total = 0;
	private double[] preco;
	private int[] qtdItem;
	
	public void setVetor()
	{
		preco = new double[this.qtdProdutos];
		qtdItem = new int[this.qtdProdutos];
	}
	public void setPreco(double preco, int pos) {
		this.preco[pos] = preco;
	}
	public void setQtdItem(int item, int pos)
	{
		this.qtdItem[pos] = item;
	}
	public void somar(double total)
	{
		this.total += total;
	}
	public int getQtdProdutos()
	{
		return this.qtdProdutos;
	}
	public double getPreco(int pos)
	{
		return this.preco[pos];
	}
	public int getQtdItem(int pos)
	{
		return this.qtdItem[pos];
	}
	public void setQtdProdutos(int qtdProduto)
	{
		this.qtdProdutos = qtdProduto;
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
	   public void getMessage()
	   {   String resultado = String.format("%.2f", this.total);
		   JOptionPane.showMessageDialog(null,"O total gasto foi: R$"+resultado);
	   }

}
