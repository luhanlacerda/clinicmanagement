package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Paciente;

public interface INegocioPaciente {

	public void insert(Paciente paciente);

	public void update(Paciente paciente);

	public void remove(Paciente paciente);

	public void insertCollection(Collection<Paciente> colecao);

	public Paciente searchByKey(Serializable chave);

	public void refresh(Paciente paciente);
	
	public List<Paciente> getAllByName(Paciente filtro);
	
}
