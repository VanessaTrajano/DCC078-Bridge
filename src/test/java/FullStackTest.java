import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullStackTest {

    @Test
    void deveRetornarSalarioFullStackJunior() {
        Senioridade senioridade = new Junior();
        FullStack fullStack = new FullStack(2000.0f);
        fullStack.setSenioridade(senioridade);
        assertEquals(2000.0f, fullStack.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFullStackPleno() {
        Senioridade senioridade = new Pleno();
        FullStack fullStack = new FullStack(2000.0f);
        fullStack.setSenioridade(senioridade);
        assertEquals(2400.0f, fullStack.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFullStackSenior() {
        Senioridade senioridade = new Senior();
        FullStack fullStack = new FullStack(2000.0f);
        fullStack.setSenioridade(senioridade);
        assertEquals(2800.0f, fullStack.calcularSalario(), 0.01f);
    }

}