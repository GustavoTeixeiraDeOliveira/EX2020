package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExSereiFibonaci {
	public static void main (String args[]) {
		int NumSerie  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Serie"));
		double ValorFinalSerie = GerarSerie(NumSerie);
		JOptionPane.showMessageDialog(null,ValorFinalSerie);
	}
	
	static double GerarSerie(int NumSerie) {
		double valorSerie = 0;
		int fib = 0;
		for(int i = NumSerie; i>=1; i--) {
			fib = Fibonaci(i);
			valorSerie = valorSerie+(valorSerie/fib);
		}
		return valorSerie;
	}
	
	static int Fibonaci(int i) {
		for(int x = i; x>=2; x--) {
		      i= i*(x-1);	
		}
		
		return i;
	}
}
