package exerciosFatec1;
import javax.swing.JOptionPane;
public class trocaValor {
	public static void main (String args[]) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite x"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite y"));
		double temp = x;
		x=y;
		y= temp;
		JOptionPane.showMessageDialog(null,"O valor de x é: " +x);
		JOptionPane.showMessageDialog(null,"O valor de y é: " +y);
	}
}
