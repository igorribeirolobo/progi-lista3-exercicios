package exercicio08;

import javax.swing.JOptionPane;

public class funcoes {
	private int[] num = new int[20];
	private int maior = 0;
	private int menor = 0;
	public void setNum(int pos,int num)
	{
		this.num[pos] = num;
	}
	public int getNum(int pos)
	{
		return this.num[pos];
	}
	public void setMaior(int n)
	{
		this.maior = n;
	}
	public void setMenor(int n)
	{
		this.menor = n;
	}
	public int getMaior()
	{
		return this.maior;
	}
	public int getMenor()
	{
		return this.menor;
	}
	public static int lerNumero(String mensagem)
	{  
		
	   int numero = 0;
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
	
	public void resultado()
	{
		JOptionPane.showMessageDialog(null,"O maior numero foi: "+ this.getMaior());
	}
}
