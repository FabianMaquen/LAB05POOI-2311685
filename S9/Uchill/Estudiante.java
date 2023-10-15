package Uchill;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private double notas;
    private int carnet;
    private List<Curso> cursos;

    public Estudiante(){
    }

    public Estudiante(int ID, int dni, String nombres, String apellidos, int edad, String correo, int telefono, double notas, int carnet) {
        super(ID, dni, nombres, apellidos, edad, correo, telefono);
        this.notas = notas;
        this.carnet = carnet;
        this.cursos = new ArrayList<>();
    }
    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
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
    
    public void asistencia(String asistencia){
        if (asistencia=="si"||asistencia=="SI"){
            System.out.println("El alumno " + getNombres() + " asistio a clase");
        }
        else{
            System.out.println("El alumno " + getNombres() +" no asistio a la clase");
            
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
        return "Estudiante [" + super.toString() + "notas=" + notas + ", carnet=" + carnet +  "]";
    }  

    public static void main(String[] args) {
        Curso curso1 = new Curso("MATEMATICAS", "123ABC", 4, 20);
        Curso curso2 = new Curso("POO1", "456DEF", 5, 20);
        Curso curso3 = new Curso("LENGUAJE", "789GHI", 4, 20);


        Estudiante estudiante1 = new Estudiante(0001, 2786347, "Pochita", "Quevedo", 20, "Pochitatuterror@gmail.com", 123456789, 19, 123456);


        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso2);
        estudiante1.agregarCurso(curso3);

        estudiante1.asistencia("si");

        System.out.println("Los cursos de " + estudiante1.getNombres() + ": ");
        
        for (Curso curso : estudiante1.getCursos()){
            System.out.println(curso.getNombre() + "---------" + curso.getNotas());
        }

    }
}