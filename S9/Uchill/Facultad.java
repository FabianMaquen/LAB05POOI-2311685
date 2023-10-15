package Uchill;

public class Facultad {

	private char pabellon;
	private String nameFa;
	private int facuID;
	
	
	public Facultad() {
		
	}

	public Facultad(int facuID, char pabellon, String nameFa){
		this.facuID = facuID;
		this.pabellon = pabellon;
		this.nameFa = nameFa;
	}
	
	public char getPabellon() {
		return pabellon;
	}

	public void setPabellon(char pabellon) {
		this.pabellon = pabellon;
	}

	public String getNameFa() {
		return nameFa;
	}

	public void setNameFa(String nameFa) {
		this.nameFa = nameFa;
	}

	@Override
	public String toString() {
		return "\nID de facultad: " + facuID + "\nPabellon: " + pabellon + "\nNombre de Facultad: " + nameFa + "\n";

	}
}