package Practica1;

import java.io.File;
import java.util.Scanner;

public class Crear_Borrar_Carpeta {
	public static void main(String[] args) {
		File f = new File("Temp");

		if (!f.exists()) {
			crearCarpeta(f);
			System.out.println("Se ha creado la carpeta : "+f.getAbsolutePath());
		}else {
			System.out.println("La carpeta "+f.getName() + " Existe que quieres hacer con ella? ");
			menu(f);
			crearCarpeta(f);
		}
	}
	public static void menu(File v) {
		Scanner scan = new Scanner(System.in);
		int op = 1;
		
		while(op!=0) {
			System.out.println("1- Volverla a crear"
					+ "\n2- Borrarla ");
			op = scan.nextInt();
			switch (op) {
			case 1:
				crearCarpeta(v);
				break;
			case 2:
				borrarCarpeta(v);
				break;
			}
		}
		scan.close();
	}
	public static void crearCarpeta(File v ) {
		
		File[] archivos;
		archivos = v.listFiles();
		boolean salir=false;
		
		while(!salir){
			if (archivos.length==0) {
				v.mkdir();
				salir=true;
				System.out.println("Carpeta Creada ");
			}else{
				System.out.println("No se puede crearde nuevo porque la carpeta no esta vacia");
				salir=true;
			}
		}
		
	}
	public static void borrarCarpeta(File v ) {
		File[] archivos;
		archivos = v.listFiles();
		boolean salir = false;

		while(!salir){
			if (archivos.length==0) {
				v.delete();
				salir=true;
			}else{
				System.out.println("No se ha borrado la carpeta porque existen archivos dentro de ella");
				salir=true;
			}
		}
	}
}
