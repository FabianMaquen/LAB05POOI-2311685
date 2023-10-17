package Uchill;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante persona1 = new Estudiante(151652, 2786347, "Pochita", "Quevedo", 20, "Pochitatuterror@gmail.com", 123456789, 123456, 02);
        Estudiante persona2 = new Estudiante(534215, 126534, "Cristiano", "Quevedo", 22, "Cristianotuterror@gmail.com", 51325456, 56652, 05);

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);



        Facultad facultad1 = new Facultad(202055,'C', "Ingeniería");
        Facultad facultad2 = new Facultad(151510,'A',"Medicina");
        Facultad facultad3 = new Facultad(171710,'B',"Derecho");

        List<Facultad> facultades = new ArrayList<>();
        facultades.add(facultad1);
        facultades.add(facultad2);
        facultades.add(facultad3);

        Universidad Ulima = new Universidad("Ulima", 1, "Surco", personas, facultades);

        System.out.println(Ulima.toString());
    }
}

    // public static void main(String[] args) {
    //     Curso curso1 = new Curso("MATEMATICAS", "123ABC", 20, 20,20,20,20);
    //     Curso curso2 = new Curso("POO1", "456DEF", 5, 20,20,18,19);
    //     Curso curso3 = new Curso("LENGUAJE", "789GHI", 4, 20,19,17,20);


    //     Estudiante estudiante1 = new Estudiante(151652, 2786347, "Pochita", "Quevedo", 20, "Pochitatuterror@gmail.com", 123456789, 123456, 02);


    //     estudiante1.agregarCurso(curso1);
    //     estudiante1.agregarCurso(curso2);
    //     estudiante1.agregarCurso(curso3);
        
    //     System.out.println(estudiante1.toString());

    //     estudiante1.asistencia("si");


    //     System.out.println("Los cursos de " + estudiante1.getNombres() + ": ");
        
    //     for (Curso curso : estudiante1.getCursos()){
    //         System.out.println(curso.getNombre() + "    /   Promedio: " + curso.calcularPromedio());
    //     }

        
    // public static void main(String[] args) {
	// 	Administrador administrador = new Administrador(499308293,8723623,"Javier","Gamarra",53, "dfdgrgv@.com",94477724,"Director", 5);
		
	// 	System.out.println(administrador.toString());
	// 	administrador.programarReunión("SI");
	// }

        //     public static void main(String[] args) {
        	
        // 	Profesor profesor1 = new Profesor(247837483,74627362,"Carlos","Bravo",40, "dfefddQQ@5565",999999999, 10,9);
            

        //     Curso curso1 = new Curso ("Calculo","FEFRGW",4);
        //     Curso curso2 = new Curso ("Algebra Lineal","WRERT3T",3);
        //     Curso curso3 = new Curso("Calculo 2","ERETRGSG",4);
        //     Curso curso4 = new Curso("Calculo 3","ERT3ETR",4);
            
            

        //     profesor1.asignarCurso(curso1);
        //     profesor1.asignarCurso(curso2);
        //     profesor1.asignarCurso(curso3);
        //     profesor1.asignarCurso(curso4);
            
        //     System.out.println(profesor1.toString());
            
        //     System.out.println("Profesor " + profesor1.getNombres() + " "+profesor1.getApellidos() +": " +"\nCursos dictados:");
        //     for (Curso curso : profesor1.getCursos()){
        //         System.out.println("\nCurso:"+curso.getNombre() + "\nCodigo de curso: "+ curso.getCodigo()+"\nCreditos del curso: "+ curso.getCreditos());
        //     }
            
        //     System.out.println("El salario de hoy es "+profesor1.calcSalarioDiario(8));
        // }
	
