
package pacoteLivro;

import java.util.ArrayList;

public final class Livro {
    // Declaração de variáveis de instância privadas
    private String titulo;
    private ArrayList <String> lista_autores;
    private int ano, quantidade_livros;
    private String genero;
    private final static ArrayList<Livro> Listalivro = new ArrayList();


    // Construtor da classe que inicializa as variáveis de instância
    public Livro() {
        this.titulo = null;
        this.lista_autores = null;  
        this.ano = 0; 
        this.genero = null;
        this.quantidade_livros = 0;
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "\nAutores: " + lista_autores + "\nGênero: " + genero + "\nAno publicação: " + ano + "\nQuantidade de unidades: " + quantidade_livros;
    }

    // Métodos getters e setters para acessar e modificar os atributos privados

    public String getTitulo() {
        return titulo; // Retorna o título do cadastro
    }

    public void setTitulo(String titulo) throws IllegalArgumentException{
        if(titulo.length() < 3){
            throw new IllegalArgumentException("título inválido! O título deve ter no mínimo 3 caracteres");
        }else{
            this.titulo = titulo; // Define um novo valor para o título
        }
    }

    public ArrayList<String> getLista_autores() {
        return lista_autores; // Retorna o autor do cadastro
    }

    public void setLista_autores(ArrayList <String> autor) throws IllegalArgumentException{
        if(autor.isEmpty()){
            throw new IllegalArgumentException("Lista de autores inválidos!! Deve ter no mínimo um autor");
        }
        
        for(String a:autor){    
            if(a.length() < 3){
                throw new IllegalArgumentException("Nome inválido ( " + a + " )! O nome do autor deve ter no mínimo 3 caracteres");
            }
        }
        
        this.lista_autores = autor;
    }

    public int getAno() {
        return ano; // Retorna o ano do cadastro
    }

    public void setAno(int ano) throws IllegalArgumentException{
        if(ano < 0){
            throw new IllegalArgumentException("Ano inválido! Deve ser um número positivo.");
        }else{
            this.ano = ano; // Define um novo valor para o ano
        }
    }

    public String getGenero() {
        return genero; // Retorna o gênero do cadastro
    }

    public void setGenero(String genero) throws IllegalArgumentException{
        if(genero.length() < 3){
            throw new IllegalArgumentException("Gênero inválido!  Deve ter no mínimo 3 caracteres.");
        }else{
            this.genero = genero; // Define um novo valor para o gênero
        }
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
    //Exibe info de um livro específico 
    public static String exibirInfo(String procura){
        if(Listalivro.isEmpty()){
            return "Não há livros cadastrados...";
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
        
        return "Livro não encontrado...";
    }
    //Exibe info de todos os livros
    public static String exibirInfo(){
        if(Listalivro.isEmpty()){
            return "Não há livros cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Livro l:Listalivro){
            resultado.append(l.toString()).append('\n');
        }
        
        return resultado.toString();
    }
}
    

