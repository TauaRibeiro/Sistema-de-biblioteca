package pacoteLivro;

public class LivroFisico extends Livro{
    protected int quantidade_livros;

    public LivroFisico(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano, genero);
        
        this.quantidade_livros = 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Quantidade de unidades: " + quantidade_livros;
    }
    
    public int getQuantidade_livros() {
        return quantidade_livros;
    }

    public void setQuantidade_livros(int quantidade_livros) throws IllegalArgumentException{
        if(quantidade_livros <= 0){
            throw new IllegalArgumentException("quantidade inválida!! Deve haver no mínimo uma unidade.");
        }else{
            this.quantidade_livros = quantidade_livros;
        }
    }
    
}
