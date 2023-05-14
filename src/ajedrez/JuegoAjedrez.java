package ajedrez;

import java.util.ArrayList;
import java.util.Scanner;

import ajedrez.EnumColorAjedrez.color;
import juego.Juego;
import juego.Jugador;

public class JuegoAjedrez extends Juego {
	static Scanner sc = new Scanner(System.in);

	static void turno(JugadorAjedrez jugador) {
		

//		System.out.println("¿Cual es el nombre del primer jugador1");
//		String nombre = sc.next();
//		jugador1.setNombre(nombre);
//		System.out.println("¿Cual es el nombre del primer jugador2");
//		nombre = sc.next();
//		jugador2.setNombre(nombre);

	}
	
	public ArrayList<Jugador> jugar(ArrayList<Jugador> jugadores) {
		/////////////////////////////////////////////// INICIALIZACION
		if(jugadores.size() < 2) {
			System.out.println("El número de jugadores para jugar al ajedrez ha de ser al menos 2");
			return jugadores;
		}
		// TODO INICIALIZACION
		Jugador j1 = jugadores.get(0);
		Jugador j2 = jugadores.get(1);
		color c1 = EnumColorAjedrez.color.Blanco;
		color c2 = EnumColorAjedrez.color.Negro;
		int turno = (int) (Math.random() * 1);
		if (turno == 1) {
			c1 = EnumColorAjedrez.color.Negro;
			c2 = EnumColorAjedrez.color.Blanco;
		} 
		JugadorAjedrez jugador1 = new JugadorAjedrez(j1, c1);
		JugadorAjedrez jugador2 = new JugadorAjedrez(j2, c2); // TODO REVISAR!!!!
		/////////////////////////////////////////////// INICIALIZACION

		Boolean exit = false;
		// TODO bucle de turnos
		do {
			turno(jugador1);
			// ha acabado?
			turno(jugador2);
		}while(!exit);
		
		
		

		System.out.println(jugador1);
		System.out.println(jugador2);
		jugadores.clear();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		return jugadores;
	}

}
