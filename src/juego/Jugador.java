package juego;

import java.util.Scanner;

public class Jugador {
	private String nombre;
	private int historial;

	public Jugador(String nombre, int historial) {
		this.nombre = nombre;
		this.historial = historial;
	}

	public Jugador() {
		Scanner sc = new Scanner(System.in);
		Boolean exit = false;
		System.out.println("Introduzca nombre del jugador:\t");
		String nombre = sc.next();
		this.setNombre(nombre);
		this.setHistorial(0);	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHistorial() {
		return historial;
	}

	public void setHistorial(int historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "jugador [nombre=" + nombre + ", historial=" + historial + "]";
	}

}
