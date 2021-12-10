package br.com.dio.loops;

import java.util.Scanner;

/*
DO-WHILE
Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

public class Ex03_MaiorMedia {
    public static void main(String[] args) {
        //Variáveis
        int qdeNumero = 5;
        int vetor[] = new int[qdeNumero];

        Scanner ler = new Scanner(System.in);

        //Recebendo os números do cliente
        int controle = 0;
        int soma = 0;
        do {
            System.out.printf("Informe o %dº número: ", (controle + 1));
            vetor[controle] = ler.nextInt();
            controle++;
        } while (controle < qdeNumero);

        int maiorNumero = 0;
        for (int i = 0; i < qdeNumero; i++) {
            soma = soma + vetor[i]; // Soma os números no vetor
            /*
            * Verifica qual é o maior número
            */
            if (maiorNumero < vetor[i]) {
                maiorNumero = vetor[i];
            }
        }

        System.out.println("------------------------");
        System.out.printf("Maior número .....: %d", maiorNumero);
        System.out.println();
        System.out.printf("Média.............: %d", (soma/qdeNumero));
        System.out.println();
        System.out.println("------------------------");
    }
}
