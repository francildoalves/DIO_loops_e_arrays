package br.com.dio.loops;

import javax.swing.JOptionPane;

/*
WHILE
Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

public class Ex02Nota {
    public static void main(String[] args) {
        try {
            int nota = 0;
            while ((0 >= nota) && (nota <= 10)) {
                nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma nota entre 0 e 10"));                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
