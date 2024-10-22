package org.example;
import java.util.ArrayList;

/**
 * Classe que contém um método para calcular a média dos dígitos de um número.
 *
 * Autor: 47719
 */
public class DigitAverage {

    /**
     * Método que calcula a média dos dígitos de um número.
     *
     * @param number O número do qual se deseja calcular a média dos dígitos.
     * @return A média dos dígitos do número.
     */
    public double averageOfDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
        int sum = 0;

        number = Math.abs(number);

        // Extrai os dígitos do número
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            sum += digit;
            number /= 10;
        }

        // Calcula e retorna a média
        return digits.size() > 0 ? (double) sum / digits.size() : 0;
    }
}
