package br.com.dio.loops;

/*
WHILE
Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome).
 */


import javax.swing.JOptionPane;


public class Ex01_NomeIdade {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        String nomeDoAluno = "";


        while (nomeDoAluno != Integer.toString(0)) {
            nomeDoAluno =JOptionPane.showInputDialog("Digite o nome do aluno ou ZERO para sair");
            int idadeDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
            //JOptionPane.showMessageDialog(null, "O nome do aluno é: " + nomeDoAluno + " a idade é " + idadeDoAluno);
        }

    }

}
