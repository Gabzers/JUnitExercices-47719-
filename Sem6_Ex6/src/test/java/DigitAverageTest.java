import org.example.DigitAverage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para a classe DigitAverage.
 * Esta classe contém testes unitários que verificam o funcionamento do método
 * averageOfDigits, assegurando que a média dos dígitos é calculada corretamente.
 *
 * Autor: 47719
 */
public class DigitAverageTest {
    private DigitAverage digitAverage;

    /**
     * Método que inicializa uma nova instância de DigitAverage antes de cada teste.
     * Este método é executado antes de cada caso de teste para garantir que cada teste
     * parte de um estado limpo e consistente.
     */
    @BeforeEach
    public void setup() {
        digitAverage = new DigitAverage();
    }

    /**
     * Testa a média dos dígitos de um número positivo.
     * Neste teste, a média dos dígitos de 1234 deve ser 2.5.
     */
    @Test
    public void testAverageOfPositiveNumber() {
        assertEquals(2.5, digitAverage.averageOfDigits(1234), 0.001);
    }

    /**
     * Testa a média dos dígitos de um número negativo.
     * Neste teste, a média dos dígitos de -456 deve ser 5.0.
     */
    @Test
    public void testAverageOfNegativeNumber() {
        assertEquals(5.0, digitAverage.averageOfDigits(-456), 0.001);
    }

    /**
     * Testa a média dos dígitos do número zero.
     * Neste teste, a média dos dígitos de 0 deve ser 0.0.
     */
    @Test
    public void testAverageOfZero() {
        assertEquals(0.0, digitAverage.averageOfDigits(0), 0.001);
    }

    /**
     * Testa a média dos dígitos de um número de um único dígito.
     * Neste teste, a média dos dígitos de 5 deve ser 5.0.
     */
    @Test
    public void testAverageOfSingleDigit() {
        assertEquals(5.0, digitAverage.averageOfDigits(5), 0.001);
    }

    /**
     * Testa a média dos dígitos de um número grande.
     * Neste teste, a média dos dígitos de 987654321 deve ser 5.0.
     */
    @Test
    public void testAverageOfLargeNumber() {
        assertEquals(5.0, digitAverage.averageOfDigits(987654321), 0.001);
    }
}
