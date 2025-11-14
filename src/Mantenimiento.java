public class Mantenimiento {
    // Atributos
    private String fecha;
    private String tipo;
    private String observaciones;

    // Constructor
    public Mantenimiento(String fecha, String tipo, String observaciones) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.observaciones = observaciones;
    }

    // Método funcional
    public void mostrarMantenimiento() {
        System.out.println("Mantenimiento: " + tipo + " realizado el " + fecha);
        System.out.println("Observaciones: " + observaciones);
    }

    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
