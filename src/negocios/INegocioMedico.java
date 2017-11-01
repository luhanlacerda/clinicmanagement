package negocios;

import java.util.List;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;

public interface INegocioMedico extends INegocioGenerico {

	public void insert(Medico medico);

	public void update(Medico medico);

	public void remove(Medico medico);

	public void refresh(Medico medico);

	public List<Medico> getAllByName(Medico filtro);
	
	public List<Medico> getAllByEspecialidade(Especialidade filtro);
	
	public Medico searchByCrm(Medico filtro);
	
	public Medico searchByConsulta(Consulta filtro);

}
