package exerciosFatec1;

import java.io.*;	
import javax.swing.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main (String args[]) throws IOException{
	Usuario[] usuario = new Usuario[10];
	for(int i = 0; i<10; i++) {
            usuario[i] = new Usuario(); 
	}
	Exercicios[] exercicios = new Exercicios[10];
	for(int i = 0; i<10; i++) {
            exercicios[i] = new Exercicios();
	}
        ClasseMetodos m = new ClasseMetodos();
	int opc;
	int i;
        i=0;
	do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Entrar \n2 - Entrar como Administrador \n9 - Fim"));
            switch (opc){
                case 1: m.PEntrar(usuario,exercicios);
	        break;
                case 2: m.Pentraradm(usuario,exercicios);
                break;
	        case 9: JOptionPane.showMessageDialog(null,"Finalizando...");
	        break;
	        default: JOptionPane.showMessageDialog(null,"Opção inválida");
	    }
	}
	while(opc != 9); 
    }
}