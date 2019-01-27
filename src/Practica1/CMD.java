package Practica1;

import java.io.File;
import java.util.Scanner;

public class  CMD{
	public static void main(String[] args) {
		String raiz = System.getProperty("user.dir");
		CMD cd = new CMD();
		cd.consola(raiz);
	}
	public void consola(String r) {
		Scanner scan = new Scanner(System.in);
		String rutaActual =r,rutaAnterior="";
		
		File f =new File(rutaActual);
		File [] carpeta=f.listFiles();
		rutaAnterior = f.getParent();
		String texto = "";
		while (!texto.equals("fi")) {
			int i=0;
			System.out.print(f.getPath()+"$:");
			
			texto =leerString();
			String comando [] = texto.split(" ");
			
			if (texto.equalsIgnoreCase("dir")) {
				mostrarc(carpeta);
			}else if (texto.equalsIgnoreCase("fi")) {
				System.out.println("Saliendo de la consola ");
			}
			
			for(int j =0;i<carpeta.length-1; i++) {
				if(texto.contains(carpeta[i].getName())){
					rutaActual = f.getPath() + File.separator + comando[1];
					f = new File (rutaActual);
					carpeta =f.listFiles();
				}else if (texto.contains("~")){
					rutaActual = System.getProperty("user.dir");
					f= new File (rutaActual);
					carpeta =f.listFiles();
				}
			}
			if(texto.equals("cd .." )){
				rutaActual = f.getParent();
				f = new File(rutaActual);
				carpeta= f.listFiles();
			}
		}
		System.out.println("Programa Terminado");
	}
	//Metodo para mostrar Ficheros 
	public  void mostrarc(File [] c) {	 
		for (int i = 0; i < c.length; i++) {
			if(c[i].isFile()) {
				System.out.println("[FILE] " + c[i].getName());
			} else {
				System.out.println("[DIR] " + c[i].getName());
			}
		}
	}
	/*Metodo para leer Cadenas */
	public static String leerString () {
		Scanner scan = new Scanner(System.in);
		String palabra = scan.nextLine();
		return palabra;
	}
}
