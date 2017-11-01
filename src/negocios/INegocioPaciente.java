package negocios;

import java.util.List;

import classesBasicas.Paciente;

public interface INegocioPaciente extends INegocioGenerico {

	public void insert(Paciente paciente);

	public void update(Paciente paciente);

	public void remove(Paciente paciente);

	public void refresh(Paciente paciente);
	
	public List<Paciente> getAllByName(Paciente filtro);
	
}
