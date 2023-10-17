package Uchill;

public abstract class Persona {
    protected int ID;
    protected int dni;
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected String correo;
    protected int telefono;

    public Persona(){
    }

    public Persona(int ID, int dni, String nombres, String apellidos, int edad, String correo, int telefono) {
        this.ID = ID;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;   
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // ESTA ES LA CLASE ABSTRACTA QUE SERA DEFINIDA INDOVIDUALMENTE EN CASA UNA SE LAS SUBCLASES ESTUDIANTE, PROFESOR Y ADMINISTRADOR
    public abstract void mandarCorreo();

    @Override
    public String toString() {
        return "\n"+nombres + " "+ apellidos + "\nID: " + ID + "\nDni: " + dni + "\nEdad: " + edad + "\nCorreo: " + correo + "\nTelefono: " + telefono +"\n";
    }

}