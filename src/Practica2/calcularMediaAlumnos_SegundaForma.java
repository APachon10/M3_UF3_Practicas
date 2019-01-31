package Practica2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class calcularMediaAlumnos_SegundaForma {
	public static void main(String[] args) {
		System.out.print("Que Fichero quieres Leer ? ");
		File f = new File(leerString());
		calcularMediaAlumnos_SegundaForma c2 = new calcularMediaAlumnos_SegundaForma();
	}
	public double calcularMedia(File v) {
		double valores = 0,media=0,suma=0;
		int cont=0;
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
						// Encara no s'ha acabat. Tractar dada
						System.out.println(texto + " ");
						System.out.println("--------------------");

						for(int i =0 ; i<linea.length-1;i++) {
							if(i>1) {
								if(linea[i].equals("-1")){
									System.out.println();
								}else{
									valores= Double.parseDouble(linea[i]);
									cont++;
									System.out.println("nota--->"+valores);
									suma = suma+valores;
									media = suma /cont;
								}
							}
						}
						System.out.println("--------------------------");
						System.out.println("Suma --> "+suma);
						System.out.println("Media  ---> " + media);
						System.out.println("--------------------------");
					}
				}
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
