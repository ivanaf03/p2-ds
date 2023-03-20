package e1;

public abstract class EquipoTecnico extends EquipoHumano {
    private double derechos;

    public EquipoTecnico(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
    }

    public abstract double getDerechos();
}
