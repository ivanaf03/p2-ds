package e1;



import java.util.ArrayList;

public class Pelicula{
    private String title;
    private double recaudacion;
    private final ArrayList<EquipoHumano> equipo;

    public Pelicula(String title, double recaudacion){
        this.title=title;
        this.recaudacion=recaudacion;
        equipo=new ArrayList<>();
    }

    public void addTrabajador(EquipoHumano equipoHumano){
        equipo.add(equipoHumano);
    }
    public String getTitle() {
        return title;
    }
    public void checkTitle(String title){
        if(title!=null){
            this.title=title;
        } else  throw new IllegalArgumentException("Título no válido");
    }
    public double getRecaudacion() {
        return recaudacion;
    }
    public void checkRecaudacion(double recaudacion){
        if( recaudacion>=0){
            this.recaudacion=recaudacion;
        } else  throw new IllegalArgumentException("Recaudación no válida");
    }

    public String printSalaries(){
        StringBuilder cad=new StringBuilder();
        String str;
        double x=0.0;
        for(EquipoHumano e: equipo){
            str = e.getNombre() + " " + e.getApellido() + " (" + e.getCategoria() + "): " + e.getSalario() + " " + "euros" + "\n";
            cad.append(str);
            x += e.getSalario();
        }
        cad.append("El pago total de ").append(getTitle()).append(" es ").append(x);
        return cad.toString();
    }

    public String printRoyalties(){
        StringBuilder cad=new StringBuilder();
        String str;
        String[] trozos;
        double y;
        for(EquipoHumano e: equipo){
            if(e instanceof EquipoTecnico) {
                y=((EquipoTecnico) e).getDerechos()*recaudacion;
                trozos=e.getCategoria().split(",");
                str = e.getNombre() + " " + e.getApellido() + " (" + trozos[0]+ "): " +y+ " " + "euros" + "\n";
                cad.append(str);
            }
        }
        return cad.toString();
    }
}