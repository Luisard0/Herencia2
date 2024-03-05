package Libro;
public class fecha {
    //Atributos
    private byte dia;
    private byte mes;
    private short year;
    //Constructor vacio
    public fecha() {}
    //Constructor parametrizado
    public fecha(byte dia, byte mes, short year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    //Setters and getters
    public byte getDia() {
        return dia;
    }
    public void setDia(byte dia) {
        this.dia = dia;
    }
    public byte getMes() {
        return mes;
    }
    public void setMes(byte mes) {
        this.mes = mes;
    }
    public short getYear() {
        return year;
    }
    public void setYear(short year) {
        this.year = year;
    }
    //toString
    @Override
    public String toString() {
        return "(Día: " + dia + "    Mes: " + mes + "    Año: " + year + ")";
    }
}
