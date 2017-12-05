package negocios;

import java.util.List;

import classesBasicas.Especialidade;
import classesBasicas.Medico;

public interface INegocioEspecialidade extends INegocioGenerico {
	
	public void insert(Especialidade especialidade) throws Exception;

	public void update(Especialidade especialidade) throws Exception;

	public void remove(Especialidade especialidade) throws Exception;

	public void refresh(Especialidade especialidade) throws Exception;

	public List<Especialidade> getAllByDescricao(Especialidade filtro) throws Exception;
	
	public List<Especialidade> getAllByEspecialidade(Medico filtro) throws Exception;
}
