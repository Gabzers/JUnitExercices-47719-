import org.example.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para a classe {@link Retangulo}.
 * Esta classe contém testes unitários para verificar o correto funcionamento dos métodos
 * da classe {@link Retangulo}.
 *
 * @author 47719
 */
public class RetanguloTest {

    /**
     * Testa o cálculo da área do retângulo.
     * Este teste verifica se o método {@link Retangulo#area(int, int)} retorna
     * o valor correto para um retângulo com largura 3 e altura 5.
     */
    @Test
    public void testArea() {
        Retangulo retangulo = new Retangulo();
        assertEquals(15, retangulo.area(3, 5), "A área do retângulo deve ser 15");
    }

    /**
     * Testa o cálculo do perímetro do retângulo.
     * Este teste verifica se o método {@link Retangulo#perimetro(int, int)} retorna
     * o valor correto para um retângulo com largura 3 e altura 5.
     */
    @Test
    public void testPerimetro() {
        Retangulo retangulo = new Retangulo();
        assertEquals(16, retangulo.perimetro(3, 5), "O perímetro do retângulo deve ser 16");
    }

    /**
     * Testa se os lados formam um triângulo válido.
     * Este teste verifica se o método {@link Retangulo#isTriangle(int, int, int)}
     * retorna true para os lados 3, 4 e 5, que formam um triângulo válido.
     */
    @Test
    public void testIsTriangleValid() {
        Retangulo retangulo = new Retangulo();
        assertTrue(retangulo.isTriangle(3, 4, 5), "Deve ser um triângulo válido");
    }

    /**
     * Testa se os lados não formam um triângulo.
     * Este teste verifica se o método {@link Retangulo#isTriangle(int, int, int)}
     * retorna false para os lados 1, 2 e 3, que não formam um triângulo.
     */
    @Test
    public void testIsTriangleInvalid() {
        Retangulo retangulo = new Retangulo();
        assertFalse(retangulo.isTriangle(1, 2, 3), "Não deve ser um triângulo");
    }
}
