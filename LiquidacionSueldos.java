public class LiquidacionSueldos {

    public void liquidar(Empleado e) {
        System.out.println("--- Liquidación de Haberes ---");
        System.out.println("Legajo: " + e.getLegajo());
        System.out.println("Nombre: " + e.getNombre());
        // Invocación polimórfica (Dynamic Binding)
        System.out.println("Monto Neto a Cobrar: $" + e.calcularSueldoNeto());
        System.out.println("------------------------------\n");
    }

    public static void main(String[] args) {
        LiquidacionSueldos servicio = new LiquidacionSueldos();

        Empleado p = new EmpleadoPlanta("PL-101", "Roberto Perez", 500000.0, 80000.0);
        Empleado ev = new EmpleadoEventual("EV-202", "Lucia Fernandez", 120, 4000.0);

        servicio.liquidar(p);
        servicio.liquidar(ev);
    }
}