package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExCargo {
	public static void main (String args[]) {
		Integer cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo correspodente ao cargo atual"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario atual"));
		switch(cod) {
		case 1: salario = salario * 1.5;
		        JOptionPane.showMessageDialog(null,"O novo salario é: "+salario);
		        break;
		case 2: salario = salario * 1.35;
                JOptionPane.showMessageDialog(null,"O novo salario é: "+salario);
                break;
		case 3: salario = salario * 1.2;
                JOptionPane.showMessageDialog(null,"O novo salario é: "+salario);
                break;
		case 4: salario = salario * 1.1;
                JOptionPane.showMessageDialog(null,"O novo salario é: "+salario);
                break;
        default: JOptionPane.showMessageDialog(null,"O salario se mantem o mesmo pois tal cargo não existe, o salario é: "+salario);
                break;
		
		}
	}
}
