package Uchill;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private int carnet;
    private List<Curso> cursos;
    private int ciclo;

    public Estudiante(){
    }

    public Estudiante(int ID, int dni, String nombres, String apellidos, int edad, String correo, int telefono, int carnet, int ciclo) {
        super(ID, dni, nombres, apellidos, edad, correo, telefono);
        this.carnet = carnet;
        this.cursos = new ArrayList<>();
        this.ciclo = ciclo;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void asistencia(String asistencia){
        if (asistencia=="si"||asistencia=="SI"){
            System.out.println(getNombres() + " asistio a clase");
        }
        else{
            System.out.println(getNombres() +" no asistio a la clase");
            
        }
    }
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    public  void mandarCorreo(){
        System.out.println("EL estudiante esta remitiendo un correo en formato alumno.");
    }
    @Override 
    public String toString() {
        return "\nESTUDIANTE: " + super.toString() + "Carnet: " + carnet + "\nCiclo: " + ciclo + "\n";
    }  
}