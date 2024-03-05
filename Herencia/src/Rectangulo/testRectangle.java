package Rectangulo;

import javax.swing.JOptionPane;

import EntradaSalida.Tools;

public class testRectangle {
    public static void main(String[] args) {
        Menu("Area,Perimetro,Area y Perimetro,Salir");
    }

    public static void Menu(String menu) {
		String sel;
		do {
			sel=desplegable(menu);
			switch (sel) {
			case "Area":
                Rectangle rectangulo = new Rectangle(Tools.leerFloat("Largo: "), Tools.leerFloat("Ancho: "));
                Tools.imprimeSalida(rectangulo.toString()+"\nArea del rectangulo: "+rectangulo.getArea()+"\n\nDibujo del rectangulo: \n\n"+rectangulo.dibujarRectangulo());
                break;

			case "Perimetro":
                Rectangle rectangulo2 = new Rectangle(Tools.leerFloat("Largo: "), Tools.leerFloat("Ancho: "));
                Tools.imprimeSalida(rectangulo2.toString()+"\nPerimetro del rectangulo: "+rectangulo2.getPerimetro()+"\n\nDibujo del rectangulo: \n\n"+rectangulo2.dibujarRectangulo());
                break;
                
            case "Area y Perimetro":
                Rectangle rectangulo3 = new Rectangle(Tools.leerFloat("Largo: "), Tools.leerFloat("Ancho: "));
                Tools.imprimeSalida(rectangulo3.toString()+"\nArea del rectangulo: "+rectangulo3.getArea()+"\nPerimetro del rectangulo: "+rectangulo3.getPerimetro()+"\n\nDibujo del rectangulo: \n\n"+rectangulo3.dibujarRectangulo());


                break;
			case "Salir":;break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}

    public static String desplegable(String menu) {
		String valores []=menu.split(",");
		String res= (String)JOptionPane.showInputDialog(null,"RECTANGULO","Selecciona opcion:",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}

    
}