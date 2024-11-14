
package pacoteUsuario;

import java.util.ArrayList;

public final class Funcionario extends Usuario{
    private static ArrayList<Usuario> lista_funcionarios = new ArrayList();
    
    public Funcionario(){}
  
    
    public static ArrayList<Usuario> getLista_funcionarios() {
        return lista_funcionarios;
    }
    
    
    public void cadastrarFuncionario(Usuario u){
        lista_funcionarios.add(u);
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

