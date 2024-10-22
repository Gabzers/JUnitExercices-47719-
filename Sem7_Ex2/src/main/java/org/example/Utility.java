package org.example;

/**
 * Classe Utilidade que contém métodos para verificar se um número é primo, par ou múltiplo.
 *
 * @author 47719
 */
public class Utility {

    /**
     * Verifica se um número é primo.
     *
     * @param number O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica se um número é par.
     *
     * @param number O número a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Verifica se um número é múltiplo de outro.
     *
     * @param number O número a ser verificado.
     * @param divisor O divisor a ser utilizado.
     * @return true se number for múltiplo de divisor, false caso contrário.
     */
    public static boolean isMultiple(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("O divisor não pode ser zero.");
        }
        return number % divisor == 0;
    }
}
