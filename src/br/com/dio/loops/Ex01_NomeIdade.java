package br.com.dio.loops;

import javax.swing.JOptionPane;

/*
WHILE
Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome).
 */



public class Ex01_NomeIdade {
    public static void main(String[] args) {        
        String nomeDoAluno = "";

        while (nomeDoAluno != Integer.toString(0)) {
            try {
                nomeDoAluno = JOptionPane.showInputDialog("Digite o nome do aluno ou ZERO para sair");
                if (nomeDoAluno.equals("0")) {
                    JOptionPane sair = new JOptionPane();
                    int encerrarPrograma = sair.showConfirmDialog(null, "Encerrar o programa?", "Fechar o programa", JOptionPane.YES_NO_OPTION);
                    if (encerrarPrograma == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog (null, "Programa Encerrado!");
                        break;
                    }

                } else {
                    int idadeDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
                    JOptionPane.showMessageDialog(null, "O nome do(a) aluno(a) é " + nomeDoAluno.toUpperCase() + " e sua idade é " + idadeDoAluno);
                }               
                                
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, "Digite um número para informar a idade.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
            }
            
        }

    }

}
