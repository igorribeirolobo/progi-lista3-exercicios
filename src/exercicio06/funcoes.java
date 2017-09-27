package exercicio06;

import javax.swing.JOptionPane;

public class funcoes {
   private int H;
   private int N;
   
   public void setN(int n)
   {
	   this.N = n;
   }
   public void setH(int n)
   {
	   this.H += n;
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
   public int getN()
   {
	   return this.N;
   }
   
   public void getH()
   {
	   JOptionPane.showMessageDialog(null,this.H);
   }
}
