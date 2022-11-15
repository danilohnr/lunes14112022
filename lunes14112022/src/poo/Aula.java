package poo;

public class Aula {
	private int iD;
	private final int MaxEstudiantes=20;
	private String asignatura;
	
	private Profesor profesor;
	private Estudiante[] estudiantes;
	
	
	public Aula() {
		this.iD=1;
		this.profesor=new Profesor();
		this.estudiantes=new Estudiante[MaxEstudiantes];
		this.asignatura=Asignatura.ASIGNATURAS[Metodos.generanNumerosAleatorios(0,2)];
		crearEstudiantes();
	}
	private void crearEstudiantes() {
		for (int i = 0; i < estudiantes.length; i++) {
		    estudiantes[i]=new Estudiante();	
		}
	}
	private boolean ContarAsistenciaAlumnos() {
		int contadorAsistencia=0;
		for (int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i].isAsistencias()) {
				contadorAsistencia++;
			}
		}
		System.out.println("La asistencia es de: "+contadorAsistencia+" Estudiantes");
		return (contadorAsistencia>=(int)(MaxEstudiantes/2));
	}
	public boolean ImpartirClase() {
		if(!profesor.isAsistencias()) {
			System.out.println("No esta el Profesor, Hoy no hay clase");
			return false;
		}else if(!profesor.getAsignatura().equals(asignatura)) {
			System.out.println("La asignatura del aula es diferente a la del Profesor, Hoy no hay clase");
			return false;
		}else if(!ContarAsistenciaAlumnos()) {
			System.out.println("No hay suficientes alumnos, Hoy no hay clase");
			return false;
		}else {
			System.out.println("Si se puede impartir clase");
			return true;
		}
	}
	public void MostrarNotasAprobados() {
		int ContadorAlumnosAprobados=0,ContadorAlumnasAprobadas=0;
		for (int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i].getCalificacion()>=6) {
				if(estudiantes[i].getSexo()=='M') {
					ContadorAlumnosAprobados++;
				}else {
					ContadorAlumnasAprobadas++;
				}
				System.out.println(estudiantes[i].MostrarInfoEstudiantes());
			}
			
		}
		System.out.println("Hay "+ContadorAlumnosAprobados+" Alumnos aprobados y hay "+ContadorAlumnasAprobadas+" aprobadas");
		
	}
	

}
