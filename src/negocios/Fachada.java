package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import classesBasicas.Consulta;
import classesBasicas.Convenio;
import classesBasicas.Especialidade;
import classesBasicas.Login;
import classesBasicas.Medico;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;

public class Fachada implements INegocioConsulta, INegocioConvenio, INegocioEspecialidade, INegocioMedico,
		INegocioPaciente, INegocioSecretaria, INegocioLogin {

	private INegocioConsulta negocioConsulta;
	private INegocioConvenio negocioConvenio;
	private INegocioEspecialidade negocioEspecialidade;
	private INegocioMedico negocioMedico;
	private INegocioPaciente negocioPaciente;
	private INegocioSecretaria negocioSecretaria;
	private INegocioLogin negocioLogin;

	public Fachada() {
		negocioConsulta = new NegocioConsulta();
		negocioConvenio = new NegocioConvenio();
		negocioEspecialidade = new NegocioEspecialidade();
		negocioMedico = new NegocioMedico();
		negocioPaciente = new NegocioPaciente();
		negocioSecretaria = new NegocioSecretaria();
		negocioLogin = new NegocioLogin();
	}

	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) throws Exception {
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
	public <T> T searchByKey(Serializable chave, Class<T> classType) throws Exception {
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
	public <T> List<T> getAll(Class<T> classType) throws Exception {
		if (classType == Consulta.class)
			return negocioConsulta.getAll(classType);
		else if (classType == Convenio.class)
			return negocioConvenio.getAll(classType);
		else if (classType == Especialidade.class)
			return negocioEspecialidade.getAll(classType);
		else if (classType == Medico.class)
			return negocioMedico.getAll(classType);
		else if (classType == Paciente.class)
			return negocioPaciente.getAll(classType);
		else if (classType == Secretaria.class)
			return negocioSecretaria.getAll(classType);
		else
			throw new UnsupportedOperationException();
	}


	@Override
	public void insert(Secretaria secretaria) throws Exception {
		negocioSecretaria.insert(secretaria);
	}

	@Override
	public void update(Secretaria secretaria) throws Exception {
		negocioSecretaria.update(secretaria);
	}

	@Override
	public void remove(Secretaria secretaria) throws Exception {
		negocioSecretaria.remove(secretaria);
	}

	@Override
	public void refresh(Secretaria secretaria) throws Exception {
		negocioSecretaria.refresh(secretaria);
	}

	@Override
	public List<Secretaria> getAllByName(Secretaria filtro) throws Exception {
		return negocioSecretaria.getAllByName(filtro);
	}

	@Override
	public void insert(Paciente paciente) throws Exception {
		negocioPaciente.insert(paciente);
	}

	@Override
	public void update(Paciente paciente) throws Exception {
		negocioPaciente.update(paciente);
	}

	@Override
	public void remove(Paciente paciente) throws Exception {
		negocioPaciente.remove(paciente);
	}

	@Override
	public void refresh(Paciente paciente) throws Exception {
		negocioPaciente.refresh(paciente);
	}

	@Override
	public List<Paciente> getAllByName(Paciente filtro) throws Exception {
		return negocioPaciente.getAllByName(filtro);
	}

	@Override
	public void insert(Medico medico) throws Exception {
		negocioMedico.insert(medico);
	}

	@Override
	public void update(Medico medico) throws Exception {
		negocioMedico.update(medico);
	}

	@Override
	public void remove(Medico medico) throws Exception {
		negocioMedico.remove(medico);
	}

	@Override
	public void refresh(Medico medico) throws Exception {
		negocioMedico.refresh(medico);
	}

	@Override
	public List<Medico> getAllByName(Medico filtro) throws Exception {
		return negocioMedico.getAllByName(filtro);
	}

	@Override
	public List<Medico> getAllByEspecialidade(Especialidade filtro) throws Exception {
		return negocioMedico.getAllByEspecialidade(filtro);
	}

	@Override
	public Medico searchByCrm(Medico filtro) throws Exception {
		return negocioMedico.searchByCrm(filtro);
	}

	@Override
	public Medico searchByConsulta(Consulta filtro) throws Exception {
		return negocioMedico.searchByConsulta(filtro);
	}

	@Override
	public void insert(Especialidade especialidade) throws Exception {
		negocioEspecialidade.insert(especialidade);
	}

	@Override
	public void update(Especialidade especialidade) throws Exception {
		negocioEspecialidade.update(especialidade);
	}

	@Override
	public void remove(Especialidade especialidade) throws Exception {
		negocioEspecialidade.remove(especialidade);
	}

	@Override
	public void refresh(Especialidade especialidade) throws Exception {
		negocioEspecialidade.refresh(especialidade);
	}

	@Override
	public List<Especialidade> getAllByDescricao(Especialidade filtro) throws Exception {
		return negocioEspecialidade.getAllByDescricao(filtro);
	}

	@Override
	public List<Especialidade> getAllByEspecialidade(Medico filtro) throws Exception {
		return negocioEspecialidade.getAllByEspecialidade(filtro);
	}

	@Override
	public void insert(Convenio convenio) throws Exception {
		negocioConvenio.insert(convenio);
	}

	@Override
	public void update(Convenio convenio) throws Exception {
		negocioConvenio.update(convenio);
	}

	@Override
	public void remove(Convenio convenio) throws Exception {
		negocioConvenio.remove(convenio);
	}

	@Override
	public void refresh(Convenio convenio) throws Exception {
		negocioConvenio.refresh(convenio);
	}

	@Override
	public List<Convenio> getAllByDescricao(Convenio filtro) throws Exception {
		return negocioConvenio.getAllByDescricao(filtro);
	}

	@Override
	public void insert(Consulta consulta) throws Exception {
		negocioConsulta.insert(consulta);
	}

	@Override
	public void update(Consulta consulta) throws Exception {
		negocioConsulta.update(consulta);
	}

	@Override
	public void remove(Consulta consulta) throws Exception {
		negocioConsulta.remove(consulta);
	}

	@Override
	public void refresh(Consulta consulta) throws Exception {
		negocioConsulta.refresh(consulta);
	}

	@Override
	public List<Consulta> getAllByCRM(Consulta filtro) throws Exception {
		return negocioConsulta.getAllByCRM(filtro);
	}

	@Override
	public List<Consulta> getAllByMedico(Consulta filtro) throws Exception {
		return negocioConsulta.getAllByMedico(filtro);
	}

	@Override
	public List<Consulta> getAllBySecretria(Consulta filtro) throws Exception {
		return negocioConsulta.getAllBySecretria(filtro);
	}

	@Override
	public List<Consulta> getAllByPaciente(Consulta filtro) throws Exception {
		return negocioConsulta.getAllByPaciente(filtro);
	}

	@Override
	public void insert(Login login) throws Exception {
		negocioLogin.insert(login);
	}

	@Override
	public void update(Login login) throws Exception {
		negocioLogin.update(login);
	}

	@Override
	public void refresh(Login login) throws Exception {
		negocioLogin.refresh(login);
	}

	@Override
	public Login login(Login login) throws Exception {
		return negocioLogin.login(login);
	}
	
}