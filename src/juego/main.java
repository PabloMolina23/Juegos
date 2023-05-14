package juego;

import java.util.ArrayList;
import java.util.Scanner;

import ajedrez.JuegoAjedrez;


public class main {
	public static Scanner sc = new Scanner(System.in); 

	private static Integer seleccionarJuego() {
		Integer result;
		Integer nJuegos = 1;
		Boolean exit = false;
		do {
			System.out.println("Por favor, seleccione un juego de la lista");
			System.out.println("1. Ajedrez");
			result = sc.nextInt();
	        exit = result <= nJuegos && result >= 1;
		}while(!exit);
		return result;
	}
	
	
	private static void mostrarJugadores(ArrayList<Jugador> jugadores) {
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
	}
	private static ArrayList<Jugador> crearJugadores(){
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Integer i = -1;
		do {
			System.out.println("Vamos a anadir un jugador!");
			Jugador j = new Jugador();
			jugadores.add(j);
			do {
				System.out.println("Desea anadir otro jugador? ( 0 - no, 1 - si)");
				i = sc.nextInt();	
			}while(i != 0 && i != 1);
			mostrarJugadores(jugadores);
		}while(i == 1);
		return jugadores;
	}
	public static void main(String[] args) {
		System.out.println("Hola! Bienvenidos al nuevo y fantástico entorno interactivo de juegos realizado por Pablo y Nico");
		ArrayList<Jugador> jugadores = crearJugadores();
		Integer juegoSeleccionado = seleccionarJuego();
		
		switch(juegoSeleccionado) {
			case 1:
				System.out.println("Ha seleccionado el ajedrez");
				Juego j = new JuegoAjedrez();
				j.jugar(jugadores);
		}
		
		
		
	}

}
