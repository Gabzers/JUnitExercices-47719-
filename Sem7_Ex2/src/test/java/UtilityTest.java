import org.example.Utility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes para a classe Utility.
 *
 * @author 47719
 */
public class UtilityTest {

    /**
     * Testa números primos.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void testIsPrime(int number) {
        assertTrue(Utility.isPrime(number), "O número " + number + " deveria ser primo.");
    }

    /**
     * Testa números pares.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void testIsEven(int number) {
        assertTrue(Utility.isEven(number), "O número " + number + " deveria ser par.");
    }

    /**
     * Testa múltiplos de 23.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    public void testIsMultipleOf23(int number) {
        assertTrue(Utility.isMultiple(number, 23), "O número " + number + " deveria ser múltiplo de 23.");
    }

    /**
     * Testa números que não são primos.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {4, 21, 100, 200, 49})
    public void testNotPrime(int number) {
        assertFalse(Utility.isPrime(number), "O número " + number + " não deveria ser primo.");
    }

    /**
     * Testa números ímpares.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testNotEven(int number) {
        assertFalse(Utility.isEven(number), "O número " + number + " não deveria ser par.");
    }

    /**
     * Testa números que não são múltiplos de 23.
     *
     * @param number O número a ser testado.
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testNotMultipleOf23(int number) {
        assertFalse(Utility.isMultiple(number, 23), "O número " + number + " não deveria ser múltiplo de 23.");
    }
}
