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
		int Notas[] = null;
		try {
			Scanner scan = new Scanner(v);
			boolean salir  =true;
			int i=0;
			while (!salir) {
				String texto =  scan.next();
				if (texto.equals("fi")) {
					salir=true;
				}else {
					if (scan.hasNextInt()) {
						Notas[i]=Integer.parseInt(texto);
						mostrarVector(Notas);
						i++;
					}else{
						i++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return media; 
	}
	public void mostrarVector(int [] vector ) {
		System.out.println("Vector: "+ Arrays.toString(vector));
	}
	public static String leerString() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		palabra = scan.nextLine();
		scan.close();
		return palabra;
	}
}
