package ui;
import model.*;
import java.util.Scanner;

public class Main {
	
	static CircularList circList = new CircularList();
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			
	;		System.out.println("1. Dar turno\r\n"
					+ "2. Mostrar turno\r\n"
					+ "3. Pasar turno\r\n"); //La función pasar turno viene con la implementación de eliminar turno actual, por lo que no hace falta una cuarta opción
			
			int decission = reader.nextInt();
			
			switch(decission) {
			
			case 1: {
				darTurno();
				break;
			}
			case 2: {
				mostrarTurno();
				break;
			}
			case 3: {
				pasarTurno();
				break;
			}
			
			}
		}
	}
		
		public static void darTurno() {
			circList.add();
		}
		
		public static void mostrarTurno() {
			System.out.println(circList.printCurrent());
		}
		
		public static void pasarTurno() {
			System.out.println("¿El usuario ha sido atendido?");
			boolean attended = reader.nextBoolean();
			circList.passTurn(attended);
		}
		
}
