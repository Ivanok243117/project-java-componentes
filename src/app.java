// App.java
// Clase principal para probar la clase Vehiculo

public class app {
    public static void main(String[] args) {
        // Crear un objeto de tipo Vehiculo con argumentos correctos
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", "Corolla", 2020);

        // Llamar al método mostrarInfo (corregido)
        miVehiculo.mostrarInfo();

        // También puedes probar los getters
        System.out.println("ID: " + miVehiculo.getId());
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());
        System.out.println("Año: " + miVehiculo.getAño());
    }
}