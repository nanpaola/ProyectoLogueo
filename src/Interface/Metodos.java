package Interface;

import java.util.List;
import Modelo.Usuarios;

//plantilla para declarar metodos abstractos
public interface Metodos {
	
	public void guardar(Usuarios usuario);
	
	public List<Usuarios> mostrar();
	
	public Usuarios buscar(int indice);
	
	public void editar(int indice, Usuarios usuario);
	
	public void eliminar(int indice);
	
	

}
