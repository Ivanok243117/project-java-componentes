// App.java
// Clase principal para probar Vehiculo, Motor, Transmision, Chasis y Neumatico

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
    }
}

