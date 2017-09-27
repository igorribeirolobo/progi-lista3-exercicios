package exercicio05;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		for(int i = 1;i <= 50; i++)
		{
		f.converterCelsius(i);
		f.getCelsius();
		}
		f.getLista();
		
	}

}
