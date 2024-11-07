
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
            return "N�o usu�rios cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Usuario u:lista_usuarios){
            resultado.append(u.toString()).append('\n');
        }
        
        return resultado.toString();
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

