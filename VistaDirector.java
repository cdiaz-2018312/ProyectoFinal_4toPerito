
//package org.carlos.vista;
//import org.carlos.controlador.*; los voy a dejar como comentario, di no recuerdo mal dijo que usted iba a crear el arbol de directorios para que pueda compilarlo
public class VistaDirector{

	ControladorMateria Cmateria=new ControladorMateria();
	controladorInstructor Cinstructor=new controladorInstructor();
	Datos dt=new Datos();
	ControladorSalon ContSalon=new ControladorSalon();
	int opcion;
	int eleccion;
	String nMateria;
    String breveDescripcion;
	String sino;
	String pregunta="si";
	String busqueda;
	String Eliminar;
	String finall="si";
	String nDireccion;
	int Var;
	
	
	
	public void PantallaDirector(){
	System.out.println("Seleccione una de las siguientes opciones a realizar");
	System.out.println("1...Materia");
	System.out.println("2...instructor");
	System.out.println("3...salon");
	System.out.println("3...asignar materia a profesor");
	System.out.println("4...asignar salon al profesor");
	System.out.println("----------------------------------------------------------");
	opcion=dt.dato();
	switch(opcion){
		case 1:
	while(pregunta.equals("si")){
		System.out.println("Seleccione una de las siguientes opciones a realizar;");
		System.out.println("1...Crear");
		System.out.println("2...modificar");
		System.out.println("3...eliminar");
		System.out.println("4...regresar al menu principal");
		System.out.println("-------------------------------------------------------");
		eleccion=dt.dato();
				switch(eleccion){
					case 1:
				String nuevoNombre;
				String nuevaDescripcion;
					do{
					System.out.println("Ingrese la materia y luego una descripcion");
					nMateria=dt.ingresarTexto();
					breveDescripcion=dt.ingresarTexto();
					Cmateria.AMaterias(nMateria,breveDescripcion); 
					System.out.println("¿desea agreagar otra materia?");
					sino=dt.ingresarTexto();
					}while(sino.equals("si"));{}
					System.out.println("estas son las clases creadas");
					Cmateria.Reporte();
					System.out.println("¿desea regresar al Menu de opciones materia?");
					pregunta=dt.ingresarTexto();
	
					break;
					case 2:
					while(finall.equals("si")){
					System.out.println("Ingrese el nombre de la materia a buscar para lugo ser cambiada junto con su descripcion");
					busqueda=dt.ingresarTexto();
					System.out.println("Ingrese el nuevo nombre");
					nuevoNombre=dt.ingresarTexto();
					System.out.println("ingrese la nueva descripcion");
					nuevaDescripcion=dt.ingresarTexto();
					Cmateria.modificarMateria(busqueda,nuevoNombre,nuevaDescripcion);
					System.out.println("desea Cambiar algun otro dato?(si o no)");
					finall=dt.ingresarTexto();
					}
					break;
					case 3:
					while(pregunta.equals("si")){
					System.out.println("ingrese el nombre de la clase a eliminar");
					Eliminar=dt.ingresarTexto();
					Cmateria.eliminarMateria(Eliminar);
					}
					break;
					
					case 4:
					this.PantallaDirector();
					break;
					default:{
						System.out.println("ingrese una opcion valida");
					}
	}
	}
		break;
		
		
		case 2:
	
		System.out.println("Seleccione una de las siguientes opciones a realizar;");
		System.out.println("1...Crear");
		System.out.println("2...modificar");
		System.out.println("3...eliminar");
		System.out.println("4...regresar al menu principal");
		System.out.println("-------------------------------------------------------");
		eleccion=dt.dato();
		switch(eleccion){
					case 1:
				String nuevoNombre;
				String nuevoApellido;
				int nuevoNumero;
				
				String ins;
				String ape;
				int cell;
				String calle; 
					do{
					System.out.println("Ingrese instructor, su apellido, numero de telefono y lugo su direccion");
					ins=dt.ingresarTexto();
					ape=dt.ingresarTexto();
					cell=dt.dato();
					calle=dt.ingresarTexto();
					Cinstructor.AInstructor(ins,ape,cell,calle); 
					System.out.println("¿desea agreagar otro instructor?");
					sino=dt.ingresarTexto();
					}while(sino.equals("si"));{}
					System.out.println("estas son los instructores creados");
					Cinstructor.Reporte();
					System.out.println("¿desea regresar al Menu ?");
					pregunta=dt.ingresarTexto();
					if(pregunta=="si"){
						this.PantallaDirector();
					}
					
		
					break;
					case 2:
					while(finall.equals("si")){
					System.out.println("Ingrese el nombre del instructor a buscar para lugo ser cambiada junto con sus atributos");
					busqueda=dt.ingresarTexto();
					System.out.println("Ingrese el nuevo nombre");
					nuevoNombre=dt.ingresarTexto();
					System.out.println("ingrese el nuevo apellido");
					nuevoApellido=dt.ingresarTexto();
					System.out.println("ingrese el nuevo numero");
					nuevoNumero=dt.dato();
					Cinstructor.modificarInstructor(busqueda,nuevoNombre,nuevoApellido,nuevoNumero,nDireccion);
					System.out.println("desea Cambiar algun otro dato?(si o no)");
					finall=dt.ingresarTexto();
					}
					break;
					case 3:
					while(pregunta.equals("si")){
					System.out.println("ingrese el nombre de la clase a eliminar");
					Eliminar=dt.ingresarTexto();
					Cinstructor.eliminarInstructor(Eliminar);
					}
					break;
					
					case 4:
					this.PantallaDirector();
					break;
		
			default:{
			System.out.println("Ingrese una opcion valida");
			}
			
		}
	case 3:
	int calumnos;
	String nsalon;
	String nuevoNombre;
	int nuevoEspacio;
	
		System.out.println("Seleccione una de las siguientes opciones a realizar;");
		System.out.println("1...Crear");
		System.out.println("2...modificar");
		System.out.println("3...eliminar");
		System.out.println("4...regresar al menu principal");
		System.out.println("-------------------------------------------------------");
		Var=dt.dato();
		switch(Var){
			case 1:
			do{
			System.out.println("introduzca el salon, luego la cantidad de alumnos que podra albergar");
			nsalon=dt.ingresarTexto();
			calumnos=dt.dato();
			ContSalon.ASalon(nsalon,calumnos);
			System.out.println("estos son los salones creados");
			ContSalon.Reporte();
			System.out.println("desea agregar otro salon?");
			sino=dt.ingresarTexto();
			}while(sino.equals("si"));{}
			break;
			
			case 2:
					do{
					System.out.println("Ingrese el nombre del salon a buscar para lugo ser cambiadojunto con su espacio");
					busqueda=dt.ingresarTexto();
					System.out.println("Ingrese el nuevo nombre");
					nuevoNombre=dt.ingresarTexto();
					System.out.println("ingrese el nuevo numero de espacio");
					nuevoEspacio=dt.dato();
					ContSalon.modificarSalon(busqueda,nuevoNombre,nuevoEspacio);
					System.out.println("desea Cambiar algun otro dato?(si o no)");
					finall=dt.ingresarTexto();
					}while(finall.equals("si"));{}
					break;
				
				case 3:
				while(pregunta.equals("si")){
					System.out.println("ingrese el nombre del salon a eliminar");
					Eliminar=dt.ingresarTexto();
					ContSalon.eliminarSalon(Eliminar);
					}
				break;
				default:{
					System.out.println("ingrese una opcon valida");
			}
		}
	}
	
}
}
