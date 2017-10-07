package classesBasicas;

public class Medico extends Pessoa {

	public String CRM;
	public Especialidade Especialidade;

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public Especialidade getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		Especialidade = especialidade;
	}
}
