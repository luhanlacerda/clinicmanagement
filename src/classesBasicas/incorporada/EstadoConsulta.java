package classesBasicas.incorporada;

public enum EstadoConsulta {
	MARCADA("Marcada"), CANCELADA("Cancelada"), FINALIZADA("Finalizada");
	
	private String label;

	EstadoConsulta(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}
