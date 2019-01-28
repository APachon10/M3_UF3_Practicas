package Practica2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class calcularMediaAlumnops {
	public static void main(String[] args) {
		System.out.print("Que Fichero quieres Leer ? ");
		File f = new File(leerString());
		calcularMediaAlumnops c =new calcularMediaAlumnops();
		c.calcularMedia(f);
	}
	public static void  calcularMedia(File v) {
		double media = 0,suma=0;
		int valor =0;
		int cont =0;
		try {
			Scanner scan = new Scanner(v);
			boolean salir  =false;
			while (!salir) {
				String texto =  scan.nextLine();
				String [] linea= texto.split(" ");
				if (texto.equalsIgnoreCase("fi")) {
					salir=true;
				}else {
					for (int i = 0; i < linea.length; i++) {						
						if (i>2 && isNumeric(linea[i])) {
							double valores = Double.parseDouble(linea[i]);
							cont++;
							suma = suma+valores;
							media = suma /cont;
						}
					}
					System.out.println("Media --> "+media );
				}
			}
			scan.close();
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
