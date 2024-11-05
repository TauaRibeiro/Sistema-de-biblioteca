package pacoteUsuario;


public class Usuario {
    protected static int GERADOR_ID = 1;
    
    protected String nome, senha, tipo_acesso;
    protected int id;
    
    public Usuario(String tipo_acesso){
        this.id = GERADOR_ID;
        this.nome = null;
        this.senha = null;
        this.tipo_acesso = tipo_acesso;
        
        GERADOR_ID++;
                
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

    public String getTipo_acesso() {
        return tipo_acesso;
    }

    public void setTipo_acesso(String tipo_acesso) throws IllegalArgumentException{
        this.tipo_acesso = tipo_acesso;
    }
    
}
