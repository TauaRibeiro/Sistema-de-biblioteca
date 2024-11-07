package pacoteUsuario;


public class Usuario {
    protected static int GERADOR_ID = 1;
    
    protected String nome, senha;
    protected int id;
    
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

}  