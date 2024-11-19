/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_3_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_3_2 {

    // Função para verificar se um número é capicua
    public static boolean verificarCapicua(int numero) {
        // Converte o número para String
        String numeroStr = Integer.toString(numero);
        
        // Cria uma String reversa do número
        String numeroReverso = new StringBuilder(numeroStr).reverse().toString();
        
        // Verifica se o número original é igual ao número reverso
        return numeroStr.equals(numeroReverso);
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira um número
        String input = JOptionPane.showInputDialog("Digite um número para verificar se é capicua:");
        
        // Converte a entrada de texto para inteiro
        int numero = Integer.parseInt(input);

        // Chama a função para verificar se o número é capicua
        boolean resultado = verificarCapicua(numero);

        // Exibe a resposta em uma caixa de mensagem
        String mensagem = "O número " + numero + (resultado ? " é capicua." : " não é capicua.");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

