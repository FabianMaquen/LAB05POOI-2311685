package Uchill;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
	private int numHoras;
	private int aniosExperiencia;
	private List<Curso> cursos;
	
	
	public Profesor() {
	
	}
	public Profesor (int numHoras, int aniosExperiencia) {
		this.numHoras = numHoras;
		this.aniosExperiencia = aniosExperiencia;
	}
	public Profesor (int ID, int dni, String nombres, String apellidos, int edad, String correo, int telefono, int numHoras, int aniosExperiencia) {
		super(ID,dni, nombres, apellidos, edad, correo, telefono);
		this.numHoras = numHoras;
		this.aniosExperiencia = aniosExperiencia;
		this.cursos = new ArrayList<>();
		}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public void asignarCurso(Curso curso){
        cursos.add(curso);
    }
	
	public double calcSalarioDiario(int numHoras) {
		double salarioDiario = numHoras * 80; //el sueldo por hora es de 80 soles
		return salarioDiario;
		}

    public void mandarCorreo() {
		System.out.println("Mandando correo a director");
	}

	@Override
	public String toString () {
		return "Horas trabajadas: "+ numHoras+ "\nAños de experiencia: "+ aniosExperiencia + super.toString();
		}
	}