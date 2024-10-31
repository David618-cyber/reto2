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
	public static double temperatura(Scanner sc) {
		//Elige opcion

			System.out.println("Selecciona la conversion de temperatura:");
			System.out.println("1. Celsius a Fahrenheint");
			System.out.println("2. Fahrenheint a Celsius");
			System.out.println("0. Salir");
			int opcion=Funciones.dimeEntero("Dime la opcion", sc);
			
			
			switch (opcion) {
			case 0:
				break;

			case 1:
				double opcionCase1=Funciones.dimeDouble("Escribe temperatura", sc);
				return celsiusAfahrenhit(opcionCase1);
			case 2:
				double opcionCase2=Funciones.dimeDouble("Escribe temperatura", sc);
				return fahrenhitAcelsius(opcionCase2);
			}
		
		
		return 0.0;
	
	}
	public static Double litroAgalon(Double litro) {
		return litro*3.785;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
