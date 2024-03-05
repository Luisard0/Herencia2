package Libro;
public class LibroUNAM extends LibroTexto{
    //Atributos
    private String nombreFacultad;
    private fecha fPublicacion;
    //Constructor vacio
    public LibroUNAM(){
        super();
    }
    //Constructor parametrizado
    public LibroUNAM(String tituloLibro, String autorLibro, String editorial, float precio, String asignatura,
            String nombreFacultad, fecha fPublicacion) {

        super(tituloLibro, autorLibro, editorial, precio, asignatura);
        this.nombreFacultad = nombreFacultad;
        this.fPublicacion = fPublicacion;
    }
    //Setters and getters
    public String getNombreFacultad() {
        return nombreFacultad;
    }
    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }
    public fecha getfPublicacion() {
        return fPublicacion;
    }
    public void setfPublicacion(fecha fPublicacion) {
        this.fPublicacion = fPublicacion;
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+"\nNombre De la Facultad: " + nombreFacultad + "\nFecha de publicación: " + fPublicacion ;
    }
}
