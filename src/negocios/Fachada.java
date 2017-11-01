package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import classesBasicas.Consulta;
import classesBasicas.Convenio;
import classesBasicas.Especialidade;
import classesBasicas.Medico;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;

public class Fachada implements INegocioConsulta, INegocioConvenio, INegocioEspecialidade, INegocioMedico,
		INegocioPaciente, INegocioSecretaria {

	private static Fachada fachada;

	private INegocioConsulta negocioConsulta;
	private INegocioConvenio negocioConvenio;
	private INegocioEspecialidade negocioEspecialidade;
	private INegocioMedico negocioMedico;
	private INegocioPaciente negocioPaciente;
	private INegocioSecretaria negocioSecretaria;

	private Fachada() {
		negocioConsulta = new NegocioConsulta();
		negocioConvenio = new NegocioConvenio();
		negocioEspecialidade = new NegocioEspecialidade();
		negocioMedico = new NegocioMedico();
		negocioPaciente = new NegocioPaciente();
		negocioSecretaria = new NegocioSecretaria();
	}

	public static Fachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}

		return fachada;
	}

	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		if (classType == Consulta.class)
			negocioConsulta.insertCollection(colecao, classType);
		else if (classType == Convenio.class)
			negocioConvenio.insertCollection(colecao, classType);
		else if (classType == Especialidade.class)
			negocioEspecialidade.insertCollection(colecao, classType);
		else if (classType == Medico.class)
			negocioMedico.insertCollection(colecao, classType);
		else if (classType == Paciente.class)
			negocioPaciente.insertCollection(colecao, classType);
		else if (classType == Secretaria.class)
			negocioSecretaria.insertCollection(colecao, classType);
		else
			throw new UnsupportedOperationException();
	}

	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) {
		if (classType == Consulta.class)
			return negocioConsulta.searchByKey(chave, classType);
		else if (classType == Convenio.class)
			return negocioConvenio.searchByKey(chave, classType);
		else if (classType == Especialidade.class)
			return negocioEspecialidade.searchByKey(chave, classType);
		else if (classType == Medico.class)
			return negocioMedico.searchByKey(chave, classType);
		else if (classType == Paciente.class)
			return negocioPaciente.searchByKey(chave, classType);
		else if (classType == Secretaria.class)
			return negocioSecretaria.searchByKey(chave, classType);
		else
			throw new UnsupportedOperationException();
	}

	@Override
	public void insert(Secretaria secretaria) {
		negocioSecretaria.insert(secretaria);
	}

	@Override
	public void update(Secretaria secretaria) {
		negocioSecretaria.update(secretaria);
	}

	@Override
	public void remove(Secretaria secretaria) {
		negocioSecretaria.remove(secretaria);
	}

	@Override
	public void refresh(Secretaria secretaria) {
		negocioSecretaria.refresh(secretaria);
	}

	@Override
	public List<Secretaria> getAllByName(Secretaria filtro) {
		return negocioSecretaria.getAllByName(filtro);
	}

	@Override
	public void insert(Paciente paciente) {
		negocioPaciente.insert(paciente);
	}

	@Override
	public void update(Paciente paciente) {
		negocioPaciente.update(paciente);
	}

	@Override
	public void remove(Paciente paciente) {
		negocioPaciente.remove(paciente);
	}

	@Override
	public void refresh(Paciente paciente) {
		negocioPaciente.refresh(paciente);
	}

	@Override
	public List<Paciente> getAllByName(Paciente filtro) {
		return negocioPaciente.getAllByName(filtro);
	}

	@Override
	public void insert(Medico medico) {
		negocioMedico.insert(medico);
	}

	@Override
	public void update(Medico medico) {
		negocioMedico.update(medico);
	}

	@Override
	public void remove(Medico medico) {
		negocioMedico.remove(medico);
	}

	@Override
	public void refresh(Medico medico) {
		negocioMedico.refresh(medico);
	}

	@Override
	public List<Medico> getAllByName(Medico filtro) {
		return negocioMedico.getAllByName(filtro);
	}

	@Override
	public List<Medico> getAllByEspecialidade(Especialidade filtro) {
		return negocioMedico.getAllByEspecialidade(filtro);
	}

	@Override
	public Medico searchByCrm(Medico filtro) {
		return negocioMedico.searchByCrm(filtro);
	}

	@Override
	public Medico searchByConsulta(Consulta filtro) {
		return negocioMedico.searchByConsulta(filtro);
	}

	@Override
	public void insert(Especialidade especialidade) {
		negocioEspecialidade.insert(especialidade);
	}

	@Override
	public void update(Especialidade especialidade) {
		negocioEspecialidade.update(especialidade);
	}

	@Override
	public void remove(Especialidade especialidade) {
		negocioEspecialidade.remove(especialidade);
	}

	@Override
	public void refresh(Especialidade especialidade) {
		negocioEspecialidade.refresh(especialidade);
	}

	@Override
	public List<Especialidade> getAllByDescricao(Especialidade filtro) {
		return negocioEspecialidade.getAllByDescricao(filtro);
	}

	@Override
	public List<Especialidade> getAllByEspecialidade(Medico filtro) {
		return negocioEspecialidade.getAllByEspecialidade(filtro);
	}

	@Override
	public void insert(Convenio convenio) {
		negocioConvenio.insert(convenio);
	}

	@Override
	public void update(Convenio convenio) {
		negocioConvenio.update(convenio);
	}

	@Override
	public void remove(Convenio convenio) {
		negocioConvenio.remove(convenio);
	}

	@Override
	public void refresh(Convenio convenio) {
		negocioConvenio.refresh(convenio);
	}

	@Override
	public List<Convenio> getAllByDescricao(Convenio filtro) {
		return negocioConvenio.getAllByDescricao(filtro);
	}

	@Override
	public void insert(Consulta consulta) {
		negocioConsulta.insert(consulta);
	}

	@Override
	public void update(Consulta consulta) {
		negocioConsulta.update(consulta);
	}

	@Override
	public void remove(Consulta consulta) {
		negocioConsulta.remove(consulta);
	}

	@Override
	public void refresh(Consulta consulta) {
		negocioConsulta.refresh(consulta);
	}

	@Override
	public List<Consulta> getAllByCRM(Consulta filtro) {
		return negocioConsulta.getAllByCRM(filtro);
	}

	@Override
	public List<Consulta> getAllByMedico(Consulta filtro) {
		return negocioConsulta.getAllByMedico(filtro);
	}

	@Override
	public List<Consulta> getAllBySecretria(Consulta filtro) {
		return negocioConsulta.getAllBySecretria(filtro);
	}

	@Override
	public List<Consulta> getAllByPaciente(Consulta filtro) {
		return negocioConsulta.getAllByPaciente(filtro);
	}

}