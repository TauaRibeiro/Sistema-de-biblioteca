package pacoteEmprestimo;

import java.util.ArrayList;
import pacoteLivro.Livro;
import pacoteUsuario.Usuario;
import java.time.LocalDate;
import pacoteUsuario.Administrador;

public class Emprestimo {
    private int GERADOR_ID = 1;
    private static ArrayList <Emprestimo> lista_emprestimos = new ArrayList();
    
    private Livro livro_emprestado;
    private Usuario usuario_emprestimo;
    private LocalDate data_emprestimo;
    private int id;
    
    public Emprestimo(){
        this.usuario_emprestimo = null;
        this.livro_emprestado = null;
        this.data_emprestimo = LocalDate.now();
        this.id = GERADOR_ID;
        
        GERADOR_ID++;
    }
    
    @Override
    public String toString(){
        return "Usuário: " + usuario_emprestimo.getNome() + "\nLivro: " + livro_emprestado.getTitulo() +
                "Data empréstimo: " + data_emprestimo;
    }

    public Livro getLivro_emprestado() {
        return livro_emprestado;
    }

    public void setLivro_emprestado(Livro livro_emprestado) {
        this.livro_emprestado = livro_emprestado;
    }

    public Usuario getUsuario_emprestimo() {
        return usuario_emprestimo;
    }

    public void setUsuario_emprestimo(Usuario usuario_emprestimo) {
        this.usuario_emprestimo = usuario_emprestimo;
    }
    
    
    public static String realizarEmprestimo(Emprestimo e, Administrador adm){
        for(Usuario u: Administrador.getLista_usuarios()){
            if(adm == u){
                lista_emprestimos.add(e);
                
                return "Emprestimo realizado com sucesso!!";
            }
        }
        
        return "Não foi possível realizar o empréstimo. Administrador não encontrado...";
    }
    
    public static String mostrarEmprestimos(){
        if(lista_emprestimos.isEmpty()){
            return "Não foi realizado nenhum emprestimo...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Emprestimo e:lista_emprestimos){
            resultado.append(e.toString()).append('\n');
        }
        
        return resultado.toString();
    }
    
    public static String mostrarEmprestimos(Usuario pesquisa){
        if(lista_emprestimos.isEmpty()){
            return "Não foi realizado nenhum emprestimo...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Emprestimo e:lista_emprestimos){
            if(e.usuario_emprestimo == pesquisa){
                resultado.append(e.toString()).append('\n');
            }
        }
        
        return (resultado.isEmpty())? resultado.toString():"Usuário não encontrado";
    }
    
    public static String devolverLivro(int id_emprestimo){
        if(lista_emprestimos.isEmpty()){
            return "";
        }
        
        for(Emprestimo e:lista_emprestimos){
            if(e.id == id_emprestimo){
                lista_emprestimos.remove(e);
                
                return "Livro devolvido com sucesso!!";
            }
        }
        
        return "Emprestimo não encontrado...";
    }
}
