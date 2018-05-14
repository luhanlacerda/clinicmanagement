package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import classesBasicas.Especialidade;
import classesBasicas.Medico;
import dados.DAOEspecialidade;
import dados.DAOFactory;

public class NegocioEspecialidade implements INegocioEspecialidade {

	private DAOEspecialidade especialidadeDAO = DAOFactory.getEspecialidadeDAO();

	private static final int DESCRICAO_SIZE = 400;

	@Override
	public void insert(Especialidade especialidade) {

		try {
			if (especialidade.getDescricao().trim().isEmpty()) {
				throw new Exception("Campo descri��o especialidade vazio. Informe a descri��o de especialidade.");
			}

			if (especialidade.getDescricao().equals(null)) {
				throw new Exception("Informar especialidade.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descri��o de especialidade.");
			}

			especialidadeDAO.insert(especialidade);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Especialidade especialidade) throws Exception {

			if (especialidade != null && especialidade.getDescricao().trim().isEmpty()) {
				throw new Exception("Campo descri��o especialidade vazio. Por favor, informe a descri��o.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descri��o de especialidade.");
			}
			
			especialidadeDAO.update(especialidade);
	}

	@Override
	public void remove(Especialidade especialidade) {
		try {
			if (especialidade.getId() < 0) {
				throw new Exception("Id inválido");
			}
			this.especialidadeDAO.remove(especialidade);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		this.especialidadeDAO.insertCollection((Collection<Especialidade>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inv�lido.");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return (T) especialidadeDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Especialidade especialidade) {
		try {
			if (especialidade.getDescricao().trim().isEmpty()) {
				throw new Exception("Campo descri��o especialidade vazio. Informe a descri��o de especialidade.");
			}

			if (especialidade.getDescricao().equals(null)) {
				throw new Exception("Informar especialidade.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descri��o de especialidade.");
			}

			especialidadeDAO.refresh(especialidade);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<Especialidade> getAllByDescricao(Especialidade filtro) {
		return this.especialidadeDAO.getAllByDescricao(filtro);
	}

	@Override
	public List<Especialidade> getAllByEspecialidade(Medico filtro) {
		return especialidadeDAO.getAllByMedicos(filtro);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) {
		return (List<T>) especialidadeDAO.getAll();
	}
	
}
