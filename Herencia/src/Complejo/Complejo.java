package Complejo;
/*
 * Se realiza una Clase para números complejos
 * De tener metodos de suma, resta, multiplicación y divición.
 * Los metodos debes estar sobrecargados para permitir numeros Complejos como argumentos
 * Debe tener un metodo que imprima el número complejo
*/

public class Complejo {
    //Atributos --> (real, imaginario) --> (real) + (imaginario)i
    private float real;
    private float imaginario;

    //Constructor vacio --> valores por defecto son 0 + 0i 
    public Complejo(){
        this.imaginario = 0;
        this.real = 0;
    }

    //Constructor parametrizado
    public Complejo(float real, float imaginario){
        this.imaginario = imaginario;
        this.real = real;
    }

    //Setters and getters para cada atributo 
    public float getReal() {
        return real;
    }
    public void setReal(float real) {
        this.real = real;
    }
    public float getImaginario() {
        return imaginario;
    }
    public void setImaginario(float imaginario) {
        this.imaginario = imaginario;
    }
    //Metodos estaticos para las operaciones
    //Suma
    public static Complejo sumaComplejo(Complejo a, Complejo b){
        float realSuma = a.getReal() + b.getReal() ;
        float imaginarioSuma = a.getImaginario() + b.getImaginario();
        return new Complejo(realSuma, imaginarioSuma) ; 
    }
    //Resta
    public static Complejo restaComplejo(Complejo a, Complejo b){
        float realResta = a.getReal() - b.getReal();
        float imaginarioResta = a.getImaginario() - b.getImaginario();
        return new Complejo(realResta, imaginarioResta);
    }
    //Multiplicación
    public static Complejo multiComplejo(Complejo a, Complejo b){
        float multiReal = (a.getReal() * b.getReal() - a.getImaginario()* b.getImaginario());
        float multiImaginaria = (a.getReal() * b.getImaginario() + a.getImaginario()*b.getReal());
        return new Complejo(multiReal, multiImaginaria);
    }
    //Divición
    public static Complejo divicionComplejo(Complejo a, Complejo b){
        float denominador = ((float)Math.pow(b.getReal(), 2) + (float)Math.pow(b.getImaginario(), 2));
        
        if(0.0 == denominador){
            //Evita las diviciónes entre 0
            throw new ArithmeticException("No se puede dividir por cero");
        }
        float diviReal = (a.getReal()*b.getReal() + a.getImaginario()*b.getImaginario()) / denominador;
        float diviImaginario = (a.getImaginario()*b.getReal() - a.getReal()*b.getImaginario()) / denominador;
        
        return new Complejo(diviReal, diviImaginario);
    }

    //Suma
    public Complejo sumar(float real, float imaginario){
        return new Complejo(this.getReal() + real, this.getImaginario() + imaginario);
    }
    //Suma sobrecargada
    public Complejo sumar(Complejo numCoomplejo){
        return new Complejo(this.getReal() + numCoomplejo.getReal(), this.getImaginario()+numCoomplejo.getImaginario());
    }

    //Resta
    public Complejo resta(float real, float imaginario){
        return new Complejo(this.getReal() - real, this.getImaginario() - imaginario);
    }

    //Resta sobrecargada
    public Complejo resta(Complejo numCoomplejo){
        return new Complejo(this.getReal() - numCoomplejo.getReal(), this.getImaginario() - numCoomplejo.getImaginario());
    }

    //Multiplicación
    public Complejo multiplicacion(float factorReal, float factorImaginario){
        float multiReal = (this.getReal() * factorReal - this.getImaginario()* factorImaginario);
        float multiImaginaria = (this.getReal() * factorImaginario + this.getImaginario()*factorReal);
        return new Complejo(multiReal, multiImaginaria);
    }

    //Multiplicación sobrecargada
    public Complejo multiplicacion(Complejo numCoomplejo){
        float multiReal = (this.getReal() * numCoomplejo.getReal() - this.getImaginario()* numCoomplejo.getImaginario());
        float multiImaginaria = (this.getReal() * numCoomplejo.getImaginario() + this.getImaginario()*numCoomplejo.getReal());
        return new Complejo(multiReal, multiImaginaria);
    }

    //Divición
    public Complejo divicion(float divisorReal, float divisorImaginario){
        float denominador = ((float)Math.pow(divisorReal, 2) + (float)Math.pow(divisorImaginario, 2));
        
        if(0.0 == denominador){
            //Evita las diviciónes entre 0
            throw new ArithmeticException("No se puede dividir por cero");
        }
        float diviReal = (this.getReal()*divisorReal + this.getImaginario()*divisorImaginario) / denominador;
        float diviImaginario = (this.getImaginario()*divisorReal - this.getReal()*divisorImaginario) / denominador;
        
        return new Complejo(diviReal, diviImaginario);
    }

    //Divición sobrecargada
    public Complejo divicion(Complejo numComplejo){
        float divisor = ((float)Math.pow(numComplejo.getReal(), 2) + (float)Math.pow(numComplejo.getImaginario(), 2));
        if (divisor == 0.0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        float diviReal = (this.getReal()*numComplejo.getReal() + this.getImaginario()*numComplejo.getImaginario()) / divisor;
        float diviImaginario = (this.getImaginario()*numComplejo.getReal() - this.getReal()*numComplejo.getImaginario()) / divisor;
        return new Complejo(diviReal, diviImaginario);
    }


    @Override
    public String toString() {
        //Validación para el formato de salida, el signo de la parte imaginaria
        if(imaginario>0){
            return "("+real + " +" + imaginario+" i)";
        }else if(imaginario == 0){
            return "("+real+" + 0 i)" ;
        }else{
            return "("+real+" "+imaginario+" i)";
        }
        
    }
}
