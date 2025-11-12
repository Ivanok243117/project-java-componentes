public class SistemaElectrico {
    // Atributos
    private String bateria;
    private int cantidadLuces;
    private int sensores;

    // Constructor
    public SistemaElectrico(String bateria, int cantidadLuces, int sensores) {
        this.bateria = bateria;
        this.cantidadLuces = cantidadLuces;
        this.sensores = sensores;
    }

    // Método funcional
    public void mostrarSistema() {
        System.out.println("Sistema eléctrico: batería " + bateria + ", luces: " + cantidadLuces + ", sensores: " + sensores);
    }

    // Getters y Setters
    public String getBateria() { return bateria; }
    public void setBateria(String bateria) { this.bateria = bateria; }

    public int getCantidadLuces() { return cantidadLuces; }
    public void setCantidadLuces(int cantidadLuces) { this.cantidadLuces = cantidadLuces; }

    public int getSensores() { return sensores; }
    public void setSensores(int sensores) { this.sensores = sensores; }
}
