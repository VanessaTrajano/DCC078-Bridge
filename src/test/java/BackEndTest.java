import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackEndTest {

    @Test
    void deveRetornarSalarioBackEndJunior() {
        Senioridade senioridade = new Junior();
        BackEnd backEnd = new BackEnd(2000.0f);
        backEnd.setSenioridade(senioridade);
        assertEquals(2000.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBackEndPleno() {
        Senioridade senioridade = new Pleno();
        BackEnd backEnd = new BackEnd(2000.0f);
        backEnd.setSenioridade(senioridade);
        assertEquals(2200.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBackEndSenior() {
        Senioridade senioridade = new Senior();
        BackEnd backEnd = new BackEnd(2000.0f);
        backEnd.setSenioridade(senioridade);
        assertEquals(2400.0f, backEnd.calcularSalario(), 0.01f);
    }

}