package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Secretaria;

public interface INegocioSecretaria {

	public void insert(Secretaria secretaria);

	public void update(Secretaria secretaria);

	public void remove(Secretaria secretaria);

	public void insertCollection(Collection<Secretaria> colecao);

	public Secretaria searchByKey(Serializable chave);

	public void refresh(Secretaria secretaria);
	
	public List<Secretaria> getAllByName(Secretaria filtro);
}
