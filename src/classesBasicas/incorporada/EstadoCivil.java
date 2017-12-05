package classesBasicas.incorporada;

public enum EstadoCivil {
	SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viuvo");
	
	private String label;

	EstadoCivil(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}
