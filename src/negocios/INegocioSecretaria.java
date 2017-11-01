package negocios;

import java.util.List;

import classesBasicas.Secretaria;

public interface INegocioSecretaria extends INegocioGenerico {

	public void insert(Secretaria secretaria);

	public void update(Secretaria secretaria);

	public void remove(Secretaria secretaria);

	public void refresh(Secretaria secretaria);
	
	public List<Secretaria> getAllByName(Secretaria filtro);
}
