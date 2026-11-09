public abstract class Empleado {
    private String legajo;
    private String nombre;
    private double sueldoBase;

    public Empleado(String legajo, String nombre, double sueldoBase) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }

    public abstract double calcularSueldoNeto();
}