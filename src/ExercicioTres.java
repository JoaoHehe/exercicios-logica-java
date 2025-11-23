// 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
// caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.


import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores de A e B respectivamente:");

        int A = input.nextInt();
        int B = input.nextInt();
        int C;

        if (A == B){
            C = A + B;
        } else {
            C =  A * B;
        };

        System.out.println("O valor é: " + C);

        input.close();
    };
};
