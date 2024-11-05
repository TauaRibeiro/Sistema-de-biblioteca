package pacoteEmprestimo;

import java.util.ArrayList;
import pacoteLivro.Livro;
import pacoteUsuario.Usuario;
import java.time.LocalDate;

public class Emprestimo {
    ArrayList <Emprestimo> lista_emprestimos = new ArrayList();
    
    private Livro livro_emprestado;
    private Usuario usuario_emprestimo;
    private LocalDate data_emprestimo;
    
    public Emprestimo(){
        this.usuario_emprestimo = null;
        this.livro_emprestado = null;
        this.data_emprestimo = LocalDate.now();
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
    
    
   
}
