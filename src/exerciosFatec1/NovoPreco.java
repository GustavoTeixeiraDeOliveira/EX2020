package exerciosFatec1;
import javax.swing.JOptionPane;
public class NovoPreco {
	public static void main (String args[]) {
		double precoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco atual"));
		double mediaM = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal"));
		precoA = GerarSerie(precoA,mediaM);
		JOptionPane.showMessageDialog(null,precoA);
	}
	
	static double GerarSerie(double precoA,double mediaM) {
		if(mediaM<500 && precoA<30) {
		 precoA = precoA*1.10;
		}else if(mediaM>=500 && mediaM<1000 && precoA>=30 && precoA<80) {
	     precoA = precoA*1.15;
		}else if(mediaM>=1000 && precoA>=80) {
		 precoA=(precoA-(precoA*0.05));
		}
		
		return precoA;
		
	}
}
