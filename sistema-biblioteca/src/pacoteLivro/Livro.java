
package pacoteLivro;

import java.util.ArrayList;

public class Livro {
    // Declara��o de vari�veis de inst�ncia privadas
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    protected static ArrayList<Livro> Listalivro = new ArrayList();

    // Construtor da classe que inicializa as vari�veis de inst�ncia
    public Livro(String titulo, String autor, int ano, String genero) {
        this.titulo = titulo;
        this.autor = autor;  
        this.ano = ano; 
        this.genero = genero;
    }

    // M�todos getters e setters para acessar e modificar os atributos privados

    public String getTitulo() {
        return titulo; // Retorna o t�tulo do cadastro
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; // Define um novo valor para o t�tulo
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
        return genero; // Retorna o g�nero do cadastro
    }

    public void setGenero(String genero) {
        this.genero = genero; // Define um novo valor para o g�nero
    }
}

    



