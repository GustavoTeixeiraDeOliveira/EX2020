package exerciosFatec1;
import java.io.*;
public class estatistica {
		int codigo;
		String nome;
		int qtd;
		
		estatistica(){
			this(0, "", 0);
		}

	     estatistica(int codCidade, String nomeCidade, int qtdAcidentes) {
			codigo = codCidade;
			nome = nomeCidade;
			qtd = qtdAcidentes;
		}
}
