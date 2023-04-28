//package org.carlos.controlador;
import java.util.ArrayList;
//import org.carlos.modelo.*;
public class controladorInstructor{
	ArrayList<Instructor> Ins=new ArrayList<Instructor>();
int no=0;
int c=0;

	
	public void AInstructor(String NombreInstructor,String ApellidoIns,int Telefono,String Direccion){
			
	Ins.add(new Instructor(NombreInstructor,ApellidoIns,Telefono,Direccion));
	}		
		
	public void Reporte(){
		System.out.println("-----------------------------");
		for(Instructor p:Ins){
			System.out.println(p.getNombreI()+"    "+p.getApellido()+" "+p.getTelefono()+" "+p.getDireccion());
		}
		
	}
	
	public void modificarInstructor(String busqueda,String NuevoNombre,String apellido,int nuevoFon,String Direccion){
		for(Instructor a:Ins){
			if(a.getNombreI().equals(busqueda)){
				System.out.println(" "+a.setNombre(NuevoNombre)+" "+a.setApellido(apellido)+" "+a.setTelefono(nuevoFon)+" "+a.setDireccion(Direccion)+" ");
				System.out.println("los nuevos valores han sido cambiado exitosamente");
				this.Reporte();
			}else{
				no++;
			}
		}
	
			if(no==Ins.size()){
				System.out.println("el valor no se encuentra"); 
			}
			}
	
	public void eliminarInstructor(String datoEliminar){
		for(Instructor a:Ins){
	while(a.getNombreI() != datoEliminar){
		c++;//profe no se si al momento de eliminar tengo mal mi logica en este procedimiento, pero al momento de ingresar el dato a eliminar, no pasa nada
	}
	 if(a.getNombreI()==datoEliminar){
		 Ins.remove(c);
		this.Reporte();
	 }else{
		 System.out.println("el dato no existe");
	 }
		}
}
}