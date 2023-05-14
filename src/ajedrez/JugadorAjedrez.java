package ajedrez;

import ajedrez.EnumColorAjedrez.color;
import juego.Jugador;

public class JugadorAjedrez extends Jugador {
	private color _color;

	public color getColor() {
		return _color;
	}

	public void setColor(color _color) {
		this._color = _color;
	}

	public JugadorAjedrez(String nombre, int historial, color _color) {
		super(nombre, historial);
		this._color = _color;
	}

	
	public JugadorAjedrez(Jugador jugador, color _color) { //creo un jugador de ajedrez desde un jugador estandar.
		this.setNombre(jugador.getNombre());
		this.setHistorial(jugador.getHistorial());
		this.setColor(_color);
	}
	@Override
	public String toString() {
		return "jugadorAjedrez [nombre = " + this.getNombre() + "color=" + this.getColor() + "]";
	}

}
