package Practica2;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class calcularMediaAlumnos_SegundaForma {
	public static void main(String[] args) {
		System.out.print("Que Fichero quieres Leer ? ");
		File f = new File(leerString());
		calcularMediaAlumnos_SegundaForma c2 = new calcularMediaAlumnos_SegundaForma();
		if (f.exists()) {
			c2.leerFichero(f);
		}else {
			String confirmacion = leerString();
			System.out.println("El Archivo " + f.getName() + " No existe quieres Crearlo ? ");
			if (confirmacion.equalsIgnoreCase("si")) {
				c2.escribirFichero(f);
			}
			c2.leerFichero(f);
			
		}	
	}
	public void calcularMedia(File v,String [] linea) {
		leerFichero(v);
		double media=0,suma=0;
		int cont=0;
		
		for (int i = 0; i < linea.length; i++) {						
			if (isNumeric(linea[i])) {
				double valores = Double.parseDouble(linea[i]);
				cont++;
				suma = suma+valores;
				media = suma /cont;
			}
		}
		System.out.println("Media --> "+media );
		
		
	}
	public void leerFichero(File v) {
		try {
			Scanner scan = new Scanner(v);
			boolean salir  =false;
			while (!salir) {
				String texto =  scan.nextLine();
				String [] linea= texto.split(" ");
				if (texto.equalsIgnoreCase("fi")) {
					salir=true;
				}
				if (texto.equals("-1")) {
					scan.nextLine();
				}
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void escribirFichero(File v ) {
		try {
			leerFichero(v);
			PrintStream ps = new PrintStream(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean isNumeric(String cadena) {
	    try {
	        double d = Double.parseDouble(cadena);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}
	public static String leerString() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		palabra = scan.nextLine();
		scan.close();
		return palabra;
	}
}
