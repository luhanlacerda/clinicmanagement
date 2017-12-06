package classesBasicas.incorporada;

import java.io.Serializable;

public enum EstadoCivil implements Serializable {
	SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viuvo");
	
	private String label;

	EstadoCivil(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}
