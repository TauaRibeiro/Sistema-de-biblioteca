package pacoteUsuario;

import java.util.ArrayList;


public class Usuario {
    protected static ArrayList<Usuario> lista_usuarios = new ArrayList();
    protected static int GERADOR_ID = 1;
    
    protected String nome, senha;
    protected final int id;
    
    public Usuario(){
        this.id = GERADOR_ID;
        this.nome = null;
        this.senha = null;
        
        GERADOR_ID++;
                
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.id + "\nNOME: " + this.nome + "\nSenha: " + this.senha + "\n";
    }

    public static ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if(nome.length() < 3){
            IllegalArgumentException erro = new IllegalArgumentException("Nome deve ter no mínimo de 3 caracteres");
            
            throw erro;
        }else{
            this.nome = nome;
        }
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) throws IllegalArgumentException{
        if(senha.length() < 4){
            IllegalArgumentException erro = new IllegalArgumentException("A senha deve ter no mínimo 4 caracteres");
            throw erro;
        }else{
            this.senha = senha;
        }
    }

    public int getId() {
        return id;
    }
    
    public static Usuario procurarUsuario(String nome) throws IllegalArgumentException{
        for(Usuario u: lista_usuarios){
            if(u.getNome().equals(nome)){
                return u;
            }
        }
        
        throw new IllegalArgumentException("Usuário não encontrado...");
    }

}  