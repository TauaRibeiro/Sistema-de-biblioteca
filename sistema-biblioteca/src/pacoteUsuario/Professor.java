
package pacoteUsuario;

public class Professor extends Usuario{
    public Professor(){
        super("professor");
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.id + "\nNOME: " + this.nome + "\nTipo de acesso: " + this.tipo_acesso + "\nSenha: " + this.senha + "\n";
    }
}
