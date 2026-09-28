package src.main;

import src.funcionarios.Funcionario;

public class main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Funcionario("Marcelo", "Operário", 1600.00f),
            new Funcionario("Ana", "Analista", 3200.00f),
            new Funcionario("Carlos", "Assistente", 2200.00f),
            new Funcionario("Beatriz", "Gerente", 3600.00f),
            new Funcionario("João", "Desenvolvedor", 200.00f)
        };

        float[] percentuaisDeAumento = { 5, 8, 6, 10, 7 };

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].aumentarSalario(percentuaisDeAumento[i]);
            funcionarios[i].exibirDados();
            System.out.println();
        }
    }
}
