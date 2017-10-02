package exercicio09;

import exercicio08.funcoes;

public class Main {

	public static void main(String[] args) {
		funcoes f = new funcoes();
		 
		for(int i = 0; i < 20; i++)
		{
			f.setNum(i,f.lerNumero("informe um numero inteiro: "));
			if(i == 0)
			{
				f.setMaior(f.getNum(i));
				f.setMenor(f.getNum(i));
			}
			if(f.getMaior() < f.getNum(i))
			{
				f.setMaior(f.getNum(i));
			}
			if(f.getMenor() > f.getNum(i))
			{
				f.setMenor(f.getNum(i));
			}
		}
		f.resultado();

	}

}
