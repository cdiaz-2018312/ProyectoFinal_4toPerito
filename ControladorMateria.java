//package org.carlos.controlador;
import java.util.ArrayList;
//import org.carlos.modelo.*;
public class ControladorMateria{
	int no=0;
	int c=0;
	ArrayList<Materias> MateriaArreglo=new ArrayList<Materias>();
	
	public void AMaterias(String NombreMateria,String DescripcionMateria){
			
	MateriaArreglo.add(new Materias(NombreMateria,DescripcionMateria));
	}		
		
	public void Reporte(){
		System.out.println("-----------------------------");
		for(Materias p:MateriaArreglo){
			System.out.println(p.getNombreM()+"    "+p.getDescripcion());
		}
		
	}
	
	public void modificarMateria(String busqueda,String NuevoNombre,String nuevadescripcion){
		for(Materias a:MateriaArreglo){
			if(a.getNombreM().equals(busqueda)){
				System.out.println(a.setNombre(NuevoNombre)+" "+a.setDescription(nuevadescripcion));
				System.out.println("los nuevos valores han sido cambiado exitosamente");
				System.out.println(a.getNombreM()+" "+a.getDescripcion());
			}else{
				no++;
			}
		}
	
			if(no==MateriaArreglo.size()){
				System.out.println("el valor no se encuentra"); 
			}
			}
	
	public void eliminarMateria(String datoEliminar){
		for(Materias a:MateriaArreglo){
	while(a.getNombreM() != datoEliminar){
		c++;//profe no se si al momento de eliminar tengo mal mi logica en este procedimiento, pero al momento de ingresar el dato a eliminar, no pasa nada
	}
	 if(a.getNombreM()==datoEliminar){
		 MateriaArreglo.remove(c);
		this.Reporte();
	 }else{
		 System.out.println("el dato no existe");
	 }
		}
				
				
  }
		
		
}