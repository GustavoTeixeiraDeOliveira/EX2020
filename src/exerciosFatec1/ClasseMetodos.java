package exerciosFatec1;

import java.io.IOException;
import javax.swing.JOptionPane;

public class ClasseMetodos {
    static void PEntrar(Usuario[] User,Exercicios[] exercicios) throws IOException {
        int i;
        int a=0;
        boolean e=false;
        String Login;
        String Senha;	
        Login=JOptionPane.showInputDialog("Usuário: ");
        Senha=JOptionPane.showInputDialog("Senha: ");
        for (i = 0 ; i < 10 ; i++){	
            if(Login.equals(User[i].Usuario)==true && Senha.equals(User[i].Senha)==true){
                e=true;
                a=i;
            }                
        }
        if (e==true){
            AcessoUser(User, exercicios,User[a].Usuario);
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
        }
    }
    
    static void Pentraradm(Usuario[] User, Exercicios[] exercicios) throws IOException	{
        String login="adm";
        String Senha="123";
        String tlog,tsen;
        tlog=JOptionPane.showInputDialog("Usuário: ");
        tsen=JOptionPane.showInputDialog("Senha: ");
        if(login.equals(tlog)==true && Senha.equals(tsen)==true){
            PMenuadm(User,exercicios);
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
        }        
    }

    static void PMenuadm(Usuario[] usuario, Exercicios[] exercicios) throws IOException	{
        int opc2;
        do {
	    opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar usuarios  \n2 - Agendar exercicios  \n3 - Editar lista de exercicios  \n9 - Retornar"));
	    switch (opc2){
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
    }
	                        


    static void AcessoUser(Usuario[] usuarios, Exercicios[] exercicios,String userName) throws IOException{
        int opc2;
        do {
            opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Exibir lista de exercicios  \n9 - Retornar"));
            switch (opc2){
		case 1: exibirExercicios(exercicios, userName);
		break;
		case 9: 
		break;
		default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
	}
	while(opc2 != 9); 
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
                int j = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de exercicios da lista Maximo 10"));
                for(int x = 0; x<j; x++){
                    exercicio[i].horario[x]=  JOptionPane.showInputDialog("Digite o horario do exercicio");
                    exercicio[i].diaSema[x]=  JOptionPane.showInputDialog("Digite o dia de semana da pratica do exercicio");
                    exercicio[i].exercicio[x]=  JOptionPane.showInputDialog("Digite o exercicio");
                    exercicio[i].cont[i]= exercicio[i].cont[i]+1;
                }
                //i = 10;
            }
            i++;
        }
        return exercicio;
    }
	
    static Exercicios[] editarExercicios(Exercicios[] exercicio) {
	String nomeUsuario = JOptionPane.showInputDialog("Digite o login do Usuario cujo a lista de exercicios sera alterada");
	int i = 0;
	while(i<10){
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
	for(int i = 0; i <exercicio[i].cont[i]; i++){
            if(nomeUser.equals(exercicio[i].nome)==true){
		int l = 0;
		for(int h = 0; h<exercicio[i].cont[i]; h++) {
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