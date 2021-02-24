package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExCelsiosFaherit {
   public static void main (String args[]) {
	   double celsios;
	   celsios = Double.parseDouble(JOptionPane.showInputDialog("Digite temperatura em celsios"));
	   double fahrenheit = ((9*celsios+160)/5);
	   JOptionPane.showMessageDialog(null,"A temperatura convertida em fahrenheit é: " +fahrenheit);
   }
	
}
