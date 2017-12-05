package negocios;

import java.util.List;

import classesBasicas.Convenio;

public interface INegocioConvenio extends INegocioGenerico {

	public void insert(Convenio convenio) throws Exception;

	public void update(Convenio convenio) throws Exception;

	public void remove(Convenio convenio) throws Exception;

	public void refresh(Convenio convenio) throws Exception;

	public List<Convenio> getAllByDescricao(Convenio filtro) throws Exception;

}
