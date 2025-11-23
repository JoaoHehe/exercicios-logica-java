// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

class ExercicioSeis {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Digite o valor: ");
         int valor = input.nextInt();
         float valorReajustado = (valor + (5f / 100f) * valor);

         System.out.println("O valor informado com o reajuste de 5% é: " + valorReajustado);

     };
};
