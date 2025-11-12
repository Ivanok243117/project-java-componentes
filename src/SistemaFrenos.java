public class SistemaFrenos {
    // Atributos
    private String tipo;
    private int discos;
    private boolean abs;
    private String estado;

    // Constructor
    public SistemaFrenos(String tipo, int discos, boolean abs, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    // Método funcional
    public void mostrarFrenos() {
        System.out.println("Frenos: " + tipo + ", discos: " + discos + ", ABS: " + (abs ? "Sí" : "No") + ", estado: " + estado);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getDiscos() { return discos; }
    public void setDiscos(int discos) { this.discos = discos; }

    public boolean isAbs() { return abs; }
    public void setAbs(boolean abs) { this.abs = abs; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
