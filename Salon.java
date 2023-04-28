//package org.carlos.modelo;
public class Salon{

	String NombreSalon;
	int Personas;
	
	public Salon(String Nombresalon,int personas){
		this.NombreSalon=Nombresalon;
		this.Personas=personas;
	}
	public String getNombreS(){
		return NombreSalon;
	}
	public int getPersonas(){
		return Personas;
	}
	public String setNombreSalon(String nombre){
		this.NombreSalon=nombre;
		return NombreSalon;
	}
	public int setSalon(int Npersonas){
		this.Personas=Npersonas;
		return Personas;
	}
}
