package Uchill;

public class Administrador extends Persona {
	private String rango;
	private int nOficina;
	
	public Administrador() {
		
	}
    public Administrador(String rango, int nOficina) {
	    this.rango = rango;
	    this.nOficina = nOficina;
    }
    public Administrador(int ID,int dni, String nombres, String apellidos, int edad, String correo, int telefono,String rango, int nOficina) {
	    super(ID,dni, nombres, apellidos,edad, correo,telefono);
	    this.rango = rango;
	    this.nOficina = nOficina;
    }
    public String getRango() {
	    return rango;
    }
    public void setRango(String rango) {
	    this.rango = rango;
    }
    public int getOficina() {
	    return nOficina;
    }
    public void setOficina(int oficina) {
	    this.nOficina = oficina;
    }
    public void programarReunión (String decisión) {
        if(decisión.equals("SI")||decisión.equals("si")){
            System.out.println("Se programo una reunión para hoy");
        }
        else {
            System.out.println("No se programo una reunión para hoy");
        }
    }
    public void mandarCorreo() {
		System.out.println("Mandando correo a coordinador");
	}
    public String toString () {
        return "Administrador[Rango="+rango+",Numero de oficinas ="+nOficina+super.toString()+"]";
    }
}
