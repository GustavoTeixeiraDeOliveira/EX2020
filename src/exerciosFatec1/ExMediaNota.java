package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExMediaNota {
	static double n1 ;
	static double n2 ;
	static double n3 ;
	static double n4 ;
	
	public static void main (String args[]) {
		 n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		 n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		 n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		 n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
		calculo_media();
	}
	static void calculo_media() {	
		double media = (n1 + n2 + n3 + n4)/4;
		if(media>=6) {
			JOptionPane.showMessageDialog(null,"Aprovado");
		}else if(media>=3) {
			JOptionPane.showMessageDialog(null,"Exame");
		}else {
			JOptionPane.showMessageDialog(null,"Reprovado");	
		}
	}
}
