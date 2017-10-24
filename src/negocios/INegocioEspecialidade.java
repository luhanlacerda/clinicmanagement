package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Especialidade;
import classesBasicas.Medico;

public interface INegocioEspecialidade {
	public void insert(Especialidade especialidade);

	public void update(Especialidade especialidade);

	public void remove(Especialidade especialidade);

	public void insertCollection(Collection<Especialidade> colecao);

	public Especialidade searchByKey(Serializable chave);

	public void refresh(Especialidade especialidade);

	public List<Especialidade> getAllByDescricao(Especialidade filtro);
	
	public List<Especialidade> getAllByEspecialidade(Medico filtro);
}
