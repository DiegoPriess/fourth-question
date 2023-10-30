import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    final Main main = new Main();

    @Test
    public void testWordWithUpperCase() {
        assertEquals("72olle", main.encryptThis("Hello"), "Erro ao tentar criptografar palavra com uma letra maiúscula");
    }

    @Test
    public void testWordWithLowerCase() {
        assertEquals("103doo", main.encryptThis("good"), "Erro ao tentar criptografar palavra com letras minúsculas");
    }

    @Test
    public void testTwoWords() {
        assertEquals("104olle 119drlo", main.encryptThis("hello world"), "Erro ao tentar criptografar duas palavras");
    }

}
