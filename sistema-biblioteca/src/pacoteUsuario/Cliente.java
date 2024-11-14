/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteUsuario;

import java.util.ArrayList;

/**
 *
 * @author Tau�- one nation
 */
public final class Cliente extends Usuario{
    private static ArrayList<Usuario> lista_cliente = new ArrayList();
    private String cpf, endereco;
    
    public Cliente(){
        super();
        this.cpf = null;
        this.endereco = null;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException{
        if(cpf.length() != 11){
            throw new IllegalArgumentException("CPF inv�lido!! O cpf deve conter apenas os 11 d�gitos num�ricos...");
        }else{
            this.cpf = cpf;
        }
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException{
        if(endereco.length() < 5){
            throw new IllegalArgumentException("endere�o inv�lido!! O endere�o deve ter mais de 5 caracteres...");
        }
        this.endereco = endereco;
    }
    
    public static void cadastrarCliente(Cliente c){
        lista_usuarios.add(c);
        lista_cliente.add(c);
    }
    
    
}
