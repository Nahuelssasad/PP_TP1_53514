import java.util.List;

import java.util.ArrayList;
import java.util.Scanner

public class App {
    public static void main(String[] args){
	

	int cantidad; //variable general para denotar cantidades
	int cantidadActividades //variable para cantidad de eventos

		
	//Creacion de varios objectos.El usuario ingresa datos usando el teclado
	Scanner scanner = new Scanner(System.in);
	

	// Se crean los estudiantes
	
	
        List<Estudiante> estudiantes = new ArrayList<>();
	

        System.out.println("REGISTRO DE ESTUDIANTES: ");
        System.out.println("======================");
	
	System.out.println("Cantidad Estudiantes: ");
	cantidad = scanner.nextInt();
	scanner.nextLine();

	
	for ( int i = 0 ; i < cantidad ; i++ ) {


	 	System.out.println("Ingese legajo del estudiante: ");
        	String legajo = scanner.nextLine();
            	System.out.println("Ingese nombre y apellido del estudiante: ");
            	String apenomb = scanner.nextLine();
            	estudiantes.add(new Estudiante(legajo, apenomb));

	}


	//Se crean  eventos
	System.out.println("REGISTRO DE EVENTOS: ");
        System.out.println("======================");

        System.out.println("Cantidad Eventos: ");
	cantidad = scanner.nextInt();
        scanner.nextLine();

	for ( int i = 0 ; i < cantidad ; i++){

	/* Se requieren datos por consola para construir un evento */
            System.out.println("Ingese un título para el evento: ");
            String titulo = scanner.nextLine();
            System.out.println("Ingese el costo base:  ");
            double costoBase = scanner.nextDouble();
            scanner.nextLine(); //limpia el Enter pendiente.
            System.out.println("El evento tendra costo para los participantes s/n?");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            boolean esGratuito= true;
            if (respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("sí")) {
                esGratuito= false;
            }

            /* Se construye un objeto del tipo EventoUniversitario con el constructor de inicializacion de parametros */
            EventoUniversitario evento = new EventoUniversitario( "EVT-" + id, titulo, costo:Base, esGratuito);

            /* Se crea una sala y se asigna al evento */
            System.out.println("Ingese el nombre de la sala donde se realizará el evento: ");
            String nombreSala= scanner.nextLine();
            Sala sala = new Sala(id, nombreSala);
            evento.asignarSala(sala);


	    //Se crean las actividades del evento
	    System.out.println("\n\nREGISTRO DE ACTIVIDADES PARA EL EVENTO " + evento.getTitulo());
            System.out.println("================================================================");
		
	    System.out.println("Cantidad Eventos: ");
       	    cantidadActividades = scanner.nextInt();

	    scanner.nextLine();

	   int idActividades=1;
	    for ( int j = 0 ; j < cantidadActividades ; j++) {
	    
	    	System.out.println("Ingese el título de la actividad: ");
                String tituloActividad= scanner.nextLine();
                System.out.println("Ingese el cupo máximo de estudiantes admitidos para la actividad: ");
                int cupo= scanner.nextInt();
                scanner.nextLine(); //Se consume la linea.
                evento.crearActividad(idActividad, tituloActividad, cupo);
		idActividad++;

	}
    
	    }


	//Interfaz grafica para mostrar  las actividades de  un evento concreto  e inscribirse.
	System.out.println("INSCRIPCIONES");
	System.out.println("================================================================");



	boolean continuar = true;

	
	while(true){
	
		System.out.println("Ingrese el evento a inscribirse");
		String eventoInscripcion=scanner.nextLine();	
		System.out.println("Ingese legajo del estudiante a inscribir: ");
                String legajo = scanner.nextLine();
                System.out.println("Ingese id de la Actividad: ");
                idActividad = scanner.nextInt();
	
		


	
	
	
	
	}
	


	}




    }
