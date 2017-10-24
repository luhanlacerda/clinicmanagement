package negocio;

import classesBasicas.Especialidade;
import negocios.INegocioEspecialidade;
import negocios.NegocioEspecialidade;

public class NegocioEspecialidadeTest {
	public static void main(String[] args) {
		Especialidade especialidade = new Especialidade();

		especialidade.setDescricao("Ortopedista");

		INegocioEspecialidade negocioEspecialidade = new NegocioEspecialidade();

		especialidade = negocioEspecialidade.searchByKey(2);
		negocioEspecialidade.remove(especialidade);

	}
}
