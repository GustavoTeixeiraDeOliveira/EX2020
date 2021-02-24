package exerciosFatec1;
import javax.swing.JOptionPane;
public class exercioDados {
	public static void main (String args[]) {
		int d1 =1;
		int d2 = 1;
		while(d1<=6){
			while(d2<=6) {
				if(d1+d2==7) {
					JOptionPane.showMessageDialog(null,d1 +" + "+ d2 +"  = 7");
				}
				d2 = d2 +1;
			}
			d2 = 1;
			d1 = d1+1;
		}
				
	}
}
