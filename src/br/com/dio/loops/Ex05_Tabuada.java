package br.com.dio.loops;

/*
FOR
Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

import java.util.Scanner;

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        try {
            System.out.printf("Digite um número inteiro entre 1 e 10: ");
            int numero = leia.nextInt();

            //Tabuada de SOMAR
            System.out.println("Tabuada de SOMAR");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d + %d = %d", i, numero, + (numero + i));
                System.out.println();
            }
            System.out.println();

            //Tabuada de SUBTRAIR
            System.out.println("Tabuada de SUBTRAIR");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d - %d = %d", i, numero, + (numero - i));
                System.out.println();
            }
            System.out.println();

            //Tabuada de MULTIPLICAR
            System.out.println("Tabuada de SUBTRAIR");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d X %d = %d", i, numero, + (numero * i));
                System.out.println();
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } //Fim do catch
    } // Fim do Main
}// Fim da classe
