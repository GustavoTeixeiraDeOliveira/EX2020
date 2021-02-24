package exerciosFatec1;
import java.io.*;
import java.util.Random;

import javax.swing.JOptionPane;
public class ExercicioVoto {
	public static void main (String args[]) throws IOException{
		int opc;
		exerciosFatec1.voto[] Voto = new voto[100];
		int i;
		for(i = 0; i<100; i++) {
			Voto[i] = new voto(); 
		}
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Votação \n2 - Classificar votos \n3 - Gravar votação \n4 -Indicadores \n9 - Fim"));
			switch (opc)
	        {
	              case 1: Voto = FCADRASTRAVOTAÇÃO(Voto);
	                           break;
	              case 2:     Voto = FCLASSIFICASEÇÃO(Voto);
	                           break;
	              case 3: FGRAVAVOTAÇÃOO(Voto);
	                           break;
	              case 4: Indicadores();
	            	            break;
	              case 9: JOptionPane.showMessageDialog(null,"finaliza");
	                           break;
	              default: JOptionPane.showMessageDialog(null,"opc inválida");
	       }
	    }
	    while(opc != 9);
	  }
	
	 static voto[] FCADRASTRAVOTAÇÃO(voto[] votos) {
		  int i;
			for(i = 0; i<99; i++) {
				Random Sec =  new Random();
				votos[i].numerioSecao = Sec.nextInt(11);
				votos[i].numeroCandidato = Sec.nextInt(300);
			}
		return votos;
	  }
	 
	 static voto[] FCLASSIFICASEÇÃO(voto[] votos) {
		  int i;
		  for(i = 0; i<99; i++) {
			  for(int j = 0; j<99; j++) {
				  if(votos[i].numerioSecao> votos[j].numerioSecao) {
					  int temp;
					  int temp2;
					  temp = votos[i].numerioSecao;
					  temp2 = votos[i].numeroCandidato;
					  votos[i].numerioSecao = votos[j].numerioSecao;
					  votos[j].numerioSecao = temp;
					  votos[i].numeroCandidato = votos[j].numeroCandidato;
					  votos[j].numeroCandidato = temp2;
				  }
			  }
		  }
		  return votos;
	 }
	 static void FGRAVAVOTAÇÃOO(voto[] votos) throws IOException{
		 int i;
		 String fileName = "Votação2016.txt";
		 BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
		 for (i = 0 ; i < 100 ; i++) {
			 writer.write(Integer.toString(votos[i].numerioSecao));
			 writer.newLine();
			 writer.write(Integer.toString(votos[i].numeroCandidato));
			 writer.newLine();

		 }
		 writer.close();
		 System.out.println("arquivo gerado ");

	 }
	 static void Indicadores() throws IOException{
		 int opc2;
		 
		 do {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Quantidade de eleitores por Seção  \n2 - Número da Seção com maior e menor números de eleitores  \n3 - Quantidade de votos por candidato  \n4 -Exibir os 10 candidatos mais votados e suas  quantidades  \n9 - Retornar"));
				switch (opc2)
		        {
		              case 1: 
		                           break;
		              case 2:     
		                           break;
		              case 3:
		                           break;
		              case 4:
		            	            break;
		              case 9: 
		                           break;
		              default: JOptionPane.showMessageDialog(null,"opc inválida");
		       }
		    }
		    while(opc2 != 9);
		  }
	 
	 
}
