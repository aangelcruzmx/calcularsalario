public class EmpleadoBR {
    private TipoEmpleado tipoEmpleado;
    private double ventasMes;
    private double horasExtra;

    public EmpleadoBR(TipoEmpleado tipoEmpleado, double ventasMes, double horasExtra) {
        this.tipoEmpleado = tipoEmpleado;
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
    }

    //getters
    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    //setters
    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    /*El salario baso será 1000 euros si el empleado es de tipo *TipoEmpleado.vendedor, y de
            1500 euros si es de tipos *TipoVendedor.encargado. A esta cantidad se le
            sumará una prima de 100 euros si *ventasMes es mayor o igual que 1000 euros, y de
            200 euros si fuera al menos de 1500 euros. Finalmente, cada hora extra se pagará a
            20 euros. Si tipo es *null, o *ventasMes o *horasExtra toman valores negativos el
            método devuelve -1

            * */
    public static double calculaSalarioBruto  (TipoEmpleado tipoEmpleado, double ventasMes, double horasExtra  ){

        if (tipoEmpleado == null || ventasMes < 0 || horasExtra < 0) {
            return -1;
        }

        double salarioBase;
        if (tipoEmpleado == TipoEmpleado.VENDEDOR) {
            salarioBase = 1000;
        } else if (tipoEmpleado == TipoEmpleado.ENCARGADO) {
            salarioBase = 1500;
        } else {
            return -1; //Si tipo es *null, o *ventasMes o *horasExtra toman valores negativos el método devuelve -1
        }

        double prima = 0;
        if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes >= 1000) {
            prima = 100;
        }

        double pagoHorasExtra = horasExtra * 20;

        return salarioBase + prima + pagoHorasExtra;
    }

/*Si el salario bruto es menor de 1000 euros, no se aplicará ninguna retención. Para salarios a partir de
 1000 euros, y menores de 1500 euros se los aplicará un 16%, y a los salarios a partir de
 1500 euros se los aplicará un 18%. El método nos devolverá *salarioBruto * (1-
(*retencion/100)), o -1 el salario es menor que cero.
* */

    public static   double calculaSalarioNeto (double salarioBruto ){
        if (salarioBruto < 0) {
            return -1;
        }

        double retencion;
        if (salarioBruto < 1000) {
            retencion = 0;
        } else if (salarioBruto < 1500) {
            retencion = 16;
        } else {
            retencion = 18;
        }

        return salarioBruto * (1 - (retencion / 100));

    }


}
