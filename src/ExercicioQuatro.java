// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de sua preferência: ");
        int valor = input.nextInt();

        System.out.println("O sucessor de " + valor + " é: " + (valor + 1));
        System.out.println("O antecessor de " + valor + " é: " + (valor - 1));

        input.close();
    };
};
