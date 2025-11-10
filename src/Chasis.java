public class Chasis {
    // 🔹 Atributos
    private String tipo;
    private double largo;
    private double ancho;
    private double peso;

    // 🔸 Constructor
    public Chasis(String tipo, double largo, double ancho, double peso) {
        this.tipo = tipo;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
    }

    // 🟢 Método funcional
    public void mostrarChasis() {
        System.out.println("Chasis: " + tipo + ", " + largo + "m x " + ancho + "m, " + peso + "kg");
    }

    // 🟠 Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }

    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}
