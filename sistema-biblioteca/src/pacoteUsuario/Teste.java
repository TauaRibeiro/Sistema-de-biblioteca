package pacoteUsuario;

public class Teste {
    public static void main(String[] args) {
        Administrador adm = new Administrador();
        Cliente estudante = new Cliente();
        Funcionario professor = new Funcionario();
        
        adm.setNome("Adm1");
        adm.setSenha("12234");
        
        estudante.setNome("estudante 1");
        estudante.setSenha("12345");
        
        professor.setNome("profesor 1");
        professor.setSenha("123424");
        
        adm.cadastrarUsuario(adm);
        adm.cadastrarUsuario(estudante);
        adm.cadastrarUsuario(professor);
        
        System.out.println(adm.mostrarUsuarios());
        
    }
    
}