package pacoteLivro;

public class Ebook extends Livro {
    protected String TipoArquivo;

    public Ebook(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano, genero);
    }
    
    @Override
    public String toString(){
        return super.toString() + "Tipo de arquivo: " + TipoArquivo;
    }
}
