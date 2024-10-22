package org.example;

/**
 * Classe que representa um retângulo e fornece métodos para calcular a área,
 * o perímetro e verificar se três lados podem formar um triângulo.
 *
 * @author 47719
 */
public class Retangulo {

    /**
     * Calcula a área de um retângulo dado a base e a altura.
     *
     * @param base  A base do retângulo.
     * @param altura A altura do retângulo.
     * @return A área do retângulo.
     */
    public int area(int base, int altura) {
        return base * altura;
    }

    /**
     * Calcula o perímetro de um retângulo dado a base e a altura.
     *
     * @param base  A base do retângulo.
     * @param altura A altura do retângulo.
     * @return O perímetro do retângulo.
     */
    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    /**
     * Verifica se três lados podem formar um triângulo.
     *
     * @param a O comprimento do primeiro lado.
     * @param b O comprimento do segundo lado.
     * @param c O comprimento do terceiro lado.
     * @return {@code true} se os lados podem formar um triângulo, {@code false} caso contrário.
     */
    public boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
