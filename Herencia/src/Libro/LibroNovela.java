package Libro;
public class LibroNovela extends Libro {
    //Atributo
    private String tipoNovela; //historica, romántica, policíaca, realista, ciencia ficcion o aventuras
    
    //Constructor vacio
    public LibroNovela(){
        super();
    }
    //Constructor parametrizado
    public LibroNovela(String tituloLibro, String autorLibro, String editorial, float precio, String tipoNovela){
        super(tituloLibro, autorLibro, editorial, precio);
        this.tipoNovela = tipoNovela;
    }
    //Setter and getter
    public String getTipoNovela() {
        return tipoNovela;
    }
    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }
    //to String
    @Override
    public String toString() {
        return super.toString()+"\nTipo de novela: " + tipoNovela ;
    }
}
