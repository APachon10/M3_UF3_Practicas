package Practica3;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FusionarFicheros_Ex2 {
	public static void main(String[] args) {
		FusionarFicheros_Ex2 programa = new FusionarFicheros_Ex2();
		File v1 = new File("Senars.txt");
		File v2 = new File("Parells.txt");
		programa.fusionarficheros(v1, v2);
	}
	public File fusionarficheros(File f, File v ) {
		Scanner scan_parells  =null;
		Scanner scan_senars =null;
		//Creamos el fichero donde vamos a combianr los 2 ficheros 
		File resultado = new File("1a100.txt");
		PrintStream ps = null;
		//Leemos ambos Ficheros 
		
		try {
			ps = new PrintStream(resultado);
			scan_parells = new Scanner(v);
			scan_senars = new Scanner(f);
			
		} catch (Exception e) {
			System.out.println("Error!! "+e);
		}
		//Devolvemos el fichero que hemos creado 
		return resultado;
	}
}
