package classesBasicas.incorporada;

import java.io.Serializable;

public enum EstadoConsulta implements Serializable {
	MARCADA("Marcada"), CANCELADA("Cancelada"), FINALIZADA("Finalizada");
	
	private String label;

	EstadoConsulta(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}
