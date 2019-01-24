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
	public double calcularMedia(File v) {
		double valores = 0,media=0;
		int val =  0;
		try {
			Scanner lector = new Scanner(v);
			// Aquesta estrategia es basa en un semafor
			boolean llegir = false;
			// Si s'executa aquesta instrucci, s'ha obert el fitxer
			while (!llegir) {
				String valor = lector.nextLine();
				String [] pal = valor.split(" ");
				if (valor == "fi") {
					// Marca de finalitzaci  Ja s'ha acabat la lectura
					llegir = true;
				}else {
					double suma=0;
					for(int i =0 ; i<pal.length;i++) {
						val= Integer.parseInt(pal[2]);
						if(i>2) {
							valores= Double.parseDouble(pal[i]);
							suma = suma+valores;
							media = suma /val;
						}
					}
					System.out.println("Media  ---> " + media);
				}
			}
			// Cal tancar el fitxer
			lector.close();
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
