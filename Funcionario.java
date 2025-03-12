/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilarespoo1;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa{
    
    int RGM;
    String cargo;
    
    Funcionario(String nome, int CPF, int idade, int RGM, String cargo) {
        super(nome, CPF, idade);
        
        this.RGM = RGM;
        this.cargo = cargo;
    }
} 
