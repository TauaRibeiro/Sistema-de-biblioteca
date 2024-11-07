
package pacoteUsuario;

import java.util.ArrayList;

public class Funcionario extends Usuario{
    private static ArrayList<Usuario> lista_usuarios = new ArrayList();
    
    public Funcionario(){}
  
    
    public static ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }
    
    
    public void cadastrarUsuario(Usuario u){
        lista_usuarios.add(u);
    }
    
    public String mostrarUsuarios(){
        if(lista_usuarios.isEmpty()){
            return "Não usuários cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Usuario u:lista_usuarios){
            resultado.append(u.toString()).append('\n');
        }
        
        return resultado.toString();
    }
    
    public String excluirUsuario(int id_usuario){
        if(lista_usuarios.isEmpty()){
            return "Não há usuário cadastrados...";
        }
        
        for(Usuario u:lista_usuarios){
            if(u.id == id_usuario){
                lista_usuarios.remove(u);
                
                return "Usuário removido com sucesso!!";
            }
        }
        
        return "Usuário não encontrado...";
    }
}

