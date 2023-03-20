package e1;

public abstract class EquipoArtistico extends EquipoHumano {
    public EquipoArtistico(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
    }
}