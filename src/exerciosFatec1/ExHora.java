package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExHora {
	static int Hi;
	static int Mi;
	static int Hf;
	static int Mf;
	
	public static void main (String args[]) {
		Hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
		Mi = Integer.parseInt(JOptionPane.showInputDialog("Digite a minuto inicial"));
		Hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final"));
		Mf = Integer.parseInt(JOptionPane.showInputDialog("Digite a minuto final"));
		calculo_Hora();
	}
	static void calculo_Hora() {
		int Hp;
		int Mp;
		if(Hi<=Hf) {
			Hp = Hf- Hi; 
		}else {
			Hp = (24-Hi)+Hf;
		}
		
		if(Mi<=Mf) {
			Mp = Mf- Mi; 
		}else {
			Mp = (60-Mi)+Mf;
			Hp--;
		}
		JOptionPane.showMessageDialog(null,"Se passaram: "+ Hp+ " Horas e "+Mp+" Minutos.");
	}
}
