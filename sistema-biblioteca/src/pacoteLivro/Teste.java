package pacoteLivro;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList <String> autores = new ArrayList();
        Livro l = new Livro();
        
        autores.add("Teste 1");
        autores.add("Teste 2");
        autores.add("Teste 3");
        
        l.setAno(2000);
        l.setGenero("Terror");
        l.setLista_autores(autores);
        l.setQuantidade_livros(45);
        l.setTitulo("Título geral");
        
        System.out.println(l.toString());
    }
    
}
