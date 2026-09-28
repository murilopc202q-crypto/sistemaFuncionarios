package scr.funcionarios;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;

    public Funcionario(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void aumentarSalario(float percentual) {
        salario += salario * (percentual / 100);
    }

    public float calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
        System.out.printf("Salário anual: R$ %.2f%n", calcularSalarioAnual());
    }
}