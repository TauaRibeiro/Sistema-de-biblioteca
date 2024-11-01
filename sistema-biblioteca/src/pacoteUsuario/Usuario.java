package pacoteUsuario;

import java.util.ArrayList;

public class Usuario {
    protected static ArrayList<Usuario> lista_usuarios = new ArrayList();
    protected static int GERADOR_ID = 1;
    
    protected String nome, senha;
    protected int id;
    
    public Usuario(){
        this.nome = null;
        this.senha = null;
        
        // A terminar
                
    }
}
