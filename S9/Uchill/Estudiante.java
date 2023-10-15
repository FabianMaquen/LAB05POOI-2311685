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

    public static void main(String[] args) {
        Curso curso1 = new Curso("MATEMATICAS", "123ABC", 20, 20,20,20,20);
        Curso curso2 = new Curso("POO1", "456DEF", 5, 20,20,18,19);
        Curso curso3 = new Curso("LENGUAJE", "789GHI", 4, 20,19,17,20);


        Estudiante estudiante1 = new Estudiante(151652, 2786347, "Pochita", "Quevedo", 20, "Pochitatuterror@gmail.com", 123456789, 123456, 02);


        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso2);
        estudiante1.agregarCurso(curso3);
        
        System.out.println(estudiante1.toString());

        estudiante1.asistencia("si");


        System.out.println("Los cursos de " + estudiante1.getNombres() + ": ");
        
        for (Curso curso : estudiante1.getCursos()){
            System.out.println(curso.getNombre() + "    /   Promedio: " + curso.calcularPromedio());
        }

    }
}