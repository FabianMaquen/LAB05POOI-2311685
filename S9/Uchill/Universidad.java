package Uchill;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombreU;
    private int sedes;
    private String ubicacion;
    private List<Persona> personas; // Lista para almacenar instancias de Persona
    
    Universidad(){

    }
    Universidad(String nombreU, int sedes, String ubicacion){
        this.nombreU = nombreU;
        this.sedes = sedes;
        this.ubicacion = ubicacion;
        this.personas = new ArrayList<>();
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
        return "Universidad [nombreU=" + nombreU + ", sedes=" + sedes + ", ubicacion=" + ubicacion + ", personas="
                + personas + "]";
    }
}
