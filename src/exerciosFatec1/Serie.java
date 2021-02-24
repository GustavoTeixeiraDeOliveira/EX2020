package exerciosFatec1;
import javax.swing.JOptionPane;
public class Serie {
	public static void main (String args[]) {
		double num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que vai gerar a serie"));
		double serie =  GerarSerie(num);
		JOptionPane.showMessageDialog(null,serie);
	}
	static double GerarSerie(double num) {
		double serie = 0;
		while(num>= 1) {
			serie = serie + (1/num);
			num--;
		}
		return serie;
		
	}
}
