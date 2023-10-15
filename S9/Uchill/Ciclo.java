package Uchill;
import java.util.ArrayList;
import java.util.List;

public class Ciclo {
    private int nPeriodo;
    private int anio;
    private int cicloID;
    private List<Cursos> listaCurso;

    public Ciclo(){

    }

    public Ciclo(int nPeriodo, int anio, int cicloID, List<Curso> listaCurso) {
        this.nPeriodo = nPeriodo;
        this.anio = anio;
        this.cicloID = cicloID;
        this.listaCurso = listaCurso;
    }
    
    public int getNPeriodo() {
		return nPeriodo;
	}

	public void setNPeriodo(int nPeriodo) {
		this.nPeriodo = nPeriodo;
    }

    public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
    }
  
  public int getCicloID() {
		return cicloID;
	}

	public void setCicloID(int cicloID) {
		this.cicloID = cicloID;
    }

    @Override
    public String toString(){
        return "Número de Periodo: " + nPeriodo + "- Año: " + anio + "- ID del ciclo: " + cicloID;
    }
}
