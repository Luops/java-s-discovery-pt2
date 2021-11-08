
package projatividade3;


public class Funcionario {
    public String nome;
    public double valorHora;
    public double cargaHorariaMes;
    
    public double calcularSalario(){
        double resultado = valorHora * cargaHorariaMes;
        
        return resultado;
    }
}
