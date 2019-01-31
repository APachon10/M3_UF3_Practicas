package Practica3;

import java.io.File;
import java.util.Scanner;

public class LeerArchivoPersonas {
	public static void main(String[] args) {
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
	}
}
