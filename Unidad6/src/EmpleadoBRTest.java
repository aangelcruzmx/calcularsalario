
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EmpleadoBRTest {

@Test
public void testCalculaSalarioBruto1() {
    double resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000.0, 8.0);
    double resultadoEsperado = 1360.0;
    assertEquals(resultadoEsperado, resultadoReal, 0.01);
}

@Test
    public void testCalculaSalarioNeto2000(){
    assertEquals(1640, EmpleadoBR.calculaSalarioNeto(2000), 0.01);
}




}
