//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos
// esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário do usuario: ");

        double salarioMinimo = 1293.20;
        double salarioUsuario = input.nextDouble();
        double quantidade;

        if (salarioUsuario <= salarioMinimo){
            System.out.println("O salário do usuario não pode ser menor ou igual o salário minimo");

        }else {
            quantidade = (salarioUsuario/salarioMinimo);
            String resultado = String.format("%.2f", quantidade);
            System.out.println("O Usuario ganha " + resultado + " salários minimos");
        };


    };
};
