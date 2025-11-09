public class Motor {
    // Atributos
    private String tipo;
    private double cilindrada;
    private int potencia;

    // Constructor
    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    // Método funcional
    public void mostrarEspecificaciones() {
        System.out.println("Motor: " + tipo + ", " + cilindrada + "L, " + potencia + "HP");
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getCilindrada() { return cilindrada; }
    public void setCilindrada(double cilindrada) { this.cilindrada = cilindrada; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}
