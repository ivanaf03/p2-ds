package e1;

final class Doblador extends EquipoArtistico {

    public Doblador(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
    }

    public double getSalario() {
        return 20 * (double)this.getHoras();
    }

    public String getCategoria() {
        return "Doblador";
    }

}