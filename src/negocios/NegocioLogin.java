package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import classesBasicas.Login;
import classesBasicas.Medico;
import dados.DAOFactory;
import dados.DAOLogin;

public class NegocioLogin implements INegocioLogin {

	private DAOLogin usuarioLoginDAO = DAOFactory.getLoginDAO();

	@Override
	public void insert(Login login) throws Exception {
		if (login != null && login.getUsername().trim().isEmpty()) {
			throw new Exception("Campo usuario vazio. Informe um usuario.");
		}

		if (login != null && login.getPassword().equals(null)) {
			throw new Exception("Campo senha vazio. Informe uma senha.");
		}

		usuarioLoginDAO.insert(login);
	}

	@Override
	public void update(Login login) throws Exception {
		if (login != null && login.getUsername().trim().isEmpty()) {
			throw new Exception("Campo usuario vazio. Informe um usuario.");
		}

		if (login != null && login.getPassword().equals(null)) {
			throw new Exception("Campo senha vazio. Informe uma senha.");
		}

		usuarioLoginDAO.update(login);
	}

	@Override
	public void refresh(Login login) throws Exception {
		usuarioLoginDAO.refresh(login);
	}

	@Override
	public Login login(Login login) throws Exception {
		Login result = null;

		if (login != null && login.getUsername().trim().isEmpty()) {
			throw new Exception("Campo usuario vazio. Informe um usuario.");
		}

		if (login != null && login.getPassword().equals(null)) {
			throw new Exception("Campo senha vazio. Informe uma senha.");
		}

		result = usuarioLoginDAO.login(login);

		if (result == null) {
			throw new Exception("Usuario nao existente.");
		}

		if (!login.getPassword().equals(result.getPassword())) {
			throw new Exception("Senha incorreta.");
		}

		return result;
	}

	@Override
	public void remove(Login login) throws Exception {
		if (login.getId() < 0) {
			throw new Exception("Id inválido");
		}
		usuarioLoginDAO.remove(login);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) throws Exception {
		usuarioLoginDAO.insertCollection((Collection<Login>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) throws Exception {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inválido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return (T) usuarioLoginDAO.searchByKey(chave);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) throws Exception {
		return (List<T>) usuarioLoginDAO.getAll();
	}

}
