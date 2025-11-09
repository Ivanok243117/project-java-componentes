// App.java
// Clase principal para probar Vehiculo, Motor y Transmision

public class app {
    public static void main(String[] args) {
        // Vehiculo
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", "Corolla", 2020);
        miVehiculo.mostrarInfo();
        System.out.println("ID: " + miVehiculo.getId());
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());
        System.out.println("Año: " + miVehiculo.getAño());
        System.out.println();

        // Motor
        Motor miMotor = new Motor("Gasolina", 1.8, 140);
        miMotor.mostrarEspecificaciones();
        System.out.println("Tipo de motor: " + miMotor.getTipo());
        System.out.println("Cilindrada: " + miMotor.getCilindrada());
        System.out.println("Potencia: " + miMotor.getPotencia() + " HP");
        System.out.println();

        // Transmision
        Transmision miTransmision = new Transmision("Automática", 6, "Delantera");
        miTransmision.mostrarTransmision();
        System.out.println("Tipo de transmisión: " + miTransmision.getTipo());
        System.out.println("Número de marchas: " + miTransmision.getMarchas());
        System.out.println("Tracción: " + miTransmision.getTraccion());
    }
}
