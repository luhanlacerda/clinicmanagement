package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Convenio;

public interface INegocioConvenio {

	public void insert(Convenio convenio);

	public void update(Convenio convenio);

	public void remove(Convenio convenio);

	public void insertCollection(Collection<Convenio> colecao);

	public Convenio searchByKey(Serializable chave);

	public void refresh(Convenio convenio);

	public List<Convenio> getAllByDescricao(Convenio filtro);

}
