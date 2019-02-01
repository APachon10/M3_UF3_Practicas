package Practica3;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class GuardarMatrizenFichero {
	public static void main(String[] args) {
		GuardarMatrizenFichero gc = new GuardarMatrizenFichero();
		//Constantes para conseguir la medida de la Matriz 
		final int columnas = 7;
		final int filas =10;
		//Le pedimos al usuario si quiere generar la Matriz a traves del fichero por defecto o generar una Aleatoria
		//Para generar la Aleatoria introduce Aleatoria y para Generar la por defecto introduce Por Defecto

		File archivo_creado = new File("Matriz.txt");
		gc.escribirMatriz(archivo_creado,columnas,filas);


	}
	public File escribirMatriz(File x,int n,int m ) {
		PrintStream ps = null;
		try {
			ps =new PrintStream(x);
			int Matriz [][] = new int [n][m];
			for (int i = 0; i < Matriz.length; i++) {
				for (int j = 0; j < Matriz.length; j++) {
					Matriz[i][j] = GenerarNumAleatorio();
					ps.print(Matriz[i][j] +" "); 
				}
				ps.print("\n");
			}
			mostrarMatriz(Matriz);
		} catch (Exception e) {
			System.out.println("Error!: "+e);
			e.printStackTrace();
		}
		return x;
	}
	public int GenerarNumAleatorio (){
		Random r =new Random();
		int numAleatorio  = r.nextInt(20);
		return numAleatorio;
	}
	public void mostrarMatriz(int [][]Matriz) {
		System.out.println("Matriz por Defecto");
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				System.out.print("Columna:"+i+", Fila "+j+":"+Matriz[i][j]+"          ");
			}
			System.out.println();
		}
	}
	public static String recogerCadena(){
		Scanner scan = new Scanner(System.in);
		String palabra = scan.next();
		return palabra;
	}
}
