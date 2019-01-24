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
	public void inici() {
		double valores = 0;
		int val =  0;
		try {
			Scanner lector = new Scanner(f);
			// Aquesta estrategia es basa en un semafor
			boolean llegir = true;
			// Si s'executa aquesta instrucci, s'ha obert el fitxer
			while (llegir) {
				String valor = lector.nextLine();
				String [] pal = valor.split(" ");
				if (valor == "fi") {
					// Marca de finalitzaci  Ja s'ha acabat la lectura
					llegir = false;
				}else {
					double suma=0,media=0;
					// Encara no s'ha acabat. Tractar dada
					System.out.println(valor + " ");
					System.out.println("--------------------");
					for(int i =0 ; i<pal.length;i++) {
						val= Integer.parseInt(pal[2]);
						if(i>2) {
							valores= Double.parseDouble(pal[i]);
							System.out.println("nota--->"+valores);
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
			System.out.println("Error: " + e);
		}
	}
	//	public double calcularMedia(File v) {
	//		double media = 0,suma =0;
	//		boolean salir = false;
	//		try {
	//			Scanner scan = new Scanner(v);
	//			String texto = scan.next();
	//			while (!salir) {
	//				if (texto.equals("fi")) {
	//					salir=true;
	//				}else {
	//					if (scan.hasNextInt()) {
	//						System.out.println("Hola");
	//						if (texto.equals("-1")) {
	//							System.out.println();
	//						}
	//					}else {
	//						scan.next();
	//					}
	//				}
	//			}
	//			scan.close();
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return media; 
	//	}
	//	public static String leerString() {
	//		Scanner scan = new Scanner(System.in);
	//		String palabra = "";
	//		palabra = scan.nextLine();
	//		scan.close();
	//		return palabra;
	//	}
}
