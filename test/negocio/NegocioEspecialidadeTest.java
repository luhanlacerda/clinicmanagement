package negocio;

import classesBasicas.Especialidade;
import negocios.INegocioEspecialidade;
import negocios.NegocioEspecialidade;

public class NegocioEspecialidadeTest {
	public static void main(String[] args) throws Exception {
		Especialidade especialidade = new Especialidade();

		especialidade.setDescricao("Ortopedista");

		INegocioEspecialidade negocioEspecialidade = new NegocioEspecialidade();

		especialidade = negocioEspecialidade.searchByKey(2, Especialidade.class);
		negocioEspecialidade.remove(especialidade);

	}
}
