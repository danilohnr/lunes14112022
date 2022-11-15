package poo;

public class Metodos {
	public static int generanNumerosAleatorios(int minimo, int maximo) {
		return 	(int)(Math.floor(Math.random()*(minimo-(maximo+1))+(maximo*+1)));
	}


}
