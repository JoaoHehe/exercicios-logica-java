// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de sua escolha:");
        int valor = input.nextInt();

        if (valor % 2 == 0){
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");

        }

        if (valor > 0) {
            System.out.println("O número é positivo.");
        } else if (valor < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }


        input.close();
    };
};
