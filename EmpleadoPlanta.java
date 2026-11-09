public class EmpleadoPlanta extends Empleado {
    private double bonoAntiguedad;

    public EmpleadoPlanta(String legajo, String nombre, double sueldoBase, double bonoAntiguedad) {
        super(legajo, nombre, sueldoBase);
        this.bonoAntiguedad = bonoAntiguedad;
    }

    @Override
    public double calcularSueldoNeto() {
        return getSueldoBase() + bonoAntiguedad;
    }
}