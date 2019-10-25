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
	
	public static void listaContacto(String mContacto[][]) {
		for (int i = 0; i<mContacto.length; i++) {
			if (mContacto[i][0] != null) {
				System.out.println("Contacto " + (i+1) + ": " + mContacto[i][0] + "--->" + mContacto[i][1]);
			}
		}
	}
	
	public static int buscaHueco(String mContacto[][]) {
		int pos = -1;
		for (int i = 0; i<mContacto.length; i++) {
			if (mContacto[i][0] == null) {
				return i;
			}
		}
		return pos;
	}
	
	public static void guardaContacto(String mContacto[][]) {
		int i = buscaHueco(mContacto);
		Scanner leer = new Scanner(System.in);
		System.out.println("Pon el nombre del contacto");
		mContacto[i][0] = leer.nextLine(); 
		System.out.println("Pon el teléfono del contacto");
		mContacto[i][1] = leer.nextLine();
	}
	
	public static void borrarContacto(String mContacto[][]) {
		int borro;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime qué contacto quieres borrar");
		borro = leer.nextInt();
		mContacto[borro-1][0] = null;
		mContacto[borro-1][1] = null;
	}
	
	public static void buscaContacto(String mContacto[][]) {
		String busqueda;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un nombre o teléfono y te diré su contacto");
		busqueda = leer.nextLine();
		for (int i = 0; i<mContacto.length; i++) {
			if((mContacto[i][0] != null && mContacto[i][1] != null) && (mContacto[i][0].equalsIgnoreCase(busqueda) || mContacto[i][1].equalsIgnoreCase(busqueda))) {
				System.out.println("Contacto " + (i+1) + ": " + mContacto[i][0] + "--->" + mContacto[i][1]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0, numCon = 0;
		String mContacto[][] = new String[50][2];
		
		do {
			opc = imprimeMenu();
			switch(opc) {
			case 1:
				listaContacto(mContacto);
				break;
			case 2:
				guardaContacto(mContacto);
				break;
			case 3:
				borrarContacto(mContacto);
				break;
			case 4:
				buscaContacto(mContacto);
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
