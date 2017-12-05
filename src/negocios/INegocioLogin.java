package negocios;

import classesBasicas.Login;

public interface INegocioLogin {

	public void insert(Login login) throws Exception;

	public void update(Login login) throws Exception;

	public void refresh(Login login) throws Exception;
	
	public Login login(Login login) throws Exception;
	
}
