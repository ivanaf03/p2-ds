package e1;

final class Productor extends EquipoTecnico {
    private final double derechos = 0.02;

    public Productor(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
    }

    public double getSalario() {
        return 90* (double)this.getHoras();
    }

    public String getCategoria() {
        return "Productor";
    }

    public double getDerechos() {
        return this.derechos;
    }
}