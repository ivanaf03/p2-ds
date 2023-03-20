package e1;

final class Guionista extends EquipoTecnico {
    private final double derechos = 0.05;
    private final boolean original;

    public Guionista(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas, boolean original) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
        this.original = original;
    }

    public double getSalario() {
        return this.original ? 70 * (double)this.getHoras() + 4000.0 : 70 * (double)this.getHoras();
    }

    public String getCategoria() {
        return this.original ? "Guionista, guion original" : "Guionista, guion poco original";
    }


    public double getDerechos() {
        return this.derechos;
    }
}