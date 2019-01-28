package Practica2;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class EscribirFicheroMediaAlumnos {
	public static void main(String[] args) {
		//Objeto con el cual llamaremos a la funcion 
		EscribirFicheroMediaAlumnos es = new EscribirFicheroMediaAlumnos();
		//Variables que le enviaremos al metodo 
		String nombre_Fichero = "NotaMitja.txt";
		//Llamamos al Metodo 
		es.escribirFichero(nombre_Fichero);
	}
	public void escribirFichero(String name_file) {
		//File donde vamos a escribir el contenido del otro fichero 
		File vf= new File(name_file);
		String texto = "";
		Scanner scan = null;
		double suma=0,media=0,valores=0;
		int cont=0;

		try {
			scan  = new Scanner(vf);
			boolean salir =false;
			while (!salir) {
				//Ponemos a 0 la suma y el contador al iniciar el bucle para que se reinicie al llegar a la siguiente linea 
				cont =0;
				suma=0;
				//Leemos el contenido del fichero 
				texto = scan.nextLine();
				String [] linea = texto.split(" ");
				if (texto.equals("fi")) {
					salir=true;
				}else {
					for (int i = 0; i < linea.length; i++) {
						if (isNumeric(linea[i]) && !linea[i].equals("-1")) {
							valores= Double.parseDouble(linea[i]);
							cont++;
							suma = suma+valores;
							media = suma /cont;
						}
					}
					System.out.println("Media --> "+ media);
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error!! " + e);
		}
		scan.close();
	}
	public static boolean isNumeric(String cadena) {
		try {
			double d = Double.parseDouble(cadena);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
}
