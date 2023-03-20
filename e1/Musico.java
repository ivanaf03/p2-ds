
package e1;

final class Musico extends EquipoTecnico {
    private final double derechos = 0.04;

    public Musico(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
    }

    public double getSalario() {
        return 60 * (double)this.getHoras();
    }

    public String getCategoria() {
        return "Musico";
    }

    public double getDerechos() {
        return this.derechos;
    }
}