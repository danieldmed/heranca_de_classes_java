/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilarespoo1;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa {
    
    int RA;
    String curso;
    
    Aluno(String nome, int CPF, int idade, int RA, String curso) {
     super(nome, CPF,idade );
     
     this.RA = RA;
     this.curso = curso;
     
    }
}
