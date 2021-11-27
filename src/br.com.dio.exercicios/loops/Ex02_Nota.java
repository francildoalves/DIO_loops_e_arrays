package br.com.dio.exercicios.loops;

/*
WHILE
Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe 
um valor válido.
 */

public void class Ex02_Nota (int nota){
    this.nota = nota;
    while ((nota < 0) || (nota > 10)) {
        System.out.println("Valor inválido. Digite uma valor entre 0 e 10."); 
             
    }

}
