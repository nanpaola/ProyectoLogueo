package Modelo;

public class Usuarios {

	private int idUser;
	private String nomUser;
	private String contrasena;
	private boolean estatus;
	
	public Usuarios(int idUser, String nomUser, String contrasena, boolean estatus) {
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.contrasena = contrasena;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Usuarios [idUser=" + idUser + ", nomUser=" + nomUser + ", contrasena=" + contrasena + ", estatus="
				+ estatus + "]\n";
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
	
	
	
	
}
