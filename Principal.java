//package org.carlos;
//import org.carlos.vista.*;
public class Principal{
	public static void main(String args[]){
		VistaDirector Vdirector=new VistaDirector();
		VistaCoordinador Vcoordinador=new VistaCoordinador();
	Datos dt=new Datos();
	//credenciales Director
	String UsuarioD="director";
	String claveD="1234";
	//credenciales coordinador;
	String UsuarioC="coordinador";
	String claveC="1234";
	
	String clave;
	String usuarios;
	String claves;
	String usuarioCordinador;
	String sino;
	
	do{	
	
	System.out.println("Ingrese su usuario");
	usuarios=dt.ingresarTexto();
	System.out.println("ingrese la clave");
	clave=dt.ingresarTexto();
	if(usuarios.equals(UsuarioD) && clave.equals(claveD)){
	
	System.out.println("Bienvenido Director");
	Vdirector.PantallaDirector();
	}else if(usuarios.equals(UsuarioC) && clave.equals(claveC)){
		System.out.println("Bienvenido coordinador");
		
		Vcoordinador.vistaCoordinador();
	}else{
		System.out.println("no existen ninguno de los usuarios");
		
	}
	System.out.println("desea regresar al login? si/no");
	sino=dt.ingresarTexto();
	}while(sino.equals("si"));{}
	
	}
	}
