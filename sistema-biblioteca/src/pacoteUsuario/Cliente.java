/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteUsuario;

/**
 *
 * @author Tauã- one nation
 */
public class Cliente extends Usuario{
    public Cliente(){
        super("estudante");
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.id + "\nNOME: " + this.nome + "\nTipo de acesso: " + this.tipo_acesso + "\nSenha: " + this.senha + "\n";
    }
    
}
