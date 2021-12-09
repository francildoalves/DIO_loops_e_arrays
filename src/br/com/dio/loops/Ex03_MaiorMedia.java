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
        /*
        for (int i = 0; i < qdeNumero; i++) {
            System.out.printf("Informe o %dº número: ", (i + 1));
            vetor[i] = ler.nextInt();
        }
        */

        int controle = 0;
        do {
            System.out.printf("Informe o %dº número: ", (controle + 1));
            vetor[controle] = ler.nextInt();
            controle++;
        } while (controle < qdeNumero);
            int maiorNumero = 0;
            for (int i = 0; i < qdeNumero; i++) {
                if (maiorNumero < vetor[i]){
                    maiorNumero = vetor[i];
                }
            }
            System.out.printf("O maior número é %d ", maiorNumero);


    }
}
