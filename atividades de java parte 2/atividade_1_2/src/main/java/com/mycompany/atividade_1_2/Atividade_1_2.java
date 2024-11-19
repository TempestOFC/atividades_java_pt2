/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_1_2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class Atividade_1_2 {
    
    // Função que retorna o dobro de um número
    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        // Recebe os três números do usuário através de caixas de entrada
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String input3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        // Converte as entradas de String para inteiros
        int numero1 = Integer.parseInt(input1);
        int numero2 = Integer.parseInt(input2);
        int numero3 = Integer.parseInt(input3);

        // Calcula o dobro de cada número
        int dobro1 = calcularDobro(numero1);
        int dobro2 = calcularDobro(numero2);
        int dobro3 = calcularDobro(numero3);

        // Exibe o resultado em uma caixa de mensagem
        String mensagem = "Dobro de " + numero1 + ": " + dobro1 + "\n" +
                          "Dobro de " + numero2 + ": " + dobro2 + "\n" +
                          "Dobro de " + numero3 + ": " + dobro3;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}