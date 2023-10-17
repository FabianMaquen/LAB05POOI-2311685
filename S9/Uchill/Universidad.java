package Uchill;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombreU;
    private int sedes;
    private String ubicacion;
    private List<Persona> personas; // Lista para almacenar instancias de Persona
    private List<Facultad> facultades;
    
    Universidad(){

    }
    Universidad(String nombreU, int sedes, String ubicacion, List<Persona> personas, List<Facultad> facultades){
        this.nombreU = nombreU;
        this.sedes = sedes;
        this.ubicacion = ubicacion;
        this.personas = personas;
        this.facultades = facultades;
    }
    public String getNombreU() {
        return nombreU;
    }
    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }
    public int getSedes() {
        return sedes;
    }
    public void setSedes(int sedes) {
        this.sedes = sedes;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public List<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    public List<Facultad> getFacultades() {
        return facultades;
    }
    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    public void mostrarPersona(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    @Override
    public String toString() {
        return "UNIVERSIDAD\nNombre: " + nombreU + "\nSedes: " + sedes + "\nUbicacion: " + ubicacion + "\n\nPERSONAS(S):\n" + personas + "\n\nFACULTAD(ES):\n" + facultades;
    }

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
