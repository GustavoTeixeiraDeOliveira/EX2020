package exerciosFatec1;

class Usuario {
    String Usuario;
    String Senha;
	
    Usuario(){
        this("","");
    }

    Usuario(String user,String pass) {
        Usuario = user;
	Senha = pass ;
    }
}
