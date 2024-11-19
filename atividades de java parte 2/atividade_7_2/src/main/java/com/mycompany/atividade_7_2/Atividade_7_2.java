/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_7_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Atividade_7_2 {

    // Função para inserir dados no vetor
    public static void dadosVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor para a posição " + (i + 1) + ":");
            vetor[i] = Integer.parseInt(input); // Converte a entrada para inteiro
        }
    }

    // Função para ordenar o vetor em ordem crescente
    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);
    }

    // Função para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        StringBuilder resultado = new StringBuilder("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            resultado.append(vetor[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static void main(String[] args) {
        int[] vetor = new int[5]; // Vetor de 5 elementos
        int opcao;

        do {
            // Exibe o menu para o usuário
            String menu = "MENU VETOR\n" +
                          "1. Dados do VETOR\n" +
                          "2. Ordena VETOR\n" +
                          "3. Imprime VETOR\n" +
                          "4. Sai do programa\n";
            String input = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(input); // Converte a entrada para inteiro

            // Processa a opção escolhida
            switch (opcao) {
                case 1:
                    dadosVetor(vetor); // Chama a função para inserir dados no vetor
                    break;
                case 2:
                    ordenarVetor(vetor); // Chama a função para ordenar o vetor
                    break;
                case 3:
                    imprimirVetor(vetor); // Chama a função para imprimir o vetor
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 4); // O loop continua até que o usuário escolha a opção 4 para sair
    }
}

