package negocios;

import java.util.List;

import classesBasicas.Consulta;

public interface INegocioConsulta extends INegocioGenerico {

	public void insert(Consulta consulta) throws Exception;

	public void update(Consulta consulta) throws Exception;

	public void remove(Consulta consulta) throws Exception;

	public void refresh(Consulta consulta) throws Exception;
	
	public List<Consulta> getAllByCRM(Consulta filtro) throws Exception;
	
	public List<Consulta> getAllByMedico(Consulta filtro) throws Exception;
	
	public List<Consulta> getAllBySecretria(Consulta filtro) throws Exception;
	
	public List<Consulta> getAllByPaciente(Consulta filtro) throws Exception;
}
