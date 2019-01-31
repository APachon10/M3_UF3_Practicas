package Practica3;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;

public class GuardarMatrizenFichero {
	public static void main(String[] args) {
		GuardarMatrizenFichero gc = new GuardarMatrizenFichero();
		//Constantes para conseguir la medida de la Matriz 
		final int columnas = 7;
		final int filas =10;
		File f =new File("Matriz.txt");
		
		gc.escribirMatriz(f,columnas,filas);
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
}
