
package projatividade2;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[]args){
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        objCao1.nome = JOptionPane.showInputDialog("Informe o nome do Cão 1: ");
        objCao1.raca = JOptionPane.showInputDialog("Informe a raça do Cão 1: ");
        objCao1.cor = JOptionPane.showInputDialog("Informe a cor do Cão 1: ");
        objCao1.sexo = JOptionPane.showInputDialog("Informe o sexo do Cão 1: ");
        objCao1.porte = JOptionPane.showInputDialog("Informe o porte do Cão 1: ");
        objCao1.idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade do Cão 1: "));
        objCao1.dono = JOptionPane.showInputDialog("Informe o dono do Cão 1: ");
        
        objCao2.nome = JOptionPane.showInputDialog("Informe o nome do Cão 2: ");
        objCao2.raca = JOptionPane.showInputDialog("Informe a raça do Cão 2: ");
        objCao2.cor = JOptionPane.showInputDialog("Informe a cor do Cão 2: ");
        objCao2.sexo = JOptionPane.showInputDialog("Informe o sexo do Cão 2: ");
        objCao2.porte = JOptionPane.showInputDialog("Informe o porte do Cão 2: ");
        objCao2.idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade do Cão 2: "));
        objCao2.dono = JOptionPane.showInputDialog("Informe o dono do Cão 2: ");
        
     
        
        
        JOptionPane.showMessageDialog(null, "Dados dos Cães" +  "\nCão 1:" +
         "\nNome: " + objCao1.nome +
         "\nRaça: " + objCao1.raca +
         "\nCor: " + objCao1.cor +
         "\nSexo: " + objCao1.sexo +
         "\nPorte físico: " + objCao1.porte +
         "\nIdade: " + objCao1.idade +
         "\nDono: " + objCao1.dono +
         "\n\nCão 2:" +
         "\nNome: " + objCao2.nome +
         "\nRaça: " + objCao2.raca +
         "\nCor: " + objCao2.cor +
         "\nSexo: " + objCao2.sexo +
         "\nPorte físico: " + objCao2.porte +
         "\nIdade: " + objCao2.idade +
         "\nDono: " + objCao2.dono);
        
    }
}
