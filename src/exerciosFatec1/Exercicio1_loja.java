package exerciosFatec1;
import javax.swing.JOptionPane;
public class Exercicio1_loja {
	public static void main (String args[]) {
		double qtd[] = new double[5];
		double preco[] = new double[5];
		double totalGeral = 0;
		double totVenda = 0;
		double comissao = 0;
		for(int i = 0; i<=4; i++) {
			 qtd[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do "+(i+1)+ "o produto: "));
			 preco[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do "+(i+1)+ "o produto: "));
		}
		for(int i = 0; i<=4; i++) {
			totVenda = qtd[i] * preco[i];
			JOptionPane.showMessageDialog(null,("Quantidade vendida do "+ (i+1) +"o produto: "+ qtd[i]+ " Valor do "+ (i+1) + "o produto:"+ preco[i] +" Total geral da venda: "+ totVenda));
			totalGeral = totalGeral + totVenda;
		}
		comissao = totalGeral*0.05;
		JOptionPane.showMessageDialog(null,("Valor total das vendas: "+ totalGeral +" Valor da comissão: " + comissao));
	}
}
