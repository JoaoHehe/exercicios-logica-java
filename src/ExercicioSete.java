// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva se os valores são verdadeiros ou falsos");

        boolean valorUm = input.nextBoolean();
        boolean valorDois = input.nextBoolean();

        if (valorUm == true && valorDois == true){
            System.out.println("Ambos os valores são verdadeiros.");
        }else if (valorUm == false && valorDois == false){
            System.out.println("Ambos valores são falsos");
        }else{
            System.out.println("Algum dos valores é falso");
        };

        input.close();
    };
};
