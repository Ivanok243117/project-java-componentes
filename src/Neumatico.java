public class Neumatico {
    // Atributos
    private String marca;
    private int tamaño;
    private double presion;

    // Constructor
    public Neumatico(String marca, int tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    // Método funcional
    public void mostrarNeumatico() {
        System.out.println("Neumático: " + marca + ", " + tamaño + "\", presión " + presion + " PSI");
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getTamaño() { return tamaño; }
    public void setTamaño(int tamaño) { this.tamaño = tamaño; }

    public double getPresion() { return presion; }
    public void setPresion(double presion) { this.presion = presion; }
}
