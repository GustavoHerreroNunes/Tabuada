/* Este c�digo tem o objetivo de receber um valor 
 * do usu�rio entre 1 e 10 para realizar uma pequena
 * tabuada (multiplicando do 1 ao 10)
 */

package Gerais;

import javax.swing.JOptionPane;

public class Exerc2_Tabua {

	public static void main(String[] args) {
		short Num =0, Tabua[] = new short[10], y=0;
		String Result = "";
		
		do {//O programa pede a entrada de dados pelo meno uma vez ao usu�rio
			
			Num = Short.parseShort(JOptionPane.showInputDialog(null, "Insira um valor entre 1 e 10", "Tabuada", 3));
			
			if(Num<1 || Num>10)//Caso o n�mero n�o estiver entre 1 e 10 um aviso � disparado
				
				JOptionPane.showMessageDialog(null, "ERROR_NumberRequirement\nN�mero digitado fora dos requesitos.\nPor favor digitar n�mero entre 1 e 10!", "Tabuada", 0);
			
		}while(Num<1||Num>10);//Repetir enquanto Num for maior que 10 ou menor que 1
		
		for(int x =1; x <=10; x++) {//Confec��o da tabuada com o valor digitado
			
			Tabua[y] = (short) (x*Num);
			Result += Num + " x " + x + " = " + Tabua[y] + "\n";
			y++;
		}
		
		JOptionPane.showMessageDialog(null, Result, "Tabuada", 1);

	}

}
