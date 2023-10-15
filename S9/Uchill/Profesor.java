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
	@Override
    public void mandarCorreo() {
		System.out.println("Mandando correo a director");
	}

	
	public String toString () {
		return "Profesor[Horas trabajadas="+numHoras+",Años de experiencia ="+aniosExperiencia+super.toString()+"]";
		}
	
        public static void main(String[] args) {
        	
        	Profesor profesor1 = new Profesor(247837483,74627362,"Carlos","Bravo",40, "dfefddQQ@5565",999999999, 10,9);
            

            Curso curso1 = new Curso ("Calculo","FEFRGW",4,20.0);
            Curso curso2 = new Curso ("Algebra Lineal","WRERT3T",3,50.0);
            Curso curso3 = new Curso("Calculo 2","ERETRGSG",4,20.0);
            Curso curso4 = new Curso("Calculo 3","ERT3ETR",4,20.0);
            
            

            profesor1.asignarCurso(curso1);
            profesor1.asignarCurso(curso2);
            profesor1.asignarCurso(curso3);
            profesor1.asignarCurso(curso4);
            
            System.out.println(profesor1.toString());
            
            System.out.println("Profesor " + profesor1.getNombres() + " : ");
            for (Curso curso : profesor1.getCursos()){
                System.out.println("Curso:"+curso.getNombre() + " Codigo de curso: "+ curso.getCodigo()+" Creditos del curso: "+ curso.getCreditos()+" Notas del curso: "+ curso.getNotas());
            }
            
            System.out.println("El salario de hoy es "+profesor1.calcSalarioDiario(8));
        }
	
	}


	