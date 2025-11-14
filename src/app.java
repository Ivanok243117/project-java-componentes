// App.java
// Clase principal para probar Vehiculo, Motor, Transmision, Chasis, Neumatico, SistemaElectrico, SistemaFrenos, Mantenimiento y Sensor

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
        System.out.println();

        // Chasis
        Chasis miChasis = new Chasis("Monocasco", 4.5, 1.8, 1200);
        miChasis.mostrarChasis();
        System.out.println("Tipo de chasis: " + miChasis.getTipo());
        System.out.println("Largo: " + miChasis.getLargo() + " m");
        System.out.println("Ancho: " + miChasis.getAncho() + " m");
        System.out.println("Peso: " + miChasis.getPeso() + " kg");
        System.out.println();

        // Neumatico
        Neumatico miNeumatico = new Neumatico("Michelin", 17, 32.5);
        miNeumatico.mostrarNeumatico();
        System.out.println("Marca del neumático: " + miNeumatico.getMarca());
        System.out.println("Tamaño: " + miNeumatico.getTamaño() + "\"");
        System.out.println("Presión: " + miNeumatico.getPresion() + " PSI");
        System.out.println();

        // SistemaElectrico
        SistemaElectrico miSistemaElectrico = new SistemaElectrico("Bosch", 6, 12);
        miSistemaElectrico.mostrarSistema();
        System.out.println("Batería: " + miSistemaElectrico.getBateria());
        System.out.println("Cantidad de luces: " + miSistemaElectrico.getCantidadLuces());
        System.out.println("Sensores: " + miSistemaElectrico.getSensores());
        System.out.println();

        // SistemaFrenos
        SistemaFrenos miSistemaFrenos = new SistemaFrenos("Disco", 4, true, "Óptimo");
        miSistemaFrenos.mostrarFrenos();
        System.out.println("Tipo de frenos: " + miSistemaFrenos.getTipo());
        System.out.println("Cantidad de discos: " + miSistemaFrenos.getDiscos());
        System.out.println("ABS: " + (miSistemaFrenos.isAbs() ? "Sí" : "No"));
        System.out.println("Estado: " + miSistemaFrenos.getEstado());
        System.out.println();

        // Mantenimiento
        Mantenimiento miMantenimiento = new Mantenimiento("2025-10-15", "Cambio de aceite", "Se cambió el aceite y se revisaron los filtros.");
        miMantenimiento.mostrarMantenimiento();
        System.out.println("Fecha: " + miMantenimiento.getFecha());
        System.out.println("Tipo: " + miMantenimiento.getTipo());
        System.out.println("Observaciones: " + miMantenimiento.getObservaciones());
        System.out.println();

        // Sensor
        Sensor miSensor = new Sensor("Temperatura del motor", 87.5);
        miSensor.mostrarSensor();
        System.out.println("Tipo de sensor: " + miSensor.getTipo());
        System.out.println("Valor actual: " + miSensor.getValor());
    }
}