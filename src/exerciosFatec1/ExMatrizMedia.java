package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExMatrizMedia {
	public static void main (String args[]) {
		double notas[][]= new double[3][2];
		double media[] = new double[3];
		notas[0][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do primeiro aluno"));
		notas[0][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do primeiro aluno"));
		notas[1][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do segundo aluno"));
		notas[1][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do segundo aluno"));
		notas[2][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do terceiro aluno"));
		notas[2][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do terceiro aluno"));
		media[0] = ((notas[0][0]+notas[0][1])/2);
		media[1] = ((notas[1][0]+notas[1][1])/2);
		media[2] = ((notas[2][0]+notas[2][1])/2);
		JOptionPane.showMessageDialog(null,"Media do primeiro aluno: "+ media[0]);
		JOptionPane.showMessageDialog(null,"Media do segundo aluno: "+media[1]);
		JOptionPane.showMessageDialog(null,"Media do terceiro aluno: "+media[2]);
	}
}
