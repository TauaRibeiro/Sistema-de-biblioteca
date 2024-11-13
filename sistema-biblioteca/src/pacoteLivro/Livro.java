
package pacoteLivro;

import java.util.ArrayList;

public final class Livro {
    // Declara��o de vari�veis de inst�ncia privadas
    private String titulo;
    private ArrayList <String> lista_autores;
    private int ano, quantidade_livros;
    private String genero;
    private final static ArrayList<Livro> Listalivro = new ArrayList();


    // Construtor da classe que inicializa as vari�veis de inst�ncia
    public Livro() {
        this.titulo = null;
        this.lista_autores = null;  
        this.ano = 0; 
        this.genero = null;
        this.quantidade_livros = 0;
    }
    
    @Override
    public String toString(){
        return "T�tulo: " + titulo + "\nAutores: " + lista_autores + "\nG�nero: " + genero + "\nAno publica��o: " + ano + "\nQuantidade de unidades: " + quantidade_livros;
    }

    // M�todos getters e setters para acessar e modificar os atributos privados

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

    public ArrayList<String> getLista_autores() {
        return lista_autores; // Retorna o autor do cadastro
    }

    public void setLista_autores(ArrayList <String> autor) throws IllegalArgumentException{
        if(autor.isEmpty()){
            throw new IllegalArgumentException("Lista de autores inv�lidos!! Deve ter no m�nimo um autor");
        }
        
        for(String a:autor){    
            if(a.length() < 3){
                throw new IllegalArgumentException("Nome inv�lido ( " + a + " )! O nome do autor deve ter no m�nimo 3 caracteres");
            }
        }
        
        this.lista_autores = autor;
    }

    public int getAno() {
        return ano; // Retorna o ano do cadastro
    }

    public void setAno(int ano) throws IllegalArgumentException{
        if(ano < 0){
            throw new IllegalArgumentException("Ano inv�lido! Deve ser um n�mero positivo.");
        }else{
            this.ano = ano; // Define um novo valor para o ano
        }
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
    //Exibe info de um livro espec�fico 
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
    

