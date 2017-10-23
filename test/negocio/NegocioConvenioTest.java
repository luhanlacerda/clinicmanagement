package negocio;

import classesBasicas.Convenio;
import negocios.INegocioConvenio;
import negocios.NegocioConvenio;

public class NegocioConvenioTest {

	public static void main(String[] args) {

		Convenio convenio = new Convenio();

		// Convenio
		convenio.setDescricao("HapVida");

		INegocioConvenio negocioConvenio = new NegocioConvenio();

		convenio = negocioConvenio.searchByKey(1);
		negocioConvenio.remove(convenio);
		// negocioConvenio.insert(convenio);

	}

}
