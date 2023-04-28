//package org.carlos.modelo;
//import org.carlos.controlador.*;
public class Materias{
	String NombreCurso;
	String description;
	
	public Materias(String Nombre,String Descripcion){
		this.NombreCurso=Nombre;
		this.description=Descripcion;
	}
	public String getNombreM(){
		return NombreCurso;
	}
	public String getDescripcion(){
		return description;
	}
	public String setNombre(String nombre){
		this.NombreCurso=nombre;
		return NombreCurso;
	}
	public String setDescription(String nuevaD){
		this.description=nuevaD;
		return description;
	}
}