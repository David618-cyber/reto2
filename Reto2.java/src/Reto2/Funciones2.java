package Reto2;

import java.util.Scanner;

import util.Funciones;

public class Funciones2 {
	public static Double celsiusAfahrenhit(Double celsius) {
		return celsius*1.8+32;
	}
	public static Double fahrenhitAcelsius(Double fahrenheit) {
		return fahrenheit*1.8+32;
	}
	public static double temperatura(Double num,Scanner sc) {

		
		//Elige opcion

			System.out.println("Selecciona la conversion de temperatura"
						+ "1. Celsius a Fahrenheint"
						+ "2. Fahrenheint a Celsius"
						+ "0. Salir");
			Funciones.dimeEntero("Dime la opcion", sc);
			int opcion=sc.nextInt();
			switch (opcion) {
			case 0:
				break;

			case 1:
				
				break;
			case 2:
				Funciones.dimeDouble("Escribe temperatura", sc);
				break;
			}
		
		
		return 0.0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
