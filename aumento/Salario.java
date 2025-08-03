package aumento;
import empregado.Funcionario;
public class Salario{
    public double aumento;
    public double liquido;

    public double liquido(Funcionario funcionario){
        this.liquido=funcionario.salarioBruto-funcionario.taxa;
        return this.liquido;
        
    }
    public void novosalario(Funcionario funcionario){
        funcionario.salarioBruto += (this.aumento*funcionario.salarioBruto)/100;
        return;
    }



}
