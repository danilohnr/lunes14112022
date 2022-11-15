package poo;

public class Profesor extends Persona {
	private String asignatura;
	public Profesor() {
		super();
		this.asignatura=Asignatura.ASIGNATURAS[Metodos.generanNumerosAleatorios(0,2)];
		super.setEdad(Metodos.generanNumerosAleatorios(25, 50));
	}
	@Override
	public void Disponibilidad() {
		int Probabilidad=Metodos.generanNumerosAleatorios(0,100);
		if(Probabilidad < 20) {
			super.setAsistencias(false);
		} else {
			super.setAsistencias(true);
		}
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	

}
