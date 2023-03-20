package e1;

final class Director extends EquipoTecnico {
    private final int complemento;
    private final double derechos = 0.05;

    public Director(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas, int complemento) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
        this.complemento = complemento;
    }

    public double getSalario() {
        return (double)(this.complemento * 1000) + 100 * (double)this.getHoras();
    }

    public String getCategoria() {
        return "Director, " + this.complemento + " años de experiencia";
    }


    public double getDerechos() {
        return this.derechos;
    }

}