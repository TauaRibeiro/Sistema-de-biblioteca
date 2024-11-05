package pacoteUsuario;

import java.util.ArrayList;

public class Administrador extends Usuario{
    protected static ArrayList<Usuario> lista_usuarios = new ArrayList();
    
    public Administrador(){
        super("adm");
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.id + "\nNOME: " + this.nome + "\nTipo de acesso: " + this.tipo_acesso + "\nSenha: " + this.senha + "\n";
    }
    
    public void cadastrarUsuario(Usuario u){
        lista_usuarios.add(u);
    }
    
    public String mostrarUsuarios(){
        if(lista_usuarios.isEmpty()){
            return "N�o usu�rios cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Usuario u:lista_usuarios){
            resultado.append(u.toString()).append('\n');
        }
        
        return resultado.toString();
    }
    
    public String editarUsuario(int id_usuario, Usuario usuario_editado){
        if(lista_usuarios.isEmpty()){
            return "N�o h� usu�rios cadastrados...";
        }
        
        for(Usuario u:lista_usuarios){
            if(u.id == id_usuario){
                if(usuario_editado.nome != null){
                    u.nome = usuario_editado.nome;
                }
                
                if(usuario_editado.senha != null){
                    u.senha = usuario_editado.senha;
                }
                
                if(!usuario_editado.tipo_acesso.equalsIgnoreCase(u.tipo_acesso)){
                    u.tipo_acesso = usuario_editado.tipo_acesso;
                }
                return "Usu�rio editado com sucesso!!";
            }
        }
        
        return "Usu�rio n�o encontrado";
    }
    
    public String excluirUsuario(int id_usuario){
        if(lista_usuarios.isEmpty()){
            return "N�o h� usu�rio cadastrados...";
        }
        
        for(Usuario u:lista_usuarios){
            if(u.id == id_usuario){
                lista_usuarios.remove(u);
                
                return "Usu�rio removido com sucesso!!";
            }
        }
        
        return "Usu�rio n�o encontrado...";
    }
}
