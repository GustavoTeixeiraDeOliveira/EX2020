package exerciosFatec1;
import java.io.*;
import java.util.Random;

import javax.swing.JOptionPane;
public class exercercicioVoto2{
    static int numeroeleitor[]=new int [11]; static int quantidade[]=new int [101]; static int candord[]=new int [101]; static int candidatoooo[]=new int [101];
    public static void main (String args[]) throws IOException{
	int opc;
	exerciosFatec1.voto[] Voto = new voto[100];
	int i;
	for(i = 0; i<100; i++) {
            Voto[i] = new voto(); 
	}		
	do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Seção/Número Eleitor \n2 - Classificar por Seção \n3 - Gravar Registros \n4 - Mostrar Indicadores \n9 - Fim"));
            switch (opc){
                case 1: Voto = FCADRASTRAVOTACAO(Voto);
	        break;
	        case 2: Voto = FCLASSIFICASECAO(Voto);
	        break;
	        case 3: Voto = FGRAVAVOTACAO(Voto);
	        break;
	        case 4: PIndicadores(Voto);
	        break;
	        case 9: JOptionPane.showMessageDialog(null,"Finalizando...");
	        break;
	        default: JOptionPane.showMessageDialog(null,"Opção inválida");
	    }
	}
	while(opc != 9); 
    }
    
    static voto[] FCADRASTRAVOTACAO(voto[] votos) {
        int i;
	for(i = 0; i<100; i++) {
            Random Sec =  new Random();
            votos[i].numerioSecao = Sec.nextInt(11);
            votos[i].numeroCandidato = Sec.nextInt(301);
	}
        return votos;
    }
	 
    static voto[] FCLASSIFICASECAO(voto[] votos) {
	int i,aux,auxcand;
	for(i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
		if(votos[i].numerioSecao> votos[j].numerioSecao) {
                    aux = votos[i].numerioSecao;
                    auxcand=votos[i].numeroCandidato;
                    votos[i].numerioSecao = votos[j].numerioSecao;
                    votos[i].numeroCandidato = votos[j].numeroCandidato;
                    votos[j].numerioSecao = aux;
                    votos[j].numeroCandidato=auxcand;
		}
            }
	}
        JOptionPane.showMessageDialog(null,"Dados classificados.");
	return votos;
    }
    
    static voto[] FGRAVAVOTACAO(voto[] votos) throws IOException{
        int i;
	String fileName = "Votação2016.txt";
	BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
	for (i = 0 ; i < 100 ; i++) {
            writer.write(Integer.toString(votos[i].numerioSecao));
            writer.newLine();
            writer.write(Integer.toString(votos[i].numeroCandidato));			 
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null,"Arquivo gerado.");
	writer.close();
        return votos;
    }

    static void PIndicadores(voto[] votos) throws IOException{
	int opc2;
	do {
            opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Quantidade de eleitores por Seção  \n2 - Número da Seção com maior e menor números de eleitores  \n3 - Quantidade de votos por candidato  \n4 - Exibir os 10 candidatos mais votados e suas  quantidades  \n9 - Retornar"));
            switch (opc2){
                case 1: QUANTIDADESECAO(votos);
		break;
		case 2: MAMESECAO(votos);    
		break;
		case 3: QUANTIDADEVOTOS(votos);
		break;
		case 4: TOP10CAND(votos);
                break;
                case 9:
		break;
		default: JOptionPane.showMessageDialog(null,"Opção inválida.");
            }
        }
	while(opc2 != 9);
    }	 
    static void QUANTIDADESECAO(voto[] votos) throws IOException{
        int i,e=10;       
        for (i = 0 ; i < 100 ; i++) {
            numeroeleitor[e]+=1;
            if(i>98){
                System.out.println("Seção: "+votos[i].numerioSecao+" Número de eleitores: "+numeroeleitor[e]);
                e=e-1; 
            }
            else if (votos[i+1].numerioSecao !=votos[i].numerioSecao){
                System.out.println("Seção: "+votos[i].numerioSecao+" Número de eleitores: "+numeroeleitor[e]); 
                e=e-1;
            }
        }
    }
    static void MAMESECAO(voto[] votos) throws IOException{
        int i=0;  
        int me=0,ma=0;
        int menor=numeroeleitor[i], maior=numeroeleitor[i];
        for(i=0;i<=10;i++){
            if(numeroeleitor[i]<menor){
               menor=numeroeleitor[i]; 
               me=i;
            }
            if(numeroeleitor[i]>maior){
               maior=numeroeleitor[i]; 
               ma=i;
            }
        }
        System.out.println("Menor número de votos:\nSeção: "+me+" Número de eleitores: "+numeroeleitor[me]);
        System.out.println("Maior número de votos:\nSeção: "+ma+" Número de eleitores: "+numeroeleitor[ma]);
    }
    static void QUANTIDADEVOTOS(voto[] votos) throws IOException{
        int i,auxcand,e=0;      
        for(i = 0; i<100; i++) {
            candord[i]=votos[i].numeroCandidato;
        }
        i=0;
	for(i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
		if(candord[i]> candord[j]) {
                    auxcand=candord[i];
                    candord[i] = candord[j];
                    candord[j]=auxcand;
		}
            }
	}
        i=0;
        for (i = 0 ; i < 100 ; i++) {
            quantidade[e]+=1;
            if(i>98){
                candidatoooo[e]=candord[i];
                System.out.println("Candidato: "+candord[i]+" Número de eleitores: "+quantidade[e]);
                e=e+1; 
            }
            else if (candord[i+1] !=candord[i]){
                candidatoooo[e]=candord[i];
                System.out.println("Candidato: "+candord[i]+" Número de eleitores: "+quantidade[e]);
                e=e+1; 
            }
        }
    }
    static void TOP10CAND(voto[] votos) throws IOException{
        
        int quantidadeee[]=new int[101];
        int a;
        quantidadeee=quantidade;

        int i,aux,auxcand;
	for(i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
		if(quantidadeee[i]> quantidadeee[j]) {
                    aux = quantidadeee[i];
                    auxcand=candidatoooo[i];
                    quantidadeee[i] = quantidadeee[j];
                    candidatoooo[i] = candidatoooo[j];
                    quantidadeee[j] = aux;
                    candidatoooo[j]=auxcand;
		}
            }
	}
        System.out.println("\nTop 10 Candidatos mais votados:");
        for(i =0; i<10; i++){
            System.out.println("Candidato: "+candidatoooo[i]+" Número de eleitores: "+quantidadeee[i]);
        }
    }
}
