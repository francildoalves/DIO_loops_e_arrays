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
            boolean continuar = true;
            int contador = 0;
            int vetor[] = new int[contador];
            do {
                System.out.println("Digite um número: ");
                vetor[contador] = leia.nextInt();
                contador++;
            } while (continuar);
        } catch (NumberFormatException ne) {
            System.out.println("Informe um número inteiro" + ne.getMessage());
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }//Fim do catch
    }//Fim do Main
}//Fim da classe
