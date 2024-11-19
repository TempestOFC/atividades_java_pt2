/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_2_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_2_2 {

    // Função para verificar se um número é primo
    public static boolean verificarPrimo(int numero) {
        // Um número menor ou igual a 1 não é primo
        if (numero <= 1) {
            return false;
        }
        // Verificar se o número é divisível por algum número entre 2 e a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível, não é primo
            }
        }
        return true; // Se não foi divisível por nenhum número, é primo
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira um número
        String input = JOptionPane.showInputDialog("Digite um número para verificar se é primo:");
        
        // Converte a entrada de texto para inteiro
        int numero = Integer.parseInt(input);

        // Chama a função para verificar se o número é primo
        boolean resultado = verificarPrimo(numero);

        // Exibe a resposta em uma caixa de mensagem
        String mensagem = "O número " + numero + (resultado ? " é primo." : " não é primo.");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

