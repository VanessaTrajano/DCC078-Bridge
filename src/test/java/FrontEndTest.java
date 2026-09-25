import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontEndTest {

    @Test
    void deveRetornarSalarioFrontEndJunior() {
        Senioridade senioridade = new Junior();
        FrontEnd frontEnd = new FrontEnd(2000.0f);
        frontEnd.setSenioridade(senioridade);
        assertEquals(2000.0f, frontEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFrontEndPleno() {
        Senioridade senioridade = new Pleno();
        FrontEnd frontEnd = new FrontEnd(2000.0f);
        frontEnd.setSenioridade(senioridade);
        assertEquals(2200.0f, frontEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFrontEndSenior() {
        Senioridade senioridade = new Senior();
        FrontEnd frontEnd = new FrontEnd(2000.0f);
        frontEnd.setSenioridade(senioridade);
        assertEquals(2400.0f, frontEnd.calcularSalario(), 0.01f);
    }

}