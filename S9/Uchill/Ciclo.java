package Uchill;

public class Ciclo {
  private int nPeriodo;
  private int anio;
  private int cicloID;

    public Ciclo(){

    }

    public Ciclo(int nPeriodo, int anio, int cicloID) {
        this.nPeriodo = nPeriodo;
        this.anio = anio;
        this.cicloID = cicloID;
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

  public int getnPeriodo() {
    return nPeriodo;
  }

  public void setnPeriodo(int nPeriodo) {
    this.nPeriodo = nPeriodo;
  }

  @Override
  public String toString(){
    return "Número de Periodo: " + nPeriodo + "- Año: " + anio + "- ID del ciclo: " + cicloID;
  }
}
