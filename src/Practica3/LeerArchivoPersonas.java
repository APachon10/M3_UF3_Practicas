package Practica3;

import java.io.File;
<<<<<<< HEAD
=======
import java.io.FileNotFoundException;
>>>>>>> 9798f9d34c85fb23566c938c5900b6ccd7258ab7
import java.util.Scanner;

public class LeerArchivoPersonas {
	public static void main(String[] args) {
<<<<<<< HEAD
		File f =new File("persones.txt");
		leerFichero(f);
	}
	public static void leerFichero(File x) {
		Scanner scan = null;
		try {
			scan = new Scanner(x);
			String texto = "";
			while (scan.hasNext()) {
				texto =scan.nextLine();
				int edad = Integer.parseInt(texto.split(" ")[3]);
				if (edad >=18) {
					System.out.println(texto);
				}
				

			}
		} catch (Exception e) {
			System.out.println("Error!: "+e);
		}
=======
		
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
>>>>>>> 9798f9d34c85fb23566c938c5900b6ccd7258ab7
	}
}
