package exerciosFatec1;
import javax.swing.JOptionPane;
public class CalculoSalario {
	public static void main (String args[]) {
		double HT = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
		double VHT = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
		double PD = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
		double ND = Double.parseDouble(JOptionPane.showInputDialog("Digite o  numero de dependentes"));
		double SB = (HT*VHT);
		double SL = (SB-(SB*(PD/100)));
		double SF = SL+(ND*100);
		JOptionPane.showMessageDialog(null,"O Salario final é: " +SF);
	}
}
