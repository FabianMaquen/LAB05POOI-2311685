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

        Persona persona1 = new Persona(15198, 2385515, "Juan", "Pérez", 18,"beba@usil", 9485112);
        Persona persona2 = new Persona(5121, 1521062, "María", "Rodríguez", 20, "FEAFSCZ@usil", 9958151);

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
