
package pacoteLivro;

import java.util.ArrayList;

public class Livro {
    // Declaração de variáveis de instância privadas
    protected String titulo;
    protected String autor;
    protected int ano;
    protected String genero;
    protected static ArrayList<Livro> Listalivro = new ArrayList();


    // Construtor da classe que inicializa as variáveis de instância
    public Livro(String titulo, String autor, int ano, String genero) {
        this.titulo = titulo;
        this.autor = autor;  
        this.ano = ano; 
        this.genero = genero;
    }

    // Métodos getters e setters para acessar e modificar os atributos privados

    public String getTitulo() {
        return titulo; // Retorna o título do cadastro
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; // Define um novo valor para o título
    }

    public String getAutor() {
        return autor; // Retorna o autor do cadastro
    }

    public void setAutor(String autor) {
        this.autor = autor; // Define um novo valor para o autor
    }

    public int getAno() {
        return ano; // Retorna o ano do cadastro
    }

    public void setAno(int ano) {
        this.ano = ano; // Define um novo valor para o ano
    }

    public String getGenero() {
        return genero; // Retorna o gênero do cadastro
    }

    public void setGenero(String genero) {
        this.genero = genero; // Define um novo valor para o gênero
    }
    
    public void exibirInfo(){
        System.out.println("Titulo: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Genero: "+genero);
            System.out.println("Ano de publicação: : "+ano);
    }
}
    

