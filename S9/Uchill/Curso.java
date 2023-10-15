package Uchill;

public class Curso {
    private int cursoID;
    private String nombre;
    private String codigo;
    private int creditos;
    private double notas;

    public Curso(){
    }
    public Curso(String nombre, String codigo, int creditos, double notas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.notas = notas;
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
    public void setCodigoCurso(String codigo) {
        this.codigo = codigo;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditosCurso(int creditos) {
        this.creditos = creditos;
    }
    public double getNotas() {
        return notas;
    }
    public void setNotas(double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Cursos [nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos + ", notasCurso=" + notas + "]";
    }

}
