public class RegistroVehicular {
    // Atributos
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Método funcional
    public void mostrarRegistro() {
        System.out.println("Registro: " + matricula + ", propietario: " + propietario + ", fecha: " + fechaRegistro);
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getPropietario() { return propietario; }
