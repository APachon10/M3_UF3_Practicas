package Practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoPersonas {
	public static void main(String[] args) {
		
	}
	public void leerFichero(File x) {
		Scanner scan;
		try {
			scan = new Scanner(x);
			String lineas = "";
			while (scan.hasNext()) {
				lineas = scan.nextLine();
				String texto []= lineas.split(" ");
				for (int i = 0; i < texto.length; i++) {
					if(isEnter(texto[i])) {
						int edad = Integer.parseInt(texto[i]);
						if (edad > 18 ) {
							System.out.println(texto);
						}
					}else if (isDouble(texto[i])) {
						double height = Double.parseDouble(texto[i]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error!! "+e);
		}
		
	}
	public static boolean isEnter(String cadena) {
		try {
			int d = Integer.parseInt(cadena);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
	public static boolean isDouble(String cadena) {
		try {
			double d = Double.parseDouble(cadena);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
}
