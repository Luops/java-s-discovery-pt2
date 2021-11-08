
package projatividade4;

import javax.swing.JOptionPane;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[]args){
        Aluno objAluno1 = new Aluno();
        Aluno objAluno2 = new Aluno();
        
        objAluno1.nome = JOptionPane.showInputDialog("Informe o nome do Aluno 1: ");
        objAluno1.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 do aluno 1: "));
        objAluno1.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 do aluno 1: "));
        objAluno1.calcularMedia();
        objAluno1.verificarSituacao();
        
        objAluno2.nome = JOptionPane.showInputDialog("Informe o nome do Aluno 2: ");
        objAluno2.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 do aluno 2: "));
        objAluno2.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 do aluno 2: "));
        objAluno2.calcularMedia();
        objAluno2.verificarSituacao();
        
        
        JOptionPane.showMessageDialog(null, "Dados dos Alunos:" + "\nAluno 1:"
        + "\nNome: " + objAluno1.nome
        + "\nNota 1: " + objAluno1.nota1
        + "\nNota 2:" + objAluno1.nota2
        + "\nMédia: " + objAluno1.calcularMedia()
        + "\n" + objAluno1.verificarSituacao()
        + "\n\nAluno 2:"
        + "\nNome: " + objAluno2.nome
        + "\nNota 1: " + objAluno2.nota1
        + "\nNota 2:" + objAluno2.nota2
        + "\nMédia: " + objAluno2.calcularMedia()
        + "\n" + objAluno2.verificarSituacao());
              
              
    }
}
