package e1;

public abstract class EquipoHumano {
    private final String nombre;
    private final String apellido;
    private final String DNI;
    private final String nacionalidad;
    private final int telefono;
    private final int horas;
    public double importe;

    public EquipoHumano(String nombre, String apellido, String DNI, String nacionalidad, int telefono, int horas) {
        if(nombre!=null || apellido!=null || (DNI != null && DNI.length() == 9) ||nacionalidad != null || String.valueOf(telefono).length() == 9 ||horas >= 0){
            this.nombre = nombre;
            this.apellido = apellido;
            this.DNI = DNI;
            this.nacionalidad = nacionalidad;
            this.telefono = telefono;
            this.horas = horas;

        }else {throw new IllegalArgumentException("ta mal");}

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public int getHoras() {
        return this.horas;
    }

    public double getImporte() {
        return this.importe;
    }

    public abstract String getCategoria();

    public double getSalario() {
        return this.importe * (double)this.horas;
    }
}