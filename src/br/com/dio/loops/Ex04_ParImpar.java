package br.com.dio.loops;

/*
DO-WHILE
Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números
pares e a quantidade de números impares.
 */

import javax.swing.*;
import java.util.Scanner;

public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            int contador = 0;
            int qdeNumeros = 0;
            int numPar = 0;
            int numImpar = 0;
            System.out.print("Digite quantos números serão testados: ");
            qdeNumeros = leia.nextInt();
            int vetor[] = new int[qdeNumeros];

            do {
                System.out.printf("Digite o %dº número: ", contador + 1);
                vetor[contador] = leia.nextInt();

                //Verificando PAR ou IMPAR
                if (vetor[contador]%2 == 0) { numPar++; }
                else { numImpar++; }
                contador++;
            } while (contador < qdeNumeros);

            //Total de números PARES e IMPARES
            System.out.println("-----------------------------------");
            System.out.println("Quantidade de números PARES ...: " + numPar);
            System.out.println("Quantidade de números IMPARES .: " + numImpar);
            System.out.println("-----------------------------------");

        } catch (NumberFormatException ne) {
            System.out.println("Informe um número inteiro" + ne.getMessage());
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }//Fim do catch
    }//Fim do Main
}//Fim da classe
