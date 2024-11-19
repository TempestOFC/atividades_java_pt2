/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_6_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_6_2 {

    // Função para realizar a busca binária
    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2; // Posição do meio do vetor

            // Verifica se a chave está no meio
            if (vetor[meio] == chave) {
                return meio; // Retorna a posição onde a chave foi encontrada
            }

            // Se a chave for maior que o valor no meio, procura na metade direita
            if (vetor[meio] < chave) {
                inicio = meio + 1;
            }
            // Se a chave for menor que o valor no meio, procura na metade esquerda
            else {
                fim = meio - 1;
            }
        }

        return -1; // Retorna -1 se a chave não for encontrada
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira um vetor de inteiros como uma String
        String input = JOptionPane.showInputDialog("Digite os números do vetor separados por vírgula:");

        // Divide a string de entrada em um array de Strings e converte para inteiros
        String[] numerosStr = input.split(",");
        int[] vetor = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            vetor[i] = Integer.parseInt(numerosStr[i].trim()); // Converte para int
        }

        // Solicita ao usuário que insira a chave a ser buscada
        String inputChave = JOptionPane.showInputDialog("Digite o número a ser buscado:");
        int chave = Integer.parseInt(inputChave);

        // Chama a função de busca binária
        int posicao = buscaBinaria(vetor, chave);

        // Exibe o resultado em uma caixa de mensagem
        if (posicao != -1) {
            JOptionPane.showMessageDialog(null, "A chave foi encontrada na posição: " + posicao);
        } else {
            JOptionPane.showMessageDialog(null, "A chave não foi encontrada no vetor.");
        }
    }
}

