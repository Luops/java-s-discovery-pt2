
package projatividade;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class Main {
    public static void main (String [] args){
        
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        Produto objProduto3 = new Produto();
       
        
        objProduto1.nome = JOptionPane.showInputDialog("Informe o nome do produto 1: ");
        objProduto1.descricao = JOptionPane.showInputDialog("Descrição do produto 1: ");
        objProduto1.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 1: "));
        
        objProduto2.nome = JOptionPane.showInputDialog("Informe o nome do produto 2: ");
        objProduto2.descricao = JOptionPane.showInputDialog("Descrição do produto 2: ");
        objProduto2.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 2: "));
        
        objProduto3.nome = JOptionPane.showInputDialog("Informe o nome do produto 3: ");
        objProduto3.descricao = JOptionPane.showInputDialog("Descrição do produto 3: ");
        objProduto3.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 3: "));
        
        JOptionPane.showMessageDialog(null, "Dados dos Produtos " + "\nProduto 1" +
                "\nNome: " + objProduto1.nome +
                "\nDescrição: " + objProduto1.descricao +
                "\nValor: " + objProduto1.valor
                 + "\nProduto 2" +
                "\nNome: " + objProduto2.nome +
                "\nDescrição: " + objProduto2.descricao +
                "\nValor: " + objProduto2.valor
                + "\nProduto 3" +
                "\nNome: " + objProduto3.nome +
                "\nDescrição: " + objProduto3.descricao +
                "\nValor: " + objProduto3.valor);
        
    }
  
}
