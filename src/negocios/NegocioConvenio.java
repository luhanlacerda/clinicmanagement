package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import classesBasicas.Convenio;
import dados.DAOConvenio;
import dados.DAOFactory;

public class NegocioConvenio implements INegocioConvenio {

	// Tamanhos Pr�-Definidos
	private static final int DESCRICAO_SIZE = 50;

	private DAOConvenio convenioDAO = DAOFactory.getConvenioDAO();

	@Override
	public void insert(Convenio convenio) throws Exception {
		
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descricao");
			}
			
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descricao");
			}

			convenioDAO.insert(convenio);
		
	}

	@Override
	public void update(Convenio convenio) throws Exception {
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descri��o");
			}
			
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descri��o");
			}
			
			convenioDAO.update(convenio);
	}

	@Override
	public void remove(Convenio convenio) throws Exception {
			if (convenio.getId() < 0) {
				throw new Exception("Id inv�lido");
			}
			
			convenioDAO.remove(convenio);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) throws Exception {
		convenioDAO.insertCollection((Collection<Convenio>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) throws Exception {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inv�lido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return (T) convenioDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Convenio convenio) throws Exception {
			if (convenio.getDescricao().isEmpty()) {
				throw new Exception("Informar a Descri��o");
			}
			
			if (convenio.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acimado permitido para a Descri��o");
			}
			
			convenioDAO.refresh(convenio);
	}

	@Override
	public List<Convenio> getAllByDescricao(Convenio filtro) throws Exception {
		return convenioDAO.getAllByDescricao(filtro);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) throws Exception {
		return (List<T>) convenioDAO.getAll();
	}

}
