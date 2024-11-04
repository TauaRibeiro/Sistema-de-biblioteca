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
                
    }

    @Override
    public String toString() {
        return "ID: " + id +"\nNOME: " + nome+ "\n";
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if(nome.length() < 3){
            IllegalArgumentException erro = new IllegalArgumentException("Nome deve ter no m�nimo de 3 caracteres");
            
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
            IllegalArgumentException erro = new IllegalArgumentException("A senha deve ter no m�nimo 4 caracteres");
            throw erro;
        }else{
            this.senha = senha;
        }
    }

    public int getId() {
        return id;
    }
    
    
    public static void cadastrarUsuario(Usuario u){
        lista_usuarios.add(u);
    }
    
    public static String mostrarUsuarios(){
        if(lista_usuarios.isEmpty()){
            return "N�o usu�rios cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Usuario u:lista_usuarios){
            resultado.append(u.toString());
        }
        
        return resultado.toString();
    }
    
}
