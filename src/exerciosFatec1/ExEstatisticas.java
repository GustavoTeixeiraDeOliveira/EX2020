package exerciosFatec1;
import javax.swing.JOptionPane;
public class ExEstatisticas {
	public static void main (String args[]) {
	int opc;	
	
		
	
	
	exerciosFatec1.estatistica[] Estatistica = new estatistica[10];
	int i;
	for(i = 0; i<10; i++) {
		Estatistica[i] = new estatistica(); 
	}
	 do {
		opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Estatísticas \n2 - Consultar por quantidade de acidentes \n3 -Consultar por estatisticas de acidentes \n4 -Acidentes acima da média das 10 cidades \n9 - Fim"));
		switch (opc)
        {
              case 1: Estatistica = FCadastroEstatistica(Estatistica);
                           break;
              case 2:      PQTAcidentes(Estatistica);
                           break;
              case 3: PMaiorMenor(Estatistica);
                           break;
              case 4: PAcima(Estatistica);
            	            break;
              case 9: JOptionPane.showMessageDialog(null,"finaliza");
                           break;
              default: JOptionPane.showMessageDialog(null,"opc inválida");
       }
    }
    while(opc != 9);
  }
  static estatistica[] FCadastroEstatistica(estatistica[] estatistica) {
	  int i;
		for(i = 0; i<10; i++) {
			estatistica[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da "+i+ "º cidade"));
			estatistica[i].nome = JOptionPane.showInputDialog("Digite o nome da "+i+ "º cidade");
			estatistica[i].qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da "+i+ "º cidade"));
		}
	return estatistica;
  }
  
  static void PQTAcidentes(estatistica[] estatistica) {
	  int i;
		for(i = 0; i<10; i++) {
			if(estatistica[i].qtd>100 && estatistica[i].qtd<500) {
				JOptionPane.showMessageDialog(null,estatistica[i].codigo+" "+estatistica[i].nome+" "+estatistica[i].qtd+"");
			}
			
		}
	  
  }
  
  static void PMaiorMenor(estatistica[] estatistica) {
	  int i;
	  int maior = estatistica[0].qtd;
	  int menor = estatistica[0].qtd;
	  int IndiceMaior = 0;
	  int IndiceMenor = 0;
	  for(i = 0; i<10; i++) {
		  if(maior> estatistica[i].qtd) {
			  maior = estatistica[i].qtd;
			  IndiceMaior = i;
		  }
		  if(menor< estatistica[i].qtd) {
			  menor = estatistica[i].qtd;
			  IndiceMenor = i;
		  }
		  JOptionPane.showMessageDialog(null,estatistica[IndiceMaior].codigo+" "+estatistica[IndiceMaior].nome+" "+estatistica[IndiceMaior].qtd+"");
		  JOptionPane.showMessageDialog(null,estatistica[IndiceMenor].codigo+" "+estatistica[IndiceMenor].nome+" "+estatistica[IndiceMenor].qtd+"");
	  }
	  
	  
	  
  }
  static void PAcima(estatistica[] estatistica) {
	  int i;
	  double media = 0;
	  for(i = 0; i<10; i++) {
		  media = media + estatistica[i].qtd;
	  }
	  media = media/10;
	  for(i = 0; i<10; i++) {
		  if(media< estatistica[i].qtd) {
			  JOptionPane.showMessageDialog(null,estatistica[i].codigo+" "+estatistica[i].nome+" "+estatistica[i].qtd+"");
		  }
	  }
	  
	  
  }
  
 
}
