package negocios;

import java.util.List;

import classesBasicas.Consulta;

public interface INegocioConsulta extends INegocioGenerico {

	public void insert(Consulta consulta);

	public void update(Consulta consulta);

	public void remove(Consulta consulta);

	public void refresh(Consulta consulta);
	
	public List<Consulta> getAllByCRM(Consulta filtro);
	
	public List<Consulta> getAllByMedico(Consulta filtro);
	
	public List<Consulta> getAllBySecretria(Consulta filtro);
	
	public List<Consulta> getAllByPaciente(Consulta filtro);
}
