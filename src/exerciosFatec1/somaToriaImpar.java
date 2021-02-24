package exerciosFatec1;
import javax.swing.JOptionPane;
public class somaToriaImpar {
	public static void main (String args[]) {
		int v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Valor"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo Valor"));
		int maior = 0;
		int menor = 0;
		int soma = 0;
		if(v1 > v2) {
			maior = v1;
			menor = v2;
		}else if(v1 < v2) {
			maior = v2;
			menor = v1;
		}else {
			JOptionPane.showMessageDialog(null,soma);
		}
		menor = menor +1;
		while(maior>menor) {
			if(menor%2 != 0) {
				soma = soma + menor;
			}
			menor = menor +1;
		}
		JOptionPane.showMessageDialog(null,soma);
		
	}
}
