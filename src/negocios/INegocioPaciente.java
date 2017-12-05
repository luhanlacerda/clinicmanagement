package negocios;

import java.util.List;

import classesBasicas.Paciente;

public interface INegocioPaciente extends INegocioGenerico {

	public void insert(Paciente paciente) throws Exception;

	public void update(Paciente paciente) throws Exception;

	public void remove(Paciente paciente) throws Exception;

	public void refresh(Paciente paciente) throws Exception;
	
	public List<Paciente> getAllByName(Paciente filtro) throws Exception;
	
}
