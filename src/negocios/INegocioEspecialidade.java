package negocios;

import java.util.List;

import classesBasicas.Especialidade;
import classesBasicas.Medico;

public interface INegocioEspecialidade extends INegocioGenerico {
	public void insert(Especialidade especialidade);

	public void update(Especialidade especialidade);

	public void remove(Especialidade especialidade);

	public void refresh(Especialidade especialidade);

	public List<Especialidade> getAllByDescricao(Especialidade filtro);
	
	public List<Especialidade> getAllByEspecialidade(Medico filtro);
}
