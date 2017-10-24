package negocios;

import java.io.Serializable;
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
				throw new Exception("Campo descrição especialidade vazio. Informe a descrição de especialidade.");
			}

			if (especialidade.getDescricao().equals(null)) {
				throw new Exception("Informar especialidade.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descrição de especialidade.");
			}

			if (especialidade.getId() < 1) {
				throw new Exception("Id especialidade inexistente. Informe um Id maior que 1.");
			}
			;

			especialidadeDAO.insert(especialidade);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Especialidade especialidade) {
		try {

			if (especialidade.getDescricao().trim().isEmpty()) {
				throw new Exception("Campo descrição especialidade vazio. Por favor, informe a descrição.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descrição de especialidade.");
			}

			if (especialidade.getDescricao().equals(null)) {
				throw new Exception("Informar especialidade.");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Especialidade especialidade) {
		try {
			if (especialidade.getId() < 0) {
				throw new Exception("Id invÃ¡lido");
			}
			this.especialidadeDAO.remove(especialidade);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void insertCollection(Collection<Especialidade> colecao) {
		this.especialidadeDAO.insertCollection(colecao);

	}

	@Override
	public Especialidade searchByKey(Serializable chave) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inválido.");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return especialidadeDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Especialidade especialidade) {
		try {
			if (especialidade.getDescricao().trim().isEmpty()) {
				throw new Exception("Campo descrição especialidade vazio. Informe a descrição de especialidade.");
			}

			if (especialidade.getDescricao().equals(null)) {
				throw new Exception("Informar especialidade.");
			}

			if (especialidade.getDescricao().length() > DESCRICAO_SIZE) {
				throw new Exception("Caracteres acima do permitido para descrição de especialidade.");
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

}
