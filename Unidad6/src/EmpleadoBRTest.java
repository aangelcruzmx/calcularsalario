
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EmpleadoBRTest {

    @Test
    public void testCalculaSalarioNeto2000() {
        assertEquals(1640, EmpleadoBR.calculaSalarioNeto(2000), 0.01);
    }

    @Test
    public void testCalculaSalarioNeto1500() {
        assertEquals(1230, EmpleadoBR.calculaSalarioNeto(1500), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto1499(){
        assertEquals(1259.9916, EmpleadoBR.calculaSalarioNeto(1499.99), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto1250(){
        assertEquals(1050, EmpleadoBR.calculaSalarioNeto(1250), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto1000(){
        assertEquals(840, EmpleadoBR.calculaSalarioNeto(1000), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto999(){
        assertEquals(999, EmpleadoBR.calculaSalarioNeto(999), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto500(){
        assertEquals(500, EmpleadoBR.calculaSalarioNeto(500), 0.01);
    }
    @Test
    public void testCalculaSalarioNeto0(){
        assertEquals(0, EmpleadoBR.calculaSalarioNeto(0), 0.01);
    }
    @Test
    public void testCalculaSalarioNetoMinus1(){
        assertEquals(-1, EmpleadoBR.calculaSalarioNeto(-1), 0.01);
    }
    @Test
    public void testCalculaSalarioBruto2    () {
        double resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000.0, 8.0);
        double resultadoEsperado = 1360.0;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioBruto3() {
        double resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500.0, 3.0);
        double resultadoEsperado = 1260.0;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

}
