
package projatividade3;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[]args){
        Funcionario objFuncionario1 = new Funcionario();
        Funcionario objFuncionario2 = new Funcionario();
        
        objFuncionario1.nome = JOptionPane.showInputDialog("Informe o nome do Funcionário 1: ");
        objFuncionario1.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora do Funcionário 1: "));
        objFuncionario1.cargaHorariaMes = Double.parseDouble(JOptionPane.showInputDialog("Informe a carga horária do mês do Funcionário 1: "));
        objFuncionario1.calcularSalario();
        
        objFuncionario2.nome = JOptionPane.showInputDialog("Informe o nome do Funcionário 2: ");
        objFuncionario2.valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora do Funcionário 2: "));
        objFuncionario2.cargaHorariaMes = Double.parseDouble(JOptionPane.showInputDialog("Informe a carga horária do mês do Funcionário 2: "));
        objFuncionario2.calcularSalario();
        
        JOptionPane.showMessageDialog(null, "Dados dos Funcionários:" + "\nFuncionário 1:"
        + "\nNome: " + objFuncionario1.nome
        + "\nValor da Hora: " + objFuncionario1.valorHora
        + "\nCarga horária: " + objFuncionario1.cargaHorariaMes
        + "\nSalário mensal: " + objFuncionario1.calcularSalario()
        + "\n\nFuncionário 2:"
        + "\nNome: " + objFuncionario2.nome
        + "\nValor da Hora: " + objFuncionario2.valorHora
        + "\nCarga horária: " + objFuncionario2.cargaHorariaMes
        + "\nSalário mensal: " + objFuncionario2.calcularSalario());
        
    }
}
