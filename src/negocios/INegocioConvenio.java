package negocios;

import java.util.List;

import classesBasicas.Convenio;

public interface INegocioConvenio extends INegocioGenerico {

	public void insert(Convenio convenio);

	public void update(Convenio convenio);

	public void remove(Convenio convenio);

	public void refresh(Convenio convenio);

	public List<Convenio> getAllByDescricao(Convenio filtro);

}
