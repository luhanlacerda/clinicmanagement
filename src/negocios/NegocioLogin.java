package negocios;

import classesBasicas.Login;
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
	public void refresh(Login login) {
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

}
