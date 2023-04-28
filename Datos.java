//package org.carlos.manejador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import org.carlos.controlador.*;
//import org.carlos.vista.*;
//import org.carlos.modelo.*;

public class Datos{
	BufferedReader Buff=new BufferedReader(new InputStreamReader(System.in));
	
	public int dato(){
		int valor=0;
		
		try{
		valor=Integer.parseInt(Buff.readLine());
}
	catch(IOException ioe){
	System.out.print("introduzca texto o numeros, error");
	System.exit(1);
}
	return valor;
	}

	public String ingresarTexto(){
			String texto=null;
			
	try{
		texto=Buff.readLine();
	}catch(IOException ioe){
		System.out.println("error al ingresar texto");
		System.exit(1);
	
	}
	return texto;

}


}