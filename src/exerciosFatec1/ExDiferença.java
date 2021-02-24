package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExDiferença {
	public static void main (String args[]) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Valor"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o  segundo Valor"));
		double Dif = 0;
		if(x>y) {
			 Dif = x-y;		
		}else{
			 Dif = y -x;
		}
		JOptionPane.showMessageDialog(null,"A diferença é: " +Dif);
		
	}
	
}
