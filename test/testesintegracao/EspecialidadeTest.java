package testesintegracao;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classesBasicas.Especialidade;
import negocios.INegocioEspecialidade;
import negocios.NegocioEspecialidade;

public class EspecialidadeTest {

	private Especialidade especialidade;
	private static INegocioEspecialidade negocioEspecialidade;

	@BeforeClass
	public static void inicializarNegocioEspecialidade() {
		negocioEspecialidade = new NegocioEspecialidade();
	}

	@Before
	public void inicializarEspecialidade() {
		this.especialidade = new Especialidade();
	}

	// INSERT

	@Test(expected = Exception.class)
	public void testarInserirEspecialidadeComDescricaoVazia() throws Exception {
		especialidade.setDescricao("");
		negocioEspecialidade.insert(especialidade);
	}

	@Test(expected = Exception.class)
	public void testarInserirEspecialidadeComDescricaoMaiorQueEsperado() throws Exception {
		String descricao = "dasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasd"
				+ "sadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasda"
				+ "sdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadas"
				+ "sadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassada"
				+ "sdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdas"
				+ "dsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassad" + "asdasdsadassasdfsdfsds";
		especialidade.setDescricao(descricao);
		negocioEspecialidade.insert(especialidade);
	}

	// UPDATE

	@Test(expected = Exception.class)
	public void testarUpdateEspecialidadeComDescricaoVazia() throws Exception {
		especialidade.setDescricao("");
		negocioEspecialidade.update(especialidade);
	}

	@Test(expected = Exception.class)
	public void testarUpdateEspecialidadeComDescricaoMaiorQueEsperado() throws Exception {
		String descricao = "dasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasd"
				+ "sadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasda"
				+ "sdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadas"
				+ "sadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassada"
				+ "sdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdas"
				+ "dsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassad" + "asdasdsadassasdfsdfsds";
		especialidade.setDescricao(descricao);
		negocioEspecialidade.update(especialidade);
	}

	// REFRESH

	@Test(expected = Exception.class)
	public void testarRefreshEspecialidadeComDescricaoVazia() throws Exception {
		especialidade.setDescricao("");
		negocioEspecialidade.refresh(especialidade);
	}

	@Test(expected = Exception.class)
	public void testarRefreshEspecialidadeComDescricaoMaiorQueEsperado() throws Exception {
		String descricao = "dasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasd"
				+ "sadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasda"
				+ "sdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadas"
				+ "sadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassada"
				+ "sdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdas"
				+ "dsadassadasdasdsadassadasdasdsadassadasdasdsadassadasdasdsadassad" + "asdasdsadassasdfsdfsds";
		especialidade.setDescricao(descricao);
		negocioEspecialidade.refresh(especialidade);
	}

	// REMOVE

	@Test(expected = Exception.class)
	public void testarRemoverEspecialidadeSemID() throws Exception {
		especialidade.getId();
		negocioEspecialidade.remove(especialidade);
	}

}
