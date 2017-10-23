package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import classesBasicas.Consulta;

public interface INegocioConsulta {

	public void insert(Consulta consulta);

	public void update(Consulta consulta);

	public void remove(Consulta consulta);

	public void insertCollection(Collection<Consulta> colecao);

	public Consulta searchByKey(Serializable chave);

	public void refresh(Consulta consulta);
	
	public List<Consulta> getAllByCRM(Consulta filtro);
	
	public List<Consulta> getAllByMedico(Consulta filtro);
	
	public List<Consulta> getAllBySecretria(Consulta filtro);
	
	public List<Consulta> getAllByPaciente(Consulta filtro);
}
