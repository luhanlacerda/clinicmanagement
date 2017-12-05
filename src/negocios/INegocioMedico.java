package negocios;

import java.util.List;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;

public interface INegocioMedico extends INegocioGenerico {

	public void insert(Medico medico) throws Exception;

	public void update(Medico medico) throws Exception;

	public void remove(Medico medico) throws Exception;

	public void refresh(Medico medico) throws Exception;

	public List<Medico> getAllByName(Medico filtro) throws Exception;
	
	public List<Medico> getAllByEspecialidade(Especialidade filtro) throws Exception;
	
	public Medico searchByCrm(Medico filtro) throws Exception;
	
	public Medico searchByConsulta(Consulta filtro) throws Exception;

}
