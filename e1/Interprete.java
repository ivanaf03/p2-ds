package e1;

final class Interprete extends EquipoArtistico {
    private final String rol;


    public Interprete(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas, String rol) {
        super(nombre, apellido, DNI, nacionalidad, telefono, horas);
        this.rol = this.setRol(rol);
    }

    public double getSalario() {
        return this.rol.equals("protagonista") ? 3.0 * 200 * (double)this.getHoras() : 200 * (double)this.getHoras();
    }

    public String setRol(String rol) {
        if (!rol.equals("protagonista") && !rol.equals("secundario") && !rol.equals("extra")) {
            throw new IllegalArgumentException("Rol no valido");
        } else {
            return rol;
        }
    }

    public String getCategoria() {
        if (this.rol.equals("protagonista")) {
            return "Interprete, protagonista";
        } else {
            return this.rol.equals("secundario") ? "Interprete, secundario" : "Interprete, extra";
        }
    }

}