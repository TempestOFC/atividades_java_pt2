/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_8_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_8_2 {

    // Função para inserir dados no vetor A
    public static void dadosVetorA(int[] vetorA) {
        for (int i = 0; i < vetorA.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor para o vetor A, posição " + (i + 1) + ":");
            vetorA[i] = Integer.parseInt(input); // Converte a entrada para inteiro
        }
    }

    // Função para inserir dados no vetor B
    public static void dadosVetorB(int[] vetorB) {
        for (int i = 0; i < vetorB.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor para o vetor B, posição " + (i + 1) + ":");
            vetorB[i] = Integer.parseInt(input); // Converte a entrada para inteiro
        }
    }

    // Função para imprimir os vetores A e B
    public static void imprimirVetores(int[] vetorA, int[] vetorB) {
        StringBuilder resultado = new StringBuilder("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            resultado.append(vetorA[i]).append(" ");
        }
        
        resultado.append("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            resultado.append(vetorB[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    // Função para somar os vetores A e B
    public static void somaVetores(int[] vetorA, int[] vetorB) {
        int[] resultadoSoma = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            resultadoSoma[i] = vetorA[i] + vetorB[i];
        }

        // Exibe o resultado da soma
        StringBuilder resultado = new StringBuilder("Soma dos vetores: ");
        for (int i = 0; i < resultadoSoma.length; i++) {
            resultado.append(resultadoSoma[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    // Função para subtrair os vetores A e B
    public static void subtraiVetores(int[] vetorA, int[] vetorB) {
        int[] resultadoSubtracao = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            resultadoSubtracao[i] = vetorA[i] - vetorB[i];
        }

        // Exibe o resultado da subtração
        StringBuilder resultado = new StringBuilder("Subtração dos vetores: ");
        for (int i = 0; i < resultadoSubtracao.length; i++) {
            resultado.append(resultadoSubtracao[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static void main(String[] args) {
        int[] vetorA = new int[5]; // Vetor A de 5 elementos
        int[] vetorB = new int[5]; // Vetor B de 5 elementos
        int opcao;

        do {
            // Exibe o menu para o usuário
            String menu = "VETORES\n" +
                          "1. Dados do VETOR A\n" +
                          "2. Dados do VETOR B\n" +
                          "3. Imprime VETORES\n" +
                          "4. Soma VETORES\n" +
                          "5. Subtrai VETORES\n" +
                          "6. Sai do programa\n";
            String input = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(input); // Converte a entrada para inteiro

            // Processa a opção escolhida
            switch (opcao) {
                case 1:
                    dadosVetorA(vetorA); // Chama a função para inserir dados no vetor A
                    break;
                case 2:
                    dadosVetorB(vetorB); // Chama a função para inserir dados no vetor B
                    break;
                case 3:
                    imprimirVetores(vetorA, vetorB); // Chama a função para imprimir os vetores
                    break;
                case 4:
                    somaVetores(vetorA, vetorB); // Chama a função para somar os vetores
                    break;
                case 5:
                    subtraiVetores(vetorA, vetorB); // Chama a função para subtrair os vetores
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 6); // O loop continua até que o usuário escolha a opção 6 para sair
    }
}
