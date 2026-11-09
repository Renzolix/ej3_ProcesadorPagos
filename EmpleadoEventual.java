public class EmpleadoEventual extends Empleado {
    private int horasTrabajadas;
    private double costoHora;

    public EmpleadoEventual(String legajo, String nombre, int horasTrabajadas, double costoHora) {
        super(legajo, nombre, 0.0); // El sueldo base no se utiliza para eventuales
        this.horasTrabajadas = horasTrabajadas;
        this.costoHora = costoHora;
    }

    @Override
    public double calcularSueldoNeto() {
        return horasTrabajadas * costoHora;
    }
}