package reto;

public class Ciclo {
	private int idCiclo;
	private String nombreCiclo;
	private Grupo [] grupos;
	
	public Ciclo(int idCiclo, String nombreCiclo, Grupo[] grupos) {
		this.idCiclo = idCiclo;
		this.nombreCiclo = nombreCiclo;
		this.grupos = grupos;
	}
}
