package agenda;

import java.util.Scanner;

public class agenda {

	public static int numeros1() {
		int pepe = 0;
		boolean numero = false;
		Scanner leer;
		
		do {
			System.out.println("1. Guardar Contacto");
			System.out.println("2. Borrar Contacto");
			System.out.println("3. Ver Contacto");
			System.out.println("4. Buscar Contacto");
			System.out.println("5. Editar Contacto");
			System.out.println("6. Salir");
			
			leer = new Scanner(System.in);
		pepe = leer.nextInt();
		
			if ((pepe > 0) && (pepe<7)) {
				numero = true;
			}
		}while(!numero);
		return pepe;
	}
	
	public static void guardarcontactos(String magenda[][]) {
		Scanner leer;
		leer = new Scanner(System.in);
		int numeroposicion=posicion(magenda);
		
				System.out.println("introduce nombre y edad");
				magenda[numeroposicion][0]=leer.nextLine();
				magenda[numeroposicion][1]=leer.nextLine();
		}
			
		
	
	
	public static int posicion(String magenda[][]) {
		int posi=0;
	for(int i=0;i<magenda.length;i++) {
		 
			if (magenda[i]==null){
					posi=i;
				break;
			}
		
	}
	return posi;
	}
	
	public static void vercontactos(String magenda[][]) {
		for (int i=0;i<magenda.length;i++) {
			if (magenda[i][0]!=null) {
				System.out.println(magenda[i][0]+" "+magenda[i][1]);
			}
	}
			System.out.println(" ");
		}
	
	
	public static int buscarcontactos(String magenda[][]) {
		Scanner leer;
		leer = new Scanner(System.in);
		String nombre = "";
		int posicion=0;
		
		nombre = leer.nextLine();
		for (int i=0; i<magenda.length;i++) {
			if ((magenda[i][0]!=null) && (magenda[i][0].equalsIgnoreCase(nombre))){
				posicion=i;
				break;
			}
			
		}
		return posicion;
	}
	
	public static void borrarcontactos(String magenda[][]) {
		int borrar=buscarcontactos(magenda);
		magenda[borrar][0]=null;
		magenda[borrar][1]=null;
	}
	
	
	public static void editarcontacos(String magenda[][]) {
		borrarcontactos(magenda);
		guardarcontactos(magenda);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion = 0;
		String magenda[][] = new String [2][2];
		int posicion=0;
		
		
		
		
		do {
		seleccion=numeros1();
		switch(seleccion) {
		case 1:
			guardarcontactos(magenda);
			break;
		case 2:
			borrarcontactos(magenda);
			break;
		case 3:
			vercontactos(magenda);
			break;
		case 4:
			System.out.println("A quien quieres buscar");
			posicion=buscarcontactos(magenda);
			System.out.println(posicion);
			break;
		case 5:
			editarcontacos(magenda);
			break;
		case 6:
			System.out.println("Adios");
			break;
		}
		}while(seleccion!=6);
		posicion(magenda);
	}
	
}

