/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilarespoo1;

/**
 *
 * @author Admin
 */
public class PilaresPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Daniel", 12345, 20, 987, "Programação");
        
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("CPF: " + aluno1.CPF);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("RA: " + aluno1.RA);
        System.out.println("Curso: " + aluno1.curso);
        
        Professor professor1 = new Professor("Maria", 45678, 30, 123, "Banco de dados");
        
        System.out.println("Nome: " + professor1.nome);
        System.out.println("CPF: " + professor1.CPF);
        System.out.println("Idade: " + professor1.idade);
        System.out.println("RA: " + professor1.RF);
        System.out.println("Curso: " + professor1.disciplina);
        
        Funcionario funcionario1 = new Funcionario("João", 19283, 27, 765, "Coordenador");
        
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("CPF: " + funcionario1.CPF);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("RA: " + funcionario1.RGM);
        System.out.println("Curso: " + funcionario1.cargo);
        
    }
    
}
