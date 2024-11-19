/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_4_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_4_2 {

    // Função para remover todas as ocorrências de um caractere e substituí-las por '*'
    public static int removerCaracteres(char[] vetor, int tamanho, char caractere) {
        int contador = 0;
        
        // Itera sobre o vetor de caracteres
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractere) {
                vetor[i] = '*'; // Substitui o caractere por '*'
                contador++;     // Conta a quantidade de caracteres substituídos
            }
        }
        
        // Retorna o total de caracteres substituídos
        return contador;
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira um vetor de caracteres como uma String
        String input = JOptionPane.showInputDialog("Digite a palavra:");
        
        // Converte a entrada para um vetor de caracteres
        char[] vetor = input.toCharArray();
        
        // Solicita ao usuário que insira o caractere a ser removido
        String inputChar = JOptionPane.showInputDialog("Digite a letra que quer remover:");
        char caractere = inputChar.charAt(0);  // Pega o primeiro caractere digitado

        // Chama a função para remover os caracteres e obter o total
        int totalRemovidos = removerCaracteres(vetor, vetor.length, caractere);

        // Exibe o vetor modificado e o número de caracteres removidos
        String resultado = "Vetor modificado: " + new String(vetor) + "\n" +
                           "Total de caracteres removidos: " + totalRemovidos;
        JOptionPane.showMessageDialog(null, resultado);
    }
}

