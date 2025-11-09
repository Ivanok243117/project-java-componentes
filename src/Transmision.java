public class Transmision {
    // Atributos
    private String tipo;
    private int marchas;
    private String traccion;

    // Constructor
    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    // Método funcional
    public void mostrarTransmision() {
        System.out.println("Transmisión: " + tipo + ", " + marchas + " marchas, tracción " + traccion);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getMarchas() { return marchas; }
    public void setMarchas(int marchas) { this.marchas = marchas; }

    public String getTraccion() { return traccion; }
    public void setTraccion(String traccion) { this.traccion = traccion; }
}
