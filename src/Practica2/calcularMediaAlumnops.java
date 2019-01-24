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
	public int calcularMedia(File v) {
		int media = 0;
		try {
			Scanner scan = new Scanner(v);
			boolean salir  =false;
			while (!salir) {
				String texto =  scan.nextLine();
				String [] linea= texto.split("");
				if (texto.equals("fi")) {
					salir=true;
				}else {
					if (scan.hasNextDouble()) {
						
					}else {
						scan.next();
					}
				}
				System.out.println("Vector--> " +Arrays.toString(linea));
			}
			
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return media; 
	}
	public static String leerString() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		palabra = scan.nextLine();
		scan.close();
		return palabra;
	}
}
