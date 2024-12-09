package entidades;

public class Alimento {

	private String alimento;

	public Alimento(String alimento) { 
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		return "#1 " + alimento;
	}
	
	
}
