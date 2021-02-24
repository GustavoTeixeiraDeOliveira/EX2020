package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExmatrixMediaObjeto {
	public static void main (String args[]) {
		int  opc;
		double notas[][]= new double[3][2];
		double media[] = new double[3];
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega notas \n2 - Calcula Média \n3 -Mostra Média \n9 - Fim"));
			switch (opc)
            {
                  case 1: notas = Carregarnotas(notas);
                               break;
                  case 2: media = CalcularMedia(notas);
                               break;
                  case 3: MostraMedia(media); 
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
   }
	
   static double[][] Carregarnotas(double n[][]) {
	    n[0][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do primeiro aluno"));
		n[0][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do primeiro aluno"));
		n[1][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do segundo aluno"));
		n[1][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do segundo aluno"));
		n[2][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do terceiro aluno"));
		n[2][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do terceiro aluno"));
	    return n;
   }
   
   static double[] CalcularMedia(double n[][]) {
	   double m[] = new double[3];
	   m[0] = ((n[0][0]+n[0][1])/2);
	   m[1] = ((n[1][0]+n[1][1])/2);
	   m[2] = ((n[2][0]+n[2][1])/2);
	   return m;
   }
   
   static void MostraMedia(double m[]) {
	   JOptionPane.showMessageDialog(null,"Media do primeiro aluno: "+ m[0]);
		JOptionPane.showMessageDialog(null,"Media do segundo aluno: "+m[1]);
		JOptionPane.showMessageDialog(null,"Media do terceiro aluno: "+m[2]);
   }
}

