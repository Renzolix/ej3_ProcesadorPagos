# Ejercicio 3: LiquidacionSueldos

## Explicación Lógica
1. **Desacoplamiento:** El método `liquidar(Empleado e)` recibe como parámetro el tipo abstracto `Empleado`, abstrayéndose de los detalles específicos de cada subclase.
2. **Ligadura Tardía:** La JVM resuelve en tiempo de ejecución a cuál implementación de `calcularSueldoNeto()` debe llamar según el objeto concreto pasado por argumento.