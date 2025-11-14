public class Sensor {
    // Atributos
    private String tipo;
    private double valor;

    // Constructor
    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Método funcional
    public void mostrarSensor() {
        System.out.println("Sensor: " + tipo + ", valor actual: " + valor);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
