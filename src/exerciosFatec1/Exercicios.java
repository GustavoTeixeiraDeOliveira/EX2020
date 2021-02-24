package exerciosFatec1;

public class Exercicios {
	 String nome;
	    static String horario[] = new String[10];
	    static String diaSema[] = new String[10];
	    static String exercicio[] = new String[10];
	    static int cont[] = new int[10];
		
	    Exercicios(){
		this("", horario, diaSema, exercicio,cont);
	    }
		
	    Exercicios(String Nome, String[] Horario, String[] DiaSema,String[] Exercicio, int[] Cont){
		nome = Nome;
		horario = Horario;
		diaSema = DiaSema;
		exercicio = Exercicio;
		cont = Cont;	
	    }
}
