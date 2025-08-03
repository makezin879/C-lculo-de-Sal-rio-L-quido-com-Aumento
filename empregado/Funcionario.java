package empregado;  //main//

import aumento.Salario;
import java.util.Scanner;

public class Funcionario {
    
    public String nome;
    public double salarioBruto;
    public double taxa;

    

    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();
        Salario salario=new Salario();
        

        Scanner sc= new Scanner(System.in);
        System.out.println("qual o nome do funcionario:");
        funcionario.nome=sc.nextLine();
        System.out.println("Qual o salario do funcionario?");
        funcionario.salarioBruto=sc.nextDouble();
        System.out.println("qual a taxa? ");
        funcionario.taxa=sc.nextDouble();
        salario.liquido(funcionario);

        System.out.println("nome do funcionario "+funcionario.nome
        +"salario liquido: "+ salario.liquido);
        System.out.println("qual sera a porcentagem do aumento salarial? ");
        salario.aumento=sc.nextDouble();
        salario.novosalario(funcionario);
        salario.liquido(funcionario);
        
        System.out.println("novo salario "+salario.liquido);

        sc.close();

    }


}
