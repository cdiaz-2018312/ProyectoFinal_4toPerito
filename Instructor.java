//package org.carlos.modelo;
//import org.carlos.modelo.*;
import java.util.ArrayList;
public class Instructor{
	String NombreInstructor;
	String ApellidoIns;
	int Celular;
	String Direccion;
	
	public Instructor(String Nombre,String Ape,int phone,String calle){
		this.NombreInstructor=Nombre;
		this.ApellidoIns=Ape;
		this.Celular=phone;
		this.Direccion=calle;
		
	}
	public String getNombreI(){
		return NombreInstructor;
	}
	public String getApellido(){
		return ApellidoIns;
	}
	public int getTelefono(){
		return Celular;
	}
	public String getDireccion(){
		return Direccion;
	}
	public String setNombre(String nombreI){
		this.NombreInstructor=nombreI;
		return NombreInstructor;
	}
	public String setApellido(String apellido){
		this.ApellidoIns=apellido;
		return ApellidoIns;
	}
	public int setTelefono(int numeroFon){
		this.Celular=numeroFon;
		return Celular;
	}
	public String setDireccion(String calles){
		this.Direccion=calles;
		return Direccion;
	}
}

