public class MainEjercicio2 {
    public static void main(String[] args) {
        Empleado empPlanta = new EmpleadoPlanta("EMP-001", "Carlos Gomez", 450000.0, 50000.0);
        Empleado empEventual = new EmpleadoEventual("EMP-002", "Ana Martínez", 80, 3500.0);

        System.out.println("Sueldo Neto de " + empPlanta.getNombre() + ": $" + empPlanta.calcularSueldoNeto());
        System.out.println("Sueldo Neto de " + empEventual.getNombre() + ": $" + empEventual.calcularSueldoNeto());
    }
}