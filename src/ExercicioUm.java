// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores de A , B e C... assim respectivamente");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();


        int soma = A + B;

        System.out.println(soma);

        if(soma > C){
            System.out.println("A soma de A e B é maior que C!");
        } else {
            System.out.println("A soma de A e B não é maior que C!");
        };

        input.close();
    };
};