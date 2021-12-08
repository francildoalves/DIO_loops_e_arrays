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
            boolean controle = true;
            while (controle) {
                int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma nota entre 0 e 10"));
                if ((nota > 0) || (nota < 10)) {
                    controle = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido!", "Mensagem", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
