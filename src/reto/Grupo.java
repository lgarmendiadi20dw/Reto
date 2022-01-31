package reto;

public class Grupo {
	private int idGrupo;
	private String nombreGrupo;
	private Asignatura [] asignaturas;
	
	public Grupo(int idGrupo, String nombreGrupo, Asignatura[] asignaturas) {
		this.idGrupo = idGrupo;
		this.nombreGrupo = nombreGrupo;
		this.asignaturas = asignaturas;
	}
}
