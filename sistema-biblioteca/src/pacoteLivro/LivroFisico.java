package pacoteLivro;

public class LivroFisico extends Livro{
    
    protected int QuantidadedePaginas;

    public LivroFisico(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano, genero);
                }
    
   @Override
     public void exibirInfo(){
       super.exibirInfo();
       System.out.println("Tipo: Livro Fisico");
       System.out.println("Quantidade de Paginas: "+QuantidadedePaginas);
}
    
}
