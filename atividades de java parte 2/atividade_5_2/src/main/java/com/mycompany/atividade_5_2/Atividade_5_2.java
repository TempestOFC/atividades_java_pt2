/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Atividade_5_2 {

    // Função para ordenar os nomes em ordem alfabética
    public static void ordenarNomes(String[] nomes) {
        // Utiliza o método sort da classe Arrays para ordenar os nomes
        Arrays.sort(nomes);
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira 5 nomes
        String nome1 = JOptionPane.showInputDialog("Digite o primeiro nome:");
        String nome2 = JOptionPane.showInputDialog("Digite o segundo nome:");
        String nome3 = JOptionPane.showInputDialog("Digite o terceiro nome:");
        String nome4 = JOptionPane.showInputDialog("Digite o quarto nome:");
        String nome5 = JOptionPane.showInputDialog("Digite o quinto nome:");

        // Armazena os nomes em um vetor de Strings
        String[] nomes = {nome1, nome2, nome3, nome4, nome5};

        // Chama a função para ordenar os nomes
        ordenarNomes(nomes);

        // Exibe os nomes ordenados em uma caixa de mensagem
        String resultado = "Nomes ordenados: \n";
        for (String nome : nomes) {
            resultado += nome + "\n";
        }
        
        // Mostra a mensagem na caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}

