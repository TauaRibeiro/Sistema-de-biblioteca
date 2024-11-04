package pacoteUsuario;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Usuario u = new Usuario();
        String nome, senha;
        
        do{ 
            if(u.nome == null){
                try{
                    System.out.print("Digite o nome do usuário: ");
                    nome = entrada.nextLine();
                    
                    u.setNome(nome);
                }catch(IllegalArgumentException e){
                    System.out.println("Nome inválido, pois " + e.getMessage() + "Por favor tente novamente...");
                    continue;
                }
            }
            
            try{
                System.out.print("Digite a senha do usuário:");
                senha = entrada.nextLine();
                
                u.setSenha(senha);
            }catch(IllegalArgumentException e){
                System.out.println("Senha inválida, pois " + e.getMessage() + "Por favor tente novamente...");
            }
            
        }while(u.nome == null || u.senha == null);
        
        Usuario.cadastrarUsuario(u);
        
        System.out.println(Usuario.mostrarUsuarios());
    }
    
}
