package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExOrdemCrescente {
	public static void main (String args[]) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  segundo Valor"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro Valor"));
		double num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  quarto Valor"));
		if(num4 < num1) {
			JOptionPane.showMessageDialog(null,num4);
			JOptionPane.showMessageDialog(null,num1);
			JOptionPane.showMessageDialog(null,num2);
			JOptionPane.showMessageDialog(null,num3);
		}else if(num4 < num2){
			JOptionPane.showMessageDialog(null,num1);
			JOptionPane.showMessageDialog(null,num4);
			JOptionPane.showMessageDialog(null,num2);
			JOptionPane.showMessageDialog(null,num3);
			
		}else if(num4 < num3){
			JOptionPane.showMessageDialog(null,num1);
			JOptionPane.showMessageDialog(null,num2);
			JOptionPane.showMessageDialog(null,num4);
			JOptionPane.showMessageDialog(null,num3);
			
		}else {
			JOptionPane.showMessageDialog(null,num1);
			JOptionPane.showMessageDialog(null,num2);
			JOptionPane.showMessageDialog(null,num3);
			JOptionPane.showMessageDialog(null,num4);
			
		}
		
		
	}
}
