package Uchill;

public class Curso {
    private String nombre;
    private String codigo;
    private int creditos;
    private double[] notas;

    public Curso(){
    }

    public Curso(String nombre, String codigo, int creditos, double nota1, double nota2, double nota3, double nota4) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        notas = new double[4];
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        notas[3] = nota4;
    }
    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
    }

    public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
    }

    public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularPromedio(){
        int cantidadCursos = 4;
        double suma = 0;
        double promedio = 0;
        for(int i = 0; i < cantidadCursos; i++){
            suma += notas[i];
        }
        promedio = (suma / cantidadCursos);
        return promedio;
    }

    @Override
    public String toString(){
        return "Curso: " + nombre + "\nCódigo: " + codigo + "\nCréditos: " + creditos + "\nNotas: " + notas+"\n";
    }
}