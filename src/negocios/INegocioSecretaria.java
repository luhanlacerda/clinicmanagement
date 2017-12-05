package negocios;

import java.util.List;

import classesBasicas.Secretaria;

public interface INegocioSecretaria extends INegocioGenerico {

	public void insert(Secretaria secretaria) throws Exception;

	public void update(Secretaria secretaria) throws Exception;

	public void remove(Secretaria secretaria) throws Exception;

	public void refresh(Secretaria secretaria) throws Exception;
	
	public List<Secretaria> getAllByName(Secretaria filtro) throws Exception;
}
