package pacoteLivro;

public class Ebook extends Livro {
    protected String TipoArquivo;

    public Ebook(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano, genero);
    }
    
     @Override
     public void exibirInfo(){
       super.exibirInfo();
       System.out.println("Tipo: Ebook");
       System.out.println("Tipo de Arquivo:"+TipoArquivo);
     }
    
}
