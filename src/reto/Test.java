package reto;

public class Test {
	
	public static void main (String[] args) {
		
		Asignatura asig11 = new Asignatura(1, "Entornos de desarrollo");
		Asignatura asig12 = new Asignatura(2, "Programacion");
		Asignatura asig13 = new Asignatura(3, "Bases de datos");
		Asignatura [] gr1 = {asig11, asig12, asig13};
		Grupo dw31c = new Grupo(1, "DW31c", gr1);
		
		Asignatura asig21 = new Asignatura(4, "Garapen inguruneak");
		Asignatura asig22 = new Asignatura(5, "Programazioa");
		Asignatura asig23 = new Asignatura(6, "Datu baseak");
		Asignatura [] gr2 = {asig21, asig22, asig23};
		Grupo dw31e = new Grupo(2, "DW31e", gr2);
		
		Grupo [] dw31 = {dw31c, dw31e};
		Ciclo daw = new Ciclo(1, "DAW", dw31);
		
		Alumno alum1 = new Alumno(0, "Leire", "Garmendia");
		Alumno alum2 = new Alumno(1, "Iñaki", "Palacios");
		Alumno alum3 = new Alumno(2, "Mikel", "García");
	}
}
