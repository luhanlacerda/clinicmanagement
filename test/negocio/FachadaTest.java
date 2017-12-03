package negocio;

import java.util.ArrayList;
import java.util.Arrays;

import classesBasicas.Convenio;
import classesBasicas.Especialidade;
import negocios.Fachada;

public class FachadaTest {

	public static void main(String[] args) {
		Fachada fachada = new Fachada();

		Convenio convenio1 = new Convenio();
		convenio1.setDescricao("HapVida");

		Convenio convenio2 = new Convenio();
		convenio2.setDescricao("Saude caixa");

		Especialidade especialidade1 = new Especialidade();
		especialidade1.setDescricao("Ortopedista");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setDescricao("Pediatra");

		fachada.insertCollection(new ArrayList<Convenio>(Arrays.asList(convenio1, convenio2)), Convenio.class);

		Convenio convenioFound = fachada.searchByKey(1, Convenio.class);
		System.out.println(convenioFound.getDescricao());

		fachada.insertCollection(new ArrayList<Especialidade>(Arrays.asList(especialidade1, especialidade2)),
				Especialidade.class);

		Especialidade especialidadeFound = fachada.searchByKey(2, Especialidade.class);
		System.out.println(especialidadeFound.getDescricao());
	}

}