package Libro;
public class LibroTexto extends Libro{
    //Atributos
    private String asignatura;
    //Constructor vacio
    public LibroTexto(){
        super();
    }
    //Constructor parametrizado
    public LibroTexto(String tituloLibro, String autorLibro, String editorial, float precio, String asignatura) {
        super(tituloLibro, autorLibro, editorial, precio);
        this.asignatura = asignatura;
    }
    //Setter and getter
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }


    //toString
    @Override
    public String toString() {
        return super.toString()+"\nAsignatura: " + asignatura ;
    }
}