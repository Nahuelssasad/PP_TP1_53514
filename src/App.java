import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
	

		int cantidadEstudiantes,cantidadActividades,cantidadEventos; //variable generales para denoar cantidades

		
	//Creacion de varios objectos.El usuario ingresa datos usando el teclado
		Scanner scanner = new Scanner(System.in);
	

	// Se crean los estudiantes



		List<Estudiante> estudiantes = new ArrayList<>();
		List <EventoUniversitario> eventos = new ArrayList<>();


		System.out.println("REGISTRO DE ESTUDIANTES: ");
        	System.out.println("======================");
	
		System.out.println("Cantidad Estudiantes: ");
	    cantidadEstudiantes = scanner.nextInt();
		scanner.nextLine();

	
		for ( int i = 0 ; i < cantidadEstudiantes ; i++ ) {

				System.out.println("Estudiante :  " + (i+1) );
	 			System.out.println("Ingrese legajo del estudiante: ");
        			String legajo = scanner.nextLine();
            			System.out.println("Ingrese nombre y apellido del estudiante: ");
            			String apenomb = scanner.nextLine();
				estudiantes.add(new Estudiante(apenomb, legajo));
				System.out.println();
		}


		//Se crean  eventos
		System.out.println();
		System.out.println("REGISTRO DE EVENTOS: ");
		System.out.println("====================== ");

        	System.out.println("Cantidad Eventos: ");
		cantidadEventos = scanner.nextInt();
      		scanner.nextLine();

		for ( int i = 0 ; i < cantidadEventos ; i++){

			/* Se requieren datos por consola para construir un evento */
			System.out.println("Ingrese un id para el evento: ");
			String id = scanner.nextLine();

			System.out.println("Ingrese un título para el evento: ");
			String titulo = scanner.nextLine();

			
			double costoBase=0.0 ;
			scanner.nextLine(); //limpia el Enter pendiente.
			System.out.println("El evento tendra costo para los participantes s/n?");
			String respuesta = scanner.nextLine().trim().toLowerCase();

			boolean esGratuito= true;
			if (respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("sí")) {
                		
			
				esGratuito= false;
			 	System.out.println("Ingrese el costo base:  ");
                        	costoBase = scanner.nextDouble();
				scanner.nextLine();
            		}



			/* Se construye un objeto del tipo EventoUniversitario con el constructor de inicializacion de parametros */
			EventoUniversitario evento = new EventoUniversitario( "EVT-" + id, titulo, costoBase, esGratuito);

			/* Se crea una sala y se asigna al evento */
			System.out.println("Ingrese el id de la sala : ");
			int idSala= scanner.nextInt();
			scanner.nextLine();
			System.out.println("Ingrese el nombre de la sala donde se realizará el evento: ");
			String nombreSala= scanner.nextLine();
			Sala sala = new Sala(idSala, nombreSala);
			evento.asignarSala(sala);



	    	//Se crean las actividades del evento
			System.out.println("\n\nREGISTRO DE ACTIVIDADES PARA EL EVENTO " + evento.getTitulo());
			System.out.println("================================================================");
		
			System.out.println("Cantidad Actividades: ");
			cantidadActividades = scanner.nextInt();

			scanner.nextLine();

			int idActividades=1;

	    		for ( int j = 0 ; j < cantidadActividades ; j++) {
	    			System.out.println("Actividad " + ( j+1) );
	    			System.out.println("Ingrese el título de la actividad: ");
                		String tituloActividad= scanner.nextLine();
               	 		System.out.println("Ingrese el cupo máximo de estudiantes admitidos para la actividad: ");
                		int cupo= scanner.nextInt();
                		scanner.nextLine(); //Se consume la linea.
				System.out.println("Ingrese el tipo de actividad:");
				String tipoActividad=scanner.nextLine();
                		evento.crearActividad(idActividades, tituloActividad, cupo,tipoActividad);
				idActividades++;
				System.out.println();

			}	

			eventos.add(evento);

		}


		System.out.println();
		System.out.println("INSCRIPCIONES");
		System.out.println("================================================================");



		boolean continuar = true;

	
		while(continuar){

			//Buscar evento
			System.out.println("Ingrese el evento a inscribirse");
			String tituloEvento=scanner.nextLine();
			EventoUniversitario ingresadoEvento = null;
			boolean encontrado=false;
			for ( EventoUniversitario evento:eventos){

			if (tituloEvento.equals(evento.getTitulo())){
				
				ingresadoEvento=evento;
				encontrado=true;
				break;
			}

			}
			if (!encontrado){
			System.out.println("No encontrado");
			break;
			}

		//Inscribir a un estudiantes
		System.out.println("Ingrese  cantidad estudiantes a inscribir "); //aca se podria verificar el tamaño


		cantidadEstudiantes= scanner.nextInt();
		scanner.nextLine();

		if ( cantidadEstudiantes > estudiantes.size()){
			System.out.println("La máxima cantidad de estudiantes a inscribir  es " + estudiantes.size());
			cantidadEstudiantes =estudiantes.size();

		}

		//inscribimos a estudiante a una actividad
		for ( int i =0 ; i < cantidadEstudiantes;i++){

			System.out.println("Ingrese legajo: ");
			String legajo = scanner.nextLine().trim();
			Estudiante personaInscribir=null;
			boolean encontrar=false;
			for ( Estudiante estudiante : estudiantes)
			{
				if ( estudiante.getLegajo().equals(legajo))
				{
					personaInscribir=estudiante;
					encontrar=true;
					break;
				}

			}
			if ( !encontrar) {
				System.out.println(("Estudiante no encontrado"));
				continue;
			}


			ingresadoEvento.mostrarActividades(); //Interfaz  de actividades

			System.out.println("Ingrese el numero de  la actividad a la  que quiere inscribir al estudiante");

			int  opcion =  scanner.nextInt(); //se podria verificar la opcion
			scanner.nextLine();

			for (int j =0 ; j < ingresadoEvento.getActividades().size();i++ )
			{
				if ( opcion == ingresadoEvento.getActividades().get(j).getId()){
					ingresadoEvento.getActividades().get(j).InscribirEstudiante(personaInscribir);
					System.out.println("INSCRIPCION EXITOSA");
					break;
				}

			}

			System.out.println(("Quiere inscribir  a  otro evento? "));
			String respuesta = scanner.nextLine();
                        
			continuar = (respuesta.equals("n") || respuesta.equals("no") || respuesta.equals("No")) ? false : true;
		}






	
		


	
	
	
	
	}


		System.out.println();
		System.out.println("Informacion de eventos");
                System.out.println("================================================================");


		//mostrar informacion de eventos

		for ( EventoUniversitario evento : eventos){

			evento.mostrarDatos();
		}


	}




    }
