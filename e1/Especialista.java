package e1;

final class Especialista extends EquipoArtistico {
    private final boolean peligro;

    public Especialista(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas, boolean peligro) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
        this.peligro = peligro;
    }

    public double getSalario() {
        return this.peligro ? 40 * (double)this.getHoras() + 1000.0 : 40 * (double)this.getHoras();
    }

    public String getCategoria() {
        return this.peligro ? "Especialista, escenas peligrosas" : "Especialista, sin escenas peligrosas";
    }

}