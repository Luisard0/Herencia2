package Complejo;

import javax.swing.JOptionPane;

import EntradaSalida.Tools;

public class testComplejo {
    public static void main(String[] args) {
        //Menú con operaciones de complejos como metodos de instancia
        //Menu("Sumar,Restar,Multiplicar,Dividir,Salir");
        
        Complejo a = new Complejo(2, 3);
        //Complejo b = new Complejo(5, 6);

        // //Operaciones con métodos estaticos
        // Tools.imprimeSalida(a.toString()+" + "+ b.toString()+" = "+Complejo.sumaComplejo(a, b));// ---> (5 +5i)
        // Tools.imprimeSalida(a.toString()+" - "+ b.toString()+" = "+Complejo.restaComplejo(a, b)); // ---> (-1+1i)
        // Tools.imprimeSalida(a.toString()+" x "+ b.toString()+" = "+Complejo.multiComplejo(a, b)); // ---> (0+13i)
        // Tools.imprimeSalida(a.toString()+" / "+ b.toString()+" = "+Complejo.divicionComplejo(a, b)); // --->(0.9230... +0.3846...i)

        //Operaciones con objetos y parámetros
        Tools.imprimeSalida("Operaciones con "+a.toString()+" [objeto] y (3 +2i) [Parámetros]\nSuma: "+a.sumar(3,2)+"\nResta: "+a.resta(3, 2)+"\nMultiplicación: "+a.multiplicacion(3,2)+"\nDivición: "+a.divicion(3,2));

        // a.sumar(3, 2);// ---> (5 +5i)
        // a.resta(3, 2);// ---> (-1 +1i)
        // a.multiplicacion(3, 2);// ---> (0 +13i)
        // a.divicion(3, 2);// ---> (0.9230... +0.3846...i)
    }

    public static void Menu(String menu) {
		String sel;
		do {
			sel=desplegable(menu);
			switch (sel) {
			case "Sumar":
                Tools.imprimeSalida("Ingresa el primer número a sumar: ");
                Complejo numA = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida("Ingresa el segundo número a sumar: ");
                Complejo numB = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida(numA.toString()+ " + "+numB.toString()+" = "+numA.sumar(numB));
                break;

			case "Restar":
                Tools.imprimeSalida("Ingresa el primer número a restar: ");
                Complejo numC = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida("Ingresa el segundo número a restar: ");
                Complejo numD = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida(numC.toString()+ " - "+numD.toString()+" = "+numC.resta(numD));
                break;

            case "Multiplicar":
                Tools.imprimeSalida("Ingresa el primer número a multiplicar: ");
                Complejo numE = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida("Ingresa el segundo número a multiplicar: ");
                Complejo numF = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida(numE.toString()+ " x "+numF.toString()+" = "+numE.multiplicacion(numF));
                break;
                
            case "Dividir":
                Tools.imprimeSalida("Ingresa el primer número a restar: ");
                Complejo numG = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida("Ingresa el segundo número a restar: ");
                Complejo numH = new Complejo(Tools.leerFloat("Parte real del número"), Tools.leerFloat("Parte imaginaria del número"));
                Tools.imprimeSalida(numG.toString()+ " / "+numH.toString()+" = "+numG.divicion(numH));
                break;
			case "Salir":;break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String desplegable(String menu) {
		String valores []=menu.split(",");
		String res= (String)JOptionPane.showInputDialog(null,"NÚMEROS COMPLEJOS","Selecciona opcion:",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}

}
