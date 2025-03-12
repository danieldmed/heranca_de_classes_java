/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilarespoo1;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa{
    
    int RF;
    String disciplina;
    
    Professor(String nome, int CPF, int idade, int RF, String disciplina) {
        super(nome, CPF, idade);
        
        this.RF = RF;
        this.disciplina = disciplina;
        
    }
}
