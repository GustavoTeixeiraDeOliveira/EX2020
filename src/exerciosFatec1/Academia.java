package exerciosFatec1;
import java.io.*;


import javax.swing.JOptionPane;
public class Academia {
	public static void main (String args[]) throws IOException{
		int opc;
		exerciosFatec1.Usuario[] usuario = new Usuario[10];
		for(int i = 0; i<10; i++) {
			usuario[i] = new Usuario(); 
		}
		exerciosFatec1.Exercicios[] exercicios = new Exercicios[10];
		for(int i = 0; i<10; i++) {
			exercicios[i] = new Exercicios();
		}
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Acessar como Admin \n2 - Acessar como usuario   \n9 - Fim"));
			switch (opc)
	        {
	              case 1:     
	             int opc2;
	     		 String Adm = JOptionPane.showInputDialog("Digite o login do adm");
	    		 String senha =  JOptionPane.showInputDialog("Digite a senha do adm");
	    		 JOptionPane.showMessageDialog(null,Adm);
	    		 JOptionPane.showMessageDialog(null,senha);
	    		 String Adm2 = "ADM";
	    		 String senha2 = "123";
	    		 if(Adm.equals(Adm2)==true && senha.equals(senha2)==true){
	    		   do {
	    				opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar usuarios  \n2 - Agendar exercicios  \n3 - Editar lista de exercicios  \n9 - Retornar"));
	    				switch (opc2)
	    		        {
	    		              case 1:   usuario =  CadastroUsuario(usuario);
	    		                           break;
	    		              case 2:   exercicios = cadastroExercicios(exercicios, usuario);
	    		                           break;
	    		              case 3:   exercicios = editarExercicios(exercicios);
	    		                           break;
	    		              case 9: 
	    		                           break;
	    		              default: JOptionPane.showMessageDialog(null,"opc inválida");
	    		       }
	    		    }
	    		    while(opc2 != 9);
	    		 }else { JOptionPane.showMessageDialog(null,"senha ou login incorretos");}
	                           break;
	              case 2:     AcessoUser(usuario, exercicios);
	                           break;
	              case 9: JOptionPane.showMessageDialog(null,"finaliza");
	                           break;
	              default: JOptionPane.showMessageDialog(null,"opc inválida");
	       }
	    }
	    while(opc != 9);
	  }
	
	
		 
      
	
	static void AcessoUser(Usuario[] usuarios, Exercicios[] exercicios) throws IOException{
		 int opc2;
		 String userName;
		 String User = JOptionPane.showInputDialog("Digite o login do Usuario");
		 String senha =  JOptionPane.showInputDialog("Digite a senha do Usuario");
		 for(int i = 0; i< 10; i++) {
			 if(usuarios[i].Usuario.equals(User)==true && usuarios[i].Senha.equals(senha)==true){
				 userName = usuarios[i].Usuario;
				 
				 do {
						opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Exibir lista de exercicios  \n9 - Retornar"));
						switch (opc2)
				        {
				              case 1: exibirExercicios(exercicios, userName);
				                           break;
				              case 9: 
				                           break;
				              default: JOptionPane.showMessageDialog(null,"opc inválida");
				       }
				    }
				  while(opc2 != 9); 
				  i = 10;
			 }else {JOptionPane.showMessageDialog(null,"Login ou senha incorretas");}
		 }
		 
    }
	
	static Usuario[] CadastroUsuario(Usuario[] usuarios) {
	 int i = 0;
	 String cont;
	 do {
		 usuarios[i].Usuario = JOptionPane.showInputDialog("Digite o login do Usuario");
		 usuarios[i].Senha =  JOptionPane.showInputDialog("Digite a senha do Usuario");
		 i++;
		 cont = JOptionPane.showInputDialog("Deseja continuar o cadastro digite s para sim");
		 String cont2 = "s";
		 if(cont.equals(cont2)==false) {
			 i = 10;
		}
		 
	 }
	 while(i<10);
		return usuarios;
	 }
	
	static Exercicios[] cadastroExercicios(Exercicios[] exercicio, Usuario[] usuarios) {
		String nomeUsuario = JOptionPane.showInputDialog("Digite o login do Usuario que ira praticar os exercicios");
		int i = 0;
		while(i<10) {
			if(nomeUsuario.equals(usuarios[i].Usuario)==true){
				 JOptionPane.showMessageDialog(null,usuarios[i].Usuario);
				exercicio[i].nome = nomeUsuario;
				int j = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de exercios da lista Maximo 10"));
				for(int x = 0; x<j; x++){
					
					exercicio[i].horario[j-1]=  JOptionPane.showInputDialog("Digite o horario do exercicio");
					exercicio[i].diaSema[j-1]=  JOptionPane.showInputDialog("Digite o dia de semana da pratica do exercicio");
					exercicio[i].exercicio[j-1]=  JOptionPane.showInputDialog("Digite o exercicio");
				}
				i = 10;
			}
			i++;
		}
		
		
		return exercicio;
	}
	
	static Exercicios[] editarExercicios(Exercicios[] exercicio) {
		String nomeUsuario = JOptionPane.showInputDialog("Digite o login do Usuario cujo a lista de exercicios sera alterada");
		int i = 0;
		while(i<10) {
			if(nomeUsuario.equals(exercicio[i].nome)==true){
				int l = 0;
				for(int h = 0; h<10; h++) {
					if(exercicio[i].horario[h] != ""){
						l++;
					}
				}
				int j = l;
				String alt = null;
				String alt2 ="s"; 
				for(int x = 0; x<j; x++){
					alt =JOptionPane.showInputDialog("Deseja alterar a "+(x+1)+"º linha digite s para sim");
					if(alt.equals(alt2)== true) {
					exercicio[i].horario[x]=  JOptionPane.showInputDialog("Digite o novo horario do exercicio");
					exercicio[i].diaSema[x]=  JOptionPane.showInputDialog("Digite o novo dia de semana da pratica do exercicio");
					exercicio[i].exercicio[x]=  JOptionPane.showInputDialog("Digite o novo exercicio");
					}
				}
				i = 10;
			}
			i++;
		}
		
		return exercicio;
	}
	
	static void exibirExercicios(Exercicios[] exercicio, String nomeUser) {
		for(int i = 0; i <10; i++){
			if(nomeUser.equals(exercicio[i].nome)==true){
				int l = 0;
				for(int h = 0; h<10; h++) {
					if(exercicio[i].horario[h]!= ""){
						l++;
					}
				}
				int j = l;
				for(int x = 0; x<j; x++){
					 JOptionPane.showMessageDialog(null,exercicio[i].horario[x]+"  "+exercicio[i].diaSema[x]+"  "+exercicio[i].exercicio[x]);
					}
				
			}
		}
		
		
	}
	
}


