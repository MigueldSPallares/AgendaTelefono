package agendatelefono;

import java.util.Scanner;

public class AgendaTelefono {

	public static int imprimeMenu() {
		int opcion;
		boolean bandera = false;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("MENÚ");
			System.out.println("1- Ver contactos");
			System.out.println("2- Guardar contactos");
			System.out.println("3- Eliminar contactos");
			System.out.println("4- Buscar contactos");
			System.out.println("5- Editar contactos");
			System.out.println("6- Salir");

			System.out.println("Pon una opcion");
			opcion = leer.nextInt();
			
			if(!((opcion >= 1) && (opcion <= 6))) {
				System.out.println("Opción no válida");
			}
			
		}while(!((opcion >= 1) && (opcion <= 6)));
		return opcion;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		int mContacto[][] = new int[50][2];
		
		do {
			opc = imprimeMenu();
			switch(opc) {
			case 1:
				System.out.println("Viendo contacto");
				break;
			case 2:
				System.out.println("Guardando contacto");
				break;
			case 3:
				System.out.println("Eliminando contacto");
				break;
			case 4:
				System.out.println("Buscando contacto");
				break;
			case 5:	
				System.out.println("Editando contacto");
				break;
			case 6:	
				System.out.println("Saliendo");
				break;
			default:
				break;
			}
		}while(opc != 6);
	}
}
