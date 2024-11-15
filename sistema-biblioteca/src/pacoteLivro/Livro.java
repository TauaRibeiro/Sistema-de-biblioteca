
package pacoteLivro;

import java.util.ArrayList;

public final class Livro {
    // Declara��o de vari�veis de inst�ncia privadas
    private String titulo;
    private ArrayList <String> lista_autores;
    private int quantidade_livros;
    private String genero;
    private String status;
    private final static ArrayList<Livro> Listalivro = new ArrayList();


    // Construtor da classe que inicializa as vari�veis de inst�ncia
    public Livro() {
        this.titulo = null;
        this.lista_autores = null;  
        this.genero = null;
        this.quantidade_livros = 0;
        this.status = null;
    }
    
    @Override
    public String toString(){
        return "T�tulo: " + titulo + "\nAutores: " + lista_autores + "\nG�nero: " + genero + "\nQuantidade de unidades: " + quantidade_livros;
    }

    // M�todos getters e setters para acessar e modificar os atributos privados

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getTitulo() {
        return titulo; // Retorna o t�tulo do cadastro
    }

    public void setTitulo(String titulo) throws IllegalArgumentException{
        if(titulo.length() < 3){
            throw new IllegalArgumentException("t�tulo inv�lido! O t�tulo deve ter no m�nimo 3 caracteres");
        }else{
            this.titulo = titulo; // Define um novo valor para o t�tulo
        }
    }

    public static ArrayList<Livro> getListaLivro() {
        return Listalivro; // Retorna o autor do cadastro
    }

    public String getGenero() {
        return genero; // Retorna o g�nero do cadastro
    }

    public void setGenero(String genero) throws IllegalArgumentException{
        if(genero.length() < 3){
            throw new IllegalArgumentException("G�nero inv�lido!  Deve ter no m�nimo 3 caracteres.");
        }else{
            this.genero = genero; // Define um novo valor para o g�nero
        }
    }
    
    public int getQuantidade_livros() {
        return quantidade_livros;
    }

    public void setQuantidade_livros(int quantidade_livros) throws IllegalArgumentException{
        if(quantidade_livros <= 0){
            throw new IllegalArgumentException("quantidade inv�lida!! Deve haver no m�nimo uma unidade.");
        }else{
            this.quantidade_livros = quantidade_livros;
        }
    }
    
    public void adicionarAutor(String autor) throws IllegalArgumentException{
        if(autor.length() < 3){
            throw new IllegalArgumentException();
        }else{
            this.lista_autores.add(autor);
        }
    }
    
    public static void cadastrarLivro(Livro l){
        Listalivro.add(l);
    }
    
    public static String exibirInfo(String procura){
        if(Listalivro.isEmpty()){
            return "N�o h� livros cadastrados...";
        }
        
        for(Livro l:Listalivro){
            if(l.titulo.equalsIgnoreCase(procura)){
                return l.toString();
            }
            
            for(String a: l.lista_autores){
                if(a.equalsIgnoreCase(procura)){
                    return l.toString();
                }
            }
        }
        
        return "Livro n�o encontrado...";
    }
    //Exibe info de todos os livros
    public static String exibirInfo(){
        if(Listalivro.isEmpty()){
            return "N�o h� livros cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Livro l:Listalivro){
            resultado.append(l.toString()).append('\n');
        }
        
        return resultado.toString();
    }
}
    

