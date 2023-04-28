//package org.carlos.controlador;
//import org.carlos.modelo.*;
import java.util.ArrayList;
public class ControladorSalon{
	int no=0;
	int c=0;
	ArrayList<Salon> SalonArreglo=new ArrayList<Salon>();
	
	public void ASalon(String NombreSalon,int Personas){
			
	SalonArreglo.add(new Salon(NombreSalon,Personas));
	}		
		public void Reporte(){
		System.out.println("-----------------------------");
		for(Salon p:SalonArreglo){
			System.out.println(p.getNombreS()+"    "+p.getPersonas());
		}
	}
	public void modificarSalon(String busqueda,String NombreSalones,int Npersonas){
		for(Salon a:SalonArreglo){
			if(a.getNombreS().equals(busqueda)){
				System.out.println(a.setNombreSalon(NombreSalones)+" "+a.setSalon(Npersonas));
				System.out.println("los nuevos valores han sido cambiado exitosamente");
				this.Reporte();
			}else{
				no++;
			}
		}
		if(no==SalonArreglo.size()){
				System.out.println("el salon no se encuentra"); 
			}
			}

		public void eliminarSalon(String datoEliminar){
		for(Salon a:SalonArreglo){
		while(a.getNombreS() != datoEliminar){
		c++;//profe no se si al momento de eliminar tengo mal mi logica en este procedimiento, pero al momento de ingresar el dato a eliminar, no pasa nada
	}
		 if(a.getNombreS().equals(datoEliminar)){
		 SalonArreglo.remove(c);
		 this.Reporte();
		 }else{
		 System.out.println("el dato no existe");
	 }
	}
	}
	}
