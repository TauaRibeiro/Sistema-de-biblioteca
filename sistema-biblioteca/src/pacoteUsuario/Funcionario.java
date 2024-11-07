
package pacoteUsuario;

public class Funcionario extends Usuario{
    public Funcionario(){
        super("professor");
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.id + "\nNOME: " + this.nome + "\nTipo de acesso: " + this.tipo_acesso + "\nSenha: " + this.senha + "\n";
    }
}
