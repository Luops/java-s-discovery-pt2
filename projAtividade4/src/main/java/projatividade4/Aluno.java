
package projatividade4;
import javax.swing.JOptionPane;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    
    public double calcularMedia(){
        double resultado = (nota1 + nota2)/2;
        
        return resultado;
    }
    public String verificarSituacao(){
        if(calcularMedia() >= 6){
            return "Aprovado!";
        }else {
            return "Reprovado!";
        }
    }

        
}
