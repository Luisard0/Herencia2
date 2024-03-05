package Libro;
import EntradaSalida.Tools;

public class testLibro {
    public static void main(String[] args) {
        //Contadores de libros
        int libNov = 0, lib = 0, libTexto = 0, libUNAM = 0, totales = 0;
        //Eleccion del libro
        char op;
        //Continuar??
        int seguir;

        
        while (true) {
            //Pregunta por el tipo de objeto a crear
            op = Tools.leerChar("¿Qué tipo de libro te gustaría registrar?\n\n[L] Libro Normal\n[N] Novela\n[T] Libro de Texto\n[M] Libro UNAM\n---------------------\n[C] Mostrar Contador de libros\n[S] Salir");
            //Lo pasa a minuscula para hacer menos validaciones
            op = Character.toLowerCase(op);

            //Dependiendo el tipo de libro, lo crea y luego aumente el contador de su tipo de libro y el de los totales
            //Libro normal
            if (op== 'l') {
                Libro libroNormal = new Libro(Tools.leerString("Titulo del Libro: "), Tools.leerString("Autor: "), Tools.leerString("Editorial: "), Tools.leerFloat("Precio del libro: "));
                Tools.imprimeSalida(libroNormal.toString());
                lib += 1;
                totales+=1;

                //Pregunta si desea continuar para salir
                seguir = Tools.seguirSiNo();
                if(seguir == 1){
                    Tools.imprimeSalida("--- Registro Final de libros ---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+libNov+"\nLibros de Texto registrados: "+
                    libTexto+"\nLibros de la UNAM registrados: "+
                    libUNAM+"\n\nLibros totales registrados: "+ totales);
                    break;
                }
                
            //Para una novela
            }else if (op == 'n'){
                LibroNovela novela = new LibroNovela(Tools.leerString("Titulo del libro: "), Tools.leerString("Autor del libro"), Tools.leerString("Editorial"),
                Tools.leerFloat("Precio: "), Tools.leerString("Tipo de Novela: "));
                Tools.imprimeSalida(novela.toString());
                libNov += 1;
                totales+=1;

                //Pregunta si desea continuar para salir
                seguir = Tools.seguirSiNo();
                if(seguir == 1){
                    Tools.imprimeSalida("--- Registro Final de libros ---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+libNov+
                    "\nLibros de Texto registrados: "+libTexto+"\nLibros de la UNAM registrados: "+libUNAM+"\n\nLibros totales registrados: "+ totales);
                    break;
                }
            //Libro de texto
            }else if (op == 't'){
                LibroTexto texto = new LibroTexto(Tools.leerString("Titulo: "), Tools.leerString("Autor: "), Tools.leerString("Editorial: "), 
                Tools.leerFloat("Precio: "), Tools.leerString("Asignatura: "));
                Tools.imprimeSalida(texto.toString());
                libTexto += 1;
                totales += 1;

                //Pregunta si desea continuar para salir
                seguir = Tools.seguirSiNo();
                if(seguir == 1){
                    Tools.imprimeSalida("--- Registro Final de libros ---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+libNov+"\nLibros de Texto registrados: "+
                    libTexto+"\nLibros de la UNAM registrados: "+libUNAM+"\n\nLibros totales registrados: "+ totales);
                    break;
                }
            //Libro de la UNAM
            }else if (op == 'm'){
                LibroUNAM unam = new LibroUNAM(Tools.leerString("Titulo: "), Tools.leerString("Autor: "), Tools.leerString("Editorial: "), 
                Tools.leerFloat("Precio: "), Tools.leerString("Asignatura: "), Tools.leerString("Nombre de la facultad: "),
                new fecha(Tools.leerByte("Día: "), Tools.leerByte("Mes: "), Tools.leerShort("Año: ")));
                Tools.imprimeSalida(unam.toString());
                libUNAM += 1;
                totales += 1;

                //Pregunta si desea continuar para salir
                seguir = Tools.seguirSiNo();
                if(seguir == 1){
                    Tools.imprimeSalida("--- Registro Final de libros ---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+libNov+
                    "\nLibros de Texto registrados: "+libTexto+"\nLibros de la UNAM registrados: "+libUNAM+"\n\nLibros totales registrados: "+ totales);
                    break;
                }
            //Mostrar contador
            }else if (op == 'c'){
                Tools.imprimeSalida("--- Libros ---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+
                libNov+"\nLibros de Texto registrados: "+libTexto+"\nLibros de la UNAM registrados: "+libUNAM+"\n\nLibros totales registrados: "+ totales);

            //Salir
            }else if(op == 's'){
                //Muestra como quedaron al final
                Tools.imprimeSalida("--- Conteo de libros final---\n\nLibros Normales registrados: "+ lib+"\nNovelas registradas: "+
                libNov+"\nLibros de Texto registrados: "+libTexto+"\nLibros de la UNAM registrados: "+libUNAM+"\n\nLibros totales registrados: "+ totales);
                break;

            }else{
                Tools.salidaError("Error: Entrada no valida");
            }

            
        }
    }
}
