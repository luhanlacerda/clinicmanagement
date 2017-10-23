package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Convenio;
import dados.DAOConvenio;
import dados.DAOFactory;

public class NegocioConvenio implements INegocioConvenio {

	// Tamanhos Pré-Definidos
	private static final int DESCRICAO_SIZE = 50;

	private DAOConvenio convenioDAO = DAOFactory.getConvenioDAO();

	@Override
	public void insert(Convenio convenio) {

		try {
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descrição");
			}
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descrição");
			}
			convenioDAO.insert(convenio);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void update(Convenio convenio) {

		try {
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descrição");
			}
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descrição");
			}
			convenioDAO.update(convenio);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void remove(Convenio convenio) {

		try {
			if (convenio.getId() < 0) {
				throw new Exception("Id inválido");
			}
			convenioDAO.remove(convenio);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void insertCollection(Collection<Convenio> colecao) {

		convenioDAO.insertCollection(colecao);

	}

	@Override
	public Convenio searchByKey(Serializable chave) {

		try {
			if (chave.equals(null)) {
				throw new Exception("Id inválido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return convenioDAO.searchByKey(chave);

	}

	@Override
	public void refresh(Convenio convenio) {

		try {
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descrição");
			}
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descrição");
			}
			convenioDAO.refresh(convenio);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<Convenio> getAllByDescricao(Convenio filtro) {

		return convenioDAO.getAllByDescricao(filtro);

	}

}
