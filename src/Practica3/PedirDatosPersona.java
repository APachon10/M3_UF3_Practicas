package Practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PedirDatosPersona {
	public static void main(String[] args) {
		PedirDatosPersona pd = new PedirDatosPersona();
		File f = new File("persones.txt");
		pd.escribirFichero(f);
	}
	public void escribirFichero(File x) {
		boolean salir =false;
		String confirmacion = "";
		//Variables de la persona 
		String name,surname,NIF,age,height;
		//Variable para escribir en el fichero 
		PrintStream ps = null;
		//Pedimos los datos 
		while (!salir) {
			System.out.print("Introduce Nombre:");
			name = recogerCadenas();
			System.out.print("Introduce Apellido:");
			surname = recogerCadenas();
			System.out.print("Intro NIF:");
			NIF =recogerCadenas();
			System.out.print("Intro Edad:");
			age=recogerCadenas();
			System.out.print("Intro Altura:");
			height=recogerCadenas();

			//Escribimos los datos en el fichero
			try {
				ps = new PrintStream(new FileOutputStream(x,true));
				ps.append(name+" "+surname+" "+NIF+" "+age+" "+height);
				ps.append("\n");
			} catch (FileNotFoundException e) {
				System.out.println("Error!! : "+e);
			}
			System.out.println("Quieres insertar mas datos ? ");
			confirmacion = recogerCadenas();
			if (confirmacion.equalsIgnoreCase("si")) {
				salir=false;
			}else {
				salir=true;
			}
		}
		System.out.println("Fichero Escrito ");
	}
	/*Metodos Para Recoger Datos */
	public String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String cadena = scan.next();
		return cadena;
	}
}
