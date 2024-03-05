package Rectangulo;

public class Rectangle {
    //Atributos
    private float lenght = 1.0f;
    private float width = 1.0f;
    //Constructor vacio
    public Rectangle() {
    }
    //Constructor parametrizado
    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }
    //Setters and getters para todos los atributos
    public float getLenght() {
        return lenght;
    }
    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    //get Area
    public double getArea(){
        //Validación para el rectangulo exista
        if(this.getLenght() <= 0 || this.getWidth() <= 0){
            throw new ArithmeticException("El rectangulo no existe");

        }
        return (double) this.getLenght() * this.getWidth();
    }

    //get Perimetro
    public double getPerimetro(){
        //Validación para que el rectangulo 
        if(this.getLenght() <= 0 || this.getWidth() <= 0){
            throw new ArithmeticException("El rectangulo no existe");

        }
        return (double) 2 * (this.getLenght() + this.getWidth());

    }

    //Dibuja el rectangulo con asteriscos
    public String dibujarRectangulo(){
        String cad = "";
        for(int i = 1;i <this.getWidth()+1; i++ ){
            for(int j = 1; j < this.getLenght()+1;j++){
                cad += "* ";
            }
            cad+="\n";
        }
        return cad;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle [Largo: " + lenght + ", Ancho: " + width + "]";
    }

    
}
