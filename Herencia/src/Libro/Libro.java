package Libro;
public class Libro {
    
    //Atributos
    protected String tituloLibro;
    protected String autorLibro;
    protected String editorial;
    protected float precio;

    //Constructor vacio
    public Libro(){}
    //Constructor parámetrizado
    public Libro(String tituloLibro, String autorLibro, String editorial, float precio){
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.editorial = editorial;
        this.precio = precio;
    }
    //Setters and getters (por cada atributo)
    public String getTituloLibro() {
        return tituloLibro;
    }
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
    public String getAutorLibro() {
        return autorLibro;
    }
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    //To String
    @Override
    public String toString() {
        return "--- Libro ---\nTitulo del Libro: " + tituloLibro + "\nAutor del Libro: " + autorLibro + "\nEditorial: " + editorial
                + "\nPrecio: $" + precio;
    }
}
