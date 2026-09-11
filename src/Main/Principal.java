package Main;

import Implementacion.LogicaMetodos;
import Modelo.Usuarios;

public class Principal {
	public static void main(String[]args) {
		
		//crea coleccion objectos
		Usuarios usuario1=new  Usuarios(1,"pablo","pabloma2",true);
		Usuarios usuario2=new  Usuarios(2,"lalo","la45",false);
		Usuarios usuario3=new  Usuarios(3,"marcos","asudc",true);
		
		LogicaMetodos imp=new LogicaMetodos();
	
	imp.guardar(usuario1);
	imp.guardar(usuario2);
	imp.guardar(usuario3);
	System.out.println(imp.mostrar());
	
	//buscar
	Usuarios usu1=null;
	usu1=imp.buscar(1);
	System.out.println("usuario encontrado \n" + usu1);
	
	//editar
	usu1.setContrasena("ydbckd_");
	usu1.setEstatus(true);
	imp.editar(1, usu1);
	
	//mostrar
	System.out.println(imp.mostrar());
	
	//eliminar
	imp.eliminar(0);
	System.out.println("DATO ELIMINADO");
	System.out.println(imp.mostrar());
	

}}
